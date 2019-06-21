package edu.neu.hospital.dao.inspectionDao;

import edu.neu.hospital.bean.inspectionBean.InspectMatPlateView;
import edu.neu.hospital.example.inspectionExample.InspectMatPlateViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectMatPlateViewDao {
    long countByExample(InspectMatPlateViewExample example);

    int deleteByExample(InspectMatPlateViewExample example);

    int insert(InspectMatPlateView record);

    int insertSelective(InspectMatPlateView record);

    List<InspectMatPlateView> selectByExample(InspectMatPlateViewExample example);

    int updateByExampleSelective(@Param("record") InspectMatPlateView record, @Param("example") InspectMatPlateViewExample example);

    int updateByExample(@Param("record") InspectMatPlateView record, @Param("example") InspectMatPlateViewExample example);
}