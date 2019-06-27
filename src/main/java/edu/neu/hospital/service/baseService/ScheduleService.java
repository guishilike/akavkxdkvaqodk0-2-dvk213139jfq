package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.dto.IdDTO;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface ScheduleService {
    /**
     * 添加排班信息
     */
    public void add(Schedule schedule, Integer userID);

    /**
     * 删除排班信息
     *
     * @param id     排班信息id
     * @param userID 用户ID
     */
    public void delete(Integer id, Integer userID);

    /**
     * 批量删除排班信息
     *
     * @param idDTO  选中的排班信息id
     * @param userID 用户ID
     */
    public void deleteByChoose(IdDTO idDTO, Integer userID);

    /**
     * 修改排班信息
     *
     * @param schedule 修改排班信息的内容
     * @param userID   用户ID
     */
    public void change(Schedule schedule, Integer userID);

    /**
     * 查重
     *
     * @param schedule 要进行查重的排班信息
     * @param state    查重状态，state=0表示添加时查重，state=1表示修改时查重
     */
    public boolean checkContent(Schedule schedule, int state);

    /**
     * 通过星期,科室分类id和科室类型id来查找排班信息
     *
     * @param startDate      开始日期
     * @param endDate        结束日期
     * @param deptCategoryID 科室分类id
     * @param deptTypeID     科室类型id
     */
    public List<ScheduleView> find(Date startDate, Date endDate, Integer deptCategoryID, Integer deptTypeID);

    /**
     * 自动生成排班信息
     */
    public void generate() throws ParseException;

    /**
     * 根据排班规则生成排班信息
     *
     * @param scheduleRuleViews 排班规则列表
     * @param calendar          医生排班日期
     */
    public List<Schedule> getSchedulesByRule(List<ScheduleRuleView> scheduleRuleViews, Calendar calendar);

    /**
     * @param date 要截断时间的日期
     * @return Date 返回的日期
     */
    public Date getDateRemoveTime(Date date) throws ParseException;
}
