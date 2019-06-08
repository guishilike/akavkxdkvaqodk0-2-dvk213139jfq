package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Prescriptiondetail;
import edu.neu.hospital.example.PrescriptiondetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptiondetailDao {
    long countByExample(PrescriptiondetailExample example);

    int deleteByExample(PrescriptiondetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Prescriptiondetail record);

    int insertSelective(Prescriptiondetail record);

    List<Prescriptiondetail> selectByExample(PrescriptiondetailExample example);

    Prescriptiondetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Prescriptiondetail record, @Param("example") PrescriptiondetailExample example);

    int updateByExample(@Param("record") Prescriptiondetail record, @Param("example") PrescriptiondetailExample example);

    int updateByPrimaryKeySelective(Prescriptiondetail record);

    int updateByPrimaryKey(Prescriptiondetail record);
}