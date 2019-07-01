package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.Registrationlistview;
import edu.neu.hospital.example.baseExample.RegistrationlistviewExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationlistviewDao {
    long countByExample(RegistrationlistviewExample example);

    int deleteByExample(RegistrationlistviewExample example);

    int insert(Registrationlistview record);

    int insertSelective(Registrationlistview record);

    List<Registrationlistview> selectByExample(RegistrationlistviewExample example);

    int updateByExampleSelective(@Param("record") Registrationlistview record, @Param("example") RegistrationlistviewExample example);

    int updateByExample(@Param("record") Registrationlistview record, @Param("example") RegistrationlistviewExample example);
}