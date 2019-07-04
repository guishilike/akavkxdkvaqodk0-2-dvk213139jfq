package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.InspectionDetailsView;
import edu.neu.hospital.example.basicTableExample.InspectionDetailsViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionDetailsViewDao {
    long countByExample(InspectionDetailsViewExample example);

    int deleteByExample(InspectionDetailsViewExample example);

    int insert(InspectionDetailsView record);

    int insertSelective(InspectionDetailsView record);

    List<InspectionDetailsView> selectByExample(InspectionDetailsViewExample example);

    int updateByExampleSelective(@Param("record") InspectionDetailsView record, @Param("example") InspectionDetailsViewExample example);

    int updateByExample(@Param("record") InspectionDetailsView record, @Param("example") InspectionDetailsViewExample example);
}