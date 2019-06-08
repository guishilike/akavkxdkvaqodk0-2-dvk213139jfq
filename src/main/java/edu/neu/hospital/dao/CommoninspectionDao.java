package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Commoninspection;
import edu.neu.hospital.example.CommoninspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoninspectionDao {
    long countByExample(CommoninspectionExample example);

    int deleteByExample(CommoninspectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commoninspection record);

    int insertSelective(Commoninspection record);

    List<Commoninspection> selectByExample(CommoninspectionExample example);

    Commoninspection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commoninspection record, @Param("example") CommoninspectionExample example);

    int updateByExample(@Param("record") Commoninspection record, @Param("example") CommoninspectionExample example);

    int updateByPrimaryKeySelective(Commoninspection record);

    int updateByPrimaryKey(Commoninspection record);
}