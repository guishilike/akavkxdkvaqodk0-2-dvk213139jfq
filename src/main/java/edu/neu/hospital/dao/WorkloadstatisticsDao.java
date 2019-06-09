package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.example.WorkloadstatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkloadstatisticsDao {
    long countByExample(WorkloadstatisticsExample example);

    int deleteByExample(WorkloadstatisticsExample example);

    int insert(Workloadstatistics record);

    int insertSelective(Workloadstatistics record);

    List<Workloadstatistics> selectByExample(WorkloadstatisticsExample example);

    int updateByExampleSelective(@Param("record") Workloadstatistics record, @Param("example") WorkloadstatisticsExample example);

    int updateByExample(@Param("record") Workloadstatistics record, @Param("example") WorkloadstatisticsExample example);
}