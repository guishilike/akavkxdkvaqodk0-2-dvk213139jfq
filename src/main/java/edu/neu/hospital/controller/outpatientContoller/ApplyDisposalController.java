package edu.neu.hospital.controller.outpatientContoller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.ApplyDisposalService;
import org.springframework.stereotype.Controller;
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
    public boolean newDisposal( Disposal disposal , Integer userID);
    */
    @RequestMapping("/newDisposal")
    public @ResponseBody
    ResultDTO newDisposal(Disposal disposal, HttpSession session) {
        ResultDTO<Disposal> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            applyDisposalService.newDisposal(disposal, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加处置成功");
            resultDTO.setData(disposal);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(disposal);

        }
        return resultDTO;

    }

    @RequestMapping("/addDisposalDetailsList")
    public @ResponseBody
    ResultDTO<Disposal> addDisposalDetailsList(Disposal disposal, DataListDTO disposalDetialsList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Disposal> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        applyDisposalService.addDisposalDetailsList(disposal, disposalDetialsList, user.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        resultDTO.setData(disposal);

        return resultDTO;

    }

    @RequestMapping("/addDisposalDetails")
    public @ResponseBody
    ResultDTO<Disposal> addDisposalDetails(Disposal disposal, DisposalDetails disposalDetails, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Disposal> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        applyDisposalService.addDisposalDetails(disposal, disposalDetails, user.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        resultDTO.setData(disposal);

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
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<DisposalDetails> list = dataListDTO.getData();
            List<DisposalDetails> res = new LinkedList<>();

            for (int i = 0; i < list.size(); i++) {
                DisposalDetails disposalDetails = list.get(i);
                disposalDetails.setAppearDate(new Date());
                disposalDetails.setAppearUserID(user.getId());
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
    ResultDTO<PageInfo<DisposalDetails>> drawDisposalDetails(IdDTO disposalDetailsIdList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<DisposalDetails> disposalDetailsList = applyDisposalService.drawDisposalDetails(disposalDetailsIdList, user.getId());
            PageInfo<DisposalDetails> list = new PageInfo<>(disposalDetailsList);
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
    @RequestMapping("/addProjectFee")
    public @ResponseBody
    ResultDTO  addProjectFee(  Integer disposalDetailID  ,HttpSession session){
        ResultDTO<Fee> resultDTO = new ResultDTO<>();
        try {

            //
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            Fee fee = applyDisposalService.addProjectFee(disposalDetailID , user.getId());

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


    @RequestMapping("/deleteDisposalDetails")
    public @ResponseBody
    ResultDTO<PageInfo<DisposalDetails>> deleteDisposalDetails(IdDTO disposalDetailsIdList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<DisposalDetails> disposalDetailsList = applyDisposalService.deleteDisposalDetails(disposalDetailsIdList, user.getId());
            PageInfo<DisposalDetails> list = new PageInfo<>(disposalDetailsList);
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
    @RequestMapping("/abolishDisposalDetails")
    public @ResponseBody
    ResultDTO<PageInfo<DisposalDetails>> abolishDisposalDetails(IdDTO disposalDetailsIdList, HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<DisposalDetails>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<DisposalDetails> disposalDetailsList = applyDisposalService.abolishDisposalDetails(disposalDetailsIdList, user.getId());
            PageInfo<DisposalDetails> list = new PageInfo<>(disposalDetailsList);
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

    @RequestMapping("/useCommonDisposal")
    public @ResponseBody
    ResultDTO useCommonDisposal(Integer commonDisposalID , HttpSession session) {
        ResultDTO<CommonDiposals> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("user");
            Integer userID = user.getId();
            CommonDiposals commonDisposal = applyDisposalService.useCommonDisposal(commonDisposalID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("使用常用处置");
            resultDTO.setData(commonDisposal);

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;


    }


}
