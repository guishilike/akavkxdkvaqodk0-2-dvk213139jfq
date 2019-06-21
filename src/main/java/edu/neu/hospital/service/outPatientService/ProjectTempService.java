package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.basicTableBean.ProjectTemplate;
import edu.neu.hospital.bean.basicTableBean.ProjectTemplateDetail;
import edu.neu.hospital.dto.IdDTO;

import java.util.List;

public interface ProjectTempService {
    //该医生能看到的模板(权限
    public List<Integer> getThisDoctorTemp(Integer userID);
    //病历模板管理
    //增删改查(模板级别的增删改查
    //1.	新增病历模板：输入病历模板编码、病历模板名称、模板适用范围（个人、科室、全院）、病历内容：包括主诉、现病史、体格检查、初步诊断（西医）或初步诊断（中医），点击“保存”，保存模板。
    public boolean addProjectTemplate(ProjectTemplate projectTemplate, Integer userID);
    //2.	修改模板：对病历模板信息进行修改，只能对自己创建的模板进行修改。
    public Integer updateProjectTemplate(ProjectTemplate projectTemplate, Integer userID);
    //3.	删除模板：对病历模板进行删除，只能对自己创建的模板进行删除。


    public Integer deleteProjectTemplate(Integer projectTemplateID, Integer userID);
    //批量删除
    public boolean deleteProjectTemplateList(IdDTO idDTO, Integer userID);

    //4.	查询病历模板：可以根据模板编码、名称、类型、创建人进行模板查询。
    //此时不需要考虑权限
    //使用模糊查询
    public List<ProjectTemplate> findProjectTemplate(String str);






    //对于模板detail的增删改查
    //增加一项
    public boolean addProjectTmpDetails(Integer projectTempID, ProjectTemplateDetail projectTemplateDetail, Integer userID);
    //删
    public Integer deleteProjectTmpDetails(Integer projectTemplateDetailID, Integer userID);
    //批量删除
    public boolean deleteProjectTmpDetailsList(IdDTO idDTO, Integer userID);
    //改
    public Integer updateProjectTmpDetails(ProjectTemplateDetail projectTemplateDetail, Integer userID);
    //查（注意权限
    public ProjectTemplateDetail findProjectDetails(Integer projectTemplateDetailsID);

    //在添加时可进行模糊查询
    public List<FMedItem> searchProject(String str);

}
