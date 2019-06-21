package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.TollMedView;
import edu.neu.hospital.example.tollExample.TollMedViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TollMedViewDao {
    long countByExample(TollMedViewExample example);

    int deleteByExample(TollMedViewExample example);

    int insert(TollMedView record);

    int insertSelective(TollMedView record);

    List<TollMedView> selectByExample(TollMedViewExample example);

    int updateByExampleSelective(@Param("record") TollMedView record, @Param("example") TollMedViewExample example);

    int updateByExample(@Param("record") TollMedView record, @Param("example") TollMedViewExample example);
}