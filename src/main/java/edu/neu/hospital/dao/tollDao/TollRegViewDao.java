package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.TollRegView;
import edu.neu.hospital.example.tollExample.TollRegViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TollRegViewDao {
    long countByExample(TollRegViewExample example);

    int deleteByExample(TollRegViewExample example);

    int insert(TollRegView record);

    int insertSelective(TollRegView record);

    List<TollRegView> selectByExample(TollRegViewExample example);

    int updateByExampleSelective(@Param("record") TollRegView record, @Param("example") TollRegViewExample example);

    int updateByExample(@Param("record") TollRegView record, @Param("example") TollRegViewExample example);
}