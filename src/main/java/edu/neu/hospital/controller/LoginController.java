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
package edu.neu.hospital.controller;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/check")
    public @ResponseBody
    ResultDTO<Integer> check(User user){
        ResultDTO<Integer> resultDTO = new ResultDTO();
        try{
            int i = loginService.check(user);
            if (i != -1){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("用户检查成功！可以登录");
                resultDTO.setData(i);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("用户检查失败！");
                resultDTO.setData(i);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("用户检查失败！");
        }
        return resultDTO;
    }
}
