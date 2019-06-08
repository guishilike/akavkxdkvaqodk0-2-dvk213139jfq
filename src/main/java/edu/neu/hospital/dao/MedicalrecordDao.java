package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Medicalrecord;
import edu.neu.hospital.example.MedicalrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalrecordDao {
    long countByExample(MedicalrecordExample example);

    int deleteByExample(MedicalrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    List<Medicalrecord> selectByExample(MedicalrecordExample example);

    Medicalrecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByExample(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByPrimaryKeySelective(Medicalrecord record);

    int updateByPrimaryKey(Medicalrecord record);
}