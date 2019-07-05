package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.ApplyPrescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("ApplyPrescription")
public class ApplyPrescriptionController {
    @Resource
    ApplyPrescriptionService applyPrescriptionService;

    /*
        //新建该患者的prescription
    //首先判断Prescription表里是否已经有该病例的检查了
    public boolean checkIsHaven( Integer medicalRecordID );
    public boolean newPrescription( Prescription prescription , Integer outpatientUserID);
    */
    @RequestMapping("/addPrescription")
    public @ResponseBody
    ResultDTO newPrescription(Prescription prescription, HttpSession session) {
        ResultDTO<Prescription> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.addPrescription(prescription, outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增方成功");
            resultDTO.setData(prescription);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(prescription);

        }
        return resultDTO;

    }


    @RequestMapping("/tempStore")
    public @ResponseBody
    ResultDTO<PageInfo<PrescriptionDetail>> tmpStore(DataListDTO<PrescriptionDetail> dataListDTO, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<PrescriptionDetail>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<PrescriptionDetail> list = dataListDTO.getData();
            List<PrescriptionDetail> res = new LinkedList<>();

            for (int i = 0; i < list.size(); i++) {
                PrescriptionDetail prescriptionDetails = list.get(i);
                prescriptionDetails.setAppearDate(new Date());
                prescriptionDetails.setAppearUserID(outpatientUser.getId());
                res.add(prescriptionDetails);

            }
            PageInfo<PrescriptionDetail> page = new PageInfo<>(res);
            session.setAttribute("tmpPrescriptionDetail", res);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("暂存成功");
            resultDTO.setData(page);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;


    }

    @RequestMapping("/addDrugs")
    public @ResponseBody
    ResultDTO addDrugs(Integer preID , PrescriptionDetail prescriptionDetail , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
        applyPrescriptionService.addDrugs(preID, prescriptionDetail, outpatientUser.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处方药成功");
        resultDTO.setData(preID);

        return resultDTO;

    }

    @RequestMapping("/addDetails")
    public @ResponseBody
    ResultDTO addDrugs(@RequestBody DataListDTO<PrescriptionDetail> dataListDTO , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            int preID=dataListDTO.getData().get(0).getPrescriptionID();
            System.out.println(preID);
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.deleteAllDetails(preID);
            for(int i=0;i<dataListDTO.getData().size();i++){
                applyPrescriptionService.addDrugs(preID, dataListDTO.getData().get(i), outpatientUser.getId());
            }
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加处方详情成功");
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("增加处方详情失败");
            e.printStackTrace();
        }

        return resultDTO;

    }



    @RequestMapping("/searchDrugs")
    public @ResponseBody
    ResultDTO<PageInfo<Drugs>> searchPrescription(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<Drugs>> resultDTO = new ResultDTO<>();

        try {
            PageHelper.startPage(pageNum, pageSize);
            List<Drugs> drugsList = applyPrescriptionService.searchDrugs(str);
            System.out.println("-----");
            PageInfo<Drugs> list = new PageInfo<>(drugsList);
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



    @RequestMapping("/drawPrescriptionDetail")
    public @ResponseBody
    ResultDTO drawPrescriptionDetail(Integer prescriptionID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.drawPrescription(prescriptionID, outpatientUser.getId());
            //PageInfo<PrescriptionDetail> list = new PageInfo<>(prescriptionDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("开立成功");
            resultDTO.setData(prescriptionID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }
    @RequestMapping("/addProjectFee")
    public @ResponseBody
    ResultDTO  addProjectFee(  Integer prescriptionDetailID  ,HttpSession session){
        ResultDTO<Fee> resultDTO = new ResultDTO<>();
        try {

            //
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            Fee fee = applyPrescriptionService.addProjectFee(prescriptionDetailID , outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功");
            resultDTO.setData(fee);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }


    @RequestMapping("/deleteDrugs")
    public @ResponseBody
    ResultDTO deletePrescriptionDetail(Integer prescriptionID , Integer prescriptionDetailID , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.deleteDrugs(prescriptionID, prescriptionDetailID ,outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(prescriptionDetailID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/deletePrescription")
    public @ResponseBody
    ResultDTO deletePrescription(Integer prescriptionID , HttpSession session) {
        System.out.println(prescriptionID);
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.deletePrescription(prescriptionID ,outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(prescriptionID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            e.printStackTrace();
            //resultDTO.setData(page);

        }
        return resultDTO;
    }


    @RequestMapping("/abolishPrescriptionDetail")
    public @ResponseBody
    ResultDTO abolishPrescriptionDetail(Integer prescriptionID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.abolishPrescription(prescriptionID, outpatientUser.getId());
            System.out.println("作废后"+prescriptionID);
            //PageInfo<PrescriptionDetail> list = new PageInfo<>(prescriptionDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("废除成功");
            resultDTO.setData(prescriptionID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/sendPrescription")
    public @ResponseBody
    ResultDTO sendPrescription(Integer prescriptionID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.sendPrescription(prescriptionID, outpatientUser.getId());
            //PageInfo<PrescriptionDetail> list = new PageInfo<>(prescriptionDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("发送成功");
            resultDTO.setData(prescriptionID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发送异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/useCommonDrugs")
    public @ResponseBody
    ResultDTO useCommonDrugs(Integer commonPrescriptionID , HttpSession session) {
        ResultDTO<CommonDrugs> resultDTO = new ResultDTO<>();
        try {
            //
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            CommonDrugs commonPrescription = applyPrescriptionService.useCommonDrugs(commonPrescriptionID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用常用药");
            resultDTO.setData(commonPrescription);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }

    @RequestMapping("/saveTemplate")
    public  @ResponseBody
    ResultDTO<Integer> saveTemplate(ProjectTemplate projectTemplate , HttpSession session){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try{

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            Integer id = applyPrescriptionService.saveTemplate(projectTemplate , outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("存为模板");
            resultDTO.setData(id);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }

    @RequestMapping("/saveTemplateDetails")
    public @ResponseBody
    ResultDTO saveTemplateDetails(DataListDTO lists, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyPrescriptionService.saveTemplateDetails(lists, outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("模板详细存储成功");

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/use_Check")
    public @ResponseBody
    ResultDTO use_Check(Integer projectTemplateID , HttpSession session) {
        ResultDTO<ProjectTemplate> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            ProjectTemplate p = applyPrescriptionService.use_Check(projectTemplateID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("模板详细存储成功");
            resultDTO.setData(p);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }


    /*
    //6.	存为组套
    public Integer saveTemplate(ProjectTemplate  projectTemplate , Integer outpatientUserID);
    public boolean  saveTemplateDetails(DataListDTO lists, Integer outpatientUserID);
    //7.	引用组套
    public ProjectTemplate use_Check(Integer projectTemplateID);
    //8.	查看检查结果
    public List<PrescriptionResult>    lookPrescriptionRes(Integer prescriptionDetailsID);
     */

    @RequestMapping("/listDrugs")
    public @ResponseBody
    ResultDTO<List<Drugsview>> listDrugs(){
        ResultDTO<List<Drugsview>> resultDTO = new ResultDTO<>();

        try {
            List<Drugsview> drugsList= applyPrescriptionService.listDrugs();
            resultDTO.setMsg("listDrugs操作成功");
            resultDTO.setData(drugsList);
            System.out.println("1");
            for (int i = 0; i < drugsList.size(); i++) {
                System.out.println(drugsList.get(i).toString());
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
    @RequestMapping("/listPrescription")
    public @ResponseBody
    ResultDTO<List<Prescriptionview>> listPrescription(){
        ResultDTO<List<Prescriptionview>> resultDTO = new ResultDTO<>();

        try {
            List<Prescriptionview> prescriptionList= applyPrescriptionService.findAllPrescription();
            resultDTO.setMsg("listP操作成功");
            resultDTO.setData(prescriptionList);
            System.out.println("1");

            resultDTO.setStatus("OK");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listP失败");

            System.out.println(e);
            e.printStackTrace();
        }

        return resultDTO;

    }

    @RequestMapping("/listPrescriptionDetail")
    public @ResponseBody
    ResultDTO<List<PrescriptionDetailView>> listPrescriptionDetails(Integer prescriptionID){
        ResultDTO<List<PrescriptionDetailView>> resultDTO = new ResultDTO<>();

        try {
            List<PrescriptionDetailView> prescriptiondetailList= applyPrescriptionService.findAllPrescriptionDetails(prescriptionID);
            resultDTO.setMsg("listP操作成功");
            resultDTO.setData(prescriptiondetailList);
            System.out.println("1");

            resultDTO.setStatus("OK");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listP失败");

            System.out.println(e);
            e.printStackTrace();
        }

        return resultDTO;

    }

}

