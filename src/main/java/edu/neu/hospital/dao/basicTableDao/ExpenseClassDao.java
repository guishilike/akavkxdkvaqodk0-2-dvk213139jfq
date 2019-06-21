package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.ExpenseClass;
import edu.neu.hospital.example.basicTableExample.ExpenseClassExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExpenseClassDao {
    long countByExample(ExpenseClassExample example);

    int deleteByExample(ExpenseClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpenseClass record);

    int insertSelective(ExpenseClass record);

    List<ExpenseClass> selectByExample(ExpenseClassExample example);

    ExpenseClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpenseClass record, @Param("example") ExpenseClassExample example);

    int updateByExample(@Param("record") ExpenseClass record, @Param("example") ExpenseClassExample example);

    int updateByPrimaryKeySelective(ExpenseClass record);

    int updateByPrimaryKey(ExpenseClass record);

    int uploadExpenseclassInfo(List<ExpenseClass> expenseClasses);
}