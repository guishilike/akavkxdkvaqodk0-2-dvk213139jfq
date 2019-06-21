package edu.neu.hospital.dao.finaceDao;

import edu.neu.hospital.bean.finaceBean.ExpenseClassView;
import edu.neu.hospital.example.finaceExample.ExpenseClassViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpenseClassViewDao {
    long countByExample(ExpenseClassViewExample example);

    int deleteByExample(ExpenseClassViewExample example);

    int insert(ExpenseClassView record);

    int insertSelective(ExpenseClassView record);

    List<ExpenseClassView> selectByExample(ExpenseClassViewExample example);

    int updateByExampleSelective(@Param("record") ExpenseClassView record, @Param("example") ExpenseClassViewExample example);

    int updateByExample(@Param("record") ExpenseClassView record, @Param("example") ExpenseClassViewExample example);
}