package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.example.baseExample.ScheduleViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleViewDao {
    long countByExample(ScheduleViewExample example);

    int deleteByExample(ScheduleViewExample example);

    int insert(ScheduleView record);

    int insertSelective(ScheduleView record);

    List<ScheduleView> selectByExample(ScheduleViewExample example);

    int updateByExampleSelective(@Param("record") ScheduleView record, @Param("example") ScheduleViewExample example);

    int updateByExample(@Param("record") ScheduleView record, @Param("example") ScheduleViewExample example);
}