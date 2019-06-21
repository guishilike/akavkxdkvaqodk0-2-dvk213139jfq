package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.DepartmentView;
import java.util.List;

import edu.neu.hospital.example.baseExample.DepartmentViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DepartmentViewDao {
    long countByExample(DepartmentViewExample example);

    int deleteByExample(DepartmentViewExample example);

    int insert(DepartmentView record);

    int insertSelective(DepartmentView record);

    List<DepartmentView> selectByExample(DepartmentViewExample example);

    int updateByExampleSelective(@Param("record") DepartmentView record, @Param("example") DepartmentViewExample example);

    int updateByExample(@Param("record") DepartmentView record, @Param("example") DepartmentViewExample example);
}