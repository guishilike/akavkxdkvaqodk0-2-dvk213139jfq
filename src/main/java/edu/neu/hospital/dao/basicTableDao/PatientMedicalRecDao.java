package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.PatientMedicalRec;
import edu.neu.hospital.example.basicTableExample.PatientMedicalRecExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PatientMedicalRecDao {
    long countByExample(PatientMedicalRecExample example);

    int deleteByExample(PatientMedicalRecExample example);

    int insert(PatientMedicalRec record);

    int insertSelective(PatientMedicalRec record);

    List<PatientMedicalRec> selectByExample(PatientMedicalRecExample example);

    int updateByExampleSelective(@Param("record") PatientMedicalRec record, @Param("example") PatientMedicalRecExample example);

    int updateByExample(@Param("record") PatientMedicalRec record, @Param("example") PatientMedicalRecExample example);
}