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
package edu.neu.hospital.controller.finaceController;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.finaceService.CheckworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Checkwork")
@CrossOrigin
public class CheckworkController {
    @Autowired
    CheckworkService checkworkService;

    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<PageInfo> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO = new ResultDTO();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<CheckWork> checkWorks = checkworkService.findByInfo(realName,departmentName,dateStart,dateEnd);
            PageInfo<CheckWork> list=new PageInfo<>(checkWorks);
            if (list != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("核对检查成功！");
                resultDTO.setData(list);
            }else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("核对检查失败！");
                resultDTO.setData(list);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("核对检查出现错误！");
        }
        return resultDTO;
    }
}
