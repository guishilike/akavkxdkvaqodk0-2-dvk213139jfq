/*
*工作量统计的Controller
* 根据findByInfo传入的参数查找工作量信息
* realName医生姓名,departmentName部门名称,dateStart开始日期,dateEnd结束日期
* 传参查询格式
* http://localhost:8081/hospital/WorkloadStatistics/findByInfo?dateEnd=2019-06-11&deptName=心血管科&dateStart=2019-06-09&realName=like
* 如果不传参数查询结果是全部的工作量统计信息
* 不传参查询格式
* http://localhost:8081/hospital/WorkloadStatistics/findByInfo
* return的是含有json格式的DTO
* 已经测试过
*/
package edu.neu.hospital.controller;

import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.WorkloadStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("WorkloadStatistics")
public class WorkloadStatisticsController {
    @Autowired
    WorkloadStatisticsService workloadStatisticsService;

    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<List<Workloadstatistics>> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd){
        ResultDTO<List<Workloadstatistics>> resultDTO = new ResultDTO();
        try{
            List<Workloadstatistics> list = workloadStatisticsService.findByInfo(realName,departmentName,dateStart,dateEnd);
            if (list != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("工作量检查成功！可以显示");
                resultDTO.setData(list);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("工作量检查失败！");
                resultDTO.setData(list);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("工作量检查出现错误！");
        }
        return resultDTO;
    }
}
