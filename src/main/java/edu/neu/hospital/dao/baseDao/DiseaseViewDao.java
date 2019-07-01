package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.DiseaseView;

import java.util.List;

import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.DiseaseViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DiseaseViewDao {
    long countByExample(DiseaseViewExample example);

    int deleteByExample(DiseaseViewExample example);

    int insert(DiseaseView record);

    int insertSelective(DiseaseView record);

    List<DiseaseView> selectByExample(DiseaseViewExample example);

    int updateByExampleSelective(@Param("record") DiseaseView record, @Param("example") DiseaseViewExample example);

    int updateByExample(@Param("record") DiseaseView record, @Param("example") DiseaseViewExample example);
    @Select("select id,code, name from diseaseview")
    List<NameCodeDTO> selectAllDiseaseNamesAndCodes();
    @Select("select id from diseaseview where name=#{name}")
    int getIDByName(String name);
}