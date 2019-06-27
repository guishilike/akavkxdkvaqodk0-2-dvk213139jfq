package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Department;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("department")
@CrossOrigin
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    /**
     * 列出科室
     * @param deptCategoryID 科室分类ID
     * @param typeID         科室类型ID
     * @param pageNum        第几页
     * @param pageSize       页大小
     * @return resultDTO
     */
    @RequestMapping("/list")
    public @ResponseBody
    ResultDTO<PageInfo> list(Integer deptCategoryID, Integer typeID,
                               Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<DepartmentView> departmentviews = departmentService.findDepartments(deptCategoryID, typeID);
            PageInfo<DepartmentView> list = new PageInfo<>(departmentviews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }

    /**
     * 根据id删除科室
     *
     * @param id      要删除科室的id
     * @param session HttpSession会话
     * @return resultDIO
     */
    @RequestMapping("deleteById")
    public @ResponseBody
    ResultDTO
    deleteById(Integer id, HttpSession session) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            System.out.println(id);
            UserView user = (UserView) session.getAttribute("user");
            departmentService.deleteById(id, user.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除科室成功");
            resultDTO.setData(id);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除科室失败");
            resultDTO.setData(id);
            System.out.println(e);
        }
        return resultDTO;
    }

    /**
     * 批量删除所选的科室
     *
     * @param ids     批量删除所选科室的idDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("deleteByChoose")
    public @ResponseBody
    ResultDTO<IdDTO> deleteByChoose(@RequestBody IdDTO ids, HttpSession session) {
        ResultDTO<IdDTO> resultDTO = new ResultDTO<>();
        if(ids.getId()!=null) {
            try {
                UserView user = (UserView) session.getAttribute("user");
                departmentService.deleteByChoose(ids, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除科室成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除科室失败");
                resultDTO.setData(ids);
            }
        }else{
            resultDTO.setStatus("WARN");
            resultDTO.setMsg("请先选择要删除的科室");
            resultDTO.setData(ids);
        }
        return resultDTO;
    }

    /**
     * 根据名称或编码寻找科室
     *
     * @param nameOrCode 科室的名称或编码
     * @param pageNum    第几页
     * @param pageSize   页大小
     * @return resultDTO
     */
    @RequestMapping("/findByNameOrCode")
    public @ResponseBody
    ResultDTO findByNameOrCode(String nameOrCode, Integer pageNum, Integer pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        System.out.println(pageSize);
        System.out.println(pageNum);
        System.out.println(nameOrCode);
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<DepartmentView> departmentview = departmentService.findDepartmentByNameOrCode(nameOrCode);
            if(departmentview!=null) {
                PageInfo<DepartmentView> list = new PageInfo<>(departmentview);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查找成功");
                resultDTO.setData(list);
            }else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("科室名称或编号不存在");
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找失败");
            System.out.println(e);
        }
        return resultDTO;
    }

    /**
     * 更新科室
     *
     * @param department 要修改的科室
     * @param session    HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody
    ResultDTO update(Department department, HttpSession session) {
        ResultDTO<Department> resultDTO = new ResultDTO<>();
        try {
            if (departmentService.checkContent(department, 1)) {
                UserView user = (UserView) session.getAttribute("user");                departmentService.change(department, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改科室成功");
                resultDTO.setData(department);
            } else {
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("存在重复的科室名，修改科室失败");
                resultDTO.setData(department);
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改科室失败");
            resultDTO.setData(department);
        }
        return resultDTO;
    }

    /**
     * 添加科室
     * @param department 要添加的科室
     * @param session HttpSession会话
     * @return
     */
    @RequestMapping("/add")
    public @ResponseBody
    ResultDTO add(Department department, HttpSession session) {
        ResultDTO<Department> resultDTO = new ResultDTO<>();
        try {
            if (departmentService.checkContent(department, 0)) {
                UserView user = (UserView) session.getAttribute("user");
                departmentService.add(department,user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加科室成功");
                resultDTO.setData(department);
            }else{
                resultDTO.setStatus("WARN");
                resultDTO.setMsg("存在重复的科室名，添加科室失败");
                resultDTO.setData(department);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加科室失败");
            resultDTO.setData(department);
        }
        return resultDTO;
    }

    /**
     * 获得所有科室名称和编码
     * @return resultDTO
     */
    @RequestMapping("/findAllDeptNamesAndCodes")
    public @ResponseBody ResultDTO getAllDeptNamesAndCodes(){
        ResultDTO<List<NameCodeDTO>> resultDTO=new ResultDTO<>();
        try{
            List<NameCodeDTO> list=departmentService.getAllDeptNamesAndDeptCodes();
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
     * 获得所有科室类型名称和编码
     * @return
     */
    @RequestMapping("/findAllDeptTypeNamesAndCodes")
    public @ResponseBody ResultDTO getAllDeptTypeNamesAndCodes(){
        ResultDTO<List<NameCodeDTO>> resultDTO=new ResultDTO<>();
        try{
            List<NameCodeDTO> list=departmentService.findALLDeptTypeOrCategoryId(0);
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得科室类型搜索列表成功");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得科室类型搜索列表失败");
        }
        return resultDTO;

    }

    /**
     * 获得所有科室分类名称和编码
     * @return
     */
    @RequestMapping("/findAllDeptCategoryNamesAndCodes")
    public @ResponseBody ResultDTO getAllDeptCategoryNamesAndCodes(){
        ResultDTO<List<NameCodeDTO>> resultDTO=new ResultDTO<>();
        try{
            List<NameCodeDTO> list=departmentService.findALLDeptTypeOrCategoryId(1);
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得科室分类搜索列表成功");

        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得科室分类搜索列表失败");
        }
        return resultDTO;

    }
    /**
     * 创建xml文件
     */
    @RequestMapping("/createXLS")
    public @ResponseBody ResultDTO createXLS(){
        System.out.println("开始创建");
        ResultDTO<String> resultDTO=new ResultDTO();
        try{
            File file=departmentService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建XLS文件信息成功");
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建XLS文件信息失败");

        }
        return  resultDTO;
    }

    @RequestMapping("/upload")
    public @ResponseBody ResultDTO upload(MultipartFile file,HttpSession session) throws IOException {

        ResultDTO resultDTO=new ResultDTO();
        if(!file.isEmpty()){
            try {
                System.out.println("tset");
                System.out.println();
                UserView user = (UserView) session.getAttribute("user");
                System.out.println(user.getId());
                departmentService.uploadXls(file, user.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("上传科室信息成功");
            }catch (Exception e){
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("上传科室信息失败");
                e.printStackTrace();
            }

        }
        else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("上传科室信息失败");
        }
        return resultDTO;
    }

    @RequestMapping("/createTemplate")
    public @ResponseBody ResultDTO createTemplate(){
        System.out.println("开始创建模板");
        ResultDTO<String> resultDTO=new ResultDTO();
        try{
            File file=departmentService.createXLSTemplate();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建XLS文件模板成功");
        }catch (Exception e){
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建XLS文件模板失败");
            e.printStackTrace();

        }
        return  resultDTO;
    }










}
