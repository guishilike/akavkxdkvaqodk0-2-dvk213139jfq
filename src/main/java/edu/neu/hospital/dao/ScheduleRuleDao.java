package edu.neu.hospital.dao;

import edu.neu.hospital.bean.ScheduleRule;
import edu.neu.hospital.example.ScheduleRuleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRuleDao {
    long countByExample(ScheduleRuleExample example);

    int deleteByExample(ScheduleRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleRule record);

    int insertSelective(ScheduleRule record);

    List<ScheduleRule> selectByExample(ScheduleRuleExample example);

    ScheduleRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    int updateByExample(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    int updateByPrimaryKeySelective(ScheduleRule record);

    int updateByPrimaryKey(ScheduleRule record);
}