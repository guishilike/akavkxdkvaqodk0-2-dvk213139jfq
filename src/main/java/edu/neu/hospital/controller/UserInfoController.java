/*
*用户信息的Controller
*
* show方法根据userID查询医生信息
* 需要有参数的传入，不传参是500错误
* userID用户表的ID
* 传参格式
* http://localhost:8081/hospital/UserInfo/show?userID=2
* 测试成功
*
* showMyWorkload方法显示当前医生的工作量
* 需要有参数的传入
* realName医生的真实姓名
* 传参格式
* http://localhost:8081/hospital/UserInfo/showMyWorkload?realName="like"
* 测试成功
 */
package edu.neu.hospital.controller;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("UserInfo")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/show")
    public @ResponseBody
    ResultDTO<User> show(int userID){
        ResultDTO<User> resultDTO = new ResultDTO();
        try {
            User user = userInfoService.findUserInfo(userID);
            if(user != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查成功！可以显示");
                resultDTO.setData(user);
            }else {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查失败！");
                resultDTO.setData(user);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("用户检查出现错误！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public @ResponseBody
//    ResultDTO<User> update(int id, String userName, String realName, String passwd){
    ResultDTO<User> update(User user){
        ResultDTO<User> resultDTO = new ResultDTO();
        try{
            User user1 = userInfoService.updateUserInfo(user);
//            User user1 = userInfoService.updateUserInfo(id,userName,realName,passwd);
            if (user1 != null){

                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户更新成功！可以更新");
                resultDTO.setData(user1);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("用户更新失败！");
                resultDTO.setData(user1);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("用户更新出现错误！");
        }
        return resultDTO;
    }

    @RequestMapping("/showMyWorkload")
    public @ResponseBody
    ResultDTO<List<Workloadstatistics>> showMyWorkload(String realName) {
        ResultDTO<List<Workloadstatistics>> resultDTO = new ResultDTO();
        try {
            List<Workloadstatistics> list = userInfoService.showMyWorkloadstatistics(realName);
            if (list != null) {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("工作量检查成功！可以显示");
                resultDTO.setData(list);
            } else {
//                System.out.println("list为空？？？");
                resultDTO.setStatus("NG");
                resultDTO.setMsg("工作量检查失败！");
                resultDTO.setData(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("工作量检查出现错误！");
        }
        return resultDTO;
    }
}
