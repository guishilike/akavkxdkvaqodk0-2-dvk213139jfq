package edu.neu.hospital.dao;

import edu.neu.hospital.bean.Inspetiondetails;
import edu.neu.hospital.example.InspetiondetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspetiondetailsDao {
    long countByExample(InspetiondetailsExample example);

    int deleteByExample(InspetiondetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inspetiondetails record);

    int insertSelective(Inspetiondetails record);

    List<Inspetiondetails> selectByExample(InspetiondetailsExample example);

    Inspetiondetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inspetiondetails record, @Param("example") InspetiondetailsExample example);

    int updateByExample(@Param("record") Inspetiondetails record, @Param("example") InspetiondetailsExample example);

    int updateByPrimaryKeySelective(Inspetiondetails record);

    int updateByPrimaryKey(Inspetiondetails record);
}