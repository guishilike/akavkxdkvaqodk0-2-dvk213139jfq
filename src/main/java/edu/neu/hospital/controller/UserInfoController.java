package edu.neu.hospital.controller;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("UserInfo")
public class UserInfoController {
    @Resource
    UserInfoService userInfoService;

    @RequestMapping("/show")
    public @ResponseBody
    ResultDTO<User> show(int userID){
        ResultDTO<User> resultDTO = new ResultDTO();
        try{
            User user = userInfoService.findUserInfo(userID);
            if (user != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查成功！可以显示");
                resultDTO.setData(user);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("用户检查失败！");
                resultDTO.setData(user);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("用户检查失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public @ResponseBody
    ResultDTO<User> update(User user){
        ResultDTO<User> resultDTO = new ResultDTO();
        try{
            User user1 = userInfoService.upDateUserInfo(user);
            if (user1 != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查成功！可以更新");
                resultDTO.setData(user1);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("用户检查失败！");
                resultDTO.setData(user1);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("用户检查失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/showMyWorkload")
    public @ResponseBody
    ResultDTO<List<Workloadstatistics>> showMyWorkload(String userName){
        ResultDTO<List<Workloadstatistics>> resultDTO = new ResultDTO();
        try{
            List<Workloadstatistics> list = userInfoService.showMyWorkloadstatistics(userName);
            if (list != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("工作量检查成功！可以显示");
                resultDTO.setData(list);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("工作量检查失败！");
                resultDTO.setData(list);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("工作量检查失败！");
        }
        return resultDTO;
    }
}
