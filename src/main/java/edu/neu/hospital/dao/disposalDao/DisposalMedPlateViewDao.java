package edu.neu.hospital.dao.disposalDao;

import edu.neu.hospital.bean.disposalBean.DisposalMedPlateView;
import edu.neu.hospital.example.disposalExample.DisposalMedPlateViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisposalMedPlateViewDao {
    long countByExample(DisposalMedPlateViewExample example);

    int deleteByExample(DisposalMedPlateViewExample example);

    int insert(DisposalMedPlateView record);

    int insertSelective(DisposalMedPlateView record);

    List<DisposalMedPlateView> selectByExample(DisposalMedPlateViewExample example);

    int updateByExampleSelective(@Param("record") DisposalMedPlateView record, @Param("example") DisposalMedPlateViewExample example);

    int updateByExample(@Param("record") DisposalMedPlateView record, @Param("example") DisposalMedPlateViewExample example);
}