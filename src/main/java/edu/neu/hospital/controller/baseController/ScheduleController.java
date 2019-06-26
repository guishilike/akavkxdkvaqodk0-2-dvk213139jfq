package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Schedule;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ScheduleService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("schedule")
@CrossOrigin
public class ScheduleController {
    @Resource
    ScheduleService scheduleService;

    /**
     * 添加排班信息
     * @param schedule 要添加的排班信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/add")
    public @ResponseBody ResultDTO add(Schedule schedule, HttpSession session){
        ResultDTO<Schedule> resultDTO=new ResultDTO<>();
        try{
            if(scheduleService.checkContent(schedule,0)){
                UserView loginUser=(UserView) session.getAttribute("user");
                scheduleService.add(schedule,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加排班信息成功");
                resultDTO.setData(schedule);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("排班信息重复，添加排班信息失败");
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加排班信息失败");
        }
        return resultDTO;
    }

    /**
     * 删除排班信息
     * @param id 要删除的排班信息的id
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/delete")
    public @ResponseBody ResultDTO delete(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO<>();
        try{
            UserView loginUser=(UserView) session.getAttribute("user");
            scheduleService.delete(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除排班信息成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除排班信息失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除排班信息
     * @param ids 要批量删除的排班信息的IdDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody ResultDTO deleteByChoose(IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO<>();
        if(ids.getId()!=null) {
            try {
                UserView loginUser=(UserView) session.getAttribute("user");
                scheduleService.deleteByChoose(ids,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除排班信息成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除排班信息失败");
                resultDTO.setData(ids);
            }
        }else{
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请选择你要批量删除的排班信息");
            resultDTO.setData(ids);
        }
        return resultDTO;
    }

    /**
     * 修改排班信息
     * @param schedule 要修改的排班信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody ResultDTO update(Schedule schedule,HttpSession session){
        ResultDTO<Schedule> resultDTO=new ResultDTO<>();
        try{
            if(scheduleService.checkContent(schedule,1)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                scheduleService.change(schedule, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改排班信息成功");
                resultDTO.setData(schedule);
            }else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的排班信息，修改排班信息失败");
                resultDTO.setData(schedule);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改排班信息失败");
            resultDTO.setData(schedule);
        }
        return resultDTO;

    }

    /**
     * 列出排班信息
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @param deptCategoryID 科室分类id
     * @param deptTypeID 科室类型id
     * @param pageNum 第几页
     * @param pageSize 叶大小
     * @return resultDTO
     */

    @RequestMapping("/find")
    public @ResponseBody ResultDTO
    find(@DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd")Date endDate,
         Integer deptCategoryID, Integer deptTypeID, Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<ScheduleView> scheduleViews =scheduleService.find(startDate,endDate,deptCategoryID,deptTypeID);
            PageInfo<ScheduleView> list=new PageInfo<>(scheduleViews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }

    /**
     * 自动生成排班信息
     * @return resultDTO
     */

    @RequestMapping("/generate")
    public @ResponseBody ResultDTO generate(){
        ResultDTO resultDTO=new ResultDTO();
        try{
           scheduleService.generate();
           resultDTO.setStatus("OK");
           resultDTO.setMsg("操作成功");
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }




}
