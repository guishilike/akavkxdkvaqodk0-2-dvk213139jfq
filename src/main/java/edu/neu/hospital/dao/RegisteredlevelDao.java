package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Registeredlevel;
import edu.neu.hospital.example.RegisteredlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisteredlevelDao {
    long countByExample(RegisteredlevelExample example);

    int deleteByExample(RegisteredlevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registeredlevel record);

    int insertSelective(Registeredlevel record);

    List<Registeredlevel> selectByExample(RegisteredlevelExample example);

    Registeredlevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registeredlevel record, @Param("example") RegisteredlevelExample example);

    int updateByExample(@Param("record") Registeredlevel record, @Param("example") RegisteredlevelExample example);

    int updateByPrimaryKeySelective(Registeredlevel record);

    int updateByPrimaryKey(Registeredlevel record);
}