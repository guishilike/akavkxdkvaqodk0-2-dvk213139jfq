package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.SettleCategoryView;
import edu.neu.hospital.example.baseExample.SettleCategoryViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SettleCategoryViewDao {
    long countByExample(SettleCategoryViewExample example);

    int deleteByExample(SettleCategoryViewExample example);

    int insert(SettleCategoryView record);

    int insertSelective(SettleCategoryView record);

    List<SettleCategoryView> selectByExample(SettleCategoryViewExample example);

    int updateByExampleSelective(@Param("record") SettleCategoryView record, @Param("example") SettleCategoryViewExample example);

    int updateByExample(@Param("record") SettleCategoryView record, @Param("example") SettleCategoryViewExample example);

    //根据id查找顺序号
    @Select("select sequenceID from settlecategoryview where id=#{id}")
    int findSequenceIdById(Integer id);

    //根据顺序号查找id
    @Select("select id from settlecategoryview where sequenceID=#{id}")
    int findIdBySequenceId(Integer id) ;
}