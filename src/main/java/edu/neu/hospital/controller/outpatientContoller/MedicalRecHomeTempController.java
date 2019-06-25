package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.MedicalRecHomeTemplate;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.MedicalRecHomeTempService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("MedicalRecHomeTemp")
public class MedicalRecHomeTempController {
    @Resource
    MedicalRecHomeTempService medicalRecHomeTempService;

    @RequestMapping("/addMedicalRecHomeTemp")
    public @ResponseBody
    ResultDTO addMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate, HttpSession session) {
        ResultDTO<MedicalRecHomeTemplate> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            medicalRecHomeTempService.addMedicalRecHomeTemp(medicalRecHomeTemplate, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(medicalRecHomeTemplate);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(medicalRecHomeTemplate);

        }
        return resultDTO;

    }
    @RequestMapping("/updateMedicalRecHomeTemp")
    public @ResponseBody
    ResultDTO updateMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate, HttpSession session) {
        ResultDTO<MedicalRecHomeTemplate> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            medicalRecHomeTempService.updateMedicalRecHomeTemp(medicalRecHomeTemplate, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(medicalRecHomeTemplate);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(medicalRecHomeTemplate);

        }
        return resultDTO;

    }

    @RequestMapping("/deleteMedicalRecHomeTemp")
    public @ResponseBody
    ResultDTO deleteMedicalRecHomeTemplate(Integer medicalRecHomeTemplateID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            medicalRecHomeTempService.deleteMedicalRecHomeTemplate(medicalRecHomeTemplateID ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(medicalRecHomeTemplateID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/findMedicalRecHomeTemplate")
    public @ResponseBody
    ResultDTO<PageInfo<MedicalRecHomeTemplate>> findMedicalRecHomeTemplate(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<MedicalRecHomeTemplate>> resultDTO = new ResultDTO<>();

        try {

            List<MedicalRecHomeTemplate> medicalRecHomeTemplateList = medicalRecHomeTempService.findMedicalRecHomeTemplate(str);
            System.out.println("-----");
            PageInfo<MedicalRecHomeTemplate> list = new PageInfo<>(medicalRecHomeTemplateList);
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
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<Integer> medicalRecHomeTemplateList = medicalRecHomeTempService.getThisDoctorTemp(user.getId());
            System.out.println("-----");
            System.out.println("-----");
            resultDTO.setMsg("该医生的模板");
            resultDTO.setStatus("OK");
            resultDTO.setData(medicalRecHomeTemplateList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;
    }

    /*
        //病历模板管理
    //增删改查
    //1.	新增病历模板：输入病历模板编码、病历模板名称、模板适用范围（个人、科室、全院）、病历内容：包括主诉、现病史、体格检查、初步诊断（西医）或初步诊断（中医），点击“保存”，保存模板。
   public boolean addMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate , Integer userID);
    //2.	修改模板：对病历模板信息进行修改，只能对自己创建的模板进行修改。
    public Integer updateMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate ,Integer userID);
    //3.	删除模板：对病历模板进行删除，只能对自己创建的模板进行删除。

    public Integer deleteMedicalRecHomeTemplate( Integer medicalRecHomeTemplateID , Integer userID);
    //4.	查询病历模板：可以根据模板编码、名称、类型、创建人进行模板查询。
    //此时不需要考虑权限
    //模糊查询
    public List<MedicalRecHomeTemplate> findMedicalRecHomeTemplate(String str);
    //该医生能看到的模板
    public List<Integer> getThisDoctorTemp(Integer userID);
     */
}
