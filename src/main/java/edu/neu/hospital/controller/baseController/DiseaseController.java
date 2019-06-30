package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.DiseaseView;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.DiseaseCategory;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ConstantService;
import edu.neu.hospital.service.baseService.DiseaseService;
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
@RequestMapping("disease")
@CrossOrigin
public class DiseaseController {
    @Resource
    DiseaseService diseaseService;
    @Resource
    ConstantService constantService;

    /**
     * 查找疾病
     *
     * @param diseaseCategoryID 疾病类型id
     * @param pageNum           第几页
     * @param pageSize          页大小
     * @return resultDTO
     */
    @RequestMapping("/list")
    public @ResponseBody
    ResultDTO findDiseasesByCategoryAndDicaType(Integer diseaseCategoryID,Integer dicaTypeID, int pageNum, int pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<DiseaseView> diseaseviews = diseaseService.findDiseasesByCategory(diseaseCategoryID,dicaTypeID);
            PageInfo<DiseaseView> list = new PageInfo<DiseaseView>(diseaseviews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(list);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("操作失败");
        }
        return resultDTO;

    }

    /**
     * 通过疾病名称或编码查找疾病
     *
     * @param nameOrCode 疾病名称或编号
     * @param pageNum    第几页
     * @param pageSize   页大小
     * @return resultDTO
     */
    @RequestMapping("/findByNameOrCode")
    public @ResponseBody
    ResultDTO findDiseaseByNameOrCode(String nameOrCode, int pageNum, int pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<DiseaseView> diseaseviews = diseaseService.findDiseaseByNameOrCode(nameOrCode);
            if (diseaseviews != null) {
                PageInfo<DiseaseView> list = new PageInfo<DiseaseView>(diseaseviews);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查找成功");
                resultDTO.setData(list);
            } else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("疾病名或编号不存在，查找失败");
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找失败");
        }
        return resultDTO;
    }


    /**
     * 根据id删除疾病
     *
     * @param id      要删除疾病的id
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByID")
    public @ResponseBody
    ResultDTO
    deleteById(Integer id, HttpSession session) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            UserView loginUser = (UserView) session.getAttribute("user");
            diseaseService.deleteById(id, loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除疾病成功");
            resultDTO.setData(id);
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除疾病失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除疾病
     *
     * @param ids     要批量删除疾病的IdDTO
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody
    ResultDTO deleteByChoose(@RequestBody IdDTO ids, HttpSession session) {
        ResultDTO<IdDTO> resultDTO = new ResultDTO<>();
        if (ids.getId() != null) {
            try {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.deleteByChoose(ids, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除失败");
                resultDTO.setData(ids);
            }
        } else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选择你要删除的疾病");
            resultDTO.setData(ids);
        }
        return resultDTO;
    }

    /**
     * 更新疾病
     * @param disease 要更新的疾病名
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/update")
    public @ResponseBody
    ResultDTO update(Disease disease, HttpSession session) {
        System.out.println(disease);
        ResultDTO<Disease> resultDTO = new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseContent(disease, 1)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.change(disease,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改疾病成功");
                resultDTO.setData(disease);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的疾病，修改疾病失败");
                resultDTO.setData(disease);
            }
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改疾病失败");
            resultDTO.setData(disease);
        }
        return resultDTO;
    }

    /**
     * 添加疾病
     * @param disease 要添加的疾病
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/add")
    public  @ResponseBody ResultDTO
    add( Disease disease, HttpSession session) {
        System.out.println(disease);
        ResultDTO<Disease> resultDTO=new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseContent(disease, 0)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.add(disease,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加疾病成功");
                resultDTO.setData(disease);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的疾病，添加疾病失败");
                resultDTO.setData(disease);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加疾病失败");
            resultDTO.setData(disease);
        }
        return resultDTO;
    }

    /**
     * 列出所有根据一级分类id列出所有疾病类
     * @param id 一级分类id
     * @return resultDTO
     */
    @RequestMapping("/findCategoriesByDicaTypeID")
    public @ResponseBody
    ResultDTO findAllCategoryByDicaTypeID(Integer id) {
        ResultDTO<List<NameCodeDTO>> resultDTO=new ResultDTO<>();
        System.out.println(id);
        try {
            List<NameCodeDTO> diseasecategories = diseaseService.findAllDiseaseCategoryByDicaTypeID(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(diseasecategories);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("操作失败");
            e.printStackTrace();
        }
        return resultDTO;
    }

    /**
     * 添加一级目录
     * @param constantitem 要添加的一级目录
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/addDicaType")
    public @ResponseBody
    ResultDTO addDicaType( ConstantItem constantitem, HttpSession session) {
        ResultDTO<ConstantItem> resultDTO=new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 0, 22)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.addDicaType(constantitem,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加疾病一级目录成功");
                resultDTO.setData(constantitem);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的目录名，添加疾病一级目录失败");
                resultDTO.setData(constantitem);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加疾病一级目录失败");
            resultDTO.setData(constantitem);
        }
        return resultDTO;
    }

    /**
     * 删除一级目录
     * @param id 要删除的一级目录的id
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/deleteDicaType")
    public @ResponseBody
    ResultDTO deleteDicaType(Integer id,HttpSession session) {
        ResultDTO<Integer> resultDTO=new ResultDTO<>();
        try {
            UserView loginUser = (UserView) session.getAttribute("user");
            diseaseService.deleteDicaType(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除一级目录成功");
            resultDTO.setData(id);

        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除一级目录失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 修改一级目录
     * @param constantitem 要修改的一级目录信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/updateDicaType")
    public @ResponseBody
    ResultDTO changeDicaType( ConstantItem constantitem, HttpSession session) {
        ResultDTO<ConstantItem> resultDTO=new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 1, 22)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.changeDicaType(constantitem,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改一级目录成功");
                resultDTO.setData(constantitem);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("一级目录名重复，修改一级目录失败");
                resultDTO.setData(constantitem);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改一级目录失败");
            resultDTO.setData(constantitem);
        }
        return resultDTO;
    }

    /**
     * 添加二级目录
     * @param diseasecategory 要添加的二级目录
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/addDiseaseCategory")
    public @ResponseBody
    ResultDTO addDiseaseCategory(DiseaseCategory diseasecategory, HttpSession session) {
        ResultDTO<DiseaseCategory> resultDTO=new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseCategoryContent(diseasecategory, 0)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.addDiseaseCategory(diseasecategory,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加二级目录成功");
                resultDTO.setData(diseasecategory);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("二级目录名重复，添加二级目录失败");
                resultDTO.setData(diseasecategory);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加二级目录失败");
            resultDTO.setData(diseasecategory);
        }
        return resultDTO;
    }


    /**
     * 修改二级目录
     * @param diseasecategory 要修改的二级目录信息
     * @param session HttpSession会话
     * @return resultDTO
     */
    @RequestMapping("/updateDiseaseCategory")
    public @ResponseBody
    ResultDTO updateDiseaseCategory(DiseaseCategory diseasecategory, HttpSession session) {
        ResultDTO<DiseaseCategory> resultDTO=new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseCategoryContent(diseasecategory, 1)) {
                UserView loginUser = (UserView) session.getAttribute("user");
                diseaseService.changeDiseaseCategory(diseasecategory,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改二级目录成功");
                resultDTO.setData(diseasecategory);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("二级目录名重复，修改二级目录失败");
                resultDTO.setData(diseasecategory);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改二级目录失败");
            resultDTO.setData(diseasecategory);
        }
        return resultDTO;
    }

    /**
     * 删除二级目录
     * @param id 要删除的二级目录的id
     * @param session HttpSession会话
     * @return
     */
    @RequestMapping("/deleteDiseaseCategory")
    public @ResponseBody
    ResultDTO deleteDiseaseCategory(Integer id,HttpSession session) {
        ResultDTO<Integer> resultDTO=new ResultDTO<>();
        try {
            UserView loginUser = (UserView) session.getAttribute("user");
            diseaseService.deleteDiseaseCategory(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除二级目录成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，删除二级目录失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 获得所有疾病的名称和编码
     * @return resultDTO
     */
    @RequestMapping("/findAllDiseaseNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllDiseaseNamesAndCodes() {
        System.out.println("start");
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = diseaseService.getAllDiseaseNamesAndDeptCodes();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得疾病搜索列表成功");
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得疾病搜索列表失败");
            e.printStackTrace();
        }
        return resultDTO;

    }

    /**
     * 获得所有疾病分类类别的名称和编码
     * @return resultDTO
     */
    @RequestMapping("/findAllDicaTypeNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllDicaTypeNamesAndCodes() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = diseaseService.findALLDicaType();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得疾病分类类别搜索列表成功");
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得疾病分类类别搜索列表失败");
        }
        return resultDTO;

    }

    /**
     * 获得所有疾病分类的名称和编码
     * @return resultDTO
     */
    @RequestMapping("/findAllDiseaseCategoryNamesAndCodes")
    public @ResponseBody
    ResultDTO getAllDiseaseCategoryNamesAndCodes() {
        ResultDTO<List<NameCodeDTO>> resultDTO = new ResultDTO<>();
        try {
            List<NameCodeDTO> list = diseaseService.findALLDiseaseCategory();
            resultDTO.setStatus("OK");
            resultDTO.setData(list);
            resultDTO.setMsg("获得疾病分类搜索列表成功");
        } catch (Exception e) {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("获得疾病分类搜索列表失败");
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
            File file = diseaseService.createExcel();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建疾病XLS文件信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建疾病XLS文件信息失败");

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
                System.out.println("tset");
                UserView user = (UserView) session.getAttribute("adminUser");
                System.out.println(user.getId());
                if(diseaseService.uploadXls(file, user.getId(),errorHappenContinue,repeatCoverage)){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("上传疾病信息成功");
                }else{
                    resultDTO.setStatus("WARN");
                    resultDTO.setMsg("文件部分内容出错");
                }

            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("上传疾病信息失败");
                e.printStackTrace();
            }

        } else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("上传疾病信息失败");
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
            File file = diseaseService.createXLSTemplate();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建疾病XLS文件模板成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建疾病XLS文件模板失败");
            e.printStackTrace();

        }
        return resultDTO;
    }


}
