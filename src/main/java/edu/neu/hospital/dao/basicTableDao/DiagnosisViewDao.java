package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.DiagnosisView;
import edu.neu.hospital.example.basicTableExample.DiagnosisViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiagnosisViewDao {
    long countByExample(DiagnosisViewExample example);

    int deleteByExample(DiagnosisViewExample example);

    int insert(DiagnosisView record);

    int insertSelective(DiagnosisView record);

    List<DiagnosisView> selectByExample(DiagnosisViewExample example);

    int updateByExampleSelective(@Param("record") DiagnosisView record, @Param("example") DiagnosisViewExample example);

    int updateByExample(@Param("record") DiagnosisView record, @Param("example") DiagnosisViewExample example);
}