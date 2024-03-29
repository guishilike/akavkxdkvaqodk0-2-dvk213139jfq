/**
*工作量统计的Controller
*
* 根据findByInfo传入的参数查找工作量信息
* realName医生姓名,departmentName部门名称,dateStart开始日期,dateEnd结束日期
* 传参查询格式
* http://localhost:8081/hospital/WorkloadStatistics/findByInfo?dateEnd=2019-06-11&deptName=心血管科&dateStart=2019-06-09&realName=like
* 如果不传参数查询结果是全部的工作量统计信息
* 不传参查询格式
* http://localhost:8081/hospital/WorkloadStatistics/findByInfo
* return的是含有json格式的DTO
* 测试成功
*
*/
package edu.neu.hospital.controller.finaceController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.finaceBean.DepartmentWorkCharts;
import edu.neu.hospital.bean.finaceBean.UserWorkCharts;
import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.finaceService.DepartmentWorkChartsService;
import edu.neu.hospital.service.finaceService.UserWorkChartsService;
import edu.neu.hospital.service.finaceService.WorkloadStatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("WorkloadStatistics")
@CrossOrigin
public class WorkloadStatisticsController {
    @Resource
    WorkloadStatisticsService workloadStatisticsService;
    @Resource
    DepartmentWorkChartsService workloadStatisticsChartsService;
    @Resource
    UserWorkChartsService userWorkChartsService;

    /**
     * 查找用户工作量统计的图表
     * @return 用户工作量统计数组
     */
    @RequestMapping("/userWorkCharts")
    public @ResponseBody
    ResultDTO<List<UserWorkCharts>> getUserWorkCharts(){
        ResultDTO <List<UserWorkCharts>> resultDTO = new ResultDTO<>();
        try {
            List<UserWorkCharts> list = userWorkChartsService.list();
            if (list != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("个人工作量检查成功！可以显示");
                resultDTO.setData(list);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("个人工作量检查失败！");
                resultDTO.setData(list);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("个人工作量检查出现错误！");
        }
        return resultDTO;
    }

    /**
     * 查找科室工作量统计的图表
     * @return 科室工作量统计的图表
     */
    @RequestMapping("/departmentWorkCharts")
    public @ResponseBody
    ResultDTO<List<DepartmentWorkCharts>> getDepartmentWorkCharts(){
        ResultDTO<List<DepartmentWorkCharts>> resultDTO = new ResultDTO<>();
        try {
            List<DepartmentWorkCharts> list = workloadStatisticsChartsService.list();
            if (list != null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("科室工作量检查成功！可以显示");
                resultDTO.setData(list);
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("科室工作量检查失败！");
                resultDTO.setData(list);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("科室工作量检查出现错误！");
        }
        return resultDTO;
    }

    /**
     * 根据信息查找对应的工作量
     * @param realName 医生真实姓名
     * @param deptName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return pageinfo类型的ResultDTO
     */
    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<PageInfo> findByInfo(String realName, String deptName, Date dateStart, Date dateEnd,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO = new ResultDTO();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<WorkLoadStatistics> workloadstatistics = workloadStatisticsService.findByInfo(realName,deptName,dateStart,dateEnd);
            PageInfo<WorkLoadStatistics> list = new PageInfo<>(workloadstatistics);
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
