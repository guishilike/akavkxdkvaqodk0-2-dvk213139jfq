package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    /**
     * 获取所有医生的名称和编号
     * @return
     */
    public List<NameCodeDTO> getAllDoctors();
    /**
     * 根据科室获取所有医生的名称和编号
     * @return
     */
    public List<NameCodeDTO> getAllDoctorsByDeptID(Integer deptID);

    /**
     * 用Excle表导入到数据库
     * @param file Excle文件
     * @param errorHappenContinue 错误发生时是否继续
     * @param repeatCoverage  遇到重复信息是否覆盖
     * @throws IOException 抛出的 IO异常
     * @return
     */
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException;

    /**
     * 从数据库导出
     */
    public File createExcel() throws IOException;
    /**
     * 创建下载模板
     * @return
     */
    public File createXLSTemplate() throws IOException;





}
