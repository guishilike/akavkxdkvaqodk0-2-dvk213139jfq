package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Roleauthority;
import edu.neu.hospital.example.RoleauthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleauthorityDao {
    long countByExample(RoleauthorityExample example);

    int deleteByExample(RoleauthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roleauthority record);

    int insertSelective(Roleauthority record);

    List<Roleauthority> selectByExample(RoleauthorityExample example);

    Roleauthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roleauthority record, @Param("example") RoleauthorityExample example);

    int updateByExample(@Param("record") Roleauthority record, @Param("example") RoleauthorityExample example);

    int updateByPrimaryKeySelective(Roleauthority record);

    int updateByPrimaryKey(Roleauthority record);
}