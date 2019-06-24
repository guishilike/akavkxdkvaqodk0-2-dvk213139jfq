package edu.neu.hospital.controller.medicalTechContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedDetailsView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedicineFormView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.MedicalTechService.TakeMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("TakeMedicineController")
public class TakeMedicineController {
    @Autowired
    private TakeMedicineService takeMedicineService;

    /**
     * 取药搜索表单信息
     *
     * @param search 取药搜索表单搜索框的内容
     * @param date   取药搜索表单限制日期
     * @param mark   取药表单项目标识
     * @return 取药搜索结果表单信息
     */
    @RequestMapping("/takemedicineformview")
    public @ResponseBody
    ResultDTO<PageInfo> takemedicineformview(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date date, Integer mark,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
             PageHelper.startPage(pageNum, pageSize);
            List<TakeMedicineFormView> takeMedicineFormViewList =takeMedicineService.takemedicineformview(search,date,mark);
            PageInfo<TakeMedicineFormView> takemedicineformviewPageInfo = new PageInfo<>(takeMedicineFormViewList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(takemedicineformviewPageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 显示处方详情
     *
     * @param prescriptionDetailID 处方ID
     * @return 处方详情
     */
    @RequestMapping("/takemeddetailsview")
    public @ResponseBody
    ResultDTO<List<TakeMedDetailsView>> takemeddetailsview(Integer prescriptionDetailID){
        ResultDTO<List<TakeMedDetailsView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(takeMedicineService.takemeddetailsview(prescriptionDetailID));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 批量取药
     *
     * @param presdetailsIDs 取药编号列表
     * @param session 会话
     */
    @RequestMapping("/takeMedicine")
    public @ResponseBody
    ResultDTO takeMedicine(IdDTO presdetailsIDs, HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            takeMedicineService.takeMedicine(presdetailsIDs,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 批量退药
     *
     * @param  presdetailsIDs 退药编号列表
     * @param session 会话
     */
    @RequestMapping("/withdrawMedicine")
    public @ResponseBody
    ResultDTO withdrawMedicine(IdDTO presdetailsIDs, HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            takeMedicineService.withdrawMedicine(presdetailsIDs,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }
}
