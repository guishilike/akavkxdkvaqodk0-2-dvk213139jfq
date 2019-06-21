package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.DiseaseView;

import java.util.List;

import edu.neu.hospital.example.basicTableExample.DiseaseViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DiseaseViewDao {
    long countByExample(DiseaseViewExample example);

    int deleteByExample(DiseaseViewExample example);

    int insert(DiseaseView record);

    int insertSelective(DiseaseView record);

    List<DiseaseView> selectByExample(DiseaseViewExample example);

    int updateByExampleSelective(@Param("record") DiseaseView record, @Param("example") DiseaseViewExample example);

    int updateByExample(@Param("record") DiseaseView record, @Param("example") DiseaseViewExample example);
}