package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.ScheduleRuleView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Schedulerule;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ScheduleRuleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("scheduleRule")
@CrossOrigin
public class ScheduleRuleController {
    @Resource
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
    @RequestMapping("/deleteByID")
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
     * @param onDutyDoctorID 排班医生ID
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return resultDTO
     */
    @RequestMapping("/list")
    public @ResponseBody
    ResultDTO find(Integer week,Integer deptCategoryID,Integer onDutyDoctorID,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<ScheduleRuleView> scheduleRuleViews =scheduleRuleService.find(week,deptCategoryID,onDutyDoctorID);
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

    /**
     * 获得所有排班的医生
     * @return resultDTO
     */
    @RequestMapping("/findAllDoctorNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllDoctors() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = scheduleRuleService.getAllDoctors();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得排班医生列表成功");
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得排班医生列表失败");
        }
        return resultDTO;

    }

    /**
     * 根据科室获得所有排班医生
     * @return resultDTO
     */
    @RequestMapping("/findDoctorByDeptID")
    public @ResponseBody
    ResultDTO getAllDoctorsByDeptID(Integer id) {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = scheduleRuleService.getAllDoctorsByDeptID(id);
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得排班医生列表成功");
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得排班医生列表失败");
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
            File file = scheduleRuleService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建排班规则XLS文件信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建排班规则XLS文件信息失败");

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
                if(scheduleRuleService.uploadXls(file, user.getId(),errorHappenContinue,repeatCoverage)){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("上传排班规则信息成功");
                }else{
                    resultDTO.setStatus("WARN");
                    resultDTO.setMsg("文件部分内容出错");
                }

            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("上传排班规则信息失败");
                e.printStackTrace();
            }

        } else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("上传排班规则信息失败");
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
            File file = scheduleRuleService.createXLSTemplate();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建排班规则XLS文件模板成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建排班规则XLS文件模板失败");
            e.printStackTrace();

        }
        return resultDTO;
    }



}
