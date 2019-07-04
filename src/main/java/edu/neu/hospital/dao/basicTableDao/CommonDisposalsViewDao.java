package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonDisposalsView;

import java.util.List;

import edu.neu.hospital.example.basicTableExample.CommonDisposalsViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommonDisposalsViewDao {
    long countByExample(CommonDisposalsViewExample example);

    int deleteByExample(CommonDisposalsViewExample example);

    int insert(CommonDisposalsView record);

    int insertSelective(CommonDisposalsView record);

    List<CommonDisposalsView> selectByExample(CommonDisposalsViewExample example);

    int updateByExampleSelective(@Param("record") CommonDisposalsView record, @Param("example") CommonDisposalsViewExample example);

    int updateByExample(@Param("record") CommonDisposalsView record, @Param("example") CommonDisposalsViewExample example);
}