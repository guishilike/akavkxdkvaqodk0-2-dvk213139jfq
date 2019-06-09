package edu.neu.hospital.controller;


import edu.neu.hospital.bean.Check;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.CheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Check")
public class CheckController {
    @Resource
    CheckService checkService;

    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<List<Check>> findByInfo(String userName, String departmentName, Date dateStart, Date dateEnd){
        ResultDTO<List<Check>> resultDTO = new ResultDTO();
        try{
            List<Check> list = checkService.findByInfo(userName,departmentName,dateStart,dateEnd);
            if (list != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("核对检查成功！可以显示");
                resultDTO.setData(list);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("核对检查失败！");
                resultDTO.setData(list);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("核对检查失败！");
        }
        return resultDTO;
    }
}
