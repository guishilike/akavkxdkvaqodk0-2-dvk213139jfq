package edu.neu.hospital.service;

import edu.neu.hospital.bean.Workloadstatistics;

import java.util.Date;
import java.util.List;

public interface WorkloadStatisticsService {
    List<Workloadstatistics> findByInfo(String userName, String departmentName, Date dateStart, Date dateEnd);
}
