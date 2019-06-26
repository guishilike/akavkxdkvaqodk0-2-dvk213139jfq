package edu.neu.hospital.controller.registerAndChargeController;

import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.bean.basicTableBean.Registrationinfo;
import edu.neu.hospital.dto.DeptIDAndNameDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.DepartmentService;
import edu.neu.hospital.service.registerAndCharge.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiJie
 * @date 2019/6/10 10:28
 */
@Controller
@RequestMapping("register")
public class RegisterController {

    @Resource
    DepartmentService departmentService;

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
            UserView user = (UserView) session.getAttribute("user");
            Integer appearUserID = user.getId();
            int result = regService.addRegisteredInfo(isHaveCard, patient, passwd, regInfo, appearUserID);

            if (0 == result) {
                return new ResultDTO<>("FALSE", "挂号失败", result);
            }
            return new ResultDTO<>("OK", "挂号成功", result);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，挂号失败", e);
        }
    }

    @RequestMapping("/getDeptList")
    public @ResponseBody
    ResultDTO<List<DeptIDAndNameDTO>> getDepartmentList() {

        try {

            List<DepartmentView> departmentViewList = departmentService.findDepartments(null, 120);

            List<DeptIDAndNameDTO> deptIDAndNameDTOS = new ArrayList<>();
            DeptIDAndNameDTO deptIDAndNameDTO = new DeptIDAndNameDTO();

            for (DepartmentView deptView : departmentViewList) {
                deptIDAndNameDTO.setDeptID(deptView.getId());
                deptIDAndNameDTO.setDeptName(deptView.getDeptName());
                deptIDAndNameDTOS.add(deptIDAndNameDTO);
            }

            return new ResultDTO<>("OK", "获取成功", deptIDAndNameDTOS);

        } catch (Exception e) {
            return new ResultDTO<>("error", "获取失败", null);
        }
    }
}
