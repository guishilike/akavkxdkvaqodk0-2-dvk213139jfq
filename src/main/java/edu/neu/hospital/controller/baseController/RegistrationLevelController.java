package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.RegistrationLevelView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.RegistrationLevelDetails;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ConstantService;
import edu.neu.hospital.service.baseService.RegistrationLevelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("registrationLevel")
@CrossOrigin
public class RegistrationLevelController {
    @Resource
    RegistrationLevelService registrationLevelService;
    @Resource
    ConstantService constantService;

    /**
     * 添加挂号级别
     *
     * @param constantitem 要添加的挂号级别信息
     * @param session      HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/add")
    public @ResponseBody
    ResultDTO add(ConstantItem constantitem, HttpSession session) {
        ResultDTO<ConstantItem> resultDTO = new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 0, 13)) {
                UserView user = (UserView) session.getAttribute("user");
                registrationLevelService.add(constantitem, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加挂号级别成功");
                resultDTO.setData(constantitem);
            } else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的挂号级别名，添加挂号级别失败");
                resultDTO.setData(constantitem);
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加挂号级别失败");
            resultDTO.setData(constantitem);
        }
        return resultDTO;
    }

    /**
     * 根据id删除挂号级别
     *
     * @param id      要删除的挂号级别的id
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByID")
    public @ResponseBody
    ResultDTO deleteById(Integer id, HttpSession session) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("user");
            registrationLevelService.deleteByID(id, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除挂号级别成功");
            resultDTO.setData(id);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除挂号级别失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除挂号级别
     *
     * @param ids     要批量删除的挂号级别的IdDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody
    ResultDTO deleteByChoose(@RequestBody IdDTO ids, HttpSession session) {
        ResultDTO<IdDTO> resultDTO = new ResultDTO<>();
        if (ids.getId() != null) {
            try {
                UserView user = (UserView) session.getAttribute("user");
                registrationLevelService.deleteByChoose(ids, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除挂号级别成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除挂号级别失败");
            }
        } else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选择你要删除的挂号级别");
        }
        return resultDTO;

    }

    /**
     * 更改挂号级别
     *
     * @param constantitem 修改挂号级别所需的信息
     * @param session      HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody
    ResultDTO update(ConstantItem constantitem, HttpSession session) {
        ResultDTO<ConstantItem> resultDTO = new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 1, 13)) {
                UserView user = (UserView) session.getAttribute("user");
                registrationLevelService.change(constantitem, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改挂号级别成功");
                resultDTO.setData(constantitem);
            } else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的挂号级别名，修改挂号级别失败");
                resultDTO.setData(constantitem);
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改挂号级别失败");
            resultDTO.setData(constantitem);
        }
        return resultDTO;
    }

    /**
     * 修改挂号级别详情
     *
     * @param registrationLevelDetails 修改挂号级别详情所需的信息
     * @param session                  HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/updateDetails")
    public @ResponseBody
    ResultDTO updateDetails(RegistrationLevelDetails registrationLevelDetails, HttpSession session) {
        ResultDTO<RegistrationLevelDetails> resultDTO = new ResultDTO<>();
        try {
            UserView user = (UserView) session.getAttribute("user");
            registrationLevelService.changeDetails(registrationLevelDetails, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("修改挂号级别详情成功");
            resultDTO.setData(registrationLevelDetails);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改挂号级别详情失败");
            resultDTO.setData(registrationLevelDetails);
            e.printStackTrace();
        }
        return resultDTO;
    }

    /**
     * 列出所有挂号级别信息
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
            List<RegistrationLevelView> registrationLevelViews = registrationLevelService.findAll();
            PageInfo<RegistrationLevelView> list = new PageInfo<>(registrationLevelViews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
            System.out.println(resultDTO);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;

    }

    /**
     * 根据编码或名称寻找挂号级别
     *
     * @param codeOrName 挂号级别的编码或名称
     * @param pageNum    第几页
     * @param pageSize   页大小
     * @return resultDTO
     */
    @RequestMapping("/findByCodeOrName")
    public @ResponseBody
    ResultDTO
    findByCodeOrName(String codeOrName, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<RegistrationLevelView> registrationLevelViews = registrationLevelService.findByCodeOrName(codeOrName);
            if (registrationLevelViews != null) {
                PageInfo<RegistrationLevelView> list = new PageInfo<>(registrationLevelViews);
                resultDTO.setData(list);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查找成功");
            } else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("该挂号级别名称或编号不存在");
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找失败");
        }
        return resultDTO;
    }

    /**
     * 获得所有结算类别名称和编码
     * @return resultDTO
     */
    @RequestMapping("/findAllRegLevNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllRegLevNamesAndCodes() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = registrationLevelService.getAllSetCatNamesAndCode();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得挂号级别搜索列表成功");

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得挂号级别搜索列表失败");
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
            File file = registrationLevelService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建挂号级别XLS文件信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建挂号级别XLS文件信息失败");

        }
        return resultDTO;
    }


}
