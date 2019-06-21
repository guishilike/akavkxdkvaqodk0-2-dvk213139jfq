package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleRuleDao {
    long countByExample(ScheduleRuleExample example);

    int deleteByExample(ScheduleRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schedulerule record);

    int insertSelective(Schedulerule record);

    List<Schedulerule> selectByExample(ScheduleRuleExample example);

    Schedulerule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schedulerule record, @Param("example") ScheduleRuleExample example);

    int updateByExample(@Param("record") Schedulerule record, @Param("example") ScheduleRuleExample example);

    int updateByPrimaryKeySelective(Schedulerule record);

    int updateByPrimaryKey(Schedulerule record);
}