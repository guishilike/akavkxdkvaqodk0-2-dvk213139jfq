package edu.neu.hospital.dao.basicTableDao;

import edu.neu.hospital.bean.basicTableBean.ProjectTemplateView;
import edu.neu.hospital.example.basicTableExample.ProjectTemplateViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectTemplateViewDao {
    long countByExample(ProjectTemplateViewExample example);

    int deleteByExample(ProjectTemplateViewExample example);

    int insert(ProjectTemplateView record);

    int insertSelective(ProjectTemplateView record);

    List<ProjectTemplateView> selectByExample(ProjectTemplateViewExample example);

    int updateByExampleSelective(@Param("record") ProjectTemplateView record, @Param("example") ProjectTemplateViewExample example);

    int updateByExample(@Param("record") ProjectTemplateView record, @Param("example") ProjectTemplateViewExample example);
}