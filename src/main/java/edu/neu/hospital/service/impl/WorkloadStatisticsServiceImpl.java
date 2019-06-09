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
    public List<Workloadstatistics> findByInfo(String userName, String departmentName, Date dateStart, Date dateEnd) {
        WorkloadstatisticsExample workstatisticsExample = new WorkloadstatisticsExample();
        WorkloadstatisticsExample.Criteria criteria = workstatisticsExample.createCriteria();
        if(userName != null){
            criteria.andRealnameEqualTo(userName);
        }
        if(departmentName != null){
            criteria.andDeptnameEqualTo(departmentName);
        }
        if(dateStart != null){
            criteria.andFeeappeardateGreaterThan(dateStart);
        }
        if(dateEnd != null){
            criteria.andFeeappeardateLessThan(dateEnd);
        }
        List<Workloadstatistics> list = workloadstatisticsDao.selectByExample(workstatisticsExample);
        return list;
    }

}
