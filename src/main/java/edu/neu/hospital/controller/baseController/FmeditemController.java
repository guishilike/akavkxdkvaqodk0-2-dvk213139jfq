package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.FmeditemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("fmeditem")
@CrossOrigin
public class FmeditemController {
    @Resource
    FmeditemService fmeditemService;
    /**
     * 获取excel文件
     * @return resultDTO
     */
    @RequestMapping("/getExcel")
    public @ResponseBody ResultDTO<String> getExcel(){
        ResultDTO<String> resultDTO=new ResultDTO<>();
        try {
            File file=fmeditemService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(file.getName());
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }

    /**
     * 添加非药品项目
     * @param fmeditem 要添加的药品
     * @param session  HttpSession会话
     * @return resultDIO 返回结果
     */

    @RequestMapping("/add")
    public @ResponseBody
    ResultDTO<FMedItem> add(FMedItem fmeditem, HttpSession session){
        ResultDTO<FMedItem> resultDTO=new ResultDTO();
        try{
            if(fmeditemService.checkContent(fmeditem,0)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                fmeditemService.add(fmeditem, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加非药品项目成功");
                resultDTO.setData(fmeditem);
            }else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的项目，添加非药品项目失败");
                resultDTO.setData(fmeditem);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加非药品项目失败");
            resultDTO.setData(fmeditem);
        }
        return resultDTO;
    }

    /**
     * 删除非药品项目
     * @param id 要删除的药品id
     * @param session  HttpSession会话
     * @return resultDIO 返回结果
     */
    @RequestMapping("/delete")
    public @ResponseBody ResultDTO<Integer> delete(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO();
        try{
            UserView loginUser=(UserView) session.getAttribute("user");
            fmeditemService.deleteById(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除非药品项目成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("删除非药品项目失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除非药品项目
     * @param ids 要删除的药品id列表
     * @param session  HttpSession会话
     * @return resultDIO 返回结果
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody ResultDTO<IdDTO>
    deleteByChoose(IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO();
        if(ids.getId()!=null) {
            try {
                UserView loginUser = (UserView) session.getAttribute("user");
                fmeditemService.deleteByChoose(ids, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除非药品项目成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除非药品项目失败");
                resultDTO.setData(ids);
            }
        }else{
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选择你要删除的非药品项目");
            resultDTO.setData(ids);
        }
        return resultDTO;
    }

    /**
     * 修改非药品项目
     * @param fmeditem 要修改的药品
     * @param session  HttpSession会话
     * @Return resultDIO 返回结果
     */
    @RequestMapping("/update")
    public @ResponseBody ResultDTO<FMedItem>
    update(FMedItem fmeditem, HttpSession session){
        ResultDTO<FMedItem> resultDTO=new ResultDTO();
        try{
            if(fmeditemService.checkContent(fmeditem,1)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                fmeditemService.change(fmeditem, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改非药品项目成功");
                resultDTO.setData(fmeditem);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的项目，修改非药品项目失败");
                resultDTO.setData(fmeditem);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改非药品项目失败");
            resultDTO.setData(fmeditem);
        }
        return resultDTO;
    }

    /**
     * 查找非药品项目
     * @param deptID 要查找的非药品项目的科室名称
     * @param recordType  要查找的非药品项目的类型
     * @param pageNum   第几页
     * @param pageSize  页大小
     * @eturn resultDIO 返回结果
     */
    @RequestMapping("/find")
    public @ResponseBody ResultDTO<PageInfo>
    find(Integer deptID,Integer recordType,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<FmeditemView> fmeditemviews=fmeditemService.find(deptID,recordType);
            PageInfo<FmeditemView> list=new PageInfo<>(fmeditemviews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查找非药品项目成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找非药品项目失败");
        }
        return resultDTO;
    }

    /**
     * 根据名称或编码查找非药品项目
     * @param nameOrCode 要查找的非药品项目的名称或编码
     * @param pageNum   第几页
     * @param pageSize  页大小
     * @return resultDTO 返回结果
     */
    @RequestMapping("/findByNameOrCode")
    public @ResponseBody ResultDTO<PageInfo>
    find(String nameOrCode,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<FmeditemView> fmeditemviews=fmeditemService.findByNameOrCode(nameOrCode);
            if(fmeditemviews!=null) {
                PageInfo<FmeditemView> list = new PageInfo<>(fmeditemviews);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查找非药品项目成功");
                resultDTO.setData(list);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("非药品项目名或编号不存在");
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找非药品项目失败");
        }
        return resultDTO;
    }
}
