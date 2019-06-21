package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.ProjectTemplate;
import edu.neu.hospital.example.basicTableExample.ProjectTemplateExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface ProjectTemplateDao {
    long countByExample(ProjectTemplateExample example);

    int deleteByExample(ProjectTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectTemplate record);

    int insertSelective(ProjectTemplate record);

    List<ProjectTemplate> selectByExample(ProjectTemplateExample example);

    ProjectTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectTemplate record, @Param("example") ProjectTemplateExample example);

    int updateByExample(@Param("record") ProjectTemplate record, @Param("example") ProjectTemplateExample example);

    int updateByPrimaryKeySelective(ProjectTemplate record);

    int updateByPrimaryKey(ProjectTemplate record);
}