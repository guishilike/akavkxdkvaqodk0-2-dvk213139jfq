package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dao.WorkloadstatisticsDao;
import edu.neu.hospital.example.WorkloadstatisticsExample;
import edu.neu.hospital.service.WorkloadStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class WorkloadStatisticsServiceImpl implements WorkloadStatisticsService {
    @Resource
    WorkloadstatisticsDao workloadstatisticsDao;

    /**
     *
     * @param realName 用户真实姓名
     * @param departmentName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Workloadstatistics类型的工作量统计list
     */
    @Override
    public List<Workloadstatistics> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd) {
        WorkloadstatisticsExample workloadstatisticsExample = new WorkloadstatisticsExample();
        workloadstatisticsExample.clear();
        WorkloadstatisticsExample.Criteria criteria = workloadstatisticsExample.createCriteria();
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
        List<Workloadstatistics> list = workloadstatisticsDao.selectByExample(workloadstatisticsExample);
        return list;
    }

}
