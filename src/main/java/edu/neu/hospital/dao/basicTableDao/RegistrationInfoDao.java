package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Registrationinfo;
import edu.neu.hospital.example.basicTableExample.RegistrationInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationInfoDao {
    long countByExample(RegistrationInfoExample example);

    int deleteByExample(RegistrationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registrationinfo record);

    int insertSelective(Registrationinfo record);

    List<Registrationinfo> selectByExample(RegistrationInfoExample example);

    Registrationinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registrationinfo record, @Param("example") RegistrationInfoExample example);

    int updateByExample(@Param("record") Registrationinfo record, @Param("example") RegistrationInfoExample example);

    int updateByPrimaryKeySelective(Registrationinfo record);

    int updateByPrimaryKey(Registrationinfo record);
}