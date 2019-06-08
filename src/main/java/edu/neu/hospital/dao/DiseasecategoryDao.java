package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Diseasecategory;
import edu.neu.hospital.example.DiseasecategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiseasecategoryDao {
    long countByExample(DiseasecategoryExample example);

    int deleteByExample(DiseasecategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Diseasecategory record);

    int insertSelective(Diseasecategory record);

    List<Diseasecategory> selectByExample(DiseasecategoryExample example);

    Diseasecategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Diseasecategory record, @Param("example") DiseasecategoryExample example);

    int updateByExample(@Param("record") Diseasecategory record, @Param("example") DiseasecategoryExample example);

    int updateByPrimaryKeySelective(Diseasecategory record);

    int updateByPrimaryKey(Diseasecategory record);
}