package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.PatientCardFeeRecord;
import edu.neu.hospital.example.basicTableExample.PatientCardFeeRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientCardFeeRecordDao {
    long countByExample(PatientCardFeeRecordExample example);

    int deleteByExample(PatientCardFeeRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatientCardFeeRecord record);

    int insertSelective(PatientCardFeeRecord record);

    List<PatientCardFeeRecord> selectByExample(PatientCardFeeRecordExample example);

    PatientCardFeeRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatientCardFeeRecord record, @Param("example") PatientCardFeeRecordExample example);

    int updateByExample(@Param("record") PatientCardFeeRecord record, @Param("example") PatientCardFeeRecordExample example);

    int updateByPrimaryKeySelective(PatientCardFeeRecord record);

    int updateByPrimaryKey(PatientCardFeeRecord record);
}