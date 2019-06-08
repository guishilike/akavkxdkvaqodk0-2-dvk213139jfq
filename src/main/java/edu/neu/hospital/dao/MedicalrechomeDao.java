package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Medicalrechome;
import edu.neu.hospital.example.MedicalrechomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalrechomeDao {
    long countByExample(MedicalrechomeExample example);

    int deleteByExample(MedicalrechomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicalrechome record);

    int insertSelective(Medicalrechome record);

    List<Medicalrechome> selectByExample(MedicalrechomeExample example);

    Medicalrechome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medicalrechome record, @Param("example") MedicalrechomeExample example);

    int updateByExample(@Param("record") Medicalrechome record, @Param("example") MedicalrechomeExample example);

    int updateByPrimaryKeySelective(Medicalrechome record);

    int updateByPrimaryKey(Medicalrechome record);
}