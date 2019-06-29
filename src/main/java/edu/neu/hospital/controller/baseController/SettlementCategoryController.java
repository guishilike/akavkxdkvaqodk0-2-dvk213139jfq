package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.SettleCategoryView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.SettleCategoryDetails;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ConstantService;
import edu.neu.hospital.service.baseService.SettlementCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

//结算类别控制
@Controller
@RequestMapping("settlementCategory")
@CrossOrigin
public class SettlementCategoryController {
    @Resource
    SettlementCategoryService settlementCategoryService;
    @Resource
    ConstantService constantService;

    /**
     * 列出所有结算类别
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return resultDTO
     */
    @RequestMapping("/list")
    public @ResponseBody
    ResultDTO findAll(Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<SettleCategoryView> settlementCategories = settlementCategoryService.findAll();
            PageInfo<SettleCategoryView> list = new PageInfo<>(settlementCategories);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;

    }

    /**
     * 通过编号或名称查找结算类别
     * @param codeOrName 结算类别编号或名称
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return resultDTO
     */
    @RequestMapping("/findByCodeOrName")
    public @ResponseBody ResultDTO
    findByCodeOrName(String codeOrName,Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<SettleCategoryView> settlementCategories = settlementCategoryService.findByCodeOrName(codeOrName);
            if(settlementCategories!=null) {
                PageInfo<SettleCategoryView> list = new PageInfo<>(settlementCategories);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查找结算类别成功");
                resultDTO.setData(list);
            }
            else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("结算类别名称或编号不存在");
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找失败");
        }
        return resultDTO;
    }

    /**
     * 根据id删除结算类别
     * @param id 要删除的结算类别的id
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByID")
    public @ResponseBody ResultDTO deleteByID(Integer id, HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("user");
            settlementCategoryService.deleteByID(id,user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除结算类别成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除结算类别失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除结算类别
     * @param ids 要批量删除的结算类别的IdDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody ResultDTO deleteByChoose(@RequestBody IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO<>();
        if(ids.getId()!=null&&ids.getId().size()!=0){
            try{
                UserView user = (UserView) session.getAttribute("user");
                settlementCategoryService.deleteByChoose(ids,user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除结算类别成功");
                resultDTO.setData(ids);
            }catch (Exception e){
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除结算类别失败");
            }
        }
        else{
            resultDTO.setStatus("WARN");
            resultDTO.setMsg("请先选择你要删除的结算类别");
        }
        return resultDTO;

    }

    /**
     * 添加结算类别
     * @param constantitem 要添加的结算类别信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/add")
    public @ResponseBody ResultDTO add(ConstantItem constantitem, HttpSession session){
        ResultDTO<ConstantItem> resultDTO=new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 0, 12)) {
                UserView user = (UserView) session.getAttribute("user");
                settlementCategoryService.add(constantitem,user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加结算类别成功");
                resultDTO.setData(constantitem);
            }
            else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("存在重复的结算类别名，添加结算类别失败");
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加结算类别失败");
            e.printStackTrace();
        }

        return resultDTO;
    }

    /**
     * 修改结算类别
     * @param constantitem 修改结算类别需要的信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody ResultDTO update(ConstantItem constantitem, HttpSession session){
        ResultDTO<ConstantItem> resultDTO=new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 1, 12)) {
                UserView user = (UserView) session.getAttribute("user");
                settlementCategoryService.change(constantitem,user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改结算类别成功");
                resultDTO.setData(constantitem);
            }
            else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("存在重复的结算类别名，修改结算类别失败");
                resultDTO.setData(constantitem);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改结算类别失败");
            resultDTO.setData(constantitem);
        }
            return resultDTO;
    }

    /**
     * 修改结算类别详情
     * @param settlecategorydetails 结算类别详情
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/updateDetails")
    public @ResponseBody
    ResultDTO updateDetials(SettleCategoryDetails settlecategorydetails, HttpSession session){
        ResultDTO<SettleCategoryDetails> resultDTO=new ResultDTO<>();
        System.out.println(settlecategorydetails);
        try {
            UserView user = (UserView) session.getAttribute("user");
            settlementCategoryService.changeDetails(settlecategorydetails,user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("修改结算类别详情成功");
            resultDTO.setData(settlecategorydetails);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改结算类别详情失败");
            resultDTO.setData(settlecategorydetails);
            e.printStackTrace();
        }

        return resultDTO;

    }

    /**
     * 获得所有结算类别名称和编码
     * @return resultDTO
     */
    @RequestMapping("/findAllSetCatNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllSetCatNamesAndCodes() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = settlementCategoryService.getAllSetCatNamesAndCode();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得结算类别搜索列表成功");

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得结算类别搜索列表失败");
        }
        return resultDTO;

    }


    /**
     * 创建xml文件
     * @return resultDTO
     */
    @RequestMapping("/createXLS")
    public @ResponseBody
    ResultDTO createXLS() {
        System.out.println("开始创建");
        ResultDTO<String> resultDTO = new ResultDTO();
        try {
            File file = settlementCategoryService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建结算类别XLS文件信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建结算类别XLS文件信息失败");

        }
        return resultDTO;
    }

}
