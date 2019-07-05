package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.DisposalDetailsView;
import edu.neu.hospital.example.basicTableExample.DisposalDetailsViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalDetailsViewDao {
    long countByExample(DisposalDetailsViewExample example);

    int deleteByExample(DisposalDetailsViewExample example);

    int insert(DisposalDetailsView record);

    int insertSelective(DisposalDetailsView record);

    List<DisposalDetailsView> selectByExample(DisposalDetailsViewExample example);

    int updateByExampleSelective(@Param("record") DisposalDetailsView record, @Param("example") DisposalDetailsViewExample example);

    int updateByExample(@Param("record") DisposalDetailsView record, @Param("example") DisposalDetailsViewExample example);
}