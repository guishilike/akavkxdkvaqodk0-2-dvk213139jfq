package edu.neu.hospital.controller;

import edu.neu.hospital.bean.Patient;
import edu.neu.hospital.bean.RegistrationInfo;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.PatientCardService;
import edu.neu.hospital.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
    ResultDTO applyCard(Patient patient, String passwd) {

        int result = patientCardService.applyCard(patient, passwd);

        if (0 == result) {
            return new ResultDTO<>("NG", "申请失败", result);
        }

        return new ResultDTO<>("OK", "申请成功", result);
    }

    /**
     * 修改就诊卡密码
     */
    @RequestMapping("/changepwd")
    public @ResponseBody
    ResultDTO changePasswd(Integer id, String passwd) {

        int result = patientCardService.changePasswd(id, passwd);

        if (0 == result) {
            return new ResultDTO<>("NG", "修改失败", result);
        }

        return new ResultDTO<>("OK", "修改成功", result);
    }

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
     * 挂号
     */
    @RequestMapping("/reg")
    public @ResponseBody
    ResultDTO register(String isHaveCard, Patient patient, String passwd, RegistrationInfo regInfo) {

        int result = regService.addRegisteredInfo(isHaveCard, patient, passwd, regInfo);

        if (0 == result) {
            return new ResultDTO<>("NG", "挂号失败", result);
        }

        return new ResultDTO<>("OK", "挂号成功", result);
    }
}
