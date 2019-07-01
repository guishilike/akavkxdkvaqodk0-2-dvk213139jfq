package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.DailySettleView;
import edu.neu.hospital.example.tollExample.DailySettleViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailySettleViewDao {
    long countByExample(DailySettleViewExample example);

    int deleteByExample(DailySettleViewExample example);

    int insert(DailySettleView record);

    int insertSelective(DailySettleView record);

    List<DailySettleView> selectByExample(DailySettleViewExample example);

    int updateByExampleSelective(@Param("record") DailySettleView record, @Param("example") DailySettleViewExample example);

    int updateByExample(@Param("record") DailySettleView record, @Param("example") DailySettleViewExample example);
}