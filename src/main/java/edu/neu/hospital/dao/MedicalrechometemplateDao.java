package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Medicalrechometemplate;
import edu.neu.hospital.example.MedicalrechometemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalrechometemplateDao {
    long countByExample(MedicalrechometemplateExample example);

    int deleteByExample(MedicalrechometemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicalrechometemplate record);

    int insertSelective(Medicalrechometemplate record);

    List<Medicalrechometemplate> selectByExample(MedicalrechometemplateExample example);

    Medicalrechometemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medicalrechometemplate record, @Param("example") MedicalrechometemplateExample example);

    int updateByExample(@Param("record") Medicalrechometemplate record, @Param("example") MedicalrechometemplateExample example);

    int updateByPrimaryKeySelective(Medicalrechometemplate record);

    int updateByPrimaryKey(Medicalrechometemplate record);
}