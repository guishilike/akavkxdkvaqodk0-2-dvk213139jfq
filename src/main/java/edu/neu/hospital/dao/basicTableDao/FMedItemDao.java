package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.example.basicTableExample.FMedItemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FMedItemDao {
    long countByExample(FMedItemExample example);

    int deleteByExample(FMedItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FMedItem record);

    int insertSelective(FMedItem record);

    List<FMedItem> selectByExample(FMedItemExample example);

    FMedItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FMedItem record, @Param("example") FMedItemExample example);

    int updateByExample(@Param("record") FMedItem record, @Param("example") FMedItemExample example);

    int updateByPrimaryKeySelective(FMedItem record);

    int updateByPrimaryKey(FMedItem record);

    int uploadFmeditemInfo(List<FMedItem> FMedItemList);
}