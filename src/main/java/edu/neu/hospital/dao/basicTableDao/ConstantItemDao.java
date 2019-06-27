package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.ConstantItemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ConstantItemDao {
    long countByExample(ConstantItemExample example);

    int deleteByExample(ConstantItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConstantItem record);

    int insertSelective(ConstantItem record);

    List<ConstantItem> selectByExample(ConstantItemExample example);

    ConstantItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConstantItem record, @Param("example") ConstantItemExample example);

    int updateByExample(@Param("record") ConstantItem record, @Param("example") ConstantItemExample example);

    int updateByPrimaryKeySelective(ConstantItem record);

    int updateByPrimaryKey(ConstantItem record);

    //根据名称和typeID查找id
    @Select("select id from constantitem where constantName=#{name} and constantTypeID=#{typeID} and status='1'")
    int findIdByName(String name, int typeID);

    //根据typeID查找所有constantitem
    @Select("select * from constantitem where constantTypeID=#{typeID} and status='1'")
    List<ConstantItem> findByTypeID(int typeID);

    @Select("select id,constantCode as code,constantName as name from constantitem " +
            "where status='1' and constantTypeID=#{constantTypeID}")
    List<NameCodeDTO> findAllNamesAndCodesByType(int constantTypeID);
}