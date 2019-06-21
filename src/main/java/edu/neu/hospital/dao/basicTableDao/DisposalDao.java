package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Disposal;
import edu.neu.hospital.example.basicTableExample.DisposalExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
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