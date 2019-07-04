package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.ApplyInspectionService;
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
@RequestMapping("ApplyInspection")
public class ApplyInspectionController {
    @Resource
    ApplyInspectionService applyInspectionService;

    /*
        //新建该患者的inspection
    //首先判断Inspection表里是否已经有该病例的检查了
    public boolean checkIsHaven( Integer medicalRecordID );
    public boolean newInspection( Inspection inspection , Integer outpatientUserID);
    */
    @RequestMapping("/newInspection")
    public @ResponseBody
    ResultDTO newInspection(Inspection inspection, HttpSession session) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            Inspection res =  applyInspectionService.newInspection(inspection, outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加检查成功");
            resultDTO.setData(res);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(inspection);
            System.out.println(e);

        }
        return resultDTO;

    }

    @RequestMapping("/addInspectionDetailsList")
    public @ResponseBody
    ResultDTO<Inspection> addInspectionDetailsList(Inspection inspection, DataListDTO inspectionDetailsList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
        applyInspectionService.addInspectionDetailsList(inspection, inspectionDetailsList, outpatientUser.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/addInspectionDetails")
    public @ResponseBody
    ResultDTO<Inspection> addInspectionDetails(Inspection inspection, InspectionDetails inspectionDetails, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
        applyInspectionService.addInspectionDetails(inspection, inspectionDetails, outpatientUser.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/searchInspection")
    public @ResponseBody
    ResultDTO<PageInfo<FMedItem>> searchInspection(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<FMedItem>> resultDTO = new ResultDTO<>();

        try {
            PageHelper.startPage(pageNum, pageSize);
            List<FMedItem> diseaseList = applyInspectionService.searchInspections(str);
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

    @RequestMapping("/tempStore")
    public @ResponseBody
    ResultDTO<PageInfo<InspectionDetails>> tmpStore(DataListDTO dataListDTO, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<InspectionDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<InspectionDetails> list = dataListDTO.getData();
            List<InspectionDetails> res = new LinkedList<>();

            for (int i = 0; i < list.size(); i++) {
                InspectionDetails inspectionDetails = list.get(i);
                inspectionDetails.setAppearDate(new Date());
                inspectionDetails.setAppearUserID(outpatientUser.getId());
                res.add(inspectionDetails);

            }
            PageInfo<InspectionDetails> page = new PageInfo<>(res);
            session.setAttribute("tmpInspectionDetails", res);

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


    @RequestMapping("/drawInspectionDetails")
    public @ResponseBody
    ResultDTO<PageInfo<InspectionDetails>> drawInspectionDetails(IdDTO inspectionDetailsIdList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<InspectionDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<InspectionDetails> inspectionDetailsList = applyInspectionService.drawInspectionDetails(inspectionDetailsIdList, outpatientUser.getId());
            PageInfo<InspectionDetails> list = new PageInfo<>(inspectionDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("开立成功");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }


    //只是为了测一下插入fee数据喔
    @RequestMapping("/addProjectFee")
    public @ResponseBody
    ResultDTO  addProjectFee(  Integer inspectionDetailID  ,HttpSession session){
        ResultDTO<Fee> resultDTO = new ResultDTO<>();
        try {

           //
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            Fee fee = applyInspectionService.addProjectFee(inspectionDetailID , outpatientUser.getId());

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

    @RequestMapping("/deleteInspectionDetailsByID")
    public @ResponseBody
    ResultDTO deleteInspectionDetailsByID(Integer inspectionDetailsId, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            //PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyInspectionService.deleteInspectionDetailsByID(inspectionDetailsId, outpatientUser.getId());
            //List<InspectionDetails> list = new LinkedList<>();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            //resultDTO.setData(inspectionDetailsList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            e.printStackTrace();
            //resultDTO.setData(page);

        }
        return resultDTO;
    }




    @RequestMapping("/deleteInspectionDetails")
    public @ResponseBody
    ResultDTO<List<InspectionDetails>> deleteInspectionDetails(@RequestBody IdDTO inspectionDetailsIdList, HttpSession session) {
        ResultDTO<List<InspectionDetails>> resultDTO = new ResultDTO<>();
        try {
            //PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<InspectionDetails> inspectionDetailsList = applyInspectionService.deleteInspectionDetails(inspectionDetailsIdList, outpatientUser.getId());
            //List<InspectionDetails> list = new LinkedList<>();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(inspectionDetailsList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }
    @RequestMapping("/abolishInspectionDetails")
    public @ResponseBody
    ResultDTO<PageInfo<InspectionDetails>> abolishInspectionDetails(IdDTO inspectionDetailsIdList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<InspectionDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<InspectionDetails> inspectionDetailsList = applyInspectionService.abolishInspectionDetails(inspectionDetailsIdList, outpatientUser.getId());
            PageInfo<InspectionDetails> list = new PageInfo<>(inspectionDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("废除成功");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/useCommonInspection")
    public @ResponseBody
    ResultDTO useCommonInspection(Integer commonInspectionID , HttpSession session) {
        ResultDTO<CommonInspection> resultDTO = new ResultDTO<>();
        try {
            //
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            CommonInspection commonInspection = applyInspectionService.useCommonInspection(commonInspectionID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用常用处置");
            resultDTO.setData(commonInspection);

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
            Integer id = applyInspectionService.saveTemplate(projectTemplate , outpatientUser.getId());

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
            applyInspectionService.saveTemplateDetails(lists, outpatientUser.getId());

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
    ResultDTO use_Check(Integer projectTemplateID  , Integer inspectionID , HttpSession session) {
        ResultDTO<ProjectTemplate> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            ProjectTemplate p = applyInspectionService.use_Check(projectTemplateID , inspectionID , outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用模板成功");
            resultDTO.setData(p);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/lookInspectionRes")
    public @ResponseBody
    ResultDTO<PageInfo<InspectionResult>> lookInspectionRes(Integer inspectionDetailsID , int pageNum , int pageSize) {
        ResultDTO<PageInfo<InspectionResult>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<InspectionResult> inspectionresultList = applyInspectionService.lookInspectionRes(inspectionDetailsID);
            PageInfo<InspectionResult> list = new PageInfo<>(inspectionresultList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查看结果成功");
            resultDTO.setData(list);
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
    public List<InspectionResult>    lookInspectionRes(Integer inspectionDetailsID);
     */

    @RequestMapping("/listInspection")
    public @ResponseBody
    ResultDTO<List<FMedItem>> listInspection(){
        ResultDTO<List<FMedItem>> resultDTO = new ResultDTO<>();

        try {
           // PageHelper.startPage(pageNum, pageSize);
            System.out.println("1");
            List<FMedItem> fMedItemList = applyInspectionService.listInspection();
            resultDTO.setMsg("listInspection操作成功");
            System.out.println("1");
           // PageInfo<FMedItem> list = new PageInfo<>(fMedItemList);
            resultDTO.setData(fMedItemList);
            System.out.println("1");
            for (int i = 0; i < fMedItemList.size(); i++) {
                System.out.println(fMedItemList.get(i).toString());
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



    @RequestMapping("/listIndexInspection")
    public @ResponseBody
    ResultDTO<List<InspectionDetailsView>> listIndexInspection(Integer medicalRecordID) {
        ResultDTO<List<InspectionDetailsView>> resultDTO = new ResultDTO<>();
        try{
            List<InspectionDetailsView > list = applyInspectionService.listIndexInspection(medicalRecordID);
            resultDTO.setData(list);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("listIndexInspection操作成功");
        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listIndexInspection失败");

            System.out.println(e);
        }

        return resultDTO;
    }







}

