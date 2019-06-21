package edu.neu.hospital.dao.disposalDao;

import edu.neu.hospital.bean.disposalBean.DisposalMedReView;
import edu.neu.hospital.example.disposalExample.DisposalMedReViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalMedReViewDao {
    long countByExample(DisposalMedReViewExample example);

    int deleteByExample(DisposalMedReViewExample example);

    int insert(DisposalMedReView record);

    int insertSelective(DisposalMedReView record);

    List<DisposalMedReView> selectByExample(DisposalMedReViewExample example);

    int updateByExampleSelective(@Param("record") DisposalMedReView record, @Param("example") DisposalMedReViewExample example);

    int updateByExample(@Param("record") DisposalMedReView record, @Param("example") DisposalMedReViewExample example);
}