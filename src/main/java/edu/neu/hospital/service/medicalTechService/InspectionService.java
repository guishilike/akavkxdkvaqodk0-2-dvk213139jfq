package edu.neu.hospital.service.MedicalTechService;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.inspectionBean.*;
import edu.neu.hospital.dto.IdDTO;

import java.util.Date;
import java.util.List;

public interface InspectionService {
    /**
     *检查搜索表单信息
     *
     * @param search   检查搜索表单搜索框的内容
     * @param date  检查搜索表单限制日期
     * @param itemID 检查搜索表单项目名称
     * @param mark      检查表单项目标识
     * @return 检查搜索结果表单信息
     */
    List<InspectFormView> inspectformview(String search, Date date, Integer itemID, Integer mark);


    /**
     * searchFMedItem
     *
     * @return 非药品项目列表
     */
    List<FMedItem> searchFMedItem();


    /**
     * 检查审查表单信息
     *
     * @param inspectionDetailsID 检查审查表单检查关联编号
     * @return 检查审查表单信息
     */
    List<InspectReView> inspectreview(Integer inspectionDetailsID);


    /**
     * 组套查询相关药品
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 药品列表
     */
    List<InspectMedPlateView> inspectmedplateview(String fMedItemName, String search);



    /**
     * 组套查询相关材料
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 材料列表
     */
    List<InspectMatPlateView> inspectmatplateview(String fMedItemName, String search);

    /**
     * 查询项目材料
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    List<InspectMatReView> inspectmatreview(Integer itemsDetailID );

    /**
     * 查询项目药品
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    List<InspectMedReView> inspectmedreview(Integer itemsDetailID );

    /**
     *删除药品材料表单信息
     *
     * @param medMatListID  药品材料关联编号
     */
    void deleteMedMat(Integer medMatListID,Integer userID);

    /**
     *批量删除药品材料表单信息
     *
     * @param medMatListIDs  药品材料关联编号列表
     */
    void deleteMedMatByList(IdDTO medMatListIDs,Integer userID);


    /**
     *修改药品材料表单信息
     *
     * @param medicinesmaterialslist  药品材料表单信息
     * @return 修改药品材料结果
     */
    String updateMedMat(MedicinesMaterialsList medicinesmaterialslist,Integer userID);

    /**
     *搜索药品信息
     *
     * @param search  药品表单信息
     * @return 药品信息
     */
    List<Drugs> searchDrugs(String search);

    /**
     * 搜索材料信息
     *
     * @param search 材料表单信息
     * @return 材料信息
     */
    List<Materials> searchMaterials(String search);

    /**
     *添加药品材料表单信息
     *
     * @param medicinesmaterialslist  药品材料表单信息
     * @return 添加药品材料结果
     */
    String insertMedMat(Integer userID, MedicinesMaterialsList medicinesmaterialslist);

    /**
     *批准材料表单信息
     *
     * @param matListIDs 药品材料关联编号列表
     */
    void approveMat(IdDTO matListIDs, Integer userID);
    /**
     *批准药品表单信息
     *
     * @param medListIDs 药品材料关联编号列表
     */
    void approveMed(IdDTO medListIDs, Integer userID);

    /**
     * 完成审核检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     * @return 审核结果
     */
    String approveInspectionDetails(Integer inspectionDetailsID);


    /**
     * 登记检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     * @return  登记结果
     */
   String registerInspectionDetails(Integer inspectionDetailsID);


    /**
     * 导入检查结果表单
     *
     * @param inspectionresultWithBLOBs 检查结果
     * @param userID 录入结果用户
     * @return 检查结果表单
     */
    InspectionResultWithBLOBs  importInspectResult(InspectionResultWithBLOBs inspectionresultWithBLOBs, Integer userID);

    /**
     * 重新导入检查结果表单
     *
     * @param  inspectionresultWithBLOBs 检查结果
     * @param userID 删除检查结果用户编号
     * @return 检查结果表单
     */
    InspectionResultWithBLOBs updateInspectResult(InspectionResultWithBLOBs inspectionresultWithBLOBs,Integer userID);

    /**
     * 导入检查结果图片
     *
     * @param inspectionresultimage 结果图片信息
     * @param userID 导入图片用户
     */

    void  importInspectResultImages(InspectionResultImage inspectionresultimage, Integer userID);

    /**
     * 删除检查结果图片
     *
     * @param  catalog 图片名称
     * @param  userID 删除检查结果图片用户编号
     */
    void  deleteInspectResultImages(String catalog,Integer userID);

    /**
     * 完成检查
     *
     * @param inspectionDetailsID 检查详情ID
     */
    void finishInspection(Integer inspectionDetailsID);


}
