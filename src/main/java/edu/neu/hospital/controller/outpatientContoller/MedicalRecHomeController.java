package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.MedicalRecHomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("medicalRecHome")
public class MedicalRecHomeController {

    //@Autowired
    @Resource
    MedicalRecHomeService medicalRecHomeService;
    //查询患者:通过患者病历号或患者名字
    @RequestMapping("/findPatient")
    public @ResponseBody
    ResultDTO<PageInfo<Patient>> findPatient(String nameOrMedicalRecNo , Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo<Patient>> resultDTO = new ResultDTO<>();

       try {
           PageHelper.startPage(pageNum, pageSize);

           List<Patient> patients = medicalRecHomeService.findPatient(nameOrMedicalRecNo);
           resultDTO.setMsg("操作成功");
           PageInfo<Patient> list = new PageInfo<>(patients);
           resultDTO.setData(list);
           for (int i = 0; i < patients.size(); i++) {
               System.out.println(patients.get(i).toString());
           }
           resultDTO.setStatus("OK");

       }catch (Exception e){
           resultDTO.setStatus("FALSE");

           resultDTO.setMsg("操1111");
       }

        return resultDTO;
    }
    @RequestMapping("/tempStore")
    public @ResponseBody
    ResultDTO tmpStore(MedicalRecHome medicalRecHome , HttpSession session){
        ResultDTO<MedicalRecHome> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            medicalRecHome.setDoctorId(user.getId());
            session.setAttribute("tmpMedicalRecHome" , medicalRecHome);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("暂存成功");
            resultDTO.setData(medicalRecHome);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(medicalRecHome);

        }
        return resultDTO;


    }

    @RequestMapping("/use_TempStore")
    public @ResponseBody
    ResultDTO use_TempStore(Integer medicalRecID , HttpSession session) {
        ResultDTO<MedicalRecHome> resultDTO = new ResultDTO<>();
        try {

            MedicalRecHome medicalRecHome = (MedicalRecHome) session.getAttribute("tmpMedicalRecHome");
            resultDTO.setStatus("OK");
            resultDTO.setMsg("暂存数据读取成功");
            resultDTO.setData(medicalRecHome);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }

    @RequestMapping("/add")
    public @ResponseBody
    ResultDTO add(MedicalRecHome medicalRecHome , HttpSession session) {
        ResultDTO<MedicalRecHome> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            //先把判断填写完整的那句去掉，不然测试太费劲
            medicalRecHomeService.add(medicalRecHome , user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加一条");
            resultDTO.setData(medicalRecHome);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }

    @RequestMapping("/save_Template")
    public @ResponseBody
    ResultDTO save_Template(MedicalRecHomeTemplate medicalRecHomeTemplate , HttpSession session){
        ResultDTO<MedicalRecHomeTemplate> resultDTO = new ResultDTO<>();
        try{
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            medicalRecHomeService.save_Template(medicalRecHomeTemplate , user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("存为组套");
            resultDTO.setData(medicalRecHomeTemplate);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }

    @RequestMapping("/use_Template")
    public @ResponseBody
    ResultDTO use_Template(Integer recHomeTemplateID , HttpSession session) {
        ResultDTO<MedicalRecHomeTemplate> resultDTO = new ResultDTO<>();
        try {
            //
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            MedicalRecHomeTemplate medicalRecHomeTemplate = medicalRecHomeService.use_Template(recHomeTemplateID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用病历模板");
            resultDTO.setData(medicalRecHomeTemplate);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }




    @RequestMapping("/use_CommonDiagnosis")
    public @ResponseBody
    ResultDTO use_CommonDiagnosis(Integer commonDiagnosisID , HttpSession session) {
        ResultDTO<CommonDiagnosis> resultDTO = new ResultDTO<>();
        try {
            //
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            CommonDiagnosis commonDiagnosis = medicalRecHomeService.use_CommonDiagnosis(commonDiagnosisID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用常用诊断");
            resultDTO.setData(commonDiagnosis);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }

    @RequestMapping("/searchHistoryRec")
    public @ResponseBody
    ResultDTO<PageInfo> searchHistoryRec(Integer patientID  , Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<MedicalRecord> medicalRecords =medicalRecHomeService.searchHistoryRec(patientID);
            PageInfo<MedicalRecord> list = new PageInfo<>(medicalRecords);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查看历史病历");
            resultDTO.setData(list);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }



}
