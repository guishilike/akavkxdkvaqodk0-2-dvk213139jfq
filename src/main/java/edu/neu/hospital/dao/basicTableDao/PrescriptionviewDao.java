package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Prescriptionview;
import edu.neu.hospital.example.basicTableExample.PrescriptionviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptionviewDao {
    long countByExample(PrescriptionviewExample example);

    int deleteByExample(PrescriptionviewExample example);

    int insert(Prescriptionview record);

    int insertSelective(Prescriptionview record);

    List<Prescriptionview> selectByExample(PrescriptionviewExample example);

    int updateByExampleSelective(@Param("record") Prescriptionview record, @Param("example") PrescriptionviewExample example);

    int updateByExample(@Param("record") Prescriptionview record, @Param("example") PrescriptionviewExample example);
}