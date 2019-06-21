package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.DisposalDetails;
import edu.neu.hospital.example.basicTableExample.DisposalDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalDetailsDao {
    long countByExample(DisposalDetailsExample example);

    int deleteByExample(DisposalDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DisposalDetails record);

    int insertSelective(DisposalDetails record);

    List<DisposalDetails> selectByExample(DisposalDetailsExample example);

    DisposalDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DisposalDetails record, @Param("example") DisposalDetailsExample example);

    int updateByExample(@Param("record") DisposalDetails record, @Param("example") DisposalDetailsExample example);

    int updateByPrimaryKeySelective(DisposalDetails record);

    int updateByPrimaryKey(DisposalDetails record);
}