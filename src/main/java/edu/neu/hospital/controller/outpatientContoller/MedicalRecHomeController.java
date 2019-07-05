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
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("medicalRecHome")
public class MedicalRecHomeController {

    //@Resource
    @Resource
    MedicalRecHomeService medicalRecHomeService;
    //查询患者:通过患者病历号或患者名字
    @RequestMapping("/findPatient")
    public @ResponseBody
    ResultDTO<PageInfo<PatientMedicalRec>> findPatient(String nameOrMedicalRecNo , Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo<PatientMedicalRec>> resultDTO = new ResultDTO<>();

       try {
           PageHelper.startPage(pageNum, pageSize);

           List<PatientMedicalRec> patients = medicalRecHomeService.findPatient(nameOrMedicalRecNo);
           resultDTO.setMsg("操作成功");
           PageInfo<PatientMedicalRec> list = new PageInfo<>(patients);
           resultDTO.setData(list);
           for (int i = 0; i < patients.size(); i++) {
               System.out.println(patients.get(i).toString());
           }
           resultDTO.setStatus("OK");

       }catch (Exception e){
           resultDTO.setStatus("FALSE");

           resultDTO.setMsg("findPatient失败");

           System.out.println(e);
       }

        return resultDTO;
    }
    @RequestMapping("/tempStore")
    public @ResponseBody
    ResultDTO tmpStore(MedicalRecHome medicalRecHome , HttpSession session){
        ResultDTO<MedicalRecHome> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            medicalRecHome.setDoctorId(outpatientUser.getId());
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

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            //先把判断填写完整的那句去掉，不然测试太费劲
            medicalRecHomeService.add(medicalRecHome , outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加一条");
            resultDTO.setData(medicalRecHome);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
            System.out.println(e);
        }
        return resultDTO;


    }

    @RequestMapping("/save_Template")
    public @ResponseBody
    ResultDTO save_Template(MedicalRecHomeTemplate medicalRecHomeTemplate , HttpSession session){
        ResultDTO<MedicalRecHomeTemplate> resultDTO = new ResultDTO<>();
        try{
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            medicalRecHomeService.save_Template(medicalRecHomeTemplate , outpatientUser.getId());
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
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
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
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
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

    @RequestMapping("/listPatientNoDiagnosis")
    public @ResponseBody
    ResultDTO<PageInfo<PatientMedicalRec>> listPatientNoDiagnosis(Integer pageNum , Integer pageSize){
        ResultDTO<PageInfo<PatientMedicalRec>> resultDTO = new ResultDTO<>();

        try {
            PageHelper.startPage(pageNum, pageSize);
            System.out.println("1");
            List<PatientMedicalRec> patientMedicalRecList = medicalRecHomeService.listPatientNoDiagnosis();
            resultDTO.setMsg("listPatientNoDiagnosis操作成功");
            System.out.println("1");
            PageInfo<PatientMedicalRec> list = new PageInfo<>(patientMedicalRecList);
            resultDTO.setData(list);
            System.out.println("1");
            for (int i = 0; i < patientMedicalRecList.size(); i++) {
                System.out.println(patientMedicalRecList.get(i).toString());
                System.out.println("2");
            }
            resultDTO.setStatus("OK");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listPatientNoDiagnosis失败");

            System.out.println(e);
        }

        return resultDTO;

    }

    //获取所有patientMedicalRecList序列中的medicalRecNO和patientName(想检索的东西)
    @RequestMapping("/listSearchValue")
    public @ResponseBody
    ResultDTO<List<String>> listSearchValue(){
        ResultDTO<List<String>> resultDTO = new ResultDTO<>();
        try{
            List<PatientMedicalRec> patientMedicalRecList = medicalRecHomeService.listPatientNoDiagnosis();
            List<String> stringList = new LinkedList<>();
            for( int i = 0 ; i < patientMedicalRecList.size() ; i ++){
                stringList.add(patientMedicalRecList.get(i).getPatientName());
                stringList.add(patientMedicalRecList.get(i).getMedicalRecordNo());
            }
            resultDTO.setMsg("listSearchValue操作成功");

            resultDTO.setData(stringList);
            for (int i = 0; i < patientMedicalRecList.size(); i++) {
                System.out.println(patientMedicalRecList.get(i).toString());
            }
            resultDTO.setStatus("OK");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listSearchValue失败");

            System.out.println(e);
        }

        return resultDTO;
    }



}
