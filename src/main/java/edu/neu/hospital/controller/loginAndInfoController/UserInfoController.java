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
package edu.neu.hospital.controller.loginAndInfoController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.loginAndInfoService.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("UserInfo")
@CrossOrigin
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/show")
    public @ResponseBody
//    ResultDTO<User> show(int userID){
    ResultDTO<UserView> show(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserView user1 = (UserView) session.getAttribute("user");
        int userID = user1.getId();
        ResultDTO<UserView> resultDTO = new ResultDTO();
        try {
            UserView userview = userInfoService.findUserInfo(userID);
            if(userview != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查成功！可以显示");
                resultDTO.setData(userview);
            }else {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查失败！");
                resultDTO.setData(null);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("用户检查出现错误！");
        }
        return resultDTO;
    }

    @RequestMapping("/updatePic")
    ResultDTO<String> updatePic(MultipartFile pic,HttpSession session){
        ResultDTO<String> resultDTO = new ResultDTO<>();
        UserView user = (UserView) session.getAttribute("user");
        try {
            if (!pic.isEmpty() && !pic.getOriginalFilename().isEmpty() && pic.getOriginalFilename() != "") {
                String uuid = UUID.randomUUID().toString();
                String fileName = pic.getOriginalFilename();
                String suffixName = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                String newFileName = uuid + "." + suffixName;
                File file = new File(ResourceUtils.getURL("classpath:").getPath() + "static/images/" + newFileName);
                pic.transferTo(file);
                user.setPhotoLocation(newFileName);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("图片更新成功！");
                resultDTO.setData(newFileName);
            }
            else{
                resultDTO.setStatus("NG");
                resultDTO.setMsg("图片为空！");
                resultDTO.setData(null);
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("更新图片操作失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/updateUserInfo")
    public @ResponseBody
//    ResultDTO<User> update(int id, String userName, String realName, String passwd){
    ResultDTO<UserView> update(User user, HttpServletRequest request){
//        MultipartFile pic = pic1;
        HttpSession session = request.getSession();
        UserView userView = (UserView) session.getAttribute("user");
        //只能更新自己的用户信息
        user.setId(userView.getId());
        ResultDTO<UserView> resultDTO = new ResultDTO();

        try{

            User user1 = userInfoService.updateUserInfo(user);
//            User user1 = userInfoService.updateUserInfo(id,userName,realName,passwd);
            if (user1 != null){
                UserView userview = userInfoService.findUserInfo(user1.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户更新成功！");
                resultDTO.setData(userview);
            }else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("用户更新失败！");
                resultDTO.setData(null);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("用户更新出现错误！");
        }
        return resultDTO;
    }

    @RequestMapping("/showMyWorkload")
    public @ResponseBody
//    ResultDTO<List<WorkLoadStatistics>> showMyWorkload(String realName) {
    ResultDTO<PageInfo> showMyWorkload(HttpServletRequest request,Integer pageNum,Integer pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO();
        HttpSession session = request.getSession();
        UserView user1 = (UserView) session.getAttribute("user");
        String realName = user1.getRealName();
        try {
            PageHelper.startPage(pageNum,pageSize);
            List<WorkLoadStatistics> workloadstatistics = userInfoService.showMyWorkloadstatistics(realName);
            PageInfo<WorkLoadStatistics> list = new PageInfo<>(workloadstatistics);
            if (list != null) {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("工作量检查成功!");
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
