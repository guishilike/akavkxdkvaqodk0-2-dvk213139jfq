package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonDiposals;
import edu.neu.hospital.example.basicTableExample.CommonDiposalsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommonDiposalsDao {
    long countByExample(CommonDiposalsExample example);

    int deleteByExample(CommonDiposalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonDiposals record);

    int insertSelective(CommonDiposals record);

    List<CommonDiposals> selectByExample(CommonDiposalsExample example);

    CommonDiposals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonDiposals record, @Param("example") CommonDiposalsExample example);

    int updateByExample(@Param("record") CommonDiposals record, @Param("example") CommonDiposalsExample example);

    int updateByPrimaryKeySelective(CommonDiposals record);

    int updateByPrimaryKey(CommonDiposals record);
}