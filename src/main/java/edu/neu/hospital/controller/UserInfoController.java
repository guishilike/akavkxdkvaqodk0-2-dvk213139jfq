/**
*用户信息的Controller
*
* show方法根据userID查询医生信息
* 需要有参数的传入，不传参是500错误
* userID用户表的ID
* 传参格式
* http://localhost:8081/hospital/UserInfo/show?userID=2
* 测试成功
*
* update方法根据userID更新医生信息
* 需要有参数的传入，至少是一个id
* id为user表的id
* 其余参数可以选择传入，参数为user的属性
* 传参格式
* http://localhost:8081/hospital/UserInfo/update?id=1&userName=likeee&realName=lik&passwd=456789
*测试成功
*
* showMyWorkload方法显示当前医生的工作量
* 需要有参数的传入
* realName医生的真实姓名
* 传参格式
* http://localhost:8081/hospital/UserInfo/showMyWorkload?realName=like
* 测试成功
 *
 */
package edu.neu.hospital.controller;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("UserInfo")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/show")
    public @ResponseBody
//    ResultDTO<User> show(int userID){
    ResultDTO<User> show(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user1 = (User)session.getAttribute("user");
        int userID = user1.getId();
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
    ResultDTO<User> update(User user, HttpServletRequest request, MultipartFile pic){
        HttpSession session = request.getSession();
        User user2 = (User)session.getAttribute("user");
        //只能更新自己的用户信息
        user.setId(user2.getId());
        ResultDTO<User> resultDTO = new ResultDTO();
        //将本地图片上传并导入静态资源路径

        try {
            if (!pic.isEmpty() && !pic.getOriginalFilename().isEmpty() && pic.getOriginalFilename() != "") {
                String uuid = UUID.randomUUID().toString();
                String fileName = pic.getOriginalFilename();
                String suffixName = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                String newFileName = uuid + "." + suffixName;
                File file = new File(ResourceUtils.getURL("classpath:").getPath() + "static/images/" + newFileName);
                pic.transferTo(file);
                user.setPhotoLocation(newFileName);
            }
//            else{
//                resultDTO.setStatus("NG");
//                resultDTO.setMsg("图片为空！");
//                resultDTO.setData(null);
//            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
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
//    ResultDTO<List<Workloadstatistics>> showMyWorkload(String realName) {
    ResultDTO<List<Workloadstatistics>> showMyWorkload(HttpServletRequest request) {
        ResultDTO<List<Workloadstatistics>> resultDTO = new ResultDTO();
        HttpSession session = request.getSession();
        User user1 = (User)session.getAttribute("user");
        String realName = user1.getRealName();
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
