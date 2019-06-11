package edu.neu.hospital.dao;

import edu.neu.hospital.bean.RegistrationInfo;
import edu.neu.hospital.example.RegistrationInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationInfoDao {
    long countByExample(RegistrationInfoExample example);

    int deleteByExample(RegistrationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegistrationInfo record);

    int insertSelective(RegistrationInfo record);

    List<RegistrationInfo> selectByExample(RegistrationInfoExample example);

    RegistrationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegistrationInfo record, @Param("example") RegistrationInfoExample example);

    int updateByExample(@Param("record") RegistrationInfo record, @Param("example") RegistrationInfoExample example);

    int updateByPrimaryKeySelective(RegistrationInfo record);

    int updateByPrimaryKey(RegistrationInfo record);
}