package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Inspectionresultimage;
import edu.neu.hospital.bean.InspectionresultimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionresultimageDao {
    long countByExample(InspectionresultimageExample example);

    int deleteByExample(InspectionresultimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inspectionresultimage record);

    int insertSelective(Inspectionresultimage record);

    List<Inspectionresultimage> selectByExampleWithBLOBs(InspectionresultimageExample example);

    List<Inspectionresultimage> selectByExample(InspectionresultimageExample example);

    Inspectionresultimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inspectionresultimage record, @Param("example") InspectionresultimageExample example);

    int updateByExampleWithBLOBs(@Param("record") Inspectionresultimage record, @Param("example") InspectionresultimageExample example);

    int updateByExample(@Param("record") Inspectionresultimage record, @Param("example") InspectionresultimageExample example);

    int updateByPrimaryKeySelective(Inspectionresultimage record);

    int updateByPrimaryKeyWithBLOBs(Inspectionresultimage record);

    int updateByPrimaryKey(Inspectionresultimage record);
}