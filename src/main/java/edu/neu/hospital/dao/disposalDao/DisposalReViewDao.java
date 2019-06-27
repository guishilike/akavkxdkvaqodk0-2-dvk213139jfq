package edu.neu.hospital.dao.disposalDao;

import java.util.List;

import edu.neu.hospital.example.disposalExample.DisposalReViewExample;
import edu.neu.hospital.bean.disposalBean.DisposalReView;
import org.apache.ibatis.annotations.Param;

public interface DisposalReViewDao {
    long countByExample(DisposalReViewExample example);

    int deleteByExample(DisposalReViewExample example);

    int insert(DisposalReView record);

    int insertSelective(DisposalReView record);

    List<DisposalReView> selectByExample(DisposalReViewExample example);

    int updateByExampleSelective(@Param("record") DisposalReView record, @Param("example") DisposalReViewExample example);

    int updateByExample(@Param("record") DisposalReView record, @Param("example") DisposalReViewExample example);
}