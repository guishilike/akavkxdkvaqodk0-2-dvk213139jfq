package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.dao.baseDao.UserViewDao;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.ScheduleDao;
import edu.neu.hospital.dao.basicTableDao.ScheduleRuleDao;
import edu.neu.hospital.dao.baseDao.ScheduleRuleViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.ScheduleExample;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleExample;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleViewExample;
import edu.neu.hospital.service.baseService.ScheduleRuleService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
    @Resource
    UserViewDao userViewDao;
    @Resource
    ConstantItemDao constantItemDao;


    private String[] weekDay={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    @CacheEvict(value={"schedule","scheduleRule"})
    public void add(Schedulerule schedulerule, Integer userID) {
        schedulerule.setAppearDate(new Date());
        schedulerule.setAppearUserID(userID);
        schedulerule.setStatus("1");
        System.out.println("用户id"+schedulerule.getOnDutyDoctorID());
        schedulerule.setDeptID(userViewDao.getDeptIDByDoctorID(schedulerule.getOnDutyDoctorID()));
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
    @CacheEvict(value={"schedule","scheduleRule"})
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
    @CacheEvict(value={"schedule","scheduleRule"})
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
    @CacheEvict(value={"schedule","scheduleRule"})
    public void change(Schedulerule schedulerule, Integer userID) {
        schedulerule.setChangeDate(new Date());
        schedulerule.setChangeUserID(userID);
        schedulerule.setDeptID(userViewDao.getDeptIDByDoctorID(schedulerule.getOnDutyDoctorID()));
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
        criteria.andOnDutyDoctorIDEqualTo(schedulerule.getOnDutyDoctorID());
        if (state == 1)
            criteria.andIdNotEqualTo(schedulerule.getId());
        return scheduleruleDao.countByExample(example) ==0;
    }

    @Override
    @CachePut(value="scheduleRule",key="'week'+#week+'deptID'+#deptID+'onDutyDoctorID'+#onDutyDoctorID")
    public List<ScheduleRuleView> find(Integer week, Integer deptID, Integer onDutyDoctorID) {
        ScheduleRuleViewExample example = new ScheduleRuleViewExample();
        ScheduleRuleViewExample.Criteria criteria = example.createCriteria();
        if (week != null)
            criteria.andWeekEqualTo(week);
        if (deptID != null)
            criteria.andDeptIDEqualTo(deptID);
        if (onDutyDoctorID != null)
            criteria.andOnDutyDoctorIDEqualTo(onDutyDoctorID);
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

    @Override
    @Cacheable(value="constantItem",key="'getAllOnDutyTimeNamesAndCodes'")
    public List<NameCodeDTO> getAllOnDutyTimeNamesAndCodes() {
        return constantItemDao.findAllNamesAndCodesByType(15);
    }

    @Override
    @Cacheable(value = "user",key="'getAllDoctors'")
    public List<NameCodeDTO> getAllDoctors() {
        return userViewDao.selectAllDoctor();
    }

    @Override
    @Cacheable(value = "user",key="'getAllDoctorsByDeptID'+#deptID")
    public List<NameCodeDTO> getAllDoctorsByDeptID(Integer deptID) {
        return userViewDao.selectAllDoctorByDeptID(deptID);
    }


    @Override
    @CacheEvict(value={"schedule","scheduleRule"})
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        //标识文件内容是否有错
        boolean state = true;
        Schedulerule scheduleRule;
        Workbook book;
        try {
            book = new XSSFWorkbook(file.getInputStream());
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);

        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                scheduleRule = new Schedulerule();
                Row row = sheet.getRow(i);
                for(int k=0;k<weekDay.length;k++){
                    if(row.getCell(0).toString().equals(weekDay[k])) {
                        System.out.println("成功"+k);
                        scheduleRule.setWeek(k);
                        break;
                    }
                }
                System.out.println("onDutyDoctor:"+row.getCell(1).toString());
                System.out.println(userViewDao.getIDByName(row.getCell(1).toString()));
                scheduleRule.setOnDutyDoctorID(userViewDao.getIDByName(row.getCell(1).toString()));
                scheduleRule.setLevelNameID(constantItemDao.findIdByName(row.getCell(2).toString(),13).getId());
                scheduleRule.setDeptID(userViewDao.getDeptIDByDoctorID(scheduleRule.getOnDutyDoctorID()));
                scheduleRule.setOnDutyTimeID(constantItemDao.findIdByName(row.getCell(3).toString(),15).getId());
                row.getCell(4).setCellType(CellType.STRING);
                scheduleRule.setLimitNumber(Integer.parseInt(row.getCell(4).toString()));

                //遇到重复是否继续执行
                if (checkContent(scheduleRule, 0)) {
                    add(scheduleRule, userID);
                } else if (repeatCoverage) {
                    scheduleRule.setId(scheduleruleviewDao.getIDByUserNameAndWeek(row.getCell(1).toString(),scheduleRule.getWeek()));
                    scheduleruleDao.updateByPrimaryKeySelective(scheduleRule);
                }
            } catch (Exception e) {
                e.printStackTrace();
                //遇到错误是否继续执行
                state = false;
                if (!errorHappenContinue)
                    return false;

            }

        }
        file.getInputStream().close();
        return state;
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName = "scheduleRule.xls";
        List<ScheduleRuleView> results =scheduleruleviewDao.selectByExample(new ScheduleRuleViewExample());
        String[] title = {"编号", "排班日", "科室名称", "号别", "值班医生","排班限额",
                "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        for (int i = 0; i < results.size(); i++) {
            // 创建行
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId().toString());
            row.createCell(1).setCellValue(weekDay[results.get(i).getWeek()]);
            row.createCell(2).setCellValue(results.get(i).getDeptName());
            row.createCell(3).setCellValue(results.get(i).getLevelName());
            row.createCell(4).setCellValue(results.get(i).getUserName());
            row.createCell(5).setCellValue(results.get(i).getLimitNumber());

            if (results.get(i).getAppearDate() != null)
                row.createCell(6).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(7).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(8).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(9).setCellValue(results.get(i).getChangeUserName());

        }
        return FileManage.createXLSFile(wb, path, fileName);
    }

    @Override
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName = "scheduleRuleTemplate.xls";
        String[] title = { "排班日", "值班医生", "号别", "午别", "排班限额"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }


}
