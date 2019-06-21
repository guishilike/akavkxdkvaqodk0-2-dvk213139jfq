package edu.neu.hospital.controller.registerAndChargeController;

import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.patientcard.PatientCardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @author LiJie
 * @date 2019/6/20 21:29
 */
@Controller
@RequestMapping("patientCard")
public class PatientCardController {

    @Resource
    PatientCardService patientCardService;

    /**
     * 申请就诊卡
     */
    @RequestMapping("/apply")
    public @ResponseBody
    ResultDTO applyCard(Patient patient, String passwd, HttpSession session) {

        try {

            Integer appearUserID = Integer.parseInt((String) session.getAttribute("userID"));
            int result = patientCardService.applyCard(patient, passwd, appearUserID);

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

            Integer changeUserID = Integer.parseInt((String) session.getAttribute("userID"));
            int result = patientCardService.changePasswd(id, passwd, changeUserID);

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

            Integer appearUserID = Integer.parseInt((String) session.getAttribute("userID"));
            int result = patientCardService.recharge(id, money, appearUserID);

            if (0 == result) {
                return new ResultDTO<>("NG", "充值失败", result);
            }
            return new ResultDTO<>("OK", "充值成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，就诊卡充值失败", e);
        }
    }

}
