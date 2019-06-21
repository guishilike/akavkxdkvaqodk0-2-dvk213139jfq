package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.InspectionDetails;
import edu.neu.hospital.example.basicTableExample.InspectionDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface InspectionDetailsDao {
    long countByExample(InspectionDetailsExample example);

    int deleteByExample(InspectionDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionDetails record);

    int insertSelective(InspectionDetails record);

    List<InspectionDetails> selectByExample(InspectionDetailsExample example);

    InspectionDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionDetails record, @Param("example") InspectionDetailsExample example);

    int updateByExample(@Param("record") InspectionDetails record, @Param("example") InspectionDetailsExample example);

    int updateByPrimaryKeySelective(InspectionDetails record);

    int updateByPrimaryKey(InspectionDetails record);
}