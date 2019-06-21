package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.dto.IdDTO;

import java.util.Calendar;
import java.util.List;

public interface ScheduleRuleService {
    /**
     * 添加排班规则
     * @param  schedulerule
     * @param userID
     */
    public void add(Schedulerule schedulerule,Integer userID);
    /**
     * 删除排班规则
     * @param id 排班规则id
     * @param userID 用户ID
     */
    public void delete(Integer id,Integer userID);
    /**
     * 批量删除排班规则
     * @param idDTO 选中的排班规则id
     * @param userID 用户ID
     */
    public void deleteByChoose(IdDTO idDTO, Integer userID);
    /**
     * 修改排班规则
     * @param schedulerule 修改排班规则的内容
     * @param userID 用户ID
     */
    public void change(Schedulerule schedulerule,Integer userID);
    /**
     * 查重
     * @param schedulerule 要进行查重的排班规则
     * @param state 查重状态，state=0表示添加时查重，state=1表示修改时查重
     */
    public boolean checkContent(Schedulerule schedulerule,int state);
    /**
     *通过星期,科室分类id和科室类型id来查找排班规则
     * @param week 星期 0代表星期天，1代表星期一，2代表星期二.....
     * @param deptCategoryID 科室分类id
     * @param deptTypeID 科室类型id
     */
    public List<ScheduleRuleView> find(Integer week, Integer deptCategoryID, Integer deptTypeID);

    /**
     * 根据排班规则生成排班信息
     * @param schedulerule 排班规则
     * @param calendar 医生排班日期
     * @return Schedule 返回的排班信息
     */
    public Schedule getScheduleByRule(Schedulerule schedulerule, Calendar calendar);
    /**
     * 根据排班规则生成排班信息
     * @param schedulerule 排班规则
     * @return Schedule 返回的排班信息
     */
    public Schedule getScheduleByRule(Schedulerule schedulerule);




}
