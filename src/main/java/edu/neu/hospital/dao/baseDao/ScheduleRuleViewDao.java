package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.example.basicTableExample.ScheduleRuleViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ScheduleRuleViewDao {
    long countByExample(ScheduleRuleViewExample example);

    int deleteByExample(ScheduleRuleViewExample example);

    int insert(ScheduleRuleView record);

    int insertSelective(ScheduleRuleView record);

    List<ScheduleRuleView> selectByExample(ScheduleRuleViewExample example);

    int updateByExampleSelective(@Param("record") ScheduleRuleView record, @Param("example") ScheduleRuleViewExample example);

    int updateByExample(@Param("record") ScheduleRuleView record, @Param("example") ScheduleRuleViewExample example);

    @Select("select id scheduleruleview where userName=#{userName} and week={week}")
    int getIDByUserNameAndWeek(String userName,Integer week);
}