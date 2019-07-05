package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.PrescriptionDetailView;
import edu.neu.hospital.example.basicTableExample.PrescriptionDetailViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptionDetailViewDao {
    long countByExample(PrescriptionDetailViewExample example);

    int deleteByExample(PrescriptionDetailViewExample example);

    int insert(PrescriptionDetailView record);

    int insertSelective(PrescriptionDetailView record);

    List<PrescriptionDetailView> selectByExample(PrescriptionDetailViewExample example);

    int updateByExampleSelective(@Param("record") PrescriptionDetailView record, @Param("example") PrescriptionDetailViewExample example);

    int updateByExample(@Param("record") PrescriptionDetailView record, @Param("example") PrescriptionDetailViewExample example);
}