package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.ApplyInspectionService;
import org.springframework.stereotype.Controller;
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
    public boolean newInspection( Inspection inspection , Integer userID);
    */
    @RequestMapping("/newInspection")
    public @ResponseBody
    ResultDTO newInspection(Inspection inspection, HttpSession session) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            applyInspectionService.newInspection(inspection, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加处置成功");
            resultDTO.setData(inspection);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(inspection);

        }
        return resultDTO;

    }

    @RequestMapping("/addInspectionDetailsList")
    public @ResponseBody
    ResultDTO<Inspection> addInspectionDetailsList(Inspection inspection, DataListDTO inspectionDetailsList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        applyInspectionService.addInspectionDetailsList(inspection, inspectionDetailsList, user.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/addInspectionDetails")
    public @ResponseBody
    ResultDTO<Inspection> addInspectionDetails(Inspection inspection, InspectionDetails inspectionDetails, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        applyInspectionService.addInspectionDetails(inspection, inspectionDetails, user.getId());
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

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<InspectionDetails> list = dataListDTO.getData();
            List<InspectionDetails> res = new LinkedList<>();

            for (int i = 0; i < list.size(); i++) {
                InspectionDetails inspectionDetails = list.get(i);
                inspectionDetails.setAppearDate(new Date());
                inspectionDetails.setAppearUserID(user.getId());
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

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<InspectionDetails> inspectionDetailsList = applyInspectionService.drawInspectionDetails(inspectionDetailsIdList, user.getId());
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
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            Fee fee = applyInspectionService.addProjectFee(inspectionDetailID , user.getId());

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



    @RequestMapping("/deleteInspectionDetails")
    public @ResponseBody
    ResultDTO<PageInfo<InspectionDetails>> deleteInspectionDetails(IdDTO inspectionDetailsIdList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<InspectionDetails>> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<InspectionDetails> inspectionDetailsList = applyInspectionService.deleteInspectionDetails(inspectionDetailsIdList, user.getId());
            PageInfo<InspectionDetails> list = new PageInfo<>(inspectionDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(list);
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

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<InspectionDetails> inspectionDetailsList = applyInspectionService.abolishInspectionDetails(inspectionDetailsIdList, user.getId());
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
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
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

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            Integer id = applyInspectionService.saveTemplate(projectTemplate , user.getId());

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

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            applyInspectionService.saveTemplateDetails(lists, user.getId());

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

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            ProjectTemplate p = applyInspectionService.use_Check(projectTemplateID);

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

    @RequestMapping("/lookInspectionRes")
    public @ResponseBody
    ResultDTO<PageInfo<InspectionResult>> lookInspectionRes(Integer inspectionDetailsID) {
        ResultDTO<PageInfo<InspectionResult>> resultDTO = new ResultDTO<>();
        try {

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
    public Integer saveTemplate(ProjectTemplate  projectTemplate , Integer userID);
    public boolean  saveTemplateDetails(DataListDTO lists, Integer userID);
    //7.	引用组套
    public ProjectTemplate use_Check(Integer projectTemplateID);
    //8.	查看检查结果
    public List<InspectionResult>    lookInspectionRes(Integer inspectionDetailsID);
     */

}

