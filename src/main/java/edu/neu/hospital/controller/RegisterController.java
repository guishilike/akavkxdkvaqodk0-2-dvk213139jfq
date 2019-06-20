package edu.neu.hospital.controller;

import edu.neu.hospital.bean.Patient;
import edu.neu.hospital.bean.RegistrationInfo;
import edu.neu.hospital.bean.User;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.PatientCardService;
import edu.neu.hospital.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @author LiJie
 * @date 2019/6/10 10:28
 */
@Controller
@RequestMapping("register")
public class RegisterController {


    @Resource
    PatientCardService patientCardService;

    @Resource
    RegisterService regService;

    /**
     * 申请就诊卡
     */
    @RequestMapping("/applyCard")
    public @ResponseBody
    ResultDTO applyCard(Patient patient, String passwd, HttpSession session) {

        try {

            User user = (User) session.getAttribute("User");
            int result = patientCardService.applyCard(patient, passwd, user.getId());

            if (0 == result) {
                return new ResultDTO<>("NG", "申请失败", result);
            }
            return new ResultDTO<>("OK", "申请成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，申请就诊卡失败", e);
        }
    }

    /**
     * 修改就诊卡密码
     *
     * @param id     就诊卡id
     * @param passwd 新密码
     */
    @RequestMapping("/changepwd")
    public @ResponseBody
    ResultDTO changePasswd(Integer id, String passwd, HttpSession session) {

        try {
            User user = (User) session.getAttribute("User");
            int result = patientCardService.changePasswd(id, passwd, user.getId());

            if (0 == result) {
                return new ResultDTO<>("NG", "修改失败", result);
            }
            return new ResultDTO<>("OK", "修改成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，修改就诊卡密码失败", e);
        }
    }

    /**
     * 查询就诊卡余额
     *
     * @param id 就诊卡id
     */
    @RequestMapping("/balance")
    public @ResponseBody
    ResultDTO searchBalance(Integer id) {

        BigDecimal balance = patientCardService.searchBalance(id);

        if (balance == null) {
            return new ResultDTO<>("NG", "查询失败", null);
        }

        return new ResultDTO<>("OK", "查询成功", balance);

    }

    /**
     * 就诊卡充值
     *
     * @param id    就诊卡id
     * @param money 充值金额
     */
    @RequestMapping("/recharge")
    public @ResponseBody
    ResultDTO recharge(Integer id, BigDecimal money, HttpSession session) {

        try {

            User user = (User) session.getAttribute("User");
            int result = patientCardService.recharge(id, money, user.getId());

            if (0 == result) {
                return new ResultDTO<>("NG", "充值失败", result);
            }
            return new ResultDTO<>("OK", "充值成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，就诊卡充值失败", e);
        }
    }

    /**
     * 挂号
     */
    @RequestMapping("/reg")
    public @ResponseBody
    ResultDTO register(String isHaveCard, Patient patient, String passwd,
                       RegistrationInfo regInfo, HttpSession session) {

        try {

            User user = (User) session.getAttribute("User");
            int result = regService.addRegisteredInfo(isHaveCard, patient, passwd, regInfo, user.getId());

            if (0 == result) {
                return new ResultDTO<>("NG", "挂号失败", result);
            }
            return new ResultDTO<>("OK", "挂号成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，挂号失败", e);
        }
    }
}
