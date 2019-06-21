package edu.neu.hospital.dao.finaceDao;

import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.example.finaceExample.CheckWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckWorkDao {
    long countByExample(CheckWorkExample example);

    int deleteByExample(CheckWorkExample example);

    int insert(CheckWork record);

    int insertSelective(CheckWork record);

    List<CheckWork> selectByExample(CheckWorkExample example);

    int updateByExampleSelective(@Param("record") CheckWork record, @Param("example") CheckWorkExample example);

    int updateByExample(@Param("record") CheckWork record, @Param("example") CheckWorkExample example);
}