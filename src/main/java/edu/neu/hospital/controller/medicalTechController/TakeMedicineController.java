package edu.neu.hospital.controller.medicalTechController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedDetailsView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedicineFormView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.medicalTechService.TakeMedicineService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("TakeMedicineController")
public class TakeMedicineController {
    @Resource
    private TakeMedicineService takeMedicineService;

    /**
     * 取药搜索表单信息
     *
     * @param search 取药搜索表单搜索框的内容
     * @param startDate  取药搜索表单限制开始日期
     * @param endDate 取药搜索表单限制结束日期
     * @return 取药搜索结果表单信息
     */
    @RequestMapping("/takemedicineformview")
    public @ResponseBody
    ResultDTO<PageInfo> takemedicineformview(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date startDate,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date endDate,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
             PageHelper.startPage(pageNum, pageSize);
            List<TakeMedicineFormView> takeMedicineFormViewList =takeMedicineService.takemedicineformview(search,startDate,endDate);
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
     * @param prescriptionID 处方ID
     * @param mark 取药标记
     * @return 处方详情
     */
    @RequestMapping("/takemeddetailsview")
    public @ResponseBody
    ResultDTO<List<TakeMedDetailsView>> takemeddetailsview(Integer prescriptionID,Integer mark){
        ResultDTO<List<TakeMedDetailsView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(takeMedicineService.takemeddetailsview(prescriptionID,mark));
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
     * @return 批量取药结果
     */
    @RequestMapping("/takeMedicine")
    public @ResponseBody
    ResultDTO takeMedicine(@RequestBody  IdDTO presdetailsIDs, HttpSession session){
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
     * @return 批量退药结果
     */
    @RequestMapping("/withdrawMedicine")
    public @ResponseBody
    ResultDTO withdrawMedicine(@RequestBody IdDTO presdetailsIDs, HttpSession session){
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
