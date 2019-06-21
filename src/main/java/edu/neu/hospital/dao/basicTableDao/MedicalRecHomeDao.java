package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.MedicalRecHome;
import edu.neu.hospital.example.basicTableExample.MedicalRecHomeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface MedicalRecHomeDao {
    long countByExample(MedicalRecHomeExample example);

    int deleteByExample(MedicalRecHomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecHome record);

    int insertSelective(MedicalRecHome record);

    List<MedicalRecHome> selectByExample(MedicalRecHomeExample example);

    MedicalRecHome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalRecHome record, @Param("example") MedicalRecHomeExample example);

    int updateByExample(@Param("record") MedicalRecHome record, @Param("example") MedicalRecHomeExample example);

    int updateByPrimaryKeySelective(MedicalRecHome record);

    int updateByPrimaryKey(MedicalRecHome record);
}