package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.baseExample.DepartmentViewExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentViewDao {
    long countByExample(DepartmentViewExample example);

    int deleteByExample(DepartmentViewExample example);

    int insert(DepartmentView record);

    int insertSelective(DepartmentView record);

    List<DepartmentView> selectByExample(DepartmentViewExample example);

    int updateByExampleSelective(@Param("record") DepartmentView record, @Param("example") DepartmentViewExample example);

    int updateByExample(@Param("record") DepartmentView record, @Param("example") DepartmentViewExample example);

    @Select("select id,deptCode as code,deptName as name from departmentview")
    List<NameCodeDTO> selectAllDeptNamesAndCodes();


}