package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.DailySettlement;
import edu.neu.hospital.example.basicTableExample.DailySettlementExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DailySettlementDao {
    long countByExample(DailySettlementExample example);

    int deleteByExample(DailySettlementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DailySettlement record);

    int insertSelective(DailySettlement record);

    List<DailySettlement> selectByExample(DailySettlementExample example);

    DailySettlement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DailySettlement record, @Param("example") DailySettlementExample example);

    int updateByExample(@Param("record") DailySettlement record, @Param("example") DailySettlementExample example);

    int updateByPrimaryKeySelective(DailySettlement record);

    int updateByPrimaryKey(DailySettlement record);
}