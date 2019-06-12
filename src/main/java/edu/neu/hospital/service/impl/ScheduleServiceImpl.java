package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.Schedule;
import edu.neu.hospital.bean.ScheduleRule;
import edu.neu.hospital.dao.ScheduleRuleDao;
import edu.neu.hospital.service.ScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiJie
 * @date 2019/6/12 10:17
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Resource
    ScheduleRuleDao scheduleRuleDao;

    @Override
    public int addScheduleRule(ScheduleRule scheduleRule) {

        return scheduleRuleDao.insert(scheduleRule);
    }

    @Override
    public int deleteScheduleRule(Integer id) {

        return scheduleRuleDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<Schedule> generateSchedule() {

        return null;
    }
}
