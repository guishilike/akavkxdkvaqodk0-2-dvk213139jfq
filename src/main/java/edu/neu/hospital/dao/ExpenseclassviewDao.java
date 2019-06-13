package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Expenseclassview;
import edu.neu.hospital.example.ExpenseclassviewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExpenseclassviewDao {
    long countByExample(ExpenseclassviewExample example);

    int deleteByExample(ExpenseclassviewExample example);

    int insert(Expenseclassview record);

    int insertSelective(Expenseclassview record);

    List<Expenseclassview> selectByExample(ExpenseclassviewExample example);

    int updateByExampleSelective(@Param("record") Expenseclassview record, @Param("example") ExpenseclassviewExample example);

    int updateByExample(@Param("record") Expenseclassview record, @Param("example") ExpenseclassviewExample example);
}