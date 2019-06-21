package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Materials;
import edu.neu.hospital.example.basicTableExample.MaterialsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MaterialsDao {
    long countByExample(MaterialsExample example);

    int deleteByExample(MaterialsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Materials record);

    int insertSelective(Materials record);

    List<Materials> selectByExample(MaterialsExample example);

    Materials selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Materials record, @Param("example") MaterialsExample example);

    int updateByExample(@Param("record") Materials record, @Param("example") MaterialsExample example);

    int updateByPrimaryKeySelective(Materials record);

    int updateByPrimaryKey(Materials record);
}