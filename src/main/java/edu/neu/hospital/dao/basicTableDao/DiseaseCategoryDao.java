package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.DiseaseCategory;
import edu.neu.hospital.example.basicTableExample.DiseaseCategoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiseaseCategoryDao {
    long countByExample(DiseaseCategoryExample example);

    int deleteByExample(DiseaseCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiseaseCategory record);

    int insertSelective(DiseaseCategory record);

    List<DiseaseCategory> selectByExample(DiseaseCategoryExample example);

    DiseaseCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiseaseCategory record, @Param("example") DiseaseCategoryExample example);

    int updateByExample(@Param("record") DiseaseCategory record, @Param("example") DiseaseCategoryExample example);

    int updateByPrimaryKeySelective(DiseaseCategory record);

    int updateByPrimaryKey(DiseaseCategory record);
}