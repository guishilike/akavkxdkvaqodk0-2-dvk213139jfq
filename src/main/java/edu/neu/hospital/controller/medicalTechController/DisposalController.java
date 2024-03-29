package edu.neu.hospital.controller.medicalTechController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.basicTableBean.Materials;
import edu.neu.hospital.bean.basicTableBean.MedicinesMaterialsList;
import edu.neu.hospital.bean.disposalBean.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.medicalTechService.DisposalService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;




@Controller
@RequestMapping("disposal")
public class DisposalController {

        @Resource
        private DisposalService disposalService;

    /**
     *处置搜索表单信息
     *
     * @param search   处置搜索表单搜索框的内容
     * @param date  处置搜索表单限制日期
     * @param itemID 处置搜索表单项目编号
     * @param mark      处置表单项目标识
     * @return 处置搜索结果表单信息
     */
        @RequestMapping("/disposalformview")
        public @ResponseBody
        ResultDTO<PageInfo> disposalformview(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date, Integer itemID, Integer mark,Integer pageNum,Integer pageSize) {
            ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
            try {
                PageHelper.startPage(pageNum, pageSize);
                List<DisposalFormView> disposalFormViewList =disposalService.disposalformview(search, date,itemID, mark);
                PageInfo<DisposalFormView> disposalformviewPageInfo = new PageInfo<>(disposalFormViewList);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(disposalformviewPageInfo);
            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }

        @RequestMapping("/disposalreview")
        public @ResponseBody
        ResultDTO<List<DisposalReView>> disposalreview(Integer disposalDetailsID) {
            ResultDTO<List<DisposalReView>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(disposalService.disposalreview(disposalDetailsID));
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
                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");
                resultDTO.setData(disposalService.searchFMedItem());
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
         * @param fMedItemName 项目名称
         * @param search       搜索内容
         * @return 药品列表
         */
        @RequestMapping("/disposalmedplateview")

        public @ResponseBody
        ResultDTO<List<DisposalMedPlateView>> disposalmedplateview(String fMedItemName, String search) {
            ResultDTO<List<DisposalMedPlateView>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(disposalService.disposalmedplateview(fMedItemName, search));
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
        @RequestMapping("/disposalmatreview")
        public @ResponseBody
        ResultDTO<List<DisposalMatReView>> disposalmatreview(Integer itemsDetailID ){
            ResultDTO<List<DisposalMatReView>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(disposalService.disposalmatreview(itemsDetailID));
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
        @RequestMapping("/disposalmedreview")
        public @ResponseBody
        ResultDTO<List<DisposalMedReView>> disposalmedreview(Integer itemsDetailID ){
            ResultDTO<List<DisposalMedReView>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(disposalService.disposalmedreview(itemsDetailID));
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
         * @param fMedItemName 项目名称
         * @param search       搜索内容
         * @return 材料列表
         */
        @RequestMapping("/disposalmatplateview")
        public @ResponseBody
        ResultDTO<List<DisposalMatPlateView>> disposalmatplateview(String fMedItemName, String search) {
            ResultDTO<List<DisposalMatPlateView>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
                resultDTO.setData(disposalService.disposalmatplateview(fMedItemName, search));
            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }


        /**
         * 删除药品材料表单信息
         *
         * @param medMatListID 药品材料关联编号
         * @return 删除药品材料结果
         */
        @RequestMapping("/deleteMedMat")
        public @ResponseBody
        ResultDTO deleteMedMat(Integer medMatListID,HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user= (UserView) session.getAttribute("medicalTechUser");
                Integer userID=user.getId();
                disposalService.deleteMedMat(medMatListID,userID);
                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");
            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }

        /**
         * 批量删除药品材料表单信息
         *
         * @param medMatListIDs 药品材料关联编号列表
         * @return 批量删除药品材料结果
         */
        @RequestMapping("/deleteMedMatByList")
        public @ResponseBody
        ResultDTO deleteMedMatByList(@RequestBody IdDTO medMatListIDs,HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user= (UserView) session.getAttribute("medicalTechUser");
                Integer userID=user.getId();
                disposalService.deleteMedMatByList(medMatListIDs,userID);
                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");
            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }


        /**
         * 修改药品材料表单信息
         *
         * @param medicinesmaterialslist 药品材料表单信息
         * @return 修改药品材料结果
         */
        @RequestMapping("/updateMedMat")
        public @ResponseBody
        ResultDTO updateMedMat(@RequestBody MedicinesMaterialsList medicinesmaterialslist,HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user= (UserView) session.getAttribute("medicalTechUser");
                Integer userID=user.getId();
               String msg=disposalService.updateMedMat(medicinesmaterialslist,userID);
               if(msg.equals("处置药品材料修改成功")) {
                   resultDTO.setMsg(msg);
                   resultDTO.setStatus("OK");
               }else {
                   resultDTO.setMsg(msg);
                   resultDTO.setStatus("WARN");
               }
            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }

        /**
         * 搜索药品信息
         *
         * @param search 药品表单信息
         * @return 药品信息
         */

        @RequestMapping("/searchDrugs")
        public @ResponseBody
        ResultDTO<List<Drugs>> searchDrugs(String search) {
            ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
            try {

                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");
                resultDTO.setData(disposalService.searchDrugs(search));
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
         * @return 材料信息
         */
        @RequestMapping("/searchMaterials")
        public @ResponseBody
        ResultDTO<List<Materials>> searchMaterials(String search) {
            ResultDTO<List<Materials>> resultDTO = new ResultDTO<>();
            try {

                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");
                resultDTO.setData(disposalService.searchMaterials(search));
            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }


        /**
         * 添加药品材料表单信息
         *
         * @param medicinesmaterialslist 药品材料表单信息
         * @param session                会话
         * @return 添加药品材料信息
         */
        @RequestMapping("/insertMedMat")
        public @ResponseBody
        ResultDTO insertMedMat(HttpSession session,@RequestBody MedicinesMaterialsList medicinesmaterialslist) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user = (UserView) session.getAttribute("medicalTechUser");
                Integer userID = user.getId();
                String msg=disposalService.insertMedMat(userID, medicinesmaterialslist);
                if(msg.equals("处置药品材料添加成功")){
                resultDTO.setMsg(msg);
                resultDTO.setStatus("OK");
                }else{
                    resultDTO.setMsg(msg);
                    resultDTO.setStatus("WARN");
                }

            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }

        /**
         * 批准材料表单信息
         *
         * @param matListIDs 药品材料关联编号列表
         * @param session    会话
         * @return 批准材料信息结果
         */
        @RequestMapping("/approveMat")
        public @ResponseBody
        ResultDTO approveMat(@RequestBody IdDTO matListIDs, HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user = (UserView) session.getAttribute("medicalTechUser");
                Integer userID = user.getId();
                disposalService.approveMat(matListIDs, userID);

                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");

            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }


        /**
         * 批准药品表单信息
         *
         * @param medListIDs 药品材料关联编号列表
         * @return 批准药品信息结果
         */
        @RequestMapping("/approveMed")
        public @ResponseBody
        ResultDTO approveMed(@RequestBody IdDTO medListIDs, HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user = (UserView) session.getAttribute("medicalTechUser");
                Integer userID = user.getId();
                disposalService.approveMed(medListIDs, userID);
                resultDTO.setMsg("操作成功！");
                resultDTO.setStatus("OK");

            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }


        /**
         * 完成审核处置项目表单信息
         *
         * @param disposalDetailsID 药品材料关联编号列表
         * @return 审核结果
         */
        @RequestMapping("/approveDisposalDetails")
        public @ResponseBody
        ResultDTO approveInspectionDetails(Integer disposalDetailsID){
            ResultDTO resultDTO = new ResultDTO();
            try {
                String msg=disposalService.approvedisposalDetails(disposalDetailsID);
                if(msg.equals("完成审核")) {
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg(msg);
                }else{
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
         * 登记处置项目表单信息
         *
         * @param disposalDetailsID 药品材料关联编号列表
         * @return  登记结果
         */
        @RequestMapping("/registerDisposalDetails")
        public @ResponseBody
        ResultDTO registerdisposalDetails(Integer disposalDetailsID){
            ResultDTO resultDTO = new ResultDTO();
            try {
                String msg=disposalService.registerdisposalDetails(disposalDetailsID);
                if (msg.equals("处置登记成功")) {
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
     * 完成处置
     *
     * @param disposalDetailsID 处置详情ID
     * @return 处置结果
     */
        @RequestMapping("/finishDisposal")
        public @ResponseBody
        ResultDTO finishDisposal(Integer disposalDetailsID) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                disposalService.finishDisposal(disposalDetailsID);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");

            } catch (Exception e) {
                e.printStackTrace();
                resultDTO.setStatus("NG");
                resultDTO.setMsg("操作失败！");
            }
            return resultDTO;
        }

}
