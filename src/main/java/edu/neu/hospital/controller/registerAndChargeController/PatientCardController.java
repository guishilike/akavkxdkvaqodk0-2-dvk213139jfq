package edu.neu.hospital.controller.registerAndChargeController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.PatientCardView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.patientCard.PatientCardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

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
     * 获取所有的就诊卡列表
     *
     * @param pageNum  分页号
     * @param pageSize 分页大小
     * @return 就诊卡列表
     */
    @RequestMapping("/getPatientCardList")
    public @ResponseBody
    ResultDTO<PageInfo> getPatientCardList(Integer pageNum, Integer pageSize) {

        System.out.println("/patientCard/getPatientCardList");

        try {

            PageHelper.startPage(pageNum, pageSize);
            List<PatientCardView> patientCardList = patientCardService.getAll();
            PageInfo<PatientCardView> list = new PageInfo<>(patientCardList);

            return new ResultDTO<>("OK", "获取成功", list);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResultDTO<>("error", "发生异常，获取列表失败", null);
        }
    }

    @RequestMapping("/getPatientCard")
    public @ResponseBody
    ResultDTO<PatientCardView> getPatientCard(Integer patientCardID) {

        System.out.println("/patientCard/getPatientCard");

        try {

            System.out.println(patientCardID);
            PatientCardView view = patientCardService.selectByID(patientCardID);
            System.out.println(view.toString());
            return new ResultDTO<>("OK", "获取成功", view);

        } catch (Exception e) {
            System.out.println(e.getCause().toString());
            return new ResultDTO<>("error", "发生异常，获取就诊卡失败", null);
        }
    }

    /**
     * 申请就诊卡
     */
    @RequestMapping("/apply")
    public @ResponseBody
    ResultDTO applyCard(Patient patient, String passwd, HttpSession session) {

        try {

            System.out.println(patient.toString());
            UserView loginUser = (UserView) session.getAttribute("user");
            int result = patientCardService.applyCard(patient, passwd, loginUser.getId());

            if (0 == result) {
                return new ResultDTO<>("NG", "申请失败", result);
            }
            return new ResultDTO<>("OK", "申请成功", result);

        } catch (Exception e) {
            System.out.println(e.getCause().toString());
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
            UserView user = (UserView) session.getAttribute("user");
            Integer changeUserID = user.getId();
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
            UserView user = (UserView) session.getAttribute("user");
            Integer appearUserID = user.getId();
            int result = patientCardService.recharge(id, money, appearUserID);

            if (0 == result) {
                return new ResultDTO<>("FALSE", "充值失败！", result);
            }
            return new ResultDTO<>("OK", "充值成功！", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，就诊卡充值失败", e);
        }
    }

}
