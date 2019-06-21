package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonDiagnosis;
import edu.neu.hospital.example.basicTableExample.CommonDiagnosisExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommonDiagnosisDao {
    long countByExample(CommonDiagnosisExample example);

    int deleteByExample(CommonDiagnosisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonDiagnosis record);

    int insertSelective(CommonDiagnosis record);

    List<CommonDiagnosis> selectByExample(CommonDiagnosisExample example);

    CommonDiagnosis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonDiagnosis record, @Param("example") CommonDiagnosisExample example);

    int updateByExample(@Param("record") CommonDiagnosis record, @Param("example") CommonDiagnosisExample example);

    int updateByPrimaryKeySelective(CommonDiagnosis record);

    int updateByPrimaryKey(CommonDiagnosis record);
}