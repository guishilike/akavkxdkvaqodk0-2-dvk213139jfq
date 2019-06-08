package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Commondiagnosis;
import edu.neu.hospital.example.CommondiagnosisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommondiagnosisDao {
    long countByExample(CommondiagnosisExample example);

    int deleteByExample(CommondiagnosisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commondiagnosis record);

    int insertSelective(Commondiagnosis record);

    List<Commondiagnosis> selectByExample(CommondiagnosisExample example);

    Commondiagnosis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commondiagnosis record, @Param("example") CommondiagnosisExample example);

    int updateByExample(@Param("record") Commondiagnosis record, @Param("example") CommondiagnosisExample example);

    int updateByPrimaryKeySelective(Commondiagnosis record);

    int updateByPrimaryKey(Commondiagnosis record);
}