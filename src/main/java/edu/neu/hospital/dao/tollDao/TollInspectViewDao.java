package edu.neu.hospital.dao.tollDao;

import java.util.List;

import edu.neu.hospital.example.tollExample.TollInspectViewExample;
import edu.neu.hospital.bean.tollBean.TollInspectView;
import org.apache.ibatis.annotations.Param;

public interface TollInspectViewDao {
    long countByExample(TollInspectViewExample example);

    int deleteByExample(TollInspectViewExample example);

    int insert(TollInspectView record);

    int insertSelective(TollInspectView record);

    List<TollInspectView> selectByExample(TollInspectViewExample example);

    int updateByExampleSelective(@Param("record") TollInspectView record, @Param("example") TollInspectViewExample example);

    int updateByExample(@Param("record") TollInspectView record, @Param("example") TollInspectViewExample example);
}