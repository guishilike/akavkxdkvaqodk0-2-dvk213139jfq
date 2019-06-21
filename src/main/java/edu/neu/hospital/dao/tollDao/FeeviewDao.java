package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.FeeView;
import edu.neu.hospital.example.tollExample.FeeViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeviewDao {
    long countByExample(FeeViewExample example);

    int deleteByExample(FeeViewExample example);

    int insert(FeeView record);

    int insertSelective(FeeView record);

    List<FeeView> selectByExample(FeeViewExample example);

    int updateByExampleSelective(@Param("record") FeeView record, @Param("example") FeeViewExample example);

    int updateByExample(@Param("record") FeeView record, @Param("example") FeeViewExample example);
}