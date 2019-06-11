/**
 *Checkwork核对工作的Controller
 *
 * 根据findByInfo传入的参数查找工作量信息
 * realName医生姓名,departmentName部门名称,dateStart开始日期,dateEnd结束日期
 * 传参查询格式
 * http://localhost:8081/hospital/Checkwork/findByInfo?dateEnd=2019-06-11&deptName=%E5%BF%83%E8%A1%80%E7%AE%A1%E7%A7%91&dateStart=2019-06-09&realName=like
 * 如果不传参数查询结果是全部的核对信息
 * 不传参查询格式
 * http://localhost:8081/hospital/Checkwork/findByInfo
 * 测试成功
 *
 */
package edu.neu.hospital.controller;

import edu.neu.hospital.bean.Checkwork;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.CheckworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Checkwork")
public class CheckworkController {
    @Autowired
    CheckworkService checkworkService;

    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<List<Checkwork>> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd){
        ResultDTO<List<Checkwork>> resultDTO = new ResultDTO();
        try{
            List<Checkwork> list = checkworkService.findByInfo(realName,departmentName,dateStart,dateEnd);
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
