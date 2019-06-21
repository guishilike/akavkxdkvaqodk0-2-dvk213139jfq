package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleRuleViewDao {
    long countByExample(ScheduleRuleViewExample example);

    int deleteByExample(ScheduleRuleViewExample example);

    int insert(ScheduleRuleView record);

    int insertSelective(ScheduleRuleView record);

    List<ScheduleRuleView> selectByExample(ScheduleRuleViewExample example);

    int updateByExampleSelective(@Param("record") ScheduleRuleView record, @Param("example") ScheduleRuleViewExample example);

    int updateByExample(@Param("record") ScheduleRuleView record, @Param("example") ScheduleRuleViewExample example);
}