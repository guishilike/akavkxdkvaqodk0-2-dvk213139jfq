package edu.neu.hospital.dao.inspectionDao;

import edu.neu.hospital.example.inspectionExample.InspectMatReViewExample;
import java.util.List;

import edu.neu.hospital.bean.inspectionBean.InspectMatReView;
import org.apache.ibatis.annotations.Param;

public interface InspectMatReViewDao {
    long countByExample(InspectMatReViewExample example);

    int deleteByExample(InspectMatReViewExample example);

    int insert(InspectMatReView record);

    int insertSelective(InspectMatReView record);

    List<InspectMatReView> selectByExample(InspectMatReViewExample example);

    int updateByExampleSelective(@Param("record") InspectMatReView record, @Param("example") InspectMatReViewExample example);

    int updateByExample(@Param("record") InspectMatReView record, @Param("example") InspectMatReViewExample example);
}