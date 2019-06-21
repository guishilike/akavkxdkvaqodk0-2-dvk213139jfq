package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.MedicalRecHomeTemplate;
import edu.neu.hospital.example.basicTableExample.MedicalRecHomeTemplateExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalRecHomeTemplateDao {
    long countByExample(MedicalRecHomeTemplateExample example);

    int deleteByExample(MedicalRecHomeTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecHomeTemplate record);

    int insertSelective(MedicalRecHomeTemplate record);

    List<MedicalRecHomeTemplate> selectByExample(MedicalRecHomeTemplateExample example);

    MedicalRecHomeTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalRecHomeTemplate record, @Param("example") MedicalRecHomeTemplateExample example);

    int updateByExample(@Param("record") MedicalRecHomeTemplate record, @Param("example") MedicalRecHomeTemplateExample example);

    int updateByPrimaryKeySelective(MedicalRecHomeTemplate record);

    int updateByPrimaryKey(MedicalRecHomeTemplate record);
}