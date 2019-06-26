package edu.neu.hospital.dao.disposalDao;

import java.util.List;

import edu.neu.hospital.example.disposalExample.DisposalMatReViewExample;
import edu.neu.hospital.bean.disposalBean.DisposalMatReView;
import org.apache.ibatis.annotations.Param;

public interface DisposalMatReViewDao {
    long countByExample(DisposalMatReViewExample example);

    int deleteByExample(DisposalMatReViewExample example);

    int insert(DisposalMatReView record);

    int insertSelective(DisposalMatReView record);

    List<DisposalMatReView> selectByExample(DisposalMatReViewExample example);

    int updateByExampleSelective(@Param("record") DisposalMatReView record, @Param("example") DisposalMatReViewExample example);

    int updateByExample(@Param("record") DisposalMatReView record, @Param("example") DisposalMatReViewExample example);
}