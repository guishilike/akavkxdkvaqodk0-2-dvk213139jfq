package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonDrugs;
import edu.neu.hospital.example.basicTableExample.CommonDrugsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommonDrugsDao {
    long countByExample(CommonDrugsExample example);

    int deleteByExample(CommonDrugsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonDrugs record);

    int insertSelective(CommonDrugs record);

    List<CommonDrugs> selectByExample(CommonDrugsExample example);

    CommonDrugs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonDrugs record, @Param("example") CommonDrugsExample example);

    int updateByExample(@Param("record") CommonDrugs record, @Param("example") CommonDrugsExample example);

    int updateByPrimaryKeySelective(CommonDrugs record);

    int updateByPrimaryKey(CommonDrugs record);
}