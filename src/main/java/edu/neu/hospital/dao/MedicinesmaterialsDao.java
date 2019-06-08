package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Medicinesmaterials;
import edu.neu.hospital.example.MedicinesmaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinesmaterialsDao {
    long countByExample(MedicinesmaterialsExample example);

    int deleteByExample(MedicinesmaterialsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicinesmaterials record);

    int insertSelective(Medicinesmaterials record);

    List<Medicinesmaterials> selectByExample(MedicinesmaterialsExample example);

    Medicinesmaterials selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Medicinesmaterials record, @Param("example") MedicinesmaterialsExample example);

    int updateByExample(@Param("record") Medicinesmaterials record, @Param("example") MedicinesmaterialsExample example);

    int updateByPrimaryKeySelective(Medicinesmaterials record);

    int updateByPrimaryKey(Medicinesmaterials record);
}