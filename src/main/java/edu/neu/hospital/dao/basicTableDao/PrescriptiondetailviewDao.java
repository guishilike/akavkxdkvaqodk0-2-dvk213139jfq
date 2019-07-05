package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Prescriptiondetailview;
import edu.neu.hospital.example.basicTableExample.PrescriptiondetailviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptiondetailviewDao {
    long countByExample(PrescriptiondetailviewExample example);

    int deleteByExample(PrescriptiondetailviewExample example);

    int insert(Prescriptiondetailview record);

    int insertSelective(Prescriptiondetailview record);

    List<Prescriptiondetailview> selectByExample(PrescriptiondetailviewExample example);

    int updateByExampleSelective(@Param("record") Prescriptiondetailview record, @Param("example") PrescriptiondetailviewExample example);

    int updateByExample(@Param("record") Prescriptiondetailview record, @Param("example") PrescriptiondetailviewExample example);
}