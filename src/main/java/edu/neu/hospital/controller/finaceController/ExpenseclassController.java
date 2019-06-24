package edu.neu.hospital.controller.finaceController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.ExpenseClass;
import edu.neu.hospital.bean.finaceBean.ExpenseClassView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.finaceService.ExpenseclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("expenseclass")
@CrossOrigin
public class ExpenseclassController {
    @Autowired
    ExpenseclassService expenseclassService;

    /**
     * 获取excel文件
     * @return resultDTO
     */
    @RequestMapping("/getExcel")
    public @ResponseBody
    ResultDTO<String> getExcel(){
        ResultDTO<String> resultDTO=new ResultDTO<>();
        try {
            File file=expenseclassService.createExcle();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功");
            resultDTO.setData(file.getName());
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
        }
        return resultDTO;
    }

    @RequestMapping("/uploadXls")
    public @ResponseBody
    ResultDTO<String> upload(MultipartFile file){
        ResultDTO<String> resultDTO=new ResultDTO<>();
        try {
            int i = expenseclassService.uploadXls(file);
            if(i != -1){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功");
                resultDTO.setData(file.getName());
            }
            else {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("文件类型错误");
                resultDTO.setData(file.getName());
            }
        }catch (Exception e){
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("发生异常，操作失败");
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
                UserView loginUser = (UserView) session.getAttribute("user");
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
    @RequestMapping("/delete")
    public @ResponseBody ResultDTO<Integer> delete(Integer id,HttpSession session){
        ResultDTO<Integer> resultDTO=new ResultDTO();
        try{
            UserView loginUser=(UserView) session.getAttribute("user");
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
     * @param ids
     * @param session
     * @return
     */
    @RequestMapping("/deleteByChoose")
    public @ResponseBody ResultDTO<IdDTO>
    deleteByChoose(IdDTO ids, HttpSession session){
        ResultDTO<IdDTO> resultDTO=new ResultDTO();
        if(ids.getId()!=null) {
            try {
                UserView loginUser = (UserView) session.getAttribute("user");
                expenseclassService.deleteByChoose(ids, loginUser.getId());
                resultDTO.setStatus("OK");
                resultDTO.setMsg("批量删除收费类型成功");
                resultDTO.setData(ids);
            } catch (Exception e) {
                resultDTO.setStatus("FALSE");
                resultDTO.setMsg("发生异常，批量删除收费类型失败");
                resultDTO.setData(ids);
            }
        }else{
            resultDTO.setStatus("FALSE");
            resultDTO.setMsg("请先选择你要删除的收费类型");
            resultDTO.setData(ids);
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
                UserView loginUser = (UserView) session.getAttribute("user");
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
