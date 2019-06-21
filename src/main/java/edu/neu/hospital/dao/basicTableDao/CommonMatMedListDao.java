package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.CommonMatMedList;
import edu.neu.hospital.example.basicTableExample.CommonMatMedListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonMatMedListDao {
    long countByExample(CommonMatMedListExample example);

    int deleteByExample(CommonMatMedListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonMatMedList record);

    int insertSelective(CommonMatMedList record);

    List<CommonMatMedList> selectByExample(CommonMatMedListExample example);

    CommonMatMedList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonMatMedList record, @Param("example") CommonMatMedListExample example);

    int updateByExample(@Param("record") CommonMatMedList record, @Param("example") CommonMatMedListExample example);

    int updateByPrimaryKeySelective(CommonMatMedList record);

    int updateByPrimaryKey(CommonMatMedList record);
}