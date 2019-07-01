package edu.neu.hospital.dao.TakeMedicineDao;

import java.util.List;

import edu.neu.hospital.bean.takeMedicineBean.TakeMedicineFormView;
import edu.neu.hospital.example.takeMedicineExample.TakeMedicineFormViewExample;
import org.apache.ibatis.annotations.Param;

public interface TakeMedicineFormViewDao {
    long countByExample(TakeMedicineFormViewExample example);

    int deleteByExample(TakeMedicineFormViewExample example);

    int insert(TakeMedicineFormView record);

    int insertSelective(TakeMedicineFormView record);

    List<TakeMedicineFormView> selectByExample(TakeMedicineFormViewExample example);

    int updateByExampleSelective(@Param("record") TakeMedicineFormView record, @Param("example") TakeMedicineFormViewExample example);

    int updateByExample(@Param("record") TakeMedicineFormView record, @Param("example") TakeMedicineFormViewExample example);
}