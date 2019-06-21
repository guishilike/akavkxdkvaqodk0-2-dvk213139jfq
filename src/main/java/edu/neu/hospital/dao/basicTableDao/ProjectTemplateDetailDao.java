package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.ProjectTemplateDetail;
import edu.neu.hospital.example.basicTableExample.ProjectTemplateDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface ProjectTemplateDetailDao {
    long countByExample(ProjectTemplateDetailExample example);

    int deleteByExample(ProjectTemplateDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectTemplateDetail record);

    int insertSelective(ProjectTemplateDetail record);

    List<ProjectTemplateDetail> selectByExample(ProjectTemplateDetailExample example);

    ProjectTemplateDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectTemplateDetail record, @Param("example") ProjectTemplateDetailExample example);

    int updateByExample(@Param("record") ProjectTemplateDetail record, @Param("example") ProjectTemplateDetailExample example);

    int updateByPrimaryKeySelective(ProjectTemplateDetail record);

    int updateByPrimaryKey(ProjectTemplateDetail record);
}