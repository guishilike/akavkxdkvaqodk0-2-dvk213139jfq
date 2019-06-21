package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.InspectionResultImage;
import edu.neu.hospital.example.basicTableExample.InspectionResultImageExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InspectionResultImageDao {
    long countByExample(InspectionResultImageExample example);

    int deleteByExample(InspectionResultImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionResultImage record);

    int insertSelective(InspectionResultImage record);

    List<InspectionResultImage> selectByExample(InspectionResultImageExample example);

    InspectionResultImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionResultImage record, @Param("example") InspectionResultImageExample example);

    int updateByExample(@Param("record") InspectionResultImage record, @Param("example") InspectionResultImageExample example);

    int updateByPrimaryKeySelective(InspectionResultImage record);

    int updateByPrimaryKey(InspectionResultImage record);
}