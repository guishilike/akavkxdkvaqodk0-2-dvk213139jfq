package edu.neu.hospital.controller.outpatientContoller;

import edu.neu.hospital.bean.baseBean.UserView;
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
    public List<CommonDrugs> listCommonDrugs(Integer outpatientUser.getId() );

    //增
    public Integer addCommonDrugs( Integer outpatientUser.getId() , Integer drugsID);
    //批量增
    public boolean addCommonDrugsList( Integer outpatientUser.getId() , IdDTO IdDTO);
    public List<Disease> searchDisease(String str);
    //删
    public Integer deleteCommonDrugs ( Integer commonDrugsID , Integer outpatientUserID);
    //批量删
    public boolean deleteCommonDrugsList( IdDTO IdDTO , Integer outpatientUserID);
    //改
    public Integer updateCommonDrugs ( CommonDrugs commonDrugs , Integer outpatientUserID);

    //查
    public CommonDrugs searchCommonDrugs( Integer commonDrugsID);
     */


    @RequestMapping("/addCommonDrugs")
    public @ResponseBody
    ResultDTO addCommonDrugs(Integer drugsID, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO<>();
        try {

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            commonDrugsService.addCommonDrugs( outpatientUser.getId() ,drugsID);
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


        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
        commonDrugsService.addCommonDrugsList( outpatientUser.getId() , idDTO);
        resultDTO.setStatus("OK");
        resultDTO.setMsg("增加处置详细成功");
        //resultDTO.setData(inspection);

        return resultDTO;

    }

    @RequestMapping("/deleteCommonDrugsList")
    public @ResponseBody
    ResultDTO<Inspection> deleteCommonDrugsList(IdDTO idDTO , HttpSession session, Integer pageNum, Integer pageSize) {
        ResultDTO<Inspection> resultDTO = new ResultDTO<>();


        UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
        System.out.println(outpatientUser.getId());
        commonDrugsService.deleteCommonDrugsList(idDTO , outpatientUser.getId());
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

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            commonDrugsService.updateCommonDrugs(commonDrugs, outpatientUser.getId());
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

            UserView outpatientUser = (UserView) session.getAttribute("outpatientUser");
            System.out.println(outpatientUser.getId());
            commonDrugsService.deleteCommonDrugs(commonDrugsID ,outpatientUser.getId());

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
