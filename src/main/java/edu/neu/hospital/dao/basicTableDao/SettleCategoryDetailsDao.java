package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.SettleCategoryDetails;

import java.util.List;

import edu.neu.hospital.example.basicTableExample.SettleCategoryDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SettleCategoryDetailsDao {
    long countByExample(SettleCategoryDetailsExample example);

    int deleteByExample(SettleCategoryDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SettleCategoryDetails record);

    int insertSelective(SettleCategoryDetails record);

    List<SettleCategoryDetails> selectByExample(SettleCategoryDetailsExample example);

    SettleCategoryDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SettleCategoryDetails record, @Param("example") SettleCategoryDetailsExample example);

    int updateByExample(@Param("record") SettleCategoryDetails record, @Param("example") SettleCategoryDetailsExample example);

    int updateByPrimaryKeySelective(SettleCategoryDetails record);

    int updateByPrimaryKey(SettleCategoryDetails record);
}