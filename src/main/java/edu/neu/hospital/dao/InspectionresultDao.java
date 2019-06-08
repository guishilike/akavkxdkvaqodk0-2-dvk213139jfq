package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Inspectionresult;
import edu.neu.hospital.example.InspectionresultExample;
import edu.neu.hospital.bean.InspectionresultWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionresultDao {
    long countByExample(InspectionresultExample example);

    int deleteByExample(InspectionresultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionresultWithBLOBs record);

    int insertSelective(InspectionresultWithBLOBs record);

    List<InspectionresultWithBLOBs> selectByExampleWithBLOBs(InspectionresultExample example);

    List<Inspectionresult> selectByExample(InspectionresultExample example);

    InspectionresultWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionresultWithBLOBs record, @Param("example") InspectionresultExample example);

    int updateByExampleWithBLOBs(@Param("record") InspectionresultWithBLOBs record, @Param("example") InspectionresultExample example);

    int updateByExample(@Param("record") Inspectionresult record, @Param("example") InspectionresultExample example);

    int updateByPrimaryKeySelective(InspectionresultWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(InspectionresultWithBLOBs record);

    int updateByPrimaryKey(Inspectionresult record);
}