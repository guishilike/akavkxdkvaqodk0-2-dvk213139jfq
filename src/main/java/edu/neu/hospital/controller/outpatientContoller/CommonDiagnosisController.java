package edu.neu.hospital.controller.outpatientContoller;

import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.CommonDiagnosis;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.Inspection;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.CommonDiagnosisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("CommonDiagnosis")
public class CommonDiagnosisController {
    @Resource
    CommonDiagnosisService commonDiagnosisService;
    /*
        //常用诊断管理
    //列出
    //根据医生ID列出他的常用诊断
    public List<CommonDiagnosis> listCommonDiagnosis(Integer user.getId() );

    //增
    public Integer addCommonDiagnosis( Integer user.getId() , Integer diagnosisID);
    //批量增
    public boolean addCommonDiagnosisList( Integer user.getId() , IdDTO IdDTO);
    public List<Disease> searchDisease(String str);
    //删
    public Integer deleteCommonDiagnosis ( Integer commonDiagnosisID , Integer userID);
    //批量删
    public boolean deleteCommonDiagnosisList( IdDTO IdDTO , Integer userID);
    //改
    public Integer updateCommonDiagnosis ( CommonDiagnosis commonDiagnosis , Integer userID);

    //查
    public CommonDiagnosis searchCommonDiagnosis( Integer commonDiagnosisID);
     */


    @RequestMapping("/addCommonDiagnosis")
    public @ResponseBody
    ResultDTO addCommonDiagnosis(Integer diagnosisID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            commonDiagnosisService.addCommonDiagnosis( user.getId() ,diagnosisID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(diagnosisID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(commonDiagnosis);

        }
        return resultDTO;

    }

    @RequestMapping("/addCommonDiagnosisList")
    public @ResponseBody
    ResultDTO<Inspection> addCommonDiagnosisList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        commonDiagnosisService.addCommonDiagnosisList( user.getId() , idDTO);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/deleteCommonDiagnosisList")
    public @ResponseBody
    ResultDTO<Inspection> deleteCommonDiagnosisList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView user = (UserView) session.getAttribute("user");
        System.out.println(user.getId());
        commonDiagnosisService.deleteCommonDiagnosisList( idDTO , user.getId());
        resultDTO.setStatus("OK");
        resultDTO.setMsg("删除多个成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }


    @RequestMapping("/updateCommonDiagnosis")
    public @ResponseBody
    ResultDTO updateCommonDiagnosis(CommonDiagnosis commonDiagnosis, HttpSession session) {
        ResultDTO<CommonDiagnosis> resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            commonDiagnosisService.updateCommonDiagnosis(commonDiagnosis, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(commonDiagnosis);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(commonDiagnosis);

        }
        return resultDTO;

    }

    @RequestMapping("/CommonDiagnosis")
    public @ResponseBody
    ResultDTO deleteCommonDiagnosis(Integer commonDiagnosisID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            commonDiagnosisService.deleteCommonDiagnosis(commonDiagnosisID ,user.getId());

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(commonDiagnosisID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }

    @RequestMapping("/findCommonDiagnosis")
    public @ResponseBody
    ResultDTO<PageInfo<Disease>> findCommonDiagnosis(String str, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo<Disease>> resultDTO = new ResultDTO<>();

        try {

            List<Disease> diseaseList = commonDiagnosisService.searchDisease(str);
            System.out.println("-----");
            PageInfo<Disease> list = new PageInfo<>(diseaseList);
            System.out.println("-----");
            resultDTO.setMsg("模糊查询处置");
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;

    }

    @RequestMapping("/getThisDoctorTemp")
    public @ResponseBody
    ResultDTO getThisDoctorTemp(HttpSession session){
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView user = (UserView) session.getAttribute("user");
            System.out.println(user.getId());
            List<CommonDiagnosis> commonDiagnosisList = commonDiagnosisService.listCommonDiagnosis(user.getId());
            System.out.println("-----");
            System.out.println("-----");
            resultDTO.setMsg("模糊查询处置");
            resultDTO.setStatus("OK");
            resultDTO.setData(commonDiagnosisList);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
        }
        return resultDTO;
    }

}
