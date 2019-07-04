package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Diagnosis;
import edu.neu.hospital.bean.basicTableBean.DiagnosisView;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.DiagnoseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("Diagnosis")
public class DiagnosisController {
    @Resource
    DiagnoseService diagnoseService;

    @RequestMapping("/addDiagnosis")
    public @ResponseBody
    ResultDTO addDiagnosis(Diagnosis diagnosis, HttpSession session){
        ResultDTO<Diagnosis> resultDTO = new ResultDTO<>();
        try{

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            diagnoseService.addDiagnosis(diagnosis , outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加诊断成功");
            resultDTO.setData(diagnosis);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(diagnosis);

        }
        return resultDTO;

    }


    @RequestMapping("/addDiagnosisList")
    public @ResponseBody
    ResultDTO<PageInfo<Diagnosis>> addDiagnosisList(DataListDTO<Diagnosis> diagnosisList, Integer pageNum, Integer pageSize, HttpSession session){
        ResultDTO<PageInfo<Diagnosis>> resultDTO = new ResultDTO<>();

       // try{
        PageHelper.startPage(pageNum, pageSize);
        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
            System.out.println("wai-----");
            diagnoseService.addDiagnosisList(diagnosisList , outpatientUser.getId());
            System.out.println("-----");
            PageInfo<Diagnosis> list = new PageInfo<>(diagnosisList.getData());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加诊断成功");
            resultDTO.setData(list);
       /* }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            System.out.println(e);
            //resultDTO.setData(list);

        }*/
        return resultDTO;

    }
    @RequestMapping("/searchDisease")
    public @ResponseBody
    ResultDTO<PageInfo<Disease>> searchDisease(String str, Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo<Disease>> resultDTO = new ResultDTO<>();

        try {
            PageHelper.startPage(pageNum, pageSize);
            List<Disease> diseaseList = diagnoseService.searchDisease(str);
            System.out.println("-----");
            PageInfo<Disease> list = new PageInfo<>(diseaseList);
            System.out.println("-----");
            resultDTO.setMsg("模糊查询疾病");
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;

        }



    @RequestMapping("/deleteDiagnosis")
    public @ResponseBody
    ResultDTO deleteDiagnosis(Integer diagnosisID, HttpSession session){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try{

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            diagnoseService.deleteDiagnosis(diagnosisID , outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除诊断成功");
            resultDTO.setData(diagnosisID);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(diagnosisID);

        }
        return resultDTO;

    }
    @RequestMapping("/deleteDiagnosisList")
    public @ResponseBody
    ResultDTO deleteDiagnosisList(IdDTO ids, HttpSession session){
        ResultDTO<List<Integer>> resultDTO = new ResultDTO<>();

        // try{

        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
        System.out.println("wai-----");

        diagnoseService.deleteDiagnosisList(ids , outpatientUser.getId());
        System.out.println("-----");


        resultDTO.setStatus("OK");
        resultDTO.setMsg("批量删除诊断成功");
        resultDTO.setData(ids.getId());
       /* }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            System.out.println(e);
            //resultDTO.setData(list);

        }*/
        return resultDTO;

    }

    @RequestMapping("/updateDiagnosis")
    public @ResponseBody
    ResultDTO updateDiagnosis(Diagnosis diagnosis, HttpSession session){
        ResultDTO<Diagnosis> resultDTO = new ResultDTO<>();
    try{

        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
            diagnoseService.updateDiagnosis(diagnosis , outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新诊断成功");
            resultDTO.setData(diagnosis);

    }catch (Exception e){
        resultDTO.setStatus("FALSE");
        resultDTO.setMsg("发生异常");
        resultDTO.setData(diagnosis);

    }

        return resultDTO;

    }


    @RequestMapping("/searchDiagnosis")
    public @ResponseBody
    ResultDTO searchDiagnosis(Integer diagnosisID){
        ResultDTO<Diagnosis> resultDTO = new ResultDTO<>();
        try{

            Diagnosis diagnosis =  diagnoseService.searchDiagnosis(diagnosisID );
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查看诊断成功");
            resultDTO.setData(diagnosis);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(diagnosis);

        }
        return resultDTO;

    }



    /*
    //删

    public  boolean deleteDiagnosis( Integer diagnosisID,Integer outpatientUserID);
    public boolean deleteDiagnosisList(IdDTO diagnosisIDs , Integer outpatientUserID);
    //改
    //主诊、疑似等都在此处设置
    public boolean updateDiagnosis( Diagnosis diagnosis,Integer outpatientUserID);

    //查
    public  Diagnosis searchDiagnosis( Integer diagnosisID);
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
     */

    @RequestMapping("/defineDiagnose")
    public @ResponseBody
    ResultDTO defineDiagnose(Integer diagnosisID, HttpSession session){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();

        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            diagnoseService.defineDiagnose(diagnosisID , outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("确诊成功");
            resultDTO.setData(diagnosisID);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(diagnosisID);

        }
        return resultDTO;


    }

    //public List<Diagnosis> getIndexDiagnosis(Integer medicalRecordID) {

        @RequestMapping("/getIndexDiagnosis")
        public @ResponseBody
        ResultDTO getIndexDiagnosis(Integer medicalRecordID){
            ResultDTO<List<DiagnosisView>> resultDTO = new ResultDTO<>();

            try {


                List<DiagnosisView> list = diagnoseService.getIndexDiagnosis(medicalRecordID);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("确诊成功");
                resultDTO.setData(list);
            }catch (Exception e){
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常");
                //resultDTO.setData(diagnosisID);
                System.out.println(e);

            }
            return resultDTO;


        }


    @RequestMapping("/listDisease")
    public @ResponseBody
    ResultDTO listDisease() {
        ResultDTO<List<Disease>> resultDTO = new ResultDTO<>();
        try {


            List<Disease> list = diagnoseService.listDisease();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("确诊成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(diagnosisID);
            System.out.println(e);

        }
        return resultDTO;


    }




}
