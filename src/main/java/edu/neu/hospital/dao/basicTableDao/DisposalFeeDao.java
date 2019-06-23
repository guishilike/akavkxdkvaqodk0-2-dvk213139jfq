package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.DisposalFee;
import edu.neu.hospital.example.basicTableExample.DisposalFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalFeeDao {
    long countByExample(DisposalFeeExample example);

    int deleteByExample(DisposalFeeExample example);

    int insert(DisposalFee record);

    int insertSelective(DisposalFee record);

    List<DisposalFee> selectByExample(DisposalFeeExample example);

    int updateByExampleSelective(@Param("record") DisposalFee record, @Param("example") DisposalFeeExample example);

    int updateByExample(@Param("record") DisposalFee record, @Param("example") DisposalFeeExample example);
}