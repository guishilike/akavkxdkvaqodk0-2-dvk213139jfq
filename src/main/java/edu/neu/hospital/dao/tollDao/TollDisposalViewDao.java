package edu.neu.hospital.dao.tollDao;

import edu.neu.hospital.bean.tollBean.TollDisposalView;
import edu.neu.hospital.example.tollExample.TollDisposalViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TollDisposalViewDao {
    long countByExample(TollDisposalViewExample example);

    int deleteByExample(TollDisposalViewExample example);

    int insert(TollDisposalView record);

    int insertSelective(TollDisposalView record);

    List<TollDisposalView> selectByExample(TollDisposalViewExample example);

    int updateByExampleSelective(@Param("record") TollDisposalView record, @Param("example") TollDisposalViewExample example);

    int updateByExample(@Param("record") TollDisposalView record, @Param("example") TollDisposalViewExample example);
}