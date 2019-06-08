package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Fee;
import edu.neu.hospital.example.FeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeDao {
    long countByExample(FeeExample example);

    int deleteByExample(FeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fee record);

    int insertSelective(Fee record);

    List<Fee> selectByExample(FeeExample example);

    Fee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fee record, @Param("example") FeeExample example);

    int updateByExample(@Param("record") Fee record, @Param("example") FeeExample example);

    int updateByPrimaryKeySelective(Fee record);

    int updateByPrimaryKey(Fee record);
}