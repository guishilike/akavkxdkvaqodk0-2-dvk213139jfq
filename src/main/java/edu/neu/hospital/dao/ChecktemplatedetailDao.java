package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Checktemplatedetail;
import edu.neu.hospital.example.ChecktemplatedetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChecktemplatedetailDao {
    long countByExample(ChecktemplatedetailExample example);

    int deleteByExample(ChecktemplatedetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checktemplatedetail record);

    int insertSelective(Checktemplatedetail record);

    List<Checktemplatedetail> selectByExample(ChecktemplatedetailExample example);

    Checktemplatedetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checktemplatedetail record, @Param("example") ChecktemplatedetailExample example);

    int updateByExample(@Param("record") Checktemplatedetail record, @Param("example") ChecktemplatedetailExample example);

    int updateByPrimaryKeySelective(Checktemplatedetail record);

    int updateByPrimaryKey(Checktemplatedetail record);
}