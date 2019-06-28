package edu.neu.hospital.controller.finaceController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ExpenseClass;
import edu.neu.hospital.bean.finaceBean.ExpenseClassView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.finaceService.ExpenseclassService;
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
@RequestMapping("expenseclass")
@CrossOrigin
public class ExpenseclassController {
    @Resource
    ExpenseclassService expenseclassService;

    /**
     * 创建excel文件
     *
     * @return resultDTO
     */
    @RequestMapping("/createXLS")
    public @ResponseBody
    ResultDTO<String> createXLS(){
        ResultDTO<String> resultDTO=new ResultDTO<>();
        try {
            File file=expenseclassService.createExcle();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("创建excel文件成功");
            resultDTO.setData(file.getName());
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建excel文件失败");
        }
        return resultDTO;
    }

    @RequestMapping("/upload")
    public @ResponseBody
    ResultDTO<String> upload(MultipartFile file, boolean errorHappenContinue,
                             boolean repeatCoverage, HttpSession session)  throws IOException {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        if (!file.isEmpty()){
            try {
                UserView user = (UserView) session.getAttribute("financeUser");
                if(expenseclassService.uploadXls(file, user.getId(),errorHappenContinue,repeatCoverage)){
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("上传费用类型信息成功");
                }else{
                    resultDTO.setStatus("WARN");
                    resultDTO.setMsg("文件部分内容出错");
                }

            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("上传费用类型信息失败");
                e.printStackTrace();
            }
        }else {
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("上传费用类型信息失败");
        }
        return resultDTO;
    }

    @RequestMapping("/createTemplate")
    public @ResponseBody
    ResultDTO createTemplate() {
        System.out.println("开始创建模板");
        ResultDTO<String> resultDTO = new ResultDTO();
        try {
            File file = expenseclassService.createXLSTemplate();
            resultDTO.setStatus("OK");
            resultDTO.setData(file.getName());
            resultDTO.setMsg("创建XLS文件模板成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("创建XLS文件模板失败");
            e.printStackTrace();

        }
        return resultDTO;
    }

    /**
     * 添加
     * @param expenseclass
     * @param session
     * @return
     */
    @RequestMapping("/add")
    public @ResponseBody
    ResultDTO<ExpenseClass> add(ExpenseClass expenseclass , HttpSession session){
        ResultDTO<ExpenseClass> resultDTO = new ResultDTO<>();
        try {
            if(expenseclassService.checkContent(expenseclass,0)){
                UserView loginUser = (UserView) session.getAttribute("financeUser");
                System.out.println("获得session成功");
                expenseclassService.add(expenseclass,loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("添加收费类型成功");
                resultDTO.setData(expenseclass);
            }else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的项目，添加收费类型失败");
                resultDTO.setData(expenseclass);
            }
        }catch (Exception e){
            System.out.println(e);
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，添加收费类型失败");
            resultDTO.setData(expenseclass);
        }
        return resultDTO;
    }

    /**
     * 删除收费类型
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("/deleteById")
    public @ResponseBody ResultDTO<Integer> delete(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO();
        try{
            UserView loginUser=(UserView) session.getAttribute("financeUser");
            expenseclassService.deleteById(id,loginUser.getId());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除收费类型成功");
            resultDTO.setData(id);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("删除收费类型失败");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 批量删除
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody ResultDTO<IdDTO>
    deleteByChoose(@RequestBody IdDTO id, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO();
        System.out.println(id==null);
        System.out.println(id.getId());
        if(id.getId() != null) {
            try {
                UserView loginUser = (UserView) session.getAttribute("financeUser");
                expenseclassService.deleteByChoose(id, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除收费类型成功");
                resultDTO.setData(id);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除收费类型失败");
                resultDTO.setData(id);
            }
        }else{
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选择你要删除的收费类型");
            resultDTO.setData(id);
        }
        return resultDTO;
    }

    /**
     * 更新
     * @param expenseclass
     * @param session
     * @return
     */
    @RequestMapping("/update")
    public @ResponseBody ResultDTO<ExpenseClass>
    update(ExpenseClass expenseclass , HttpSession session){
        ResultDTO<ExpenseClass> resultDTO = new ResultDTO<>();
        try{
            if(expenseclassService.checkContent(expenseclass,1)) {
                UserView loginUser = (UserView) session.getAttribute("financeUser");
                expenseclassService.change(expenseclass, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("修改收费类型成功");
                resultDTO.setData(expenseclass);
            }
            else{
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("存在重复的项目，修改收费类型失败");
                resultDTO.setData(expenseclass);
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，修改收费类型失败");
            resultDTO.setData(expenseclass);
        }
        return resultDTO;
    }

    /**
     * 按名称或code模糊查找
     * @param code
     * @param name
     * @param pageNum 第几页
     * @param pageSize 页大小
     * @return
     */
    @RequestMapping("/find")
    public @ResponseBody ResultDTO<PageInfo>
    find(String code, String name,Integer pageNum,Integer pageSize){
        ResultDTO<PageInfo> resultDTO=new ResultDTO();
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<ExpenseClassView> expenseClassViews = expenseclassService.find(code,name);
            PageInfo<ExpenseClassView> list=new PageInfo<>(expenseClassViews);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查找收费类型成功");
            resultDTO.setData(list);
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，查找收费类型目失败");
        }
        return resultDTO;
    }
}
