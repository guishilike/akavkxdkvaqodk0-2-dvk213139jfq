package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Fmeditemview;
import edu.neu.hospital.example.FmeditemviewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FmeditemviewDao {
    long countByExample(FmeditemviewExample example);

    int deleteByExample(FmeditemviewExample example);

    int insert(Fmeditemview record);

    int insertSelective(Fmeditemview record);

    List<Fmeditemview> selectByExample(FmeditemviewExample example);

    int updateByExampleSelective(@Param("record") Fmeditemview record, @Param("example") FmeditemviewExample example);

    int updateByExample(@Param("record") Fmeditemview record, @Param("example") FmeditemviewExample example);
}