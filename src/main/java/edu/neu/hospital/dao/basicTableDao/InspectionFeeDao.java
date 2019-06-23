package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.InspectionFee;
import edu.neu.hospital.example.basicTableExample.InspectionFeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface InspectionFeeDao {
    long countByExample(InspectionFeeExample example);

    int deleteByExample(InspectionFeeExample example);

    int insert(InspectionFee record);

    int insertSelective(InspectionFee record);

    List<InspectionFee> selectByExample(InspectionFeeExample example);

    int updateByExampleSelective(@Param("record") InspectionFee record, @Param("example") InspectionFeeExample example);

    int updateByExample(@Param("record") InspectionFee record, @Param("example") InspectionFeeExample example);
}