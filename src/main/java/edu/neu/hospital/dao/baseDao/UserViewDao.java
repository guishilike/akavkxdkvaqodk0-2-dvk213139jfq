package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.baseExample.UserViewExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserViewDao {
    long countByExample(UserViewExample example);

    int deleteByExample(UserViewExample example);

    int insert(UserView record);

    int insertSelective(UserView record);

    List<UserView> selectByExample(UserViewExample example);

    int updateByExampleSelective(@Param("record") UserView record, @Param("example") UserViewExample example);

    int updateByExample(@Param("record") UserView record, @Param("example") UserViewExample example);

    @Select("select id ,userName as name, realName as code from userview")
    List<NameCodeDTO> selectAllUserNamesAndUserIDs();
    @Select("select id form userview where userName=#{userName}")
    int getIDByName(String userName);
}