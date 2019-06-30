package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.DiseaseCategory;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.DiseaseCategoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    //根据名称和dicaTypeID查找
    @Select("select id, code, name from diseasecategory where name=#{name} and dicaType=#{typeID} and status='1'")
    NameCodeDTO findByName(String name, int typeID);
    //根据dicaTypeID查找所有疾病分类
    @Select("select id,code,name from diseasecategory where dicaType=#{typeID} and status='1'")
    List<NameCodeDTO> findByTypeID(int typeID);

    @Select("select id,dicaType as code,name from diseasecategory where status='1'")
    List<NameCodeDTO> findAll();

}