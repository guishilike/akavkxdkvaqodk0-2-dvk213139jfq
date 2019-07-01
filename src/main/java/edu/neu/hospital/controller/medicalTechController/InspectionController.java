package edu.neu.hospital.controller.medicalTechController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.inspectionBean.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.MedicalTechService.InspectionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Controller
@RequestMapping("inspection")

public class InspectionController{
    @Resource
    private InspectionService inspectionService;

    @RequestMapping("/inspectformview")
    public @ResponseBody
    ResultDTO<PageInfo<InspectFormView>> inspectformview(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date, Integer itemID, Integer mark, Integer pageNum, Integer pageSize){

        ResultDTO<PageInfo<InspectFormView>> resultDTO = new ResultDTO<>();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<InspectFormView> inspectFormViewList =inspectionService.inspectformview(search,date,itemID,mark);
            PageInfo<InspectFormView> inspectformviewPageInfo = new PageInfo<>(inspectFormViewList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectformviewPageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * searchFMedItem
     *
     * @return 非药品项目列表
     */
    @RequestMapping("/searchFMedItem")
    public @ResponseBody ResultDTO<List<FMedItem>> searchFMedItem(){
        ResultDTO<List<FMedItem>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.searchFMedItem());
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/inspectreview")
    public  @ResponseBody ResultDTO<List<InspectReView>> inspectreview(Integer inspectionDetailsID){
        ResultDTO<List<InspectReView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.inspectreview(inspectionDetailsID));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 查询项目材料
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    @RequestMapping("/inspectmatreview")
    public @ResponseBody
    ResultDTO<List<InspectMatReView>> inspectmatreview(Integer itemsDetailID ){
        ResultDTO<List<InspectMatReView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.inspectmatreview(itemsDetailID));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 查询项目药品
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    @RequestMapping("/inspectmedreview")
    public @ResponseBody
    ResultDTO<List<InspectMedReView>> inspectmedreview(Integer itemsDetailID ){
        ResultDTO<List<InspectMedReView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.inspectmedreview(itemsDetailID));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 组套查询相关药品
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 药品列表
     */
    @RequestMapping("/inspectmedplateview")

    public @ResponseBody ResultDTO<List<InspectMedPlateView>> inspectmedplateview(String fMedItemName, String search){
        ResultDTO<List<InspectMedPlateView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.inspectmedplateview(fMedItemName,search));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }



    /**
     * 组套查询相关材料
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 材料列表
     */
    @RequestMapping("/inspectmatplateview")
    public @ResponseBody ResultDTO<List<InspectMatPlateView>> inspectmatplateview(String fMedItemName, String search){
        ResultDTO<List<InspectMatPlateView>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.inspectmatplateview(fMedItemName,search));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }



    /**
     *删除药品材料表单信息
     *
     * @param medMatListID  药品材料关联编号
     */
    @RequestMapping("/deleteMedMat")
    public @ResponseBody ResultDTO deleteMedMat(Integer medMatListID,HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.deleteMedMat(medMatListID,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     *批量删除药品材料表单信息
     *
     * @param medMatListIDs  药品材料关联编号列表
     */
    @RequestMapping("/deleteMedMatByList")
    public @ResponseBody ResultDTO deleteMedMatByList(@RequestBody IdDTO medMatListIDs,HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.deleteMedMatByList(medMatListIDs,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     *修改药品材料表单信息
     *
     * @param medicinesmaterialslist  药品材料表单信息
     */
    @RequestMapping("/updateMedMat")
    public @ResponseBody ResultDTO updateMedMat(@RequestBody MedicinesMaterialsList medicinesmaterialslist,HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.updateMedMat(medicinesmaterialslist,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     *搜索药品信息
     *
     * @param search  药品表单信息
     */

    @RequestMapping("/searchDrugs")
    public  @ResponseBody ResultDTO<List<Drugs>> searchDrugs(String search){
        ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.searchDrugs(search));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 搜索材料信息
     *
     * @param search 材料表单信息
     */
    @RequestMapping("/searchMaterials")
    public @ResponseBody
    ResultDTO<List<Materials>> searchMaterials(String search){
        ResultDTO<List<Materials>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.searchMaterials(search));
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     *添加药品材料表单信息
     *
     * @param medicinesmaterialslist  药品材料表单信息
     * @param session 会话
     */
    @RequestMapping("/insertMedMat")
    public @ResponseBody
    ResultDTO insertMedMat(HttpSession session,@RequestBody MedicinesMaterialsList medicinesmaterialslist){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.insertMedMat(userID,medicinesmaterialslist);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     *批准材料表单信息
     *
     * @param matListIDs 药品材料关联编号列表
     * @param session 会话
     */
    @RequestMapping("/approveMat")
    public @ResponseBody
    ResultDTO approveMat(@RequestBody IdDTO matListIDs,HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.approveMat(matListIDs,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     *批准药品表单信息
     *
     * @param medListIDs 药品材料关联编号列表
     */
    @RequestMapping("/approveMed")
    public @ResponseBody
    ResultDTO approveMed(@RequestBody IdDTO medListIDs, HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.approveMed(medListIDs,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }



    /**
     * 完成审核检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     */
    @RequestMapping("/approveInspectionDetails")
    public @ResponseBody
    ResultDTO approveInspectionDetails(Integer inspectionDetailsID){
        ResultDTO resultDTO = new ResultDTO();
        try {
            String msg=inspectionService.approveInspectionDetails(inspectionDetailsID);
            if(msg.equals("完成审核")){
            resultDTO.setStatus("OK");
            resultDTO.setMsg(msg);
            }else {
                resultDTO.setStatus("WARN");
                resultDTO.setMsg(msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }



    /**
     * 登记检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     * @return  登记结果
     */
    @RequestMapping("/registerInspectionDetails")
    public @ResponseBody
    ResultDTO registerInspectionDetails(Integer inspectionDetailsID){
        ResultDTO resultDTO = new ResultDTO();
        try {

          String msg=inspectionService.registerInspectionDetails(inspectionDetailsID);
          if (msg.equals("检查检验登记成功")) {
              resultDTO.setStatus("OK");
              resultDTO.setMsg(msg);
          }else {
              resultDTO.setStatus("NG");
              resultDTO.setMsg(msg);
          }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }



    /**
     * 导入检查结果表单
     *
     * @param inspectionresultWithBLOBs 检查结果
     * @param session 会话
     */
    @RequestMapping("/importInspectResult")
    public @ResponseBody
    ResultDTO<InspectionResultWithBLOBs>  importInspectResult(@RequestBody InspectionResultWithBLOBs inspectionresultWithBLOBs, HttpSession session){
        ResultDTO<InspectionResultWithBLOBs> resultDTO = new ResultDTO<>();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();

            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData( inspectionService.importInspectResult(inspectionresultWithBLOBs,userID));

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 重新录入检查结果表单
     *
     * @param  inspectionresultWithBLOBs 检查结果编号
     * @param  session 会话
     */
    @RequestMapping("/updateInspectResult")
    public @ResponseBody
    ResultDTO<InspectionResultWithBLOBs> deleteInspectResult(@RequestBody InspectionResultWithBLOBs inspectionresultWithBLOBs,HttpSession session){
        ResultDTO<InspectionResultWithBLOBs> resultDTO = new ResultDTO<>();
        try {
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            resultDTO.setData(inspectionService.updateInspectResult(inspectionresultWithBLOBs,userID));


        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }


    /**
     * 导入检查结果图片
     *
     * @param inspectionresultimage 结果图片信息
     * @param session 会话
     */
    @RequestMapping("/importInspectResultImages")
    public @ResponseBody ResultDTO importInspectResultImages(@RequestBody InspectionResultImage inspectionresultimage, HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
                UserView user= (UserView) session.getAttribute("user");
                Integer userID=user.getId();
                inspectionService.importInspectResultImages(inspectionresultimage,userID);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }




    /**
     * 上传检查结果图片
     *
     * @param pic 图片对象
     */
    @RequestMapping("/uploadInspectResultImages")
    public @ResponseBody ResultDTO<String> uploadInspectResultImages(MultipartFile pic){
        ResultDTO<String> resultDTO = new ResultDTO<>();
        try {
            if (!pic.isEmpty() && !Objects.requireNonNull(pic.getOriginalFilename()).isEmpty() && !pic.getOriginalFilename().equals("")) {
                String uuid = UUID.randomUUID().toString();
                String fileName = pic.getOriginalFilename();
                String suffixName = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                String newFileName = uuid + "." + suffixName;
                File file = new File(ResourceUtils.getURL("classpath:").getPath() + "static/images/" + newFileName);
                pic.transferTo(file);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(newFileName);

            }else{
                resultDTO.setStatus("NG");
                resultDTO.setMsg("图片为空！");
                resultDTO.setData(null);
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }






    /**
     * 删除检查结果图片
     *
     * @param  catalog 图片名称
     * @param  session 会话
     */
    @RequestMapping("/deleteInspectResultImages")
    public @ResponseBody
    ResultDTO  deleteInspectResultImages(String catalog,HttpSession session){
        ResultDTO resultDTO = new ResultDTO();
        try {
            String url=ResourceUtils.getURL("classpath:").getPath() + "static/images/"+catalog;
            File file=new File(url);

            boolean delete = file.delete();
            if(delete){
            UserView user= (UserView) session.getAttribute("user");
            Integer userID=user.getId();
            inspectionService.deleteInspectResultImages(catalog,userID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");
            }else {
                resultDTO.setStatus("NG");
                resultDTO.setMsg("删除失败！");
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }

    /**
     * 完成检查
     *
     * @param inspectionDetailsID 检查详情ID
     */
    @RequestMapping("/finishInspection")
    public @ResponseBody
    ResultDTO finishInspection(Integer inspectionDetailsID){
        ResultDTO resultDTO = new ResultDTO();
        try {
            inspectionService.finishInspection(inspectionDetailsID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("操作成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("NG");
            resultDTO.setMsg("操作失败！");
        }
        return resultDTO;
    }




    @RequestMapping("/upload")
    public String upload(){
         return "upload";
    }







}

