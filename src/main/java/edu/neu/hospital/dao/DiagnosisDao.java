package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Diagnosis;
import edu.neu.hospital.example.DiagnosisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiagnosisDao {
    long countByExample(DiagnosisExample example);

    int deleteByExample(DiagnosisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Diagnosis record);

    int insertSelective(Diagnosis record);

    List<Diagnosis> selectByExample(DiagnosisExample example);

    Diagnosis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    int updateByExample(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    int updateByPrimaryKeySelective(Diagnosis record);

    int updateByPrimaryKey(Diagnosis record);
}