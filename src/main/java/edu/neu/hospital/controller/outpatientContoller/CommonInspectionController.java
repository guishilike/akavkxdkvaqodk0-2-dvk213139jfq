package edu.neu.hospital.controller.outpatientContoller;

import edu.neu.hospital.bean.basicTableBean.CommonInspection;
import edu.neu.hospital.bean.basicTableBean.Inspection;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.outPatientService.CommonInspectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("CommonInspection")
public class CommonInspectionController {
    @Resource
    CommonInspectionService commonInspectionService;
    /*
        //常用诊断管理
    //列出
    //根据医生ID列出他的常用诊断
    public List<CommonInspection> listCommonInspection(Integer doctorID );

    //增
    public Integer addCommonInspection( Integer doctorID , Integer inspectionID);
    //批量增
    public boolean addCommonInspectionList( Integer doctorID , IdDTO IdDTO);
    public List<Disease> searchDisease(String str);
    //删
    public Integer deleteCommonInspection ( Integer commonInspectionID , Integer userID);
    //批量删
    public boolean deleteCommonInspectionList( IdDTO IdDTO , Integer userID);
    //改
    public Integer updateCommonInspection ( CommonInspection commonInspection , Integer userID);

    //查
    public CommonInspection searchCommonInspection( Integer commonInspectionID);
     */


    @RequestMapping("/addCommonInspection")
    public @ResponseBody
    ResultDTO addCommonInspection(Integer inspectionID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            System.out.println("111111111111");

            System.out.println("111111111111");
            System.out.println(session.getAttribute("userID"));
            System.out.println("111111111111");
            Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
            System.out.println("111111111111");
            commonInspectionService.addCommonInspection( doctorID ,inspectionID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(inspectionID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(commonInspection);

        }
        return resultDTO;

    }

    @RequestMapping("/addCommonInspectionList")
    public @ResponseBody
    ResultDTO<Inspection> addCommonInspectionList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        System.out.println(session.getAttribute("userID"));
        Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
        commonInspectionService.addCommonInspectionList( doctorID , idDTO);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/deleteCommonInspectionList")
    public @ResponseBody
    ResultDTO<Inspection> deleteCommonInspectionList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        System.out.println(session.getAttribute("userID"));
        Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
        commonInspectionService.deleteCommonInspectionList( idDTO , doctorID);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("删除多个成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }


    @RequestMapping("/updateCommonInspection")
    public @ResponseBody
    ResultDTO updateCommonInspection(CommonInspection commonInspection, HttpSession session) {
        ResultDTO<CommonInspection> resultDTO = new ResultDTO<>();
        try {

            System.out.println(session.getAttribute("userID"));
            Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
            commonInspectionService.updateCommonInspection(commonInspection, doctorID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("增加模板成功");
            resultDTO.setData(commonInspection);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            resultDTO.setData(commonInspection);

        }
        return resultDTO;

    }

    @RequestMapping("/deleteInspection")
    public @ResponseBody
    ResultDTO deleteCommonInspection(Integer commonInspectionID , HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            System.out.println(session.getAttribute("userID"));
            Integer doctorID = Integer.parseInt((String) session.getAttribute("userID"));
            commonInspectionService.deleteCommonInspection(commonInspectionID ,doctorID);

            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功");
            resultDTO.setData(commonInspectionID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常");
            //resultDTO.setData(page);

        }
        return resultDTO;
    }
}