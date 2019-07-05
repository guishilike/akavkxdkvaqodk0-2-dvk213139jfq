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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("schedule")
@CrossOrigin
public class ScheduleController {
    @Resource
    ScheduleService scheduleService;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date date;

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
                UserView loginUser=(UserView) session.getAttribute("adminUser");
                scheduleService.add(schedule,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加排班信息成功");
                resultDTO.setData(schedule);
            }
            else{
                resultDTO.setStatus("WARN");
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
    @RequestMapping("/deleteByID")
    public @ResponseBody ResultDTO delete(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO<>();
        try{
            UserView loginUser=(UserView) session.getAttribute("adminUser");
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
    public @ResponseBody ResultDTO deleteByChoose(@RequestBody IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO<>();
        if(ids.getId()!=null&&ids.getId().size()!=0) {
            try {
                UserView loginUser=(UserView) session.getAttribute("adminUser");
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
            resultDTO.setStatus("WARN");
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
        System.out.println(schedule);
        date=schedule.getOnDutyDate();
        schedule.setOnDutyDate(date);
        ResultDTO<Schedule> resultDTO=new ResultDTO<>();
        try{
            if(scheduleService.checkContent(schedule,1)) {
                UserView loginUser = (UserView) session.getAttribute("adminUser");
                scheduleService.change(schedule, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改排班信息成功");
                resultDTO.setData(schedule);
            }else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("存在重复的排班信息，修改排班信息失败");
                resultDTO.setData(schedule);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改排班信息失败");
            resultDTO.setData(schedule);
            e.printStackTrace();
        }
        System.out.println(resultDTO);
        return resultDTO;

    }

    /**
     * 列出排班信息
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @param deptID 科室id
     * @param doctorID 医生IDid
     * @param pageNum 第几页
     * @param pageSize 叶大小
     * @return resultDTO
     */

    @RequestMapping("/list")
    public @ResponseBody ResultDTO
    find(@DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date endDate,
         Integer deptID, Integer doctorID, Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<ScheduleView> scheduleViews =scheduleService.find(startDate,endDate,deptID,doctorID);
            PageInfo<ScheduleView> list=new PageInfo<>(scheduleViews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        System.out.println(resultDTO);
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

    /**
     * 创建xml文件
     * @return resultDTO
     */
    @RequestMapping("/createXLS")
    public @ResponseBody
    ResultDTO createXLS() {
        System.out.println("开始创建");
        ResultDTO<String> resultDTO = new ResultDTO();
        try {
            File file = scheduleService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建排班信息XLS文件信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建排班信息XLS文件信息失败");
            e.printStackTrace();

        }
        return resultDTO;
    }

    /**
     * 导入xls文件
     * @param file 要导入的xls文件
     * @param errorHappenContinue 错误发生是否继续
     * @param repeatCoverage 遇到重复是否覆盖
     * @param session HttpSession会话
     * @return resultDTO
     * @throws IOException
     */
    @RequestMapping("/upload")
    public @ResponseBody
    ResultDTO upload(MultipartFile file, boolean errorHappenContinue,
                     boolean repeatCoverage, HttpSession session) throws IOException {

        ResultDTO resultDTO = new ResultDTO();
        if (!file.isEmpty()) {
            try {
                UserView user = (UserView) session.getAttribute("adminUser");
                System.out.println(user.getId());
                if(scheduleService.uploadXls(file, user.getId(),errorHappenContinue,repeatCoverage)){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("上传排班信息成功");
                }else{
                    resultDTO.setStatus("WARN");
                    resultDTO.setMsg("文件部分内容出错");
                }

            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("上传排班信息失败");
                e.printStackTrace();
            }

        } else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("上传排班信息失败");
        }
        return resultDTO;
    }

    /**
     * 创建模板
     * @return resultDTO
     */

    @RequestMapping("/createTemplate")
    public @ResponseBody
    ResultDTO createTemplate() {
        System.out.println("开始创建模板");
        ResultDTO<String> resultDTO = new ResultDTO();
        try {
            File file = scheduleService.createXLSTemplate();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建排班信息XLS文件模板成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建排班信息XLS文件模板失败");
            e.printStackTrace();

        }
        return resultDTO;
    }




}
