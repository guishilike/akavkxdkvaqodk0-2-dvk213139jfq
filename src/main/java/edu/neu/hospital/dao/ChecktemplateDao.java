package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Checktemplate;
import edu.neu.hospital.example.ChecktemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChecktemplateDao {
    long countByExample(ChecktemplateExample example);

    int deleteByExample(ChecktemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checktemplate record);

    int insertSelective(Checktemplate record);

    List<Checktemplate> selectByExample(ChecktemplateExample example);

    Checktemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checktemplate record, @Param("example") ChecktemplateExample example);

    int updateByExample(@Param("record") Checktemplate record, @Param("example") ChecktemplateExample example);

    int updateByPrimaryKeySelective(Checktemplate record);

    int updateByPrimaryKey(Checktemplate record);
}