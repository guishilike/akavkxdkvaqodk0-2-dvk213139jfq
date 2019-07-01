package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.RegistrationListView;
import edu.neu.hospital.example.baseExample.RegistrationListViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationListViewDao {
    long countByExample(RegistrationListViewExample example);

    int deleteByExample(RegistrationListViewExample example);

    int insert(RegistrationListView record);

    int insertSelective(RegistrationListView record);

    List<RegistrationListView> selectByExample(RegistrationListViewExample example);

    int updateByExampleSelective(@Param("record") RegistrationListView record, @Param("example") RegistrationListViewExample example);

    int updateByExample(@Param("record") RegistrationListView record, @Param("example") RegistrationListViewExample example);
}