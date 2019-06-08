package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Schedulerule;
import edu.neu.hospital.example.ScheduleruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleruleDao {
    long countByExample(ScheduleruleExample example);

    int deleteByExample(ScheduleruleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schedulerule record);

    int insertSelective(Schedulerule record);

    List<Schedulerule> selectByExample(ScheduleruleExample example);

    Schedulerule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schedulerule record, @Param("example") ScheduleruleExample example);

    int updateByExample(@Param("record") Schedulerule record, @Param("example") ScheduleruleExample example);

    int updateByPrimaryKeySelective(Schedulerule record);

    int updateByPrimaryKey(Schedulerule record);
}