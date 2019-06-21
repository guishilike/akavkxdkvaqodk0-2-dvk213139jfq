package edu.neu.hospital.dao.inspectionDao;

import edu.neu.hospital.bean.inspectionBean.InspectMedReView;
import edu.neu.hospital.example.inspectionExample.InspectMedReViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectMedReViewDao {
    long countByExample(InspectMedReViewExample example);

    int deleteByExample(InspectMedReViewExample example);

    int insert(InspectMedReView record);

    int insertSelective(InspectMedReView record);

    List<InspectMedReView> selectByExample(InspectMedReViewExample example);

    int updateByExampleSelective(@Param("record") InspectMedReView record, @Param("example") InspectMedReViewExample example);

    int updateByExample(@Param("record") InspectMedReView record, @Param("example") InspectMedReViewExample example);
}