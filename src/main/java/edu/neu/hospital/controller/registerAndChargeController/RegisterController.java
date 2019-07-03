package edu.neu.hospital.controller.registerAndChargeController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.bean.baseBean.RegistrationListView;
import edu.neu.hospital.bean.baseBean.ScheduleView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.bean.basicTableBean.Registrationinfo;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.*;
import edu.neu.hospital.service.registerAndCharge.RegisterService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    RegistrationLevelService registrationLevelService;

    @Resource
    DepartmentService departmentService;

    @Resource
    RegisterService regService;

    @Resource
    UserService userService;

    /**
     * 挂号
     */
    @RequestMapping("/reg")
    public @ResponseBody
    ResultDTO register(String isHaveCard, String patientName, String identityCardNo, String gender,
                       Date birthday, String familyAddress, String passwd, Integer registeredLevelID,
                       Integer departmentID, Integer doctorID, Date seeDoctorDate, Integer regSourceID,
                       Integer payID, BigDecimal expense, HttpSession session) {

        System.out.println("url: /register/reg");
        Patient patient = new Patient();
        Registrationinfo regInfo = new Registrationinfo();

        patient.setPatientName(patientName);
        patient.setIdentityCardNo(identityCardNo);
        patient.setGender(gender);
        patient.setBirthday(birthday);
        patient.setFamilyAddress(familyAddress);

        regInfo.setRegistrationLevelID(registeredLevelID);
        regInfo.setDepartmentID(departmentID);
        regInfo.setDoctorID(doctorID);
        regInfo.setSeeDoctorDate(seeDoctorDate);
        regInfo.setRegistrationSourceID(regSourceID);
        regInfo.setPaymentCategoryID(payID);
        regInfo.setExpense(expense);

        try {

            UserView user = (UserView) session.getAttribute("user");
            Integer appearUserID = user.getId();
            int result = regService.addRegisteredInfo(isHaveCard, patient, passwd, regInfo, appearUserID);

            if (0 == result) {
                return new ResultDTO<>("FALSE", "挂号失败", result);
            }

            return new ResultDTO<>("OK", "挂号成功", result);

        } catch (Exception e) {
            System.out.println(e.toString());
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
    ResultDTO<List<NameCodeDTO>> getDoctor(Integer levelNameID, Integer deptID, String date) throws ParseException {

        System.out.println("url: /register/getDoctor");

        try {

            System.out.println(levelNameID);
            System.out.println(deptID);
            System.out.println(date);
            Date date1 = null;
            if (date != null && !date.equals("")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

                date1 = simpleDateFormat.parse(date);
            }

            List<ScheduleView> scheduleViews = scheduleService.find(date1, date1, null, null);
            List<NameCodeDTO> nameCodeDTOS = new ArrayList<>();

            for (ScheduleView view : scheduleViews) {

                if (view.getLevelNameID().equals(levelNameID) && view.getDeptID().equals(deptID)) {

                    NameCodeDTO nameCodeDTO = new NameCodeDTO();
                    nameCodeDTO.setId(view.getOnDutyDoctorID());

                    nameCodeDTO.setCode(view.getUserName());
                    User user = regService.findUserByID(view.getOnDutyDoctorID());
                    nameCodeDTO.setName(user.getRealName());

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

    @RequestMapping("/calculateExpanse")
    public @ResponseBody
    ResultDTO<Double> calculateExpanse(Integer regLevelID, Integer payCategoryID) {

        System.out.println("url: /register/calculateExpanse");
        double realFee, regFee, reimbursementRatio;

        //挂号费
        switch (regLevelID) {
            case 95:
                //急诊挂号
                regFee = 20;
                break;
            case 96:
                //专家挂号
                regFee = 30;
                break;
            case 94:
                //普通挂号
            default:
                //默认普通挂号
                regFee = 10;
        }
        //报销比例
        switch (payCategoryID) {
            case 92:
                //医保 报销20%
                reimbursementRatio = 0.2;
                break;
            case 93:
                //新农合 报销40%
                reimbursementRatio = 0.4;
                break;
            case 91:
                //自费 不报销
            default:
                //默认自费
                reimbursementRatio = 0;
        }
        realFee = regFee * (1 - reimbursementRatio);
        System.out.println("实际挂号费: " + realFee);
        return new ResultDTO<>("OK", "获取成功", realFee);
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

    @RequestMapping("/allInfo")
    public @ResponseBody
    ResultDTO<PageInfo> getAllInfo(@DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
                                   @DateTimeFormat(pattern = "yyyy-MM-dd") Date end,
                                   Integer pageNum, Integer pageSize) {

        System.out.println("/register/allInfo");

        try {

            PageHelper.startPage(pageNum, pageSize);
            List<RegistrationListView> regInfoList = regService.find(start, end);
            PageInfo<RegistrationListView> list = new PageInfo<>(regInfoList);

            return new ResultDTO<>("OK", "获取成功", list);

        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResultDTO<>("error", "发生异常，获取挂号列表失败", null);
        }
    }

    @RequestMapping("/getSelectRegInfo")
    public @ResponseBody
    ResultDTO<RegistrationListView> getSelectByRegInfo(String medRecNo) {

        System.out.println("/register/getSelectRegInfo");
        try {

            System.out.println(medRecNo);
            RegistrationListView view = regService.selectByMedRecID(medRecNo);
            System.out.println(view.toString());
            return new ResultDTO<>("OK", "获取成功", view);

        } catch (Exception e) {
            System.out.println(e.getCause().toString());
            return new ResultDTO<>("error", "发生异常，获取挂号列表失败", null);
        }
    }

    @RequestMapping("/todayWorkload")
    public @ResponseBody
    ResultDTO<Integer> getTodayWorkload() {

        System.out.println("/register/todayWorkload");
        try {

            List<RegistrationListView> regInfoList = regService.find(null, null);
            SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simp.parse(simp.format(new Date()));
            int count = 0;
            for (RegistrationListView view : regInfoList) {
                if (date.equals(view.getRegistrationDate()))
                    count++;
            }
            System.out.println(count);
            return new ResultDTO<>("OK", "获取成功", count);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResultDTO<>("error", "发生异常，获取挂号列表失败", null);
        }
    }

    @RequestMapping("/retreat")
    public @ResponseBody
    ResultDTO retreat(String regInfoID){

        System.out.println("退号: /register/retreat");
        System.out.println(regInfoID);

        int res = regService.retreat(Integer.parseInt(regInfoID));

        return new ResultDTO<>("OK", "退号成功", res);

    }
}
