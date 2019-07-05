package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.Drugsview;
import edu.neu.hospital.example.basicTableExample.DrugsviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugsviewDao {
    long countByExample(DrugsviewExample example);

    int deleteByExample(DrugsviewExample example);

    int insert(Drugsview record);

    int insertSelective(Drugsview record);

    List<Drugsview> selectByExample(DrugsviewExample example);

    int updateByExampleSelective(@Param("record") Drugsview record, @Param("example") DrugsviewExample example);

    int updateByExample(@Param("record") Drugsview record, @Param("example") DrugsviewExample example);
}