package edu.neu.hospital.dao.inspectionDao;

import edu.neu.hospital.bean.inspectionBean.InspectMatReview;
import edu.neu.hospital.example.inspectionExample.InspectMatReViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectMatReViewDao {
    long countByExample(InspectMatReViewExample example);

    int deleteByExample(InspectMatReViewExample example);

    int insert(InspectMatReview record);

    int insertSelective(InspectMatReview record);

    List<InspectMatReview> selectByExample(InspectMatReViewExample example);

    int updateByExampleSelective(@Param("record") InspectMatReview record, @Param("example") InspectMatReViewExample example);

    int updateByExample(@Param("record") InspectMatReview record, @Param("example") InspectMatReViewExample example);
}