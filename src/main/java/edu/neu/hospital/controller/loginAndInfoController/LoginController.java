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

import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.loginAndInfoService.LoginService;
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

    @RequestMapping("/check")
    public @ResponseBody
    ResultDTO<User> check(HttpServletRequest request,  @RequestBody User user){
//        System.out.println("userName"+user.getUserName());
////        System.out.println("passwd"+user.getPasswd());
        HttpSession session = request.getSession(true);
        ResultDTO<User> resultDTO = new ResultDTO();
        try{
            int i = loginService.check(user);
            if (i != -1){
                user = loginService.findByID(i);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查成功！可以登录");
                resultDTO.setData(user);
                session.setAttribute("user",user);
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
