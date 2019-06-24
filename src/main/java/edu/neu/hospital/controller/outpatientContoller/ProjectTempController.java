package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.basicTableBean.ProjectTemplate;
import edu.neu.hospital.bean.basicTableBean.ProjectTemplateDetail;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.service.outPatientService.ProjectTempService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("ProjectTemp")
public class ProjectTempController {
    @Resource
    ProjectTempService projectTempService;
    /*
        //该医生能看到的模板(权限
    public List<Integer> getThisDoctorTemp(Integer userID);
    //病历模板管理
    //增删改查(模板级别的增删改查
    //1.	新增病历模板：输入病历模板编码、病历模板名称、模板适用范围（个人、科室、全院）、病历内容：包括主诉、现病史、体格检查、初步诊断（西医）或初步诊断（中医），点击“保存”，保存模板。
    public boolean addProjectTemplate(ProjectTemplate projectTemplate , Integer userID);
    //2.	修改模板：对病历模板信息进行修改，只能对自己创建的模板进行修改。
    public Integer updateProjectTemplate(ProjectTemplate projectTemplate ,Integer userID);
    //3.	删除模板：对病历模板进行删除，只能对自己创建的模板进行删除。


    public Integer deleteProjectTemplate( Integer projectTemplateID , Integer userID);
    //批量删除
    public boolean deleteProjectTemplateList(IdDTO IdDTO , Integer userID);

    //4.	查询病历模板：可以根据模板编码、名称、类型、创建人进行模板查询。
    //此时不需要考虑权限
    //使用模糊查询
    public List<ProjectTemplate> findProjectTemplate(String str);

     */
    @RequestMapping("/addProjectTemp")
    public @ResponseBody
    ResultDTO addProjectTemp(ProjectTemplate projectTemplate, HttpSession session) {
        ResultDTO<ProjectTemplate> resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.addProjectTemplate(projectTemplate, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(projectTemplate);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(projectTemplate);

        }
        return resultDTO;

    }
    @RequestMapping("/updateProjectTemp")
    public @ResponseBody
    ResultDTO updateProjectTemp(ProjectTemplate projectTemplate, HttpSession session) {
        ResultDTO<ProjectTemplate> resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.updateProjectTemplate(projectTemplate, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(projectTemplate);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(projectTemplate);

        }
        return resultDTO;

    }

    @RequestMapping("/deleteProjectTemplate")
    public @ResponseBody
    ResultDTO deleteProjectTemplate(Integer projectTemplateID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.deleteProjectTemplate(projectTemplateID ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(projectTemplateID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/deleteProjectTemplateList")
    public @ResponseBody
    ResultDTO deleteProjectTemplateList(IdDTO idDTO, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.deleteProjectTemplateList(idDTO ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            //resultDTO.setData(projectTemplateID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/findProjectTemplate")
    public @ResponseBody
    ResultDTO<PageInfo<ProjectTemplate>> findProjectTemplate(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<ProjectTemplate>> resultDTO = new ResultDTO<>();

        try {

            List<ProjectTemplate> projectTemplateList = projectTempService.findProjectTemplate(str);
            System.out.println("-----");
            PageInfo<ProjectTemplate> list = new PageInfo<>(projectTemplateList);
            System.out.println("-----");
            resultDTO.setMsg("模糊查询处置");
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;

    }

    @RequestMapping("/getThisDoctorTemp")
    public @ResponseBody
    ResultDTO getThisDoctorTemp(HttpSession session){
        ResultDTO resultDTO = new ResultDTO<>();


        User user = (User)session.getAttribute("user");
        System.out.println(user.getId());
            List<Integer> projectTemplateList = projectTempService.getThisDoctorTemp(user.getId());
            System.out.println("-----");
            System.out.println("-----");
            resultDTO.setMsg("模糊查询处置");
            resultDTO.setStatus("OK");
            resultDTO.setData(projectTemplateList);

        return resultDTO;
    }


//details

    /*
        //增加一项
    public boolean addProjectTmpDetails(Integer projectTempID , ProjectTemplateDetail projectTemplateDetail , Integer userID);
    //删
    public Integer deleteProjectTmpDetails( Integer projectTemplateDetailID , Integer userID);
    //批量删除
    public boolean deleteProjectTmpDetailsList( IdDTO IdDTO , Integer userID);
    //改
    public Integer updateProjectTmpDetails( Integer projectTemplateDetailsID , Integer userID);
    //查（注意权限
    public ProjectTemplateDetail findProjectDetails( Integer projectTemplateDetailsID );

    //在添加时可进行模糊查询
    public List<FMedItem> searchProject(String str);

     */

    @RequestMapping("/ProjectTemplateDetail")
    public @ResponseBody
    ResultDTO addProjectTmpDetails(Integer projectTempID , ProjectTemplateDetail projectTemplateDetail , HttpSession session) {
        ResultDTO<ProjectTemplateDetail> resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.addProjectTmpDetails(projectTempID, projectTemplateDetail,user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(projectTemplateDetail);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(projectTemplateDetail);

        }
        return resultDTO;

    }
    @RequestMapping("/updateProjectTmpDetails")
    public @ResponseBody
    ResultDTO updateProjectTmpDetails(ProjectTemplateDetail projectTemplateDetail, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.updateProjectTmpDetails(projectTemplateDetail, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更改模板成功");
            resultDTO.setData(projectTemplateDetail);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(projectTemplateDetail);

        }
        return resultDTO;

    }

    @RequestMapping("/deleteProjectTmpDetails")
    public @ResponseBody
    ResultDTO deleteProjectTmpDetails(Integer projectTemplateDetailID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.deleteProjectTmpDetails(projectTemplateDetailID ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(projectTemplateDetailID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/deleteProjectTmpDetailsList")
    public @ResponseBody
    ResultDTO deleteProjectTmpDetailsList(IdDTO idDTO, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            User user = (User)session.getAttribute("user");
            System.out.println(user.getId());
            projectTempService.deleteProjectTmpDetailsList(idDTO ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            //resultDTO.setData(projectTemplateID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/searchProject")
    public @ResponseBody
    ResultDTO<PageInfo<FMedItem>> searchProject(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<FMedItem>> resultDTO = new ResultDTO<>();

        try {

            List<FMedItem> diseaseList = projectTempService.searchProject(str);
            System.out.println("-----");
            PageInfo<FMedItem> list = new PageInfo<>(diseaseList);
            System.out.println("-----");
            resultDTO.setMsg("模糊查询处置");
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;

    }
}
