package edu.neu.hospital.dao.inspectionDao;

import edu.neu.hospital.bean.inspectionBean.InspectMedPlateView;
import edu.neu.hospital.example.inspectionExample.InspectMedPlateViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectMedPlateViewDao {
    long countByExample(InspectMedPlateViewExample example);

    int deleteByExample(InspectMedPlateViewExample example);

    int insert(InspectMedPlateView record);

    int insertSelective(InspectMedPlateView record);

    List<InspectMedPlateView> selectByExample(InspectMedPlateViewExample example);

    int updateByExampleSelective(@Param("record") InspectMedPlateView record, @Param("example") InspectMedPlateViewExample example);

    int updateByExample(@Param("record") InspectMedPlateView record, @Param("example") InspectMedPlateViewExample example);
}