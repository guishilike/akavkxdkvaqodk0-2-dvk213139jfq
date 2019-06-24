/**
 * 登录检查用户名和密码的Controller
 *
 * 需要传入用户名和密码
 * userName用户名passwd密码
 * 传参格式
 * http://localhost:8081/hospital/login/check?userName=likeee&passwd=456789
 * 测试成功
 *
 */
package edu.neu.hospital.controller.loginAndInfoController;

import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.loginAndInfoService.LoginService;
import edu.neu.hospital.service.loginAndInfoService.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService loginService;
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/check")
    public @ResponseBody
    ResultDTO<UserView> check(HttpServletRequest request, @RequestBody User user){
//        System.out.println("userName"+user.getUserName());
////        System.out.println("passwd"+user.getPasswd());
        HttpSession session = request.getSession(true);
        ResultDTO<UserView> resultDTO = new ResultDTO();
        try{
            int i = loginService.check(user);
            if (i != -1){
                UserView userView = new UserView();
                userView = userInfoService.findUserInfo(i);
//                user = loginService.findByID(i);
                if(userView.getId() != null){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("用户检查成功！可以登录");
                    resultDTO.setData(userView);
                    userView.setPasswd("");
                    session.setAttribute("user",userView);
                }else {
                    resultDTO.setStatus("NG");
                    resultDTO.setMsg("用户检查失败！");
                    resultDTO.setData(null);
                }
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("用户检查失败！");
                resultDTO.setData(null);
            }
        }catch (Exception e){
            resultDTO.setStatus("False");
            resultDTO.setMsg("用户检查出现错误！");
            System.out.println(e);

        }
        return resultDTO;
    }
}
