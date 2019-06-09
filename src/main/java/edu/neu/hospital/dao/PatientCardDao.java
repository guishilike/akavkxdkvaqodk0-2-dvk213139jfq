package edu.neu.hospital.dao;

import edu.neu.hospital.bean.PatientCard;
import edu.neu.hospital.example.PatientCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientCardDao {
    long countByExample(PatientCardExample example);

    int deleteByExample(PatientCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatientCard record);

    int insertSelective(PatientCard record);

    List<PatientCard> selectByExample(PatientCardExample example);

    PatientCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatientCard record, @Param("example") PatientCardExample example);

    int updateByExample(@Param("record") PatientCard record, @Param("example") PatientCardExample example);

    int updateByPrimaryKeySelective(PatientCard record);

    int updateByPrimaryKey(PatientCard record);
}