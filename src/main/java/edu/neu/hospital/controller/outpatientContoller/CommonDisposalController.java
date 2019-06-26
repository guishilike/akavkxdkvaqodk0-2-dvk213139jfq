package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.CommonDiposals;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.basicTableBean.Inspection;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.CommonDisposalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("CommonDisposal")
public class CommonDisposalController {
    @Resource
    CommonDisposalService commonDisposalService;
    /*
        //常用诊断管理
    //列出
    //根据医生ID列出他的常用诊断
    public List<CommonDisposal> listCommonDisposal(Integer user.getId() );

    //增
    public Integer addCommonDisposal( Integer user.getId() , Integer disposalID);
    //批量增
    public boolean addCommonDisposalList( Integer user.getId() , IdDTO IdDTO);
    public List<Disease> searchDisease(String str);
    //删
    public Integer deleteCommonDisposal ( Integer commonDisposalID , Integer userID);
    //批量删
    public boolean deleteCommonDisposalList( IdDTO IdDTO , Integer userID);
    //改
    public Integer updateCommonDisposal ( CommonDisposal commonDisposal , Integer userID);

    //查
    public CommonDisposal searchCommonDisposal( Integer commonDisposalID);
     */


    @RequestMapping("/addCommonDisposal")
    public @ResponseBody
    ResultDTO addCommonDisposal(Integer disposalID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            System.out.println("1");
            commonDisposalService.addCommonDiposals(  user.getId(),disposalID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(disposalID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(commonDisposal);

        }
        return resultDTO;

    }

    @RequestMapping("/addCommonDisposalList")
    public @ResponseBody
    ResultDTO<Inspection> addCommonDisposalList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        commonDisposalService.addCommonDiposalsList( user.getId() , idDTO);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/deleteCommonDisposalList")
    public @ResponseBody
    ResultDTO<Inspection> deleteCommonDisposalList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        commonDisposalService.deleteCommonDiposalsList( idDTO , user.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("删除多个成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }


    @RequestMapping("/updateCommonDisposal")
    public @ResponseBody
    ResultDTO updateCommonDisposal(CommonDiposals commonDisposal, HttpSession session) {
        ResultDTO<CommonDiposals> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            commonDisposalService.updateCommonDiposals(commonDisposal, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("修改模板成功");
            resultDTO.setData(commonDisposal);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;

    }

    @RequestMapping("/deleteCommonDisposal")
    public @ResponseBody
    ResultDTO deleteCommonDisposal(Integer commonDisposalID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            commonDisposalService.deleteCommonDiposals(commonDisposalID ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(commonDisposalID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/findCommonDisposal")
    public @ResponseBody
    ResultDTO<PageInfo<FMedItem>> findCommonDisposal(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<FMedItem>> resultDTO = new ResultDTO<>();

        try {
            PageHelper.startPage(pageNum, pageSize);
            List<FMedItem> diposals = commonDisposalService.searchDiposal(str);
            System.out.println("-----");
            PageInfo<FMedItem> list = new PageInfo<>(diposals);
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
            List<CommonDiposals> commonDisposalList = commonDisposalService.listCommonDiposals(user.getId());
            System.out.println("-----");
            System.out.println("-----");
            resultDTO.setMsg("模糊查询处置");
            resultDTO.setStatus("OK");
            resultDTO.setData(commonDisposalList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;
    }

}
