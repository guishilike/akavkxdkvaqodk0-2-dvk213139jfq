package edu.neu.hospital.dao.disposalDao;

import java.util.List;

import edu.neu.hospital.example.disposalExample.DisposalFormViewExample;
import edu.neu.hospital.bean.disposalBean.DisposalFormView;
import org.apache.ibatis.annotations.Param;

public interface DisposalFormViewDao {
    long countByExample(DisposalFormViewExample example);

    int deleteByExample(DisposalFormViewExample example);

    int insert(DisposalFormView record);

    int insertSelective(DisposalFormView record);

    List<DisposalFormView> selectByExample(DisposalFormViewExample example);

    int updateByExampleSelective(@Param("record") DisposalFormView record, @Param("example") DisposalFormViewExample example);

    int updateByExample(@Param("record") DisposalFormView record, @Param("example") DisposalFormViewExample example);
}