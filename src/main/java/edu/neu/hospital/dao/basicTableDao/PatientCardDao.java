package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.PatientCard;
import edu.neu.hospital.example.basicTableExample.PatientCardExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientCardDao {
    long countByExample(PatientCardExample example);

    int deleteByExample(PatientCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatientCard record);

    int insertSelective(PatientCard record);

    List<PatientCard> selectByExample(PatientCardExample example);

    PatientCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatientCard record, @Param("example") PatientCardExample example);

    int updateByExample(@Param("record") PatientCard record, @Param("example") PatientCardExample example);

    int updateByPrimaryKeySelective(PatientCard record);

    int updateByPrimaryKey(PatientCard record);
}