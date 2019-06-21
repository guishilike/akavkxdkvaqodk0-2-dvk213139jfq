package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.dao.basicTableDao.ScheduleDao;
import edu.neu.hospital.dao.baseDao.ScheduleRuleViewDao;
import edu.neu.hospital.dao.baseDao.ScheduleViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.ScheduleExample;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleViewExample;
import edu.neu.hospital.example.baseExample.ScheduleViewExample;
import edu.neu.hospital.service.baseService.ScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    ScheduleDao scheduleDao;
    @Resource
    ScheduleViewDao scheduleviewDao;
    @Resource
    ScheduleRuleViewDao scheduleruleviewDao;

    @Override
    public void add(Schedule schedule, Integer userID) {
        schedule.setAppearDate(new Date());
        schedule.setAppearUserID(userID);
        schedule.setStatus("1");
        scheduleDao.insert(schedule);
    }

    @Override
    public void delete(Integer id, Integer userID) {
        Schedule schedule = scheduleDao.selectByPrimaryKey(id);
        if (schedule != null) {
            schedule.setChangeDate(new Date());
            schedule.setChangeUserID(userID);
            schedule.setStatus("0");
            scheduleDao.updateByPrimaryKeySelective(schedule);
        }
    }

    @Override
    public void deleteByChoose(IdDTO idDTO, Integer userID) {
        for (Integer id : idDTO.getId()) {
            Schedule schedule = scheduleDao.selectByPrimaryKey(id);
            if (schedule != null) {
                schedule.setChangeDate(new Date());
                schedule.setChangeUserID(userID);
                schedule.setStatus("0");
                scheduleDao.updateByPrimaryKeySelective(schedule);
            }
        }

    }

    @Override
    public void change(Schedule schedule, Integer userID) {
        schedule.setChangeDate(new Date());
        schedule.setChangeUserID(userID);
        scheduleDao.updateByPrimaryKeySelective(schedule);
    }

    @Override
    public boolean checkContent(Schedule schedule, int state) {
        ScheduleExample example = new ScheduleExample();
        ScheduleExample.Criteria criteria = example.createCriteria();
        criteria.andOnDutyDateEqualTo(schedule.getOnDutyDate());
        criteria.andOnDutyDoctorIDEqualTo(schedule.getOnDutyTimeID());
        criteria.andDeptIDEqualTo(schedule.getDeptID());
        criteria.andOnDutyTimeIDEqualTo(schedule.getOnDutyTimeID());
        if (state == 1)
            criteria.andIdNotEqualTo(schedule.getId());
        if (scheduleDao.countByExample(example) > 0)
            return false;
        else
            return true;
    }

    @Override
    public List<ScheduleView> find(Date startDate, Date endDate, Integer deptCategoryID, Integer deptTypeID) {
        ScheduleViewExample example = new ScheduleViewExample();
        ScheduleViewExample.Criteria criteria = example.createCriteria();
        if (startDate != null)
            criteria.andOnDutyDateGreaterThanOrEqualTo(startDate);
        if (endDate != null)
            criteria.andOnDutyDateLessThanOrEqualTo(endDate);
        if (deptCategoryID != null)
            criteria.andDeptCategoryIDEqualTo(deptCategoryID);
        if (deptTypeID != null)
            criteria.andDeptTypeIDEqualTo(deptTypeID);
        example.setOrderByClause("onDutyDate asc");
        return scheduleviewDao.selectByExample(example);
    }

    @Override
    public void generate() throws ParseException {
        ScheduleExample example = new ScheduleExample();
        Date date = getDateRemoveTime(new Date());
        //当前日期30天后的日期
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.add(Calendar.DAY_OF_MONTH, 30);
        //当前日期
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);

        if (scheduleDao.countByExample(example) != 0) {
            example.setOrderByClause("onDutyDate desc");
            example.setLimit(1);
            Date lastDate = scheduleDao.selectByExample(example).get(0).getOnDutyDate();
            if (getDateRemoveTime(lastDate).compareTo(getDateRemoveTime(date)) >= 0){
                date = getDateRemoveTime(lastDate);
                calendar.setTime(date);
                calendar.add(Calendar.DAY_OF_MONTH,1);
            }

        }
        /*
        若排班信息表为空或排班信息表的最后一条信息日期小于当前日期，则根据排班规则生成当天及以后三十天的排班信息。
        若最后一条信息大于等于当前日期，则生成信息对应日期之后直到三十天的信息
         */
        while (calendar.compareTo(endCalendar) <= 0) {
            ScheduleRuleViewExample scheduleruleviewExample = new ScheduleRuleViewExample();
            ScheduleRuleViewExample.Criteria criteria = scheduleruleviewExample.createCriteria();
            criteria.andWeekEqualTo(calendar.get(Calendar.DAY_OF_WEEK) - 1);
            List<ScheduleRuleView> scheduleRuleViews = scheduleruleviewDao.selectByExample(scheduleruleviewExample);
            List<Schedule> schedules = getSchedulesByRule(scheduleRuleViews, calendar);
            for (int i = 0; i < schedules.size(); i++) {
                scheduleDao.insert(schedules.get(i));
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

    }

    @Override
    public List<Schedule> getSchedulesByRule(List<ScheduleRuleView> scheduleRuleViews, Calendar calendar) {
        List<Schedule> schedules = new ArrayList<Schedule>();
        for (int i = 0; i < scheduleRuleViews.size(); i++) {
            Schedule schedule = new Schedule();
            schedule.setOnDutyDate(calendar.getTime());
            schedule.setOnDutyDoctorID(scheduleRuleViews.get(i).getOnDutyDoctorID());
            schedule.setOnDutyTimeID(scheduleRuleViews.get(i).getOnDutyTimeID());
            schedule.setDeptID(scheduleRuleViews.get(i).getDeptID());
            schedule.setLevelNameID(scheduleRuleViews.get(i).getLevelNameID());
            schedule.setLimitNumber(scheduleRuleViews.get(i).getLimitNumber());
            schedule.setRemainingAmount(scheduleRuleViews.get(i).getLimitNumber());
            schedule.setRuleID(scheduleRuleViews.get(i).getId());
            schedule.setAppearDate(new Date());
            schedule.setStatus("1");
        }
        return schedules;
    }

    @Override
    public Date getDateRemoveTime(Date date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = format.format(date);
        date = format.parse(dateStr);
        return date;
    }

}
