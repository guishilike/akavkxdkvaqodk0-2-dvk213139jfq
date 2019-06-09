package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Check;
import edu.neu.hospital.example.CheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckDao {
    long countByExample(CheckExample example);

    int deleteByExample(CheckExample example);

    int insert(Check record);

    int insertSelective(Check record);

    List<Check> selectByExample(CheckExample example);

    int updateByExampleSelective(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByExample(@Param("record") Check record, @Param("example") CheckExample example);
}