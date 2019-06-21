package edu.neu.hospital.dao.disposalDao;

import edu.neu.hospital.bean.disposalBean.DisposalMatPlateView;
import edu.neu.hospital.example.disposalExample.DisposalMatPlateViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalMatPlateViewDao {
    long countByExample(DisposalMatPlateViewExample example);

    int deleteByExample(DisposalMatPlateViewExample example);

    int insert(DisposalMatPlateView record);

    int insertSelective(DisposalMatPlateView record);

    List<DisposalMatPlateView> selectByExample(DisposalMatPlateViewExample example);

    int updateByExampleSelective(@Param("record") DisposalMatPlateView record, @Param("example") DisposalMatPlateViewExample example);

    int updateByExample(@Param("record") DisposalMatPlateView record, @Param("example") DisposalMatPlateViewExample example);
}