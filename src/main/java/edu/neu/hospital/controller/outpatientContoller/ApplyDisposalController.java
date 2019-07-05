package edu.neu.hospital.controller.outpatientContoller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.ApplyDisposalService;
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
@RequestMapping("ApplyDisposal")
public class ApplyDisposalController {
    @Resource
    ApplyDisposalService applyDisposalService;

    /*
        //新建该患者的disposal
    //首先判断Disposal表里是否已经有该病例的检查了
    public boolean checkIsHaven( Integer medicalRecordID );
    public boolean newDisposal( Disposal disposal , Integer outpatientUserID);
    */
    @RequestMapping("/newDisposal")
    public @ResponseBody
    ResultDTO newDisposal(Disposal disposal, HttpSession session) {
        ResultDTO<Disposal> resultDTO = new ResultDTO<>();
        try {
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            Disposal res = applyDisposalService.newDisposal(disposal, outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加处置成功");
            resultDTO.setData(res);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(disposal);
            System.out.println(e +"newDisposal" );

        }
        return resultDTO;

    }


    @RequestMapping("/deleteDisposalDetailsByID")
    public @ResponseBody
    ResultDTO deleteDisposalDetailsByID(Integer disposalDetailsId, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            //PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyDisposalService.deleteDisposalDetailsByID(disposalDetailsId, outpatientUser.getId());
            //List<DisposalDetails> list = new LinkedList<>();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            //resultDTO.setData(disposalDetailsList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            e.printStackTrace();
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/addDisposalDetailsList")
    public @ResponseBody
    ResultDTO<Disposal> addDisposalDetailsList(Disposal disposal, DataListDTO disposalDetialsList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Disposal> resultDTO = new ResultDTO<>();


        try {
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyDisposalService.addDisposalDetailsList(disposal, disposalDetialsList, outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加处置详细成功");
            resultDTO.setData(disposal);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            System.out.println(e +"addDisposalDetailsList" );

        }
        return resultDTO;

    }

    @RequestMapping("/addDisposalDetails")
    public @ResponseBody
    ResultDTO<Disposal> addDisposalDetails(Disposal disposal, DisposalDetails disposalDetails, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Disposal> resultDTO = new ResultDTO<>();


        try {
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            applyDisposalService.addDisposalDetails(disposal, disposalDetails, outpatientUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加处置详细成功");
            resultDTO.setData(disposal);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            System.out.println(e +"addDisposalDetails" );

        }
        return resultDTO;

    }

    @RequestMapping("/searchDisposal")
    public @ResponseBody
    ResultDTO<PageInfo<FMedItem>> searchDisposal(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<FMedItem>> resultDTO = new ResultDTO<>();

        try {
            PageHelper.startPage(pageNum, pageSize);
            List<FMedItem> diseaseList = applyDisposalService.searchDisposal(str);
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
    ResultDTO<PageInfo<DisposalDetails>> tmpStore(DataListDTO dataListDTO, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<DisposalDetails> list = dataListDTO.getData();
            List<DisposalDetails> res = new LinkedList<>();

            for (int i = 0; i < list.size(); i++) {
                DisposalDetails disposalDetails = list.get(i);
                disposalDetails.setAppearDate(new Date());
                disposalDetails.setAppearUserID(outpatientUser.getId());
                res.add(disposalDetails);

            }
            PageInfo<DisposalDetails> page = new PageInfo<>(res);
            session.setAttribute("tmpDisposalDetials", res);

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


    @RequestMapping("/drawDisposalDetails")
    public @ResponseBody
    ResultDTO<List<DisposalDetails>> drawDisposalDetails(@RequestBody IdDTO disposalDetailsIdList, HttpSession session) {
        ResultDTO<List<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {
            //PageHelper.startPage(pageNum, pageSize);
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<DisposalDetails> disposalDetailsList = applyDisposalService.drawDisposalDetails(disposalDetailsIdList, outpatientUser.getId());
            //PageInfo<DisposalDetails> list = new PageInfo<>(disposalDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("开立成功");
            resultDTO.setData(disposalDetailsList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);
            e.printStackTrace();
            System.out.println(e+ "drawDisposalDetails");

        }
        return resultDTO;
    }
    @RequestMapping("/addProjectFee")
    public @ResponseBody
    ResultDTO  addProjectFee(  Integer disposalDetailID  ,HttpSession session){
        ResultDTO<Fee> resultDTO = new ResultDTO<>();
        try {

            //
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            Fee fee = applyDisposalService.addProjectFee(disposalDetailID , outpatientUser.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功");
            resultDTO.setData(fee);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);
            System.out.println(e + "addProjectFee" );

        }
        return resultDTO;
    }


    @RequestMapping("/deleteDisposalDetails")
    public @ResponseBody
    ResultDTO<List<DisposalDetails>> deleteDisposalDetails(IdDTO disposalDetailsIdList, HttpSession session) {
        ResultDTO<List<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<DisposalDetails> disposalDetailsList = applyDisposalService.deleteDisposalDetails(disposalDetailsIdList, outpatientUser.getId());
           // PageInfo<DisposalDetails> list = new PageInfo<>(disposalDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(disposalDetailsList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            System.out.println(e + "deleteDisposalDetails是啊比");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }
    @RequestMapping("/abolishDisposalDetails")
    public @ResponseBody
    ResultDTO<List<DisposalDetails>> abolishDisposalDetails(IdDTO disposalDetailsIdList, HttpSession session) {
        ResultDTO<List<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {
           
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            List<DisposalDetails> disposalDetailsList = applyDisposalService.abolishDisposalDetails(disposalDetailsIdList, outpatientUser.getId());
           // PageInfo<DisposalDetails> list = new PageInfo<>(disposalDetailsList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("废除成功");
            resultDTO.setData(disposalDetailsList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            System.out.println(e + "abolishDisposalDetails失败");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/useCommonDisposal")
    public @ResponseBody
    ResultDTO useCommonDisposal(Integer commonDisposalID , HttpSession session) {
        ResultDTO<CommonDiposals> resultDTO = new ResultDTO<>();
        try {
            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            Integer outpatientUserID = outpatientUser.getId();
            CommonDiposals commonDisposal = applyDisposalService.useCommonDisposal(commonDisposalID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用常用处置");
            resultDTO.setData(commonDisposal);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
            System.out.println("useCommonDisposal失败");
            System.out.println(e);
        }
        return resultDTO;


    }

    @RequestMapping("/listDisposal")
    public @ResponseBody
    ResultDTO<List<FMedItem>> listDisposal(){
        ResultDTO<List<FMedItem>> resultDTO = new ResultDTO<>();

        try {
            //PageHelper.startPage(pageNum, pageSize);
            System.out.println("1");
            List<FMedItem> fMedItemList = applyDisposalService.listDisposal();
            resultDTO.setMsg("listDisposal操作成功");
            System.out.println("1");
            PageInfo<FMedItem> list = new PageInfo<>(fMedItemList);
            resultDTO.setData(fMedItemList);
            System.out.println("1");
            for (int i = 0; i < fMedItemList.size(); i++) {
                System.out.println(fMedItemList.get(i).toString());
                System.out.println("2");
            }
            resultDTO.setStatus("OK");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listDisposal失败");
            System.out.println("listDisposal失败");
            System.out.println(e);
        }

        return resultDTO;

    }


    @RequestMapping("/listIndexDisposal")
    public @ResponseBody
    ResultDTO<List<DisposalDetailsView>> listIndexDisposal(Integer medicalRecordID) {
        ResultDTO<List<DisposalDetailsView>> resultDTO = new ResultDTO<>();
        try{
            System.out.println(medicalRecordID);
            List<DisposalDetailsView > list = applyDisposalService.listIndexDisposal(medicalRecordID);
            resultDTO.setData(list);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("listIndexDisposal操作成功");
        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listIndexDisposal失败");
            System.out.println("listIndexDisposal失败");

            System.out.println(e);
        }

        return resultDTO;
    }


    @RequestMapping("/getIndexFMedItem")
    public @ResponseBody
    ResultDTO<FmeditemView> getIndexFMedItem(DisposalDetails disposalDetails) {
        ResultDTO<FmeditemView> resultDTO = new ResultDTO<>();
        try{
            FmeditemView fMeditemView = applyDisposalService.getIndexFMedItem(disposalDetails);
            resultDTO.setData(fMeditemView);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("listIndexDisposal操作成功");
        }catch (Exception e){
            resultDTO.setStatus("FALSE");

            resultDTO.setMsg("listIndexDisposal失败");

            System.out.println(e);
        }

        return resultDTO;
    }


    @RequestMapping("/use_Check")
    public @ResponseBody
    ResultDTO use_Check(Integer projectTemplateID  , Integer disposalID , HttpSession session) {
        ResultDTO<ProjectTemplate> resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            ProjectTemplate p = applyDisposalService.use_Check(projectTemplateID , disposalID , outpatientUser.getId());

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




}
