package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.RegistrationListView;
import edu.neu.hospital.example.baseExample.RegistrationListViewExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationListViewDao {
    long countByExample(RegistrationListViewExample example);

    int deleteByExample(RegistrationListViewExample example);

    int insert(RegistrationListView record);

    int insertSelective(RegistrationListView record);

    List<RegistrationListView> selectByExample(RegistrationListViewExample example);

    int updateByExampleSelective(@Param("record") RegistrationListView record, @Param("example") RegistrationListViewExample example);

    int updateByExample(@Param("record") RegistrationListView record, @Param("example") RegistrationListViewExample example);

    @Select("select * from registrationlistview where medicalRecordNo = #{medRecNo}")
    RegistrationListView selectByMedRecID(String medRecNo);
}