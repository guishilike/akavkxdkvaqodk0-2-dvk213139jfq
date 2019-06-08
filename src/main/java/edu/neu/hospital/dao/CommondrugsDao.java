package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Commondrugs;
import edu.neu.hospital.example.CommondrugsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommondrugsDao {
    long countByExample(CommondrugsExample example);

    int deleteByExample(CommondrugsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commondrugs record);

    int insertSelective(Commondrugs record);

    List<Commondrugs> selectByExample(CommondrugsExample example);

    Commondrugs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commondrugs record, @Param("example") CommondrugsExample example);

    int updateByExample(@Param("record") Commondrugs record, @Param("example") CommondrugsExample example);

    int updateByPrimaryKeySelective(Commondrugs record);

    int updateByPrimaryKey(Commondrugs record);
}