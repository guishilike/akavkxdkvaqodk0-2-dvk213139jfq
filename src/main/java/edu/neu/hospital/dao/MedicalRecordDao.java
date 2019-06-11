package edu.neu.hospital.dao;

import edu.neu.hospital.bean.MedicalRecord;
import edu.neu.hospital.example.MedicalrecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordDao {
    long countByExample(MedicalrecordExample example);

    int deleteByExample(MedicalrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecord record);

    int insertSelective(MedicalRecord record);

    List<MedicalRecord> selectByExample(MedicalrecordExample example);

    MedicalRecord selectByPrimaryKey(Integer id);

    MedicalRecord selectByMedRecNo(String medRecNo);

    int updateByExampleSelective(@Param("record") MedicalRecord record, @Param("example") MedicalrecordExample example);

    int updateByExample(@Param("record") MedicalRecord record, @Param("example") MedicalrecordExample example);

    int updateByPrimaryKeySelective(MedicalRecord record);

    int updateByPrimaryKey(MedicalRecord record);
}