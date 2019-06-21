package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.UserDepart;
import edu.neu.hospital.example.basicTableExample.UserDepartExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDepartDao {
    long countByExample(UserDepartExample example);

    int deleteByExample(UserDepartExample example);

    int insert(UserDepart record);

    int insertSelective(UserDepart record);

    List<UserDepart> selectByExample(UserDepartExample example);

    int updateByExampleSelective(@Param("record") UserDepart record, @Param("example") UserDepartExample example);

    int updateByExample(@Param("record") UserDepart record, @Param("example") UserDepartExample example);
}