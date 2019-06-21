package edu.neu.hospital.dao.finaceDao;

import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;
import edu.neu.hospital.example.finaceExample.WorkLoadStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkLoadStatisticsDao {
    long countByExample(WorkLoadStatisticsExample example);

    int deleteByExample(WorkLoadStatisticsExample example);

    int insert(WorkLoadStatistics record);

    int insertSelective(WorkLoadStatistics record);

    List<WorkLoadStatistics> selectByExample(WorkLoadStatisticsExample example);

    int updateByExampleSelective(@Param("record") WorkLoadStatistics record, @Param("example") WorkLoadStatisticsExample example);

    int updateByExample(@Param("record") WorkLoadStatistics record, @Param("example") WorkLoadStatisticsExample example);
}