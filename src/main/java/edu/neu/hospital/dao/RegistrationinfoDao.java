package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Registrationinfo;
import edu.neu.hospital.example.RegistrationinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationinfoDao {
    long countByExample(RegistrationinfoExample example);

    int deleteByExample(RegistrationinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registrationinfo record);

    int insertSelective(Registrationinfo record);

    List<Registrationinfo> selectByExample(RegistrationinfoExample example);

    Registrationinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registrationinfo record, @Param("example") RegistrationinfoExample example);

    int updateByExample(@Param("record") Registrationinfo record, @Param("example") RegistrationinfoExample example);

    int updateByPrimaryKeySelective(Registrationinfo record);

    int updateByPrimaryKey(Registrationinfo record);
}