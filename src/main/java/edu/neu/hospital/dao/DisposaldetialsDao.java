package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Disposaldetials;
import edu.neu.hospital.example.DisposaldetialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposaldetialsDao {
    long countByExample(DisposaldetialsExample example);

    int deleteByExample(DisposaldetialsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disposaldetials record);

    int insertSelective(Disposaldetials record);

    List<Disposaldetials> selectByExample(DisposaldetialsExample example);

    Disposaldetials selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Disposaldetials record, @Param("example") DisposaldetialsExample example);

    int updateByExample(@Param("record") Disposaldetials record, @Param("example") DisposaldetialsExample example);

    int updateByPrimaryKeySelective(Disposaldetials record);

    int updateByPrimaryKey(Disposaldetials record);
}