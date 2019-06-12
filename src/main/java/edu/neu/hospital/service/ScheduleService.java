package edu.neu.hospital.service;

import edu.neu.hospital.bean.Schedule;
import edu.neu.hospital.bean.ScheduleRule;

import java.util.List;

/**
 * 排班服务
 *
 * @author LiJie
 * @date 2019/6/12 10:06
 */
public interface ScheduleService {


    /**
     * 新增排班规则
     *
     * @param scheduleRule 排班规则
     * @return 1表示成功，0表示失败
     */
    int addScheduleRule(ScheduleRule scheduleRule);

    /**
     * 删除排班规则
     *
     * @param id 主键
     * @return 1表示成功，0表示失败
     */
    int deleteScheduleRule(Integer id);


    /**
     * 生成排班计划
     *
     * @return 排班信息列表
     */
    List<Schedule> generateSchedule();

}
