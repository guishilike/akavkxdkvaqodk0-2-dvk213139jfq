package edu.neu.hospital.controller.baseController;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Resource
    UserService userService;
    /**
     * 添加用户
     * @param user 要添加的用户
     * @param session HttpSession
     * @return resultDIO
     */
    @RequestMapping("/addUser")
    public @ResponseBody
    ResultDTO addUser(User user, HttpSession session){
        ResultDTO<User> resultDTO=new ResultDTO<>();
        try {
            if (userService.checkContent(user, 0)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                userService.add(user, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加用户成功");
                resultDTO.setData(user);
            }
            else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("该用户已存在");
                resultDTO.setData(user);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加用户失败");
            resultDTO.setData(user);
        }
       return resultDTO;
    }

    /**
     * 列出用户
     * @param deptID 科室ID
     * @param typeID 用户类型ID
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return
     */
    @RequestMapping("/list")
    public @ResponseBody
    ResultDTO list(Integer deptID, Integer typeID, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<UserView> userViews = userService.findUsers(deptID, typeID);
            PageInfo<UserView> list = new PageInfo<>(userViews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("操作失败");
        }
        return resultDTO;
    }

    /**
     *根据真实名或登录名获取用户
     * @param name 用户登录名或真实名
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return resultDTO
     */
    @RequestMapping("/findByName")
    public @ResponseBody
    ResultDTO<PageInfo> findByName(String name, Integer pageNum, Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<UserView> userview = userService.findUserByName(name);
            if(userview!=null) {
                PageInfo<UserView> list = new PageInfo<>(userview);
                resultDTO.setData(list);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查找成功");
            }else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("不存在具有该用户名或名称的用户");
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找失败");
        }

        return resultDTO;
    }

    /**
     * 根据id删除用户
     * @param id 要删除用户的id
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("deleteByID")
    public @ResponseBody
    ResultDTO deleteByID(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO<>();
        try {
            UserView loginUser=(UserView) session.getAttribute("user");
            userService.deleteById(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除用户成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除用户失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除用户
     * @param ids 要删除用户的idDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("deleteByChoose")
    public @ResponseBody ResultDTO deleteByChoose(@RequestBody IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO<>();
        if(ids.getId()!=null&&ids.getId().size()!=0) {
            try {
                UserView loginUser = (UserView) session.getAttribute("user");
                userService.deleteByChoose(ids, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除用户成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除用户失败");
                resultDTO.setData(ids);
            }
        }else{
            resultDTO.setStatus("WARN");
            resultDTO.setMsg("请先选择要删除的用户");
        }
        return resultDTO;
    }
    /**
     * 更新用户
     * @param user 要更新的用户信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody ResultDTO update(User user,HttpSession session){
        ResultDTO<User> resultDTO=new ResultDTO<>();
        try {
            if (userService.checkContent(user, 1)) {
                UserView loginUser=(UserView) session.getAttribute("user");
                userService.change(user,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改用户成功");
                resultDTO.setData(user);
            }
            else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("该用户名已被使用");
                resultDTO.setData(user);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改用户失败");
            resultDTO.setData(user);
        }
        return resultDTO;
    }

    /**
     * 获得所有用户名和用户id
     * @return resultDTO
     */

    @RequestMapping("/findAllUserNamesAndIDs")
    public @ResponseBody ResultDTO AllUserNamesAndIDs(){
        ResultDTO<List<NameCodeDTO>> resultDTO=new ResultDTO<>();
        try{
            List<NameCodeDTO> list=userService.getAllUserNamesAndUserIDs();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得搜索列表成功");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得搜索列表失败");
        }
        return resultDTO;

    }

    /**
     * 获得所有用户类型的名称和编号
     * @return resultDTO
     */
    @RequestMapping("/findAllUserTypeNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllUserTypeNamesAndCodes() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = userService.getAllUserTypeNamesAndCodes();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得用户类别搜索列表成功");

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得用户类别搜索列表失败");
        }
        return resultDTO;

    }

    /**
     * 找到所有医生职称的名字和编号
     * @return resultDTO
     */

    @RequestMapping("/findAllUserRankNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllUserRankNamesAndCodes() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = userService.getAllRankNamesAndCodes();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得医生职称搜索列表成功");

        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得医生职称搜索列表失败");
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
            File file = userService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建用户XLS文件信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建用户XLS文件信息失败");

        }
        return resultDTO;
    }
    /**
     * 导入xls文件
     * @param file 要导入的xls文件
     * @param errorHappenContinue 错误发生是否继续
     * @param repeatCoverage 遇到重复是否覆盖
     * @param session HttpSession会话
     * @return resultDTO
     * @throws IOException
     */
    @RequestMapping("/upload")
    public @ResponseBody
    ResultDTO upload(MultipartFile file, boolean errorHappenContinue,
                     boolean repeatCoverage, HttpSession session) throws IOException {

        ResultDTO resultDTO = new ResultDTO();
        if (!file.isEmpty()) {
            try {
//                System.out.println("tset");
                UserView user = (UserView) session.getAttribute("user");
                System.out.println(user.getId());
                if(userService.uploadXls(file, user.getId(),errorHappenContinue,repeatCoverage)){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("上传用户信息成功");
                }else{
                    resultDTO.setStatus("WARN");
                    resultDTO.setMsg("文件部分内容出错");
                }

            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("上传用户信息失败");
                e.printStackTrace();
            }

        } else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("上传用户信息失败");
        }
        return resultDTO;
    }
    /**
     * 创建模板
     * @return resultDTO
     */
    @RequestMapping("/createTemplate")
    public @ResponseBody
    ResultDTO createTemplate() {
        System.out.println("开始创建模板");
        ResultDTO<String> resultDTO = new ResultDTO();
        try {
            File file = userService.createXLSTemplate();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建用户XLS文件模板成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建用户XLS文件模板失败");
            e.printStackTrace();

        }
        return resultDTO;
    }


}
