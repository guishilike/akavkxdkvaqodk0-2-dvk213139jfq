package edu.neu.hospital.controller.registerAndChargeController;

import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.bean.basicTableBean.Registrationinfo;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ConstantService;
import edu.neu.hospital.service.baseService.DepartmentService;
import edu.neu.hospital.service.baseService.ScheduleService;
import edu.neu.hospital.service.registerAndCharge.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LiJie
 * @date 2019/6/10 10:28
 */
@Controller
@RequestMapping("register")
public class RegisterController {

    @Resource
    ScheduleService scheduleService;

    @Resource
    ConstantService constantService;

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

        System.out.println("url: /register/reg");
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
    ResultDTO<List<NameCodeDTO>> getDepartmentList() {

        System.out.println("url: /register/getDeptList");
        try {

            List<DepartmentView> departmentViewList = departmentService.findDepartments(null, 120);
            List<NameCodeDTO> nameCodeDTOS = new ArrayList<>();

            for (DepartmentView deptView : departmentViewList) {

                NameCodeDTO nameCodeDTO = new NameCodeDTO();

                nameCodeDTO.setId(deptView.getId());
                nameCodeDTO.setCode(deptView.getDeptCode());
                nameCodeDTO.setName(deptView.getDeptName());

                nameCodeDTOS.add(nameCodeDTO);

                System.out.println(nameCodeDTO.toString());
            }

            return new ResultDTO<>("OK", "获取成功", nameCodeDTOS);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，获取失败", null);
        }
    }

    @RequestMapping("/getDoctor")
    public @ResponseBody
    ResultDTO<List<NameCodeDTO>> getDoctor(Integer levelNameID, Integer deptID, String date) {

        System.out.println("url: /register/getDoctor");

        Date date1 = null;
        if (date != null && !date.equals("")) {
            date1 = Date.from(Instant.parse(date));
        }

        try {

            List<ScheduleView> scheduleViews = scheduleService.find(date1, date1, null, null);
            List<NameCodeDTO> nameCodeDTOS = new ArrayList<>();

            for (ScheduleView view : scheduleViews) {

                if (view.getLevelNameID().equals(levelNameID) && view.getDeptID().equals(deptID)) {

                    NameCodeDTO nameCodeDTO = new NameCodeDTO();
                    nameCodeDTO.setId(view.getOnDutyDoctorID());
                    nameCodeDTO.setName(view.getUserName());

                    nameCodeDTOS.add(nameCodeDTO);

                    System.out.println(nameCodeDTO.toString());
                }
            }

            return new ResultDTO<>("OK", "获取成功", nameCodeDTOS);

        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，获取失败", null);
        }
    }


    @RequestMapping("/getRegSource")
    public @ResponseBody
    ResultDTO<List<NameCodeDTO>> getRegSource() {

        System.out.println("url: /register/getRegSource");

        return getConstants(14);
    }

    @RequestMapping("/getPayCategory")
    public @ResponseBody
    ResultDTO<List<NameCodeDTO>> getPayCategory() {

        System.out.println("url: /register/getPayCategory");

        return getConstants(12);
    }

    private ResultDTO<List<NameCodeDTO>> getConstants(Integer typeID) {

        try {

            List<ConstantItem> constantItemList = constantService.findByTypeID(typeID);
            List<NameCodeDTO> nameCodeDTOS = new ArrayList<>();

            for (ConstantItem item : constantItemList) {

                NameCodeDTO nameCodeDTO = new NameCodeDTO();

                nameCodeDTO.setId(item.getId());
                nameCodeDTO.setCode(item.getConstantCode());
                nameCodeDTO.setName(item.getConstantName());

                nameCodeDTOS.add(nameCodeDTO);

                System.out.println(nameCodeDTO.toString());
            }

            return new ResultDTO<>("OK", "获取成功", nameCodeDTOS);


        } catch (Exception e) {
            return new ResultDTO<>("error", "发生异常，获取失败", null);
        }
    }
}
