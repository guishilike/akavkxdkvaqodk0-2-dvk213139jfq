package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Commonmedicinesmaterialslist;
import edu.neu.hospital.example.CommonmedicinesmaterialslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonmedicinesmaterialslistDao {
    long countByExample(CommonmedicinesmaterialslistExample example);

    int deleteByExample(CommonmedicinesmaterialslistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commonmedicinesmaterialslist record);

    int insertSelective(Commonmedicinesmaterialslist record);

    List<Commonmedicinesmaterialslist> selectByExample(CommonmedicinesmaterialslistExample example);

    Commonmedicinesmaterialslist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commonmedicinesmaterialslist record, @Param("example") CommonmedicinesmaterialslistExample example);

    int updateByExample(@Param("record") Commonmedicinesmaterialslist record, @Param("example") CommonmedicinesmaterialslistExample example);

    int updateByPrimaryKeySelective(Commonmedicinesmaterialslist record);

    int updateByPrimaryKey(Commonmedicinesmaterialslist record);
}