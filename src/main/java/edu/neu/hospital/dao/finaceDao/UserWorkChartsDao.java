package edu.neu.hospital.dao.finaceDao;

import edu.neu.hospital.bean.finaceBean.UserWorkCharts;
import edu.neu.hospital.example.finaceExample.UserWorkChartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWorkChartsDao {
    long countByExample(UserWorkChartsExample example);

    int deleteByExample(UserWorkChartsExample example);

    int insert(UserWorkCharts record);

    int insertSelective(UserWorkCharts record);

    List<UserWorkCharts> selectByExample(UserWorkChartsExample example);

    int updateByExampleSelective(@Param("record") UserWorkCharts record, @Param("example") UserWorkChartsExample example);

    int updateByExample(@Param("record") UserWorkCharts record, @Param("example") UserWorkChartsExample example);
}