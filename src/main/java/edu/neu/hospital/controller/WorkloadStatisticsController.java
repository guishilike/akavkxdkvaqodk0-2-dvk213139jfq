package edu.neu.hospital.controller;

import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.WorkloadStatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("WorkloadStatistics")
public class WorkloadStatisticsController {
    @Resource
    WorkloadStatisticsService workloadStatisticsService;

    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<List<Workloadstatistics>> findByInfo(String userName, String departmentName, Date dateStart, Date dateEnd){
        ResultDTO<List<Workloadstatistics>> resultDTO = new ResultDTO();
        try{
            List<Workloadstatistics> list = workloadStatisticsService.findByInfo(userName,departmentName,dateStart,dateEnd);
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
            resultDTO.setMsg("工作量检查失败！");
        }
        return resultDTO;
    }
}
