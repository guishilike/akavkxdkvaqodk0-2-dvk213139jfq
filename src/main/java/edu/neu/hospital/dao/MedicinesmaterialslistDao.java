package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Medicinesmaterialslist;
import edu.neu.hospital.example.MedicinesmaterialslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinesmaterialslistDao {
    long countByExample(MedicinesmaterialslistExample example);

    int deleteByExample(MedicinesmaterialslistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicinesmaterialslist record);

    int insertSelective(Medicinesmaterialslist record);

    List<Medicinesmaterialslist> selectByExample(MedicinesmaterialslistExample example);

    Medicinesmaterialslist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medicinesmaterialslist record, @Param("example") MedicinesmaterialslistExample example);

    int updateByExample(@Param("record") Medicinesmaterialslist record, @Param("example") MedicinesmaterialslistExample example);

    int updateByPrimaryKeySelective(Medicinesmaterialslist record);

    int updateByPrimaryKey(Medicinesmaterialslist record);
}