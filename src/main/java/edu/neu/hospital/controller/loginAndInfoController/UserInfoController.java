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
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("UserInfo")
@CrossOrigin
public class UserInfoController {
    @Resource
    UserInfoService userInfoService;

    /**
     * 显示用户信息
     * @param request 用于构建session会话
     * @return 用户信息的ResultDTO
     */
    @RequestMapping("/show")
    public @ResponseBody
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

    /**
     * 更新用户头像
     * @param pic 图片文件
     * @param session session会话
     * @return String类型的ResultDTO
     */
    @RequestMapping("/updatePic")
    public @ResponseBody
    ResultDTO<String> updatePic(MultipartFile pic,HttpSession session){
        ResultDTO<String> resultDTO = new ResultDTO<>();
        UserView userView = (UserView) session.getAttribute("user");
        User user = new User();
        user.setId(userView.getId());
        user.setUserName(userView.getUserName());
        try {
            if (!pic.isEmpty() && !pic.getOriginalFilename().isEmpty() && pic.getOriginalFilename() != "") {
                String uuid = UUID.randomUUID().toString();
                String fileName = pic.getOriginalFilename();
                String suffixName = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                String newFileName = uuid + "." + suffixName;
                File file = new File(ResourceUtils.getURL("classpath:").getPath() + "static/images/" + newFileName);
                System.out.println(file.getName());
                pic.transferTo(file);
                user.setPhotoLocation(newFileName);
                User user1 = userInfoService.updateUserInfo(user);
                if (user1 != null){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("图片更新成功！");
                    resultDTO.setData(newFileName);
                }
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

    /**
     * 更新密码
     * @param oldPasswd 旧密码，用于验证
     * @param newPasswd 新秘密
     * @param session session会话
     * @return int类型的ResultDTO
     */
    @RequestMapping("/updatePasswd")
    public @ResponseBody
    ResultDTO<Integer> updatePasswd(String oldPasswd, String newPasswd,HttpSession session){
        ResultDTO<Integer> resultDTO = new ResultDTO();
        UserView userView = (UserView) session.getAttribute("user");
        int userID = userView.getId();
        try{
            int i = userInfoService.updatePasswd(userID,oldPasswd,newPasswd);
            if (i != -1){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("密码更新成功！");
                resultDTO.setData(userID);
            }else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("密码更新失败！");
                resultDTO.setData(-1);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("密码更新出现错误！");
        }
        return resultDTO;
    }

    /**
     * 更新用户信息
     * @param user user对象
     * @param session session会话
     * @return userview用户信息类型的ResultDTO
     */
    @RequestMapping("/updateUserInfo")
    public @ResponseBody
    ResultDTO<UserView> update( User user, HttpSession session){
        UserView userView = (UserView) session.getAttribute("user");
        user.setId(userView.getId());
        user.setPasswd(null);
        if(user.getUserName() == null){
            user.setUserName(userView.getUserName());
        }
        ResultDTO<UserView> resultDTO = new ResultDTO();
        try{
            User user1 = userInfoService.updateUserInfo(user);
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

    /**
     * 显示自己的工作量统计
     * @param request 用于构建session会话
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return pageinfo类型的ResultDTO
     */
    @RequestMapping("/showMyWorkload")
    public @ResponseBody
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
