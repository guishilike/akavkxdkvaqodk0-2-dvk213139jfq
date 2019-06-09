package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Patientcard;
import edu.neu.hospital.example.PatientcardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientcardDao {
    long countByExample(PatientcardExample example);

    int deleteByExample(PatientcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patientcard record);

    int insertSelective(Patientcard record);

    List<Patientcard> selectByExample(PatientcardExample example);

    Patientcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Patientcard record, @Param("example") PatientcardExample example);

    int updateByExample(@Param("record") Patientcard record, @Param("example") PatientcardExample example);

    int updateByPrimaryKeySelective(Patientcard record);

    int updateByPrimaryKey(Patientcard record);
}