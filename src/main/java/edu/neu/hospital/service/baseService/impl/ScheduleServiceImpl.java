package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.dao.baseDao.ScheduleRuleViewDao;
import edu.neu.hospital.dao.baseDao.ScheduleViewDao;
import edu.neu.hospital.dao.baseDao.UserViewDao;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.ScheduleDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.baseExample.ScheduleRuleViewExample;
import edu.neu.hospital.example.baseExample.ScheduleViewExample;
import edu.neu.hospital.example.basicTableExample.ScheduleExample;
import edu.neu.hospital.service.baseService.ScheduleService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
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
    @Resource
    ConstantItemDao constantItemDao;
    @Resource
    UserViewDao userViewDao;
    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy年MM月dd");

    @Override
//    @CacheEvict(value = "schedule")
    public void add(Schedule schedule, Integer userID) {
        schedule.setAppearDate(new Date());
        schedule.setAppearUserID(userID);
        schedule.setDeptID(userViewDao.getDeptIDByDoctorID(schedule.getOnDutyDoctorID()));
        schedule.setRemainingAmount(schedule.getLimitNumber());
        schedule.setStatus("1");
        scheduleDao.insert(schedule);
    }

    @Override
//    @CacheEvict(value = "schedule")
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
//    @CacheEvict(value = "schedule")
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
//    @CacheEvict(value = "schedule")
    public void change(Schedule schedule, Integer userID) {
        schedule.setDeptID(userViewDao.getDeptIDByDoctorID(schedule.getOnDutyDoctorID()));
        schedule.setChangeDate(new Date());
        schedule.setChangeUserID(userID);
        schedule.setRuleID(-1);
        scheduleDao.updateByPrimaryKeySelective(schedule);
    }

    @Override
    public boolean checkContent(Schedule schedule, int state) throws ParseException {
        String onDutyDateStr = simpleDateFormat2.format(schedule.getOnDutyDate());
        Integer id;
        if (state == 1)
            id = scheduleviewDao.getIDByDateAndUserNameExceptID(onDutyDateStr, schedule.getOnDutyDoctorID(), schedule.getId());
        else
            id = scheduleviewDao.getIDByDateAndUserName(onDutyDateStr, schedule.getOnDutyDoctorID());
        if (id != null)
            return false;
        else
            return true;
    }

    @Override
//    @CachePut(value = "schedule",key="'startDate'+#startDate+'endDate'+#endDate+'deptID'+#deptID+'userID'+#userID")
    public List<ScheduleView> find(Date startDate, Date endDate, Integer deptID, Integer userID) {
        ScheduleViewExample example = new ScheduleViewExample();
        ScheduleViewExample.Criteria criteria = example.createCriteria();
        if (startDate != null)
            criteria.andOnDutyDateGreaterThanOrEqualTo(startDate);
        if (endDate != null)
            criteria.andOnDutyDateLessThanOrEqualTo(endDate);
        if (deptID != null)
            criteria.andDeptIDEqualTo(deptID);
        if (userID != null)
            criteria.andOnDutyDoctorIDEqualTo(userID);
        example.setOrderByClause("onDutyDate asc");
        return scheduleviewDao.selectByExample(example);
    }

    @Override
//    @CacheEvict(value = "schedule")
    public void generate() throws ParseException {
        ScheduleExample example = new ScheduleExample();
        ScheduleExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1");
        criteria.andRuleIDIsNotNull();
        criteria.andRuleIDGreaterThan(-1);
        Date date = getDateRemoveTime(new Date());
        //当前日期30天后的日期
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.add(Calendar.DAY_OF_MONTH, 30);
        //当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        if (scheduleDao.countByExample(example) != 0) {
            System.out.println("enterMen" + scheduleDao.countByExample(example));
            example.setOrderByClause("onDutyDate desc");
            example.setLimit(1);
            Date lastDate = scheduleDao.selectByExample(example).get(0).getOnDutyDate();
            if (getDateRemoveTime(lastDate).compareTo(getDateRemoveTime(date)) >= 0) {
                date = getDateRemoveTime(lastDate);
                calendar.setTime(date);
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }

        }
        /*
        若排班信息表为空或排班信息表的最后一条信息日期小于当前日期，则根据排班规则生成当天及以后三十天的排班信息。
        若最后一条信息大于等于当前日期，则生成信息对应日期之后直到三十天的信息
         */
        System.out.println("startTest");
        while (calendar.compareTo(endCalendar) <= 0) {
            ScheduleRuleViewExample scheduleruleviewExample = new ScheduleRuleViewExample();
            ScheduleRuleViewExample.Criteria criteria1 = scheduleruleviewExample.createCriteria();
            criteria1.andWeekEqualTo(calendar.get(Calendar.DAY_OF_WEEK) - 1);
            List<ScheduleRuleView> scheduleRuleViews = scheduleruleviewDao.selectByExample(scheduleruleviewExample);
            List<Schedule> schedules = getSchedulesByRule(scheduleRuleViews, calendar);
            System.out.println(scheduleRuleViews.size());
            for (int i = 0; i < schedules.size(); i++) {
                if (checkContent(schedules.get(i), 0))
                    scheduleDao.insert(schedules.get(i));
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

    }

    @Override
    public List<Schedule> getSchedulesByRule(List<ScheduleRuleView> scheduleRuleViews, Calendar calendar) {
        ;
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
            schedules.add(schedule);
        }
        System.out.println("生成规则大小" + schedules.size());
        return schedules;
    }

    @Override
    public Date getDateRemoveTime(Date date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = format.format(date);
        date = format.parse(dateStr);
        return date;
    }

    @Override
//    @CacheEvict("schedule")
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        //标识文件内容是否有错
        Boolean state = true;
        Schedule schedule;
        Workbook book;
        try {
            book = new XSSFWorkbook(file.getInputStream());
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);

        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                schedule = new Schedule();
                Row row = sheet.getRow(i);
                schedule.setOnDutyDate(row.getCell(0).getDateCellValue());
                schedule.setOnDutyDoctorID(userViewDao.getIDByName(row.getCell(1).toString()));
                schedule.setLevelNameID(constantItemDao.findIdByName(row.getCell(2).toString(), 13).getId());
                schedule.setDeptID(userViewDao.getDeptIDByDoctorID(schedule.getOnDutyDoctorID()));
                schedule.setOnDutyTimeID(constantItemDao.findIdByName(row.getCell(3).toString(), 15).getId());
                row.getCell(4).setCellType(CellType.STRING);
                schedule.setLimitNumber(Integer.parseInt(row.getCell(4).toString()));

                //遇到重复是否继续执行
                if (checkContent(schedule, 0)) {
                    add(schedule, userID);
                } else if (repeatCoverage) {
                    schedule.setId(scheduleviewDao.getIDByDateAndUserName(simpleDateFormat2.format(schedule.getOnDutyDate()), schedule.getOnDutyDoctorID()));
                    scheduleDao.updateByPrimaryKeySelective(schedule);
                }
            } catch (Exception e) {
                e.printStackTrace();
                //遇到错误是否继续执行
                state = false;
                if (errorHappenContinue)
                    continue;
                else
                    return false;

            }

        }
        file.getInputStream().close();
        return state;
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName = "schedule.xls";
        List<ScheduleView> results = scheduleviewDao.selectByExample(new ScheduleViewExample());
        String[] title = {"编号", "排班日期", "科室名称", "值班医生", "号别", "排班限额", "剩余号数",
                "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        for (int i = 0; i < results.size(); i++) {
            // 创建行
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId().toString());
            row.createCell(1).setCellValue(simpleDateFormat2.format(results.get(i).getOnDutyDate()));
            row.createCell(2).setCellValue(results.get(i).getDeptName());
            row.createCell(3).setCellValue(results.get(i).getUserName());
            row.createCell(4).setCellValue(results.get(i).getLevelName());
            row.createCell(5).setCellValue(results.get(i).getLimitNumber());
            row.createCell(6).setCellValue(results.get(i).getRemainingAmount());
            if (results.get(i).getAppearDate() != null)
                row.createCell(7).setCellValue(simpleDateFormat1.format(results.get(i).getAppearDate()));
            row.createCell(8).setCellValue(results.get(i).getAppearUserID());
            if (results.get(i).getChangeDate() != null)
                row.createCell(9).setCellValue(simpleDateFormat1.format(results.get(i).getChangeDate()));
            row.createCell(10).setCellValue(results.get(i).getChangeUserID());

        }

        File file = FileManage.createXLSFile(wb, path, fileName);
        return file;
    }

    @Override
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName = "scheduleTemplate.xls";
        String[] title = {"排班日期", "值班医生", "号别", "午别", "排班限额"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }

}
