package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.RegistrationLevelDetails;

import java.util.List;

import edu.neu.hospital.example.basicTableExample.RegistrationLevelDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RegistrationLevelDetailsDao {
    long countByExample(RegistrationLevelDetailsExample example);

    int deleteByExample(RegistrationLevelDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegistrationLevelDetails record);

    int insertSelective(RegistrationLevelDetails record);

    List<RegistrationLevelDetails> selectByExample(RegistrationLevelDetailsExample example);

    RegistrationLevelDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegistrationLevelDetails record, @Param("example") RegistrationLevelDetailsExample example);

    int updateByExample(@Param("record") RegistrationLevelDetails record, @Param("example") RegistrationLevelDetailsExample example);

    int updateByPrimaryKeySelective(RegistrationLevelDetails record);

    int updateByPrimaryKey(RegistrationLevelDetails record);
}