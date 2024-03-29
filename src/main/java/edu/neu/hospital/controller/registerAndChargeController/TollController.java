package edu.neu.hospital.controller.registerAndChargeController;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.tollBean.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.registerAndCharge.TollService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Toll")
public class TollController {
    @Resource
    private TollService tollService;

    /**
     * 检查收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */
    @RequestMapping("/tollInspection")
    public @ResponseBody
    ResultDTO<List<TollInspectView>> tollInspection(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer payStatus) {
        ResultDTO<List<TollInspectView>> resultDTO = new ResultDTO<>();
        try {
            List<TollInspectView> tollInspectViewList = tollService.tollInspection(search, startDate, endDate, payStatus);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollInspectViewList);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 处置收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */
    @RequestMapping("/tolldisposal")
    public @ResponseBody
    ResultDTO<List<TollDisposalView>> tolldisposal(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer payStatus) {
        ResultDTO<List<TollDisposalView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollService.tolldisposal(search, startDate, endDate, payStatus));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 处方收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */
    @RequestMapping("/tollpres")
    public @ResponseBody
    ResultDTO<List<TollPresView>> tollpres(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer payStatus) {
        ResultDTO<List<TollPresView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollService.tollpres(search, startDate, endDate, payStatus));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 材料收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */
    @RequestMapping("/tollmat")
    public @ResponseBody
    ResultDTO<List<TollMatView>> tollmat(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer payStatus) {
        ResultDTO<List<TollMatView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollService.tollmat(search, startDate, endDate, payStatus));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 项目药品收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */
    @RequestMapping("/tollmed")
    public @ResponseBody
    ResultDTO<List<TollMedView>> tollmed(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer payStatus) {
        ResultDTO<List<TollMedView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollService.tollmed(search, startDate, endDate, payStatus));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 挂号收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */
    @RequestMapping("/tollreg")
    public @ResponseBody
    ResultDTO<List<TollRegView>> tollreg(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer payStatus) {
        ResultDTO<List<TollRegView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollService.tollreg(search, startDate, endDate, payStatus));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 缴费
     *
     * @param feeIDs  缴费编号
     * @param session 收费员编号
     * @return 缴费结果
     */
    @RequestMapping("/toll")
    public @ResponseBody
    ResultDTO toll(@RequestBody IdDTO feeIDs, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user = (UserView) session.getAttribute("registerAndChargeUser");
            Integer tollManID = user.getId();

            String msg = tollService.toll(feeIDs, tollManID);
            if (msg.equals("缴费成功")) {
                resultDTO.setStatus("OK");
                resultDTO.setMsg(msg);
            } else {
                resultDTO.setStatus("WARN");
                resultDTO.setMsg(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 退费
     *
     * @param feeIDs  退费编号
     * @param session 收费员编号
     * @return 退费结果
     */
    @RequestMapping("/refund")
    public @ResponseBody
    ResultDTO<String> refund(@RequestBody IdDTO feeIDs, HttpSession session) {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("registerAndChargeUser");
            Integer tollManID = user.getId();
            String msg = tollService.refund(feeIDs, tollManID);
            if (msg.equals("退费成功")) {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("msg");
            } else {
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("msg");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 日结
     *
     * @param session 日结员编号
     * @param endDate 日结日期
     * @return 日结结果
     */
    @RequestMapping("/dailySettle")
    public @ResponseBody
    ResultDTO<List<DailySettleView>> dailySettle(HttpSession session, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate) {
        ResultDTO<List<DailySettleView>> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("registerAndChargeUser");
            Integer tollManID = user.getId();
            Map<String, Date> result = tollService.dailySettle(tollManID, endDate);
            String msg = "";
            for (String key : result.keySet()) {
                msg = key;
            }
            if (msg.equals("日结成功")) {
                Date startDate = result.get(msg);
                resultDTO.setStatus("OK");
                resultDTO.setMsg(msg);
                resultDTO.setData(tollService.dailySettleSearch(tollManID, startDate, endDate));
            } else {
                resultDTO.setStatus("WARN");
                resultDTO.setMsg(msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 日结信息查询
     *
     * @param session   日结员编号
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return 日结信息
     */
    @RequestMapping("/dailySettleSearch")
    public @ResponseBody
    ResultDTO<PageInfo<DailySettleView>> dailySettleSearch(HttpSession session, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<DailySettleView>> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("registerAndChargeUser");
            Integer tollManID = user.getId();
            PageHelper.startPage(pageNum, pageSize);
            List<DailySettleView> dailySettleViewList = tollService.dailySettleSearch(tollManID, startDate, endDate);
            PageInfo<DailySettleView> dailySettleViewPageInfo = new PageInfo<>(dailySettleViewList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(dailySettleViewPageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 日结收费查询
     *
     * @param session   日结员编号
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return 日结收费信息
     */
    @RequestMapping("/dailySettleFee")
    public @ResponseBody
    ResultDTO<List<FeeView>> dailySettleFee(HttpSession session, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate) {
        ResultDTO<List<FeeView>> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("registerAndChargeUser");
            Integer tollManID = user.getId();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(tollService.dailySettleFee(tollManID, startDate, endDate));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }
}
