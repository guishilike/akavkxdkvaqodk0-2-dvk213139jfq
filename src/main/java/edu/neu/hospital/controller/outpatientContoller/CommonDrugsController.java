package edu.neu.hospital.controller.outpatientContoller;

import edu.neu.hospital.bean.basicTableBean.CommonDrugs;
import edu.neu.hospital.bean.basicTableBean.Inspection;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.CommonDrugService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("CommonDrugs")
public class CommonDrugsController {
    @Resource
    CommonDrugService commonDrugsService;
    /*
        //常用诊断管理
    //列出
    //根据医生ID列出他的常用诊断
    public List<CommonDrugs> listCommonDrugs(Integer doctorID );

    //增
    public Integer addCommonDrugs( Integer doctorID , Integer drugsID);
    //批量增
    public boolean addCommonDrugsList( Integer doctorID , IdDTO IdDTO);
    public List<Disease> searchDisease(String str);
    //删
    public Integer deleteCommonDrugs ( Integer commonDrugsID , Integer userID);
    //批量删
    public boolean deleteCommonDrugsList( IdDTO IdDTO , Integer userID);
    //改
    public Integer updateCommonDrugs ( CommonDrugs commonDrugs , Integer userID);

    //查
    public CommonDrugs searchCommonDrugs( Integer commonDrugsID);
     */


    @RequestMapping("/addCommonDrugs")
    public @ResponseBody
    ResultDTO addCommonDrugs(Integer drugsID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            System.out.println(session.getAttribute("userID"));
            Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
            commonDrugsService.addCommonDrugs( doctorID ,drugsID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(drugsID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(commonDrugs);

        }
        return resultDTO;

    }

    @RequestMapping("/addCommonDrugsList")
    public @ResponseBody
    ResultDTO<Inspection> addCommonDrugsList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        System.out.println(session.getAttribute("userID"));
        Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
        commonDrugsService.addCommonDrugsList( doctorID , idDTO);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/deleteCommonDrugsList")
    public @ResponseBody
    ResultDTO<Inspection> deleteCommonDrugsList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        System.out.println(session.getAttribute("userID"));
        Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
        commonDrugsService.deleteCommonDrugsList(idDTO , doctorID);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("删除多个成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }


    @RequestMapping("/updateCommonDrugs")
    public @ResponseBody
    ResultDTO updateCommonDrugs(CommonDrugs commonDrugs, HttpSession session) {
        ResultDTO<CommonDrugs> resultDTO = new ResultDTO<>();
        try {

            System.out.println(session.getAttribute("userID"));
            Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
            commonDrugsService.updateCommonDrugs(commonDrugs, doctorID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(commonDrugs);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(commonDrugs);

        }
        return resultDTO;

    }

    @RequestMapping("/deleteCommonDrugs")
    public @ResponseBody
    ResultDTO deleteCommonDrugs(Integer commonDrugsID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            System.out.println(session.getAttribute("userID"));
            Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
            commonDrugsService.deleteCommonDrugs(commonDrugsID ,doctorID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(commonDrugsID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }
}
