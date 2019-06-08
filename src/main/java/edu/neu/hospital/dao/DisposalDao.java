package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Disposal;
import edu.neu.hospital.example.DisposalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalDao {
    long countByExample(DisposalExample example);

    int deleteByExample(DisposalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disposal record);

    int insertSelective(Disposal record);

    List<Disposal> selectByExample(DisposalExample example);

    Disposal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Disposal record, @Param("example") DisposalExample example);

    int updateByExample(@Param("record") Disposal record, @Param("example") DisposalExample example);

    int updateByPrimaryKeySelective(Disposal record);

    int updateByPrimaryKey(Disposal record);
}