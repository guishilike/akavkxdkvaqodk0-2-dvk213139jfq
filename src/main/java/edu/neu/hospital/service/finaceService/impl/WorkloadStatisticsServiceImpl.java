package edu.neu.hospital.service.finaceService.impl;


import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;
import edu.neu.hospital.dao.finaceDao.WorkLoadStatisticsDao;
import edu.neu.hospital.example.finaceExample.WorkLoadStatisticsExample;
import edu.neu.hospital.service.finaceService.WorkloadStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class WorkloadStatisticsServiceImpl implements WorkloadStatisticsService {
    @Resource
    WorkLoadStatisticsDao workloadstatisticsDao;

    /**
     * 根据信息查找工作量统计
     * @param realName 用户真实姓名
     * @param departmentName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Workloadstatistics类型的工作量统计list
     */
    @Override
    public List<WorkLoadStatistics> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd) {
        WorkLoadStatisticsExample workloadstatisticsExample = new WorkLoadStatisticsExample();
        workloadstatisticsExample.clear();
        WorkLoadStatisticsExample.Criteria criteria = workloadstatisticsExample.createCriteria();
        if(realName != null){
            criteria.andRealNameEqualTo(realName);
        }
        if(departmentName != null){
            criteria.andDeptNameEqualTo(departmentName);
        }
        if(dateStart != null){
            criteria.andFeeAppearDateGreaterThan(dateStart);
        }
        if(dateEnd != null){
            criteria.andFeeAppearDateLessThan(dateEnd);
        }
        List<WorkLoadStatistics> list = workloadstatisticsDao.selectByExample(workloadstatisticsExample);
        return list;
    }

}
