package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.dao.basicTableDao.ScheduleDao;
import edu.neu.hospital.dao.basicTableDao.ScheduleRuleDao;
import edu.neu.hospital.dao.baseDao.ScheduleRuleViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.ScheduleExample;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleExample;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleViewExample;
import edu.neu.hospital.service.baseService.ScheduleRuleService;
import edu.neu.hospital.service.baseService.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ScheduleRuleServiceImpl implements ScheduleRuleService {
    @Resource
    ScheduleRuleDao scheduleruleDao;
    @Resource
    ScheduleRuleViewDao scheduleruleviewDao;
    @Resource
    ScheduleDao scheduleDao;
    @Autowired
    ScheduleService scheduleService;

    @Override
    public void add(Schedulerule schedulerule, Integer userID) {
        schedulerule.setAppearDate(new Date());
        schedulerule.setAppearUserID(userID);
        schedulerule.setStatus("1");
        scheduleruleDao.insert(schedulerule);
        //当前日期30天后的日期
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.add(Calendar.DAY_OF_MONTH, 30);
        //当前日期
        Calendar calendar = Calendar.getInstance();
        while (calendar.compareTo(endCalendar) <= 0) {
            if (calendar.get(Calendar.DAY_OF_WEEK) - 1 == schedulerule.getWeek()) {
                Schedule schedule=getScheduleByRule(schedulerule,calendar);
                scheduleDao.insert(schedule);
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }

    @Override
    public void delete(Integer id, Integer userID) {
        Schedulerule schedulerule = scheduleruleDao.selectByPrimaryKey(id);
        if (schedulerule != null) {
            schedulerule.setChangeUserID(userID);
            schedulerule.setChangeDate(new Date());
            schedulerule.setStatus("0");
            scheduleruleDao.updateByPrimaryKeySelective(schedulerule);
            //级联删除排班信息
            ScheduleExample scheduleExample=new ScheduleExample();
            ScheduleExample.Criteria criteria=scheduleExample.createCriteria();
            criteria.andRuleIDEqualTo(id);
            criteria.andOnDutyDateGreaterThan(new Date());
            criteria.andStatusEqualTo("1");
            Schedule schedule=new Schedule();
            schedule.setStatus("0");
            scheduleDao.updateByExampleSelective(schedule,scheduleExample);
        }
    }

    @Override
    public void deleteByChoose(IdDTO idDTO, Integer userID) {
        for (Integer id : idDTO.getId()) {
            Schedulerule schedulerule = scheduleruleDao.selectByPrimaryKey(id);
            if (schedulerule != null) {
                schedulerule.setChangeUserID(userID);
                schedulerule.setChangeDate(new Date());
                schedulerule.setStatus("0");
                scheduleruleDao.updateByPrimaryKeySelective(schedulerule);
                //级联删除排班信息
                Schedule schedule=new Schedule();
                schedule.setStatus("0");
                ScheduleExample scheduleExample=new ScheduleExample();
                ScheduleExample.Criteria criteria=scheduleExample.createCriteria();
                criteria.andStatusEqualTo("1");
                criteria.andRuleIDEqualTo(id);
                criteria.andOnDutyDateGreaterThan(new Date());
                scheduleDao.updateByExampleSelective(schedule,scheduleExample);
            }
        }

    }

    @Override
    public void change(Schedulerule schedulerule, Integer userID) {
        schedulerule.setChangeDate(new Date());
        schedulerule.setChangeUserID(userID);
        scheduleruleDao.updateByPrimaryKeySelective(schedulerule);
        //级联改变排班信息
        Schedule schedule=getScheduleByRule(schedulerule);
        schedule.setChangeUserID(userID);
        schedule.setChangeDate(new Date());
        ScheduleExample scheduleExample=new ScheduleExample();
        ScheduleExample.Criteria criteria=scheduleExample.createCriteria();
        criteria.andRuleIDEqualTo(schedulerule.getId());
        criteria.andStatusEqualTo("1");
        criteria.andOnDutyDateGreaterThan(new Date());
        scheduleDao.updateByExampleSelective(schedule,scheduleExample);
    }

    @Override
    public boolean checkContent(Schedulerule schedulerule, int state) {
        ScheduleRuleExample example = new ScheduleRuleExample();
        ScheduleRuleExample.Criteria criteria = example.createCriteria();
        criteria.andWeekEqualTo(schedulerule.getWeek());
        criteria.andDeptIDEqualTo(schedulerule.getDeptID());
        criteria.andOnDutyDoctorIDEqualTo(schedulerule.getOnDutyTimeID());
        criteria.andOnDutyTimeIDEqualTo(schedulerule.getOnDutyTimeID());
        if (state == 1)
            criteria.andIdNotEqualTo(schedulerule.getId());
        if (scheduleruleDao.countByExample(example) > 0)
            return false;
        else
            return true;
    }

    @Override
    public List<ScheduleRuleView> find(Integer week, Integer deptCategoryID, Integer deptTypeID) {
        ScheduleRuleViewExample example = new ScheduleRuleViewExample();
        ScheduleRuleViewExample.Criteria criteria = example.createCriteria();
        if (week != null)
            criteria.andWeekEqualTo(week);
        if (deptCategoryID != null)
            criteria.andDeptCategoryIDEqualTo(deptCategoryID);
        if (deptTypeID != null)
            criteria.andDeptTypeIDEqualTo(deptTypeID);
        return scheduleruleviewDao.selectByExample(example);

    }

    @Override
    public Schedule getScheduleByRule(Schedulerule schedulerule, Calendar calendar) {
        Schedule schedule = new Schedule();
        schedule.setOnDutyDate(calendar.getTime());
        schedule.setOnDutyDoctorID(schedulerule.getOnDutyDoctorID());
        schedule.setOnDutyTimeID(schedulerule.getOnDutyTimeID());
        schedule.setDeptID(schedulerule.getDeptID());
        schedule.setLevelNameID(schedulerule.getLevelNameID());
        schedule.setLimitNumber(schedulerule.getLimitNumber());
        schedule.setRemainingAmount(schedulerule.getLimitNumber());
        schedule.setRuleID(schedulerule.getId());
        schedule.setAppearDate(new Date());
        schedule.setStatus("1");
        return  schedule;
    }

    @Override
    public Schedule getScheduleByRule(Schedulerule schedulerule) {
        Schedule schedule = new Schedule();
        schedule.setDeptID(schedulerule.getDeptID());
        schedule.setLevelNameID(schedulerule.getLevelNameID());
        schedule.setLimitNumber(schedulerule.getLimitNumber());
        schedule.setRemainingAmount(schedulerule.getLimitNumber());
        schedule.setOnDutyDoctorID(schedulerule.getOnDutyDoctorID());
        schedule.setOnDutyTimeID(schedulerule.getOnDutyTimeID());
        return  schedule;
    }




}
