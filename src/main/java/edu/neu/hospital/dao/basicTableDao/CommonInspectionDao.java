package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonInspection;
import edu.neu.hospital.example.basicTableExample.CommonInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonInspectionDao {
    long countByExample(CommonInspectionExample example);

    int deleteByExample(CommonInspectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonInspection record);

    int insertSelective(CommonInspection record);

    List<CommonInspection> selectByExample(CommonInspectionExample example);

    CommonInspection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonInspection record, @Param("example") CommonInspectionExample example);

    int updateByExample(@Param("record") CommonInspection record, @Param("example") CommonInspectionExample example);

    int updateByPrimaryKeySelective(CommonInspection record);

    int updateByPrimaryKey(CommonInspection record);
}