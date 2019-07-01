package edu.neu.hospital.dao.TakeMedicineDao;

import java.util.List;

import edu.neu.hospital.bean.takeMedicineBean.TakeMedDetailsView;
import edu.neu.hospital.example.takeMedicineExample.TakeMedDetailsViewExample;
import org.apache.ibatis.annotations.Param;

public interface TakeMedDetailsViewDao {
    long countByExample(TakeMedDetailsViewExample example);

    int deleteByExample(TakeMedDetailsViewExample example);

    int insert(TakeMedDetailsView record);

    int insertSelective(TakeMedDetailsView record);

    List<TakeMedDetailsView> selectByExample(TakeMedDetailsViewExample example);

    int updateByExampleSelective(@Param("record") TakeMedDetailsView record, @Param("example") TakeMedDetailsViewExample example);

    int updateByExample(@Param("record") TakeMedDetailsView record, @Param("example") TakeMedDetailsViewExample example);
}