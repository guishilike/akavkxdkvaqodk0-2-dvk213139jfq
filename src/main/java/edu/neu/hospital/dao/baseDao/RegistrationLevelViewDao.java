package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.RegistrationLevelView;

import java.util.List;

import edu.neu.hospital.example.baseExample.RegistrationLevelViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface RegistrationLevelViewDao {
    long countByExample(RegistrationLevelViewExample example);

    int deleteByExample(RegistrationLevelViewExample example);

    int insert(RegistrationLevelView record);

    int insertSelective(RegistrationLevelView record);

    List<RegistrationLevelView> selectByExample(RegistrationLevelViewExample example);

    int updateByExampleSelective(@Param("record") RegistrationLevelView record, @Param("example") RegistrationLevelViewExample example);

    int updateByExample(@Param("record") RegistrationLevelView record, @Param("example") RegistrationLevelViewExample example);

    //根据id查找顺序号
    @Select("select sequenceID from registrationlevelview where id=#{id}")
    int findSequenceIdById(Integer id);

    //根据顺序号查找id
    @Select("select id from registrationlevelview where sequenceID=#{id}")
    int findIdBySequenceId(Integer id) ;
}