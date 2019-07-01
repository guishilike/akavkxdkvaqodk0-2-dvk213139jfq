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
    @Select("select id from userview where userName=#{userName}")
    int getIDByName(String userName);
    //根据用户id获取用户科室
    @Select("select departmentID from userview where id=#{id}")
    int getDeptIDByDoctorID(Integer id);
    //列出所有排班医生
    @Select("select id ,userName as name, realName as code from userview where (typeID=108 or typeID=109) and isSchedule=1")
    List<NameCodeDTO> selectAllDoctor();
    //列出所有排班医生
    @Select("select id ,userName as name, realName as code from userview where (typeID=108 or typeID=109) and isSchedule=1 and" +
            " departmentID=#{deptID}")
    List<NameCodeDTO> selectAllDoctorByDeptID(Integer deptID);
}