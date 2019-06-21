package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.InspectionResult;
import edu.neu.hospital.bean.basicTableBean.InspectionResultWithBLOBs;
import edu.neu.hospital.example.basicTableExample.InspectionResultExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InspectionResultDao {
    long countByExample(InspectionResultExample example);

    int deleteByExample(InspectionResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionResultWithBLOBs record);

    int insertSelective(InspectionResultWithBLOBs record);

    List<InspectionResultWithBLOBs> selectByExampleWithBLOBs(InspectionResultExample example);

    List<InspectionResult> selectByExample(InspectionResultExample example);

    InspectionResultWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionResultWithBLOBs record, @Param("example") InspectionResultExample example);

    int updateByExampleWithBLOBs(@Param("record") InspectionResultWithBLOBs record, @Param("example") InspectionResultExample example);

    int updateByExample(@Param("record") InspectionResult record, @Param("example") InspectionResultExample example);

    int updateByPrimaryKeySelective(InspectionResultWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(InspectionResultWithBLOBs record);

    int updateByPrimaryKey(InspectionResult record);
}