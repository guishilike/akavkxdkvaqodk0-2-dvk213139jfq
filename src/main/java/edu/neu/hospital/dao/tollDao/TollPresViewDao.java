package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.TollPresView;
import edu.neu.hospital.example.tollExample.TollPresViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TollPresViewDao {
    long countByExample(TollPresViewExample example);

    int deleteByExample(TollPresViewExample example);

    int insert(TollPresView record);

    int insertSelective(TollPresView record);

    List<TollPresView> selectByExample(TollPresViewExample example);

    int updateByExampleSelective(@Param("record") TollPresView record, @Param("example") TollPresViewExample example);

    int updateByExample(@Param("record") TollPresView record, @Param("example") TollPresViewExample example);
}