package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.PrescriptionFee;
import edu.neu.hospital.example.basicTableExample.PrescriptionFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptionFeeDao {
    long countByExample(PrescriptionFeeExample example);

    int deleteByExample(PrescriptionFeeExample example);

    int insert(PrescriptionFee record);

    int insertSelective(PrescriptionFee record);

    List<PrescriptionFee> selectByExample(PrescriptionFeeExample example);

    int updateByExampleSelective(@Param("record") PrescriptionFee record, @Param("example") PrescriptionFeeExample example);

    int updateByExample(@Param("record") PrescriptionFee record, @Param("example") PrescriptionFeeExample example);
}