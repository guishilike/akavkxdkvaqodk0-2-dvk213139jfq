package edu.neu.hospital.dao.inspectionDao;

import java.util.List;

import edu.neu.hospital.example.inspectionExample.InspectReViewExample;
import edu.neu.hospital.bean.inspectionBean.InspectReView;
import org.apache.ibatis.annotations.Param;

public interface InspectReViewDao {
    long countByExample(InspectReViewExample example);

    int deleteByExample(InspectReViewExample example);

    int insert(InspectReView record);

    int insertSelective(InspectReView record);

    List<InspectReView> selectByExample(InspectReViewExample example);

    int updateByExampleSelective(@Param("record") InspectReView record, @Param("example") InspectReViewExample example);

    int updateByExample(@Param("record") InspectReView record, @Param("example") InspectReViewExample example);
}