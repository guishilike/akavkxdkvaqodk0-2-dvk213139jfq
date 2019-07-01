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
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.finaceService.CheckworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Checkwork")
@CrossOrigin
public class CheckworkController {
    @Resource
    CheckworkService checkworkService;

    /**
     * 根据传入信息查找核对信息
     * @param realName 医生真实姓名
     * @param deptName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @param pageNum 第几页
     * @param pageSize 页面大小
     * @return pageinfo类型
     */
    @RequestMapping("/findByInfo")
    public @ResponseBody
    ResultDTO<PageInfo> findByInfo(String realName, String deptName, Date dateStart, Date dateEnd,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO = new ResultDTO();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<CheckWork> checkWorks = checkworkService.findByInfo(realName,deptName,dateStart,dateEnd);

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

    /**
     * 通过id修改核对状态
     * @param feeID 费用ID
     * @param session session会话
     * @return int类型的resultdto
     */
    @RequestMapping("updateById")
    public @ResponseBody
    ResultDTO
    updateById(Integer feeID, HttpSession session) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
//        System.out.println("传进来的费用ID是   "+feeID);
        try {
//            System.out.println("进入了try");
            UserView user = (UserView) session.getAttribute("financeUser");
//            System.out.println("session没有问题，userID是"+user.getId());
            checkworkService.updateById(feeID, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("修改对账状态成功");
            resultDTO.setData(feeID);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改对账状态失败");
            resultDTO.setData(feeID);
        }
        return resultDTO;
    }

    /**
     * 批量删除所选的科室
     * @param feeIDs     批量删除所选科室的idDTO
     * @param session HttpSession会话
     * @return IdDTO
     */
    @RequestMapping("updateByChoose")
    public @ResponseBody
    ResultDTO<IdDTO> updateByChoose(@RequestBody IdDTO feeIDs, HttpSession session) {
        ResultDTO<IdDTO> resultDTO = new ResultDTO<>();
//        System.out.println("feeIDs是"+feeIDs.toString());
        System.out.println(feeIDs.getId());
        if(feeIDs.getId()!=null) {
            try {
                UserView user = (UserView) session.getAttribute("financeUser");
                checkworkService.updateByChoose(feeIDs, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量修改对账状态成功");
                resultDTO.setData(feeIDs);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量修改对账状态失败");
                resultDTO.setData(feeIDs);
            }
        }else{
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选择要修改的对账状态");
            resultDTO.setData(feeIDs);
        }
        return resultDTO;
    }
}
