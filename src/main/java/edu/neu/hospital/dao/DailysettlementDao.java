package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Dailysettlement;
import edu.neu.hospital.example.DailysettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailysettlementDao {
    long countByExample(DailysettlementExample example);

    int deleteByExample(DailysettlementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dailysettlement record);

    int insertSelective(Dailysettlement record);

    List<Dailysettlement> selectByExample(DailysettlementExample example);

    Dailysettlement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dailysettlement record, @Param("example") DailysettlementExample example);

    int updateByExample(@Param("record") Dailysettlement record, @Param("example") DailysettlementExample example);

    int updateByPrimaryKeySelective(Dailysettlement record);

    int updateByPrimaryKey(Dailysettlement record);
}