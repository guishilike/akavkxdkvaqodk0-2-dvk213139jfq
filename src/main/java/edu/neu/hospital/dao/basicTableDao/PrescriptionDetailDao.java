package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.PrescriptionDetail;
import edu.neu.hospital.example.basicTableExample.PrescriptionDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PrescriptionDetailDao {
    long countByExample(PrescriptionDetailExample example);

    int deleteByExample(PrescriptionDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrescriptionDetail record);

    int insertSelective(PrescriptionDetail record);

    List<PrescriptionDetail> selectByExample(PrescriptionDetailExample example);

    PrescriptionDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrescriptionDetail record, @Param("example") PrescriptionDetailExample example);

    int updateByExample(@Param("record") PrescriptionDetail record, @Param("example") PrescriptionDetailExample example);

    int updateByPrimaryKeySelective(PrescriptionDetail record);

    int updateByPrimaryKey(PrescriptionDetail record);
}