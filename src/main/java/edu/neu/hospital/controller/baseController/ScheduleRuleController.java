package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ScheduleRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("scheduleRule")
@CrossOrigin
public class ScheduleRuleController {
    @Autowired
    ScheduleRuleService scheduleRuleService;

    /**
     * 添加排班规则
     * @param schedulerule 要添加的排班规则
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/add")
    public @ResponseBody
    ResultDTO add(Schedulerule schedulerule, HttpSession session){
        ResultDTO<Schedulerule> resultDTO=new ResultDTO<>();
        try{
            if(scheduleRuleService.checkContent(schedulerule,0)){
                UserView loginUser=(UserView) session.getAttribute("user");
                scheduleRuleService.add(schedulerule,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加排班规则成功");
                resultDTO.setData(schedulerule);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("排班规则重复，添加排班规则失败");
                resultDTO.setData(schedulerule);
            }

        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加排班规则失败");
            resultDTO.setData(schedulerule);
        }
        return resultDTO;
    }

    /**
     * 删除排班规则
     * @param id 要删除的排班规则的id
     * @return resultDTO
     */
    @RequestMapping("/delete")
    public @ResponseBody ResultDTO delete(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO();
        try{
            UserView loginUser=(UserView) session.getAttribute("user");
            scheduleRuleService.delete(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除排班规则成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除排班规则失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除排班规则
     * @param ids 要删除的排班规则的IdDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
   @RequestMapping("/deleteByChoose")
    public @ResponseBody ResultDTO deleteByChoose(IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO<>();
        if(ids.getId()!=null){
            try{
                UserView loginUser=(UserView) session.getAttribute("user");
                scheduleRuleService.deleteByChoose(ids,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除排班规则成功");
                resultDTO.setData(ids);
            }catch (Exception e){
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除排班规则失败");
                resultDTO.setData(ids);
            }
        }else{
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选中你要哦删除的排班规则");
            resultDTO.setData(ids);
        }
        return resultDTO;
    }

    /**
     * 修改排班规则
     * @param schedulerule 要修改的排班规则
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody ResultDTO update(Schedulerule schedulerule,HttpSession session){
       ResultDTO<Schedulerule> resultDTO=new ResultDTO<>();
       try{
           if(scheduleRuleService.checkContent(schedulerule,1)) {
               UserView loginUser = (UserView) session.getAttribute("user");
               scheduleRuleService.change(schedulerule, loginUser.getId());
               resultDTO.setStatus("OK");
               resultDTO.setMsg("修改排班规则成功");
               resultDTO.setData(schedulerule);
           }
           else{
               resultDTO.setStatus("FALSE");
               resultDTO.setMsg("存在重复的排班规则，修改排班规则失败");
               resultDTO.setData(schedulerule);
           }
       }catch (Exception e){
           resultDTO.setStatus("FALSE");
           resultDTO.setMsg("发生异常，修改排班规则失败");
           resultDTO.setData(schedulerule);
       }
       return resultDTO;
    }

    /**
     * 列出排班规则
     * @param week 星期几，0是星期天，1是星期一.....
     * @param deptCategoryID 科室分类ID
     * @param deptTypeID 科室类别ID
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return resultDTO
     */
    @RequestMapping("/find")
    public @ResponseBody
    ResultDTO find(Integer week,Integer deptCategoryID,Integer deptTypeID,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<ScheduleRuleView> scheduleRuleViews =scheduleRuleService.find(week,deptCategoryID,deptTypeID);
            PageInfo<ScheduleRuleView> list=new PageInfo<>(scheduleRuleViews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作成功");
        }
        return resultDTO;
    }



}
