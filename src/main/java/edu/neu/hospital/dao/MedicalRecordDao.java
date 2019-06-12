package edu.neu.hospital.dao;

import edu.neu.hospital.bean.MedicalRecord;
import edu.neu.hospital.example.MedicalRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordDao {
    long countByExample(MedicalRecordExample example);

    int deleteByExample(MedicalRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecord record);

    int insertSelective(MedicalRecord record);

    List<MedicalRecord> selectByExample(MedicalRecordExample example);

    MedicalRecord selectByPrimaryKey(Integer id);

    MedicalRecord selectByMedRecNo(String medRecNo);

    int updateByExampleSelective(@Param("record") MedicalRecord record, @Param("example") MedicalRecordExample example);

    int updateByExample(@Param("record") MedicalRecord record, @Param("example") MedicalRecordExample example);

    int updateByPrimaryKeySelective(MedicalRecord record);

    int updateByPrimaryKey(MedicalRecord record);
}