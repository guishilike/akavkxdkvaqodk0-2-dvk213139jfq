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
