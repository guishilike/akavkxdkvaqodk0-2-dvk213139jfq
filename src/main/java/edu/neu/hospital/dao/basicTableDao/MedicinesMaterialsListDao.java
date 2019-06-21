package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.MedicinesMaterialsList;
import edu.neu.hospital.example.basicTableExample.MedicinesMaterialsListExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicinesMaterialsListDao {
    long countByExample(MedicinesMaterialsListExample example);

    int deleteByExample(MedicinesMaterialsListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicinesMaterialsList record);

    int insertSelective(MedicinesMaterialsList record);

    List<MedicinesMaterialsList> selectByExample(MedicinesMaterialsListExample example);

    MedicinesMaterialsList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicinesMaterialsList record, @Param("example") MedicinesMaterialsListExample example);

    int updateByExample(@Param("record") MedicinesMaterialsList record, @Param("example") MedicinesMaterialsListExample example);

    int updateByPrimaryKeySelective(MedicinesMaterialsList record);

    int updateByPrimaryKey(MedicinesMaterialsList record);
}