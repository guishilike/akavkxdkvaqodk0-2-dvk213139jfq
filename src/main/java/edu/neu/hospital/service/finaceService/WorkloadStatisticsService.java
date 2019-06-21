package edu.neu.hospital.service.finaceService;


import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;

import java.util.Date;
import java.util.List;


public interface WorkloadStatisticsService {
    /**
     *
     * @param realName 用户真实姓名
     * @param departmentName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Workloadstatistics类型的工作量统计list
     */
    List<WorkLoadStatistics> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd);
}
