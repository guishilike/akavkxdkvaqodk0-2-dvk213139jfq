package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.TollMatView;
import edu.neu.hospital.example.tollExample.TollMatViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TollMatViewDao {
    long countByExample(TollMatViewExample example);

    int deleteByExample(TollMatViewExample example);

    int insert(TollMatView record);

    int insertSelective(TollMatView record);

    List<TollMatView> selectByExample(TollMatViewExample example);

    int updateByExampleSelective(@Param("record") TollMatView record, @Param("example") TollMatViewExample example);

    int updateByExample(@Param("record") TollMatView record, @Param("example") TollMatViewExample example);
}