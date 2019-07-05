package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonInspectionView;
import edu.neu.hospital.example.basicTableExample.CommonInspectionViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonInspectionViewDao {
    long countByExample(CommonInspectionViewExample example);

    int deleteByExample(CommonInspectionViewExample example);

    int insert(CommonInspectionView record);

    int insertSelective(CommonInspectionView record);

    List<CommonInspectionView> selectByExample(CommonInspectionViewExample example);

    int updateByExampleSelective(@Param("record") CommonInspectionView record, @Param("example") CommonInspectionViewExample example);

    int updateByExample(@Param("record") CommonInspectionView record, @Param("example") CommonInspectionViewExample example);
}