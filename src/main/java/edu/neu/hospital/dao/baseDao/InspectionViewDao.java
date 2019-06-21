package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.basicTableBean.InspectionView;
import edu.neu.hospital.example.baseExample.InspectionViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface InspectionViewDao {
    long countByExample(InspectionViewExample example);

    int deleteByExample(InspectionViewExample example);

    int insert(InspectionView record);

    int insertSelective(InspectionView record);

    List<InspectionView> selectByExample(InspectionViewExample example);

    int updateByExampleSelective(@Param("record") InspectionView record, @Param("example") InspectionViewExample example);

    int updateByExample(@Param("record") InspectionView record, @Param("example") InspectionViewExample example);
}