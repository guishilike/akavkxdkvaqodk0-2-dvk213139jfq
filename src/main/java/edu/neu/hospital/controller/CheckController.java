package edu.neu.hospital.controller;

import edu.neu.hospital.bean.Check;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Check")
//@Api(value = "CheckController|一个用来测试swagger注解的控制器")
public class CheckController {
    @Autowired
    CheckService checkService;

    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<List<Check>> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd){
        ResultDTO<List<Check>> resultDTO = new ResultDTO();
        try{
            List<Check> list = checkService.findByInfo(realName,departmentName,dateStart,dateEnd);
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
