package edu.neu.hospital.controller.registerAndChargeController;

import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.bean.basicTableBean.Registrationinfo;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.registerAndCharge.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author LiJie
 * @date 2019/6/10 10:28
 */
@Controller
@RequestMapping("register")
public class RegisterController {

    @Resource
    RegisterService regService;

    /**
     * 挂号
     */
    @RequestMapping("/reg")
    public @ResponseBody
    ResultDTO register(String isHaveCard, Patient patient, String passwd,
                       Registrationinfo regInfo, HttpSession session) {

        try {

            Integer appearUserID = Integer.parseInt((String) session.getAttribute("userID"));
            int result = regService.addRegisteredInfo(isHaveCard, patient, passwd, regInfo, appearUserID);

            if (0 == result) {
                return new ResultDTO<>("NG", "挂号失败", result);
            }
            return new ResultDTO<>("OK", "挂号成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，挂号失败", e);
        }
    }
}
