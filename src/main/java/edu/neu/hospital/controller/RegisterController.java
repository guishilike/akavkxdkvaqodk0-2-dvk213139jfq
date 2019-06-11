package edu.neu.hospital.controller;

import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.PatientCardService;
import edu.neu.hospital.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

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

    @RequestMapping("/changepwd")
    public @ResponseBody
    ResultDTO changePasswd(Integer id, String passwd) {

        patientCardService.changePasswd(id, passwd);
        System.out.println("id: " + id + " passwd: " + passwd);

        ResultDTO<String> result = new ResultDTO<>();
        result.setStatus("OK");
        result.setMsg("修改成功");
        result.setData("Change OK");

        return result;
    }

    @RequestMapping("/reg")
    public @ResponseBody
    ResultDTO register(String isHaveCard, String patientName, String identityCardNo,
                       String gender, Date birthday, String familyAddress, String passwd,
                       Integer registeredLevelID, Integer departmentID,
                       Integer doctorID, Date seeDoctorDate, Integer regSourceID,
                       Integer payID, BigDecimal expense) {

        int data = regService.addRegisteredInfo(isHaveCard, patientName, identityCardNo,
                gender, birthday, familyAddress, passwd,
                registeredLevelID, departmentID,
                doctorID, seeDoctorDate, regSourceID,
                payID, expense);

        ResultDTO<Integer> result = new ResultDTO<>();
        result.setStatus("OK");
        result.setMsg("修改成功");
        result.setData(data);

        return result;
    }

}
