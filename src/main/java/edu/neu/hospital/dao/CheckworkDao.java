package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Checkwork;
import edu.neu.hospital.example.CheckworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckworkDao {
    long countByExample(CheckworkExample example);

    int deleteByExample(CheckworkExample example);

    int insert(Checkwork record);

    int insertSelective(Checkwork record);

    List<Checkwork> selectByExample(CheckworkExample example);

    int updateByExampleSelective(@Param("record") Checkwork record, @Param("example") CheckworkExample example);

    int updateByExample(@Param("record") Checkwork record, @Param("example") CheckworkExample example);
}