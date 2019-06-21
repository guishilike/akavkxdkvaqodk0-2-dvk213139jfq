package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.example.baseExample.FMedItemViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FMedItemViewDao {
    long countByExample(FMedItemViewExample example);

    int deleteByExample(FMedItemViewExample example);

    int insert(FmeditemView record);

    int insertSelective(FmeditemView record);

    List<FmeditemView> selectByExample(FMedItemViewExample example);

    int updateByExampleSelective(@Param("record") FmeditemView record, @Param("example") FMedItemViewExample example);

    int updateByExample(@Param("record") FmeditemView record, @Param("example") FMedItemViewExample example);
}