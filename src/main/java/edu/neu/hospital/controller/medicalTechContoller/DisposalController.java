package edu.neu.hospital.controller.medicalTechContoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.bean.basicTableBean.Materials;
import edu.neu.hospital.bean.basicTableBean.MedicinesMaterialsList;
import edu.neu.hospital.bean.disposalBean.DisposalFormView;
import edu.neu.hospital.bean.disposalBean.DisposalMatPlateView;
import edu.neu.hospital.bean.disposalBean.DisposalMedPlateView;
import edu.neu.hospital.bean.disposalBean.DisposalReView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.ResultDTO;
import edu.neu.hospital.service.MedicalTechService.DisposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;




@Controller
@RequestMapping("/disposal")
public class DisposalController {



    public class disposalController {
        @Autowired
        private DisposalService disposalService;

        @RequestMapping("/disposalformview")
        public @ResponseBody
        ResultDTO<PageInfo> disposalformview(String search, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date, String itemName, Integer mark,Integer pageNum,Integer pageSize) {
            ResultDTO<PageInfo> resultDTO = new ResultDTO<>();
            try {
                PageHelper.startPage(pageNum, pageSize);
                List<DisposalFormView> disposalFormViewList =disposalService.disposalformview(search, date, itemName, mark);
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
         */
        @RequestMapping("/deleteMedMat")
        public @ResponseBody
        ResultDTO deleteMedMat(Integer medMatListID) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                disposalService.deleteMedMat(medMatListID);
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
         * 批量删除药品材料表单信息
         *
         * @param medMatListIDs 药品材料关联编号列表
         */
        @RequestMapping("/deleteMedMatByList")
        public @ResponseBody
        ResultDTO deleteMedMatByList(IdDTO medMatListIDs) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                disposalService.deleteMedMatByList(medMatListIDs);
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
         * 修改药品材料表单信息
         *
         * @param medicinesmaterialslist 药品材料表单信息
         */
        @RequestMapping("/updateMedMat")
        public @ResponseBody
        ResultDTO updateMedMat(@RequestBody MedicinesMaterialsList medicinesmaterialslist) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                disposalService.updateMedMat(medicinesmaterialslist);
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
         * 搜索药品信息
         *
         * @param search 药品表单信息
         */

        @RequestMapping("/searchDrugs")
        public @ResponseBody
        ResultDTO<List<Drugs>> searchDrugs(String search) {
            ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
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
         */
        @RequestMapping("/searchMaterials")
        public @ResponseBody
        ResultDTO<List<Materials>> searchMaterials(String search) {
            ResultDTO<List<Materials>> resultDTO = new ResultDTO<>();
            try {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("操作成功！");
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
         */
        @RequestMapping("/insertMedMat")
        public @ResponseBody
        ResultDTO insertMedMat(HttpSession session,@RequestBody MedicinesMaterialsList medicinesmaterialslist) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user = (UserView) session.getAttribute("user");
                Integer userID = user.getId();
                disposalService.insertMedMat(userID, medicinesmaterialslist);
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
         * 批准材料表单信息
         *
         * @param matListIDs 药品材料关联编号列表
         * @param session    会话
         */
        @RequestMapping("/approveMat")
        public @ResponseBody
        ResultDTO approveMat(IdDTO matListIDs, HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user = (UserView) session.getAttribute("user");
                Integer userID = user.getId();
                disposalService.approveMat(matListIDs, userID);
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
         * 批准药品表单信息
         *
         * @param medListIDs 药品材料关联编号列表
         */
        @RequestMapping("/approveMed")
        public @ResponseBody
        ResultDTO approveMed(IdDTO medListIDs, HttpSession session) {
            ResultDTO resultDTO = new ResultDTO();
            try {
                UserView user = (UserView) session.getAttribute("user");
                Integer userID = user.getId();
                disposalService.approveMed(medListIDs, userID);
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
         * 完成处置
         *
         * @param disposalDetailsID 处置详情ID
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
}
