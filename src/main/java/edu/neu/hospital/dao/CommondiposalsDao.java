package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Commondiposals;
import edu.neu.hospital.example.CommondiposalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommondiposalsDao {
    long countByExample(CommondiposalsExample example);

    int deleteByExample(CommondiposalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commondiposals record);

    int insertSelective(Commondiposals record);

    List<Commondiposals> selectByExample(CommondiposalsExample example);

    Commondiposals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commondiposals record, @Param("example") CommondiposalsExample example);

    int updateByExample(@Param("record") Commondiposals record, @Param("example") CommondiposalsExample example);

    int updateByPrimaryKeySelective(Commondiposals record);

    int updateByPrimaryKey(Commondiposals record);
}