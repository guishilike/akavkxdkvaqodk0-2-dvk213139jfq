package edu.neu.hospital.controller.baseController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.DiseaseView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.DiseaseCategory;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.baseService.ConstantService;
import edu.neu.hospital.service.baseService.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("disease")
@CrossOrigin
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;
    @Autowired
    ConstantService constantService;

    /**
     * 查找疾病
     *
     * @param diseaseCategoryID 疾病类型id
     * @param pageNum           第几页
     * @param pageSize          页大小
     * @return resultDTO
     */
    @RequestMapping("/findByCategory")
    public @ResponseBody
    ResultDTO findDiseasesByCategory(Integer diseaseCategoryID, int pageNum, int pageSize) {
        ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<DiseaseView> diseaseviews = diseaseService.findDiseasesByCategory(diseaseCategoryID);
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
    @RequestMapping("/deleteById")
    public @ResponseBody
    ResultDTO
    deleteById(Integer id, HttpSession session) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            User loginUser = (User) session.getAttribute("user");
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
                User loginUser = (User) session.getAttribute("user");
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
    ResultDTO update(@RequestBody Disease disease, HttpSession session) {
        ResultDTO<Disease> resultDTO = new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseContent(disease, 1)) {
                User loginUser = (User) session.getAttribute("user");
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
    add(@RequestBody Disease disease, HttpSession session) {
        ResultDTO<Disease> resultDTO=new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseContent(disease, 0)) {
                User loginUser = (User) session.getAttribute("user");
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
        ResultDTO<List<DiseaseCategory>> resultDTO=new ResultDTO<>();
        try {
            List<DiseaseCategory> diseasecategories = diseaseService.findAllDiseaseCategoryByDicaTypeID(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(diseasecategories);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("操作成功");
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
    ResultDTO addDicaType(@RequestBody ConstantItem constantitem, HttpSession session) {
        ResultDTO<ConstantItem> resultDTO=new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 0, 22)) {
                User loginUser = (User) session.getAttribute("user");
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
            User loginUser = (User) session.getAttribute("user");
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
    ResultDTO changeDicaType(@RequestBody ConstantItem constantitem, HttpSession session) {
        ResultDTO<ConstantItem> resultDTO=new ResultDTO<>();
        try {
            if (constantService.checkContent(constantitem, 1, 22)) {
                User loginUser = (User) session.getAttribute("user");
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
    ResultDTO addDiseaseCategory(@RequestBody DiseaseCategory diseasecategory, HttpSession session) {
        ResultDTO<DiseaseCategory> resultDTO=new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseCategoryContent(diseasecategory, 0)) {
                User loginUser = (User) session.getAttribute("user");
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
    ResultDTO updateDiseaseCategory(@RequestBody DiseaseCategory diseasecategory, HttpSession session) {
        ResultDTO<DiseaseCategory> resultDTO=new ResultDTO<>();
        try {
            if (diseaseService.checkDiseaseCategoryContent(diseasecategory, 1)) {
                User loginUser = (User) session.getAttribute("user");
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
            User loginUser = (User) session.getAttribute("user");
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

}
