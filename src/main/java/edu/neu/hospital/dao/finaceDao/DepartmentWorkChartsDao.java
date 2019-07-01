package edu.neu.hospital.dao.finaceDao;

import edu.neu.hospital.bean.finaceBean.DepartmentWorkCharts;
import edu.neu.hospital.example.finaceExample.DepartmentWorkChartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentWorkChartsDao {
    long countByExample(DepartmentWorkChartsExample example);

    int deleteByExample(DepartmentWorkChartsExample example);

    int insert(DepartmentWorkCharts record);

    int insertSelective(DepartmentWorkCharts record);

    List<DepartmentWorkCharts> selectByExample(DepartmentWorkChartsExample example);

    int updateByExampleSelective(@Param("record") DepartmentWorkCharts record, @Param("example") DepartmentWorkChartsExample example);

    int updateByExample(@Param("record") DepartmentWorkCharts record, @Param("example") DepartmentWorkChartsExample example);
}