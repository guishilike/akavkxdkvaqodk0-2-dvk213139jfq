package edu.neu.hospital.dao.inspectionDao;

import edu.neu.hospital.bean.inspectionBean.InspectFormView;
import edu.neu.hospital.example.inspectionExample.InspectFormViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectFormViewDao {
    long countByExample(InspectFormViewExample example);

    int deleteByExample(InspectFormViewExample example);

    int insert(InspectFormView record);

    int insertSelective(InspectFormView record);

    List<InspectFormView> selectByExample(InspectFormViewExample example);

    int updateByExampleSelective(@Param("record") InspectFormView record, @Param("example") InspectFormViewExample example);

    int updateByExample(@Param("record") InspectFormView record, @Param("example") InspectFormViewExample example);
}