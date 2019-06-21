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
     * @param itemName  检查搜索表单项目名称
     * @param mark      检查表单项目标识
     * @return 检查搜索结果表单信息
     */
    List<InspectFormView> inspectformview(String search, Date date, String itemName, Integer mark);

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
     *删除药品材料表单信息
     *
     * @param medMatListID  药品材料关联编号
     */
    void deleteMedMat(Integer medMatListID);

    /**
     *批量删除药品材料表单信息
     *
     * @param medMatListIDs  药品材料关联编号列表
     */
    void deleteMedMatByList(IdDTO medMatListIDs);


    /**
     *修改药品材料表单信息
     *
     * @param medicinesmaterialslist  药品材料表单信息
     */
    void updateMedMat(MedicinesMaterialsList medicinesmaterialslist);

    /**
     *搜索药品信息
     *
     * @param search  药品表单信息
     */
    List<Drugs> searchDrugs(String search);

    /**
     * 搜索材料信息
     *
     * @param search 材料表单信息
     */
    List<Materials> searchMaterials(String search);

    /**
     *添加药品材料表单信息
     *
     * @param medicinesmaterialslist  药品材料表单信息
     */
    void insertMedMat(Integer userID, MedicinesMaterialsList medicinesmaterialslist);

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
     * 导入检查结果表单
     *
     * @param inspectionresultWithBLOBs 检查结果
     * @param userID 录入结果用户
     */
    void  importInspectResult(InspectionResultWithBLOBs inspectionresultWithBLOBs, Integer userID);

    /**
     * 删除检查结果表单
     *
     * @param  inspectionresultWithBLOBsID 检查结果编号
     */
    void deleteInspectResult(Integer inspectionresultWithBLOBsID);

    /**
     * 导入检查结果图片
     *
     * @param inspectionresultimage 结果图片信息
     * @param userID 导入图片用户
     * @param catalog  图片名称
     */

    void  importInspectResultImages(InspectionResultImage inspectionresultimage, Integer userID, String catalog);

    /**
     * 删除检查结果图片
     *
     * @param  catalog 图片名称
     */
    void  deleteInspectResultImages(String catalog);

    /**
     * 完成检查
     *
     * @param inspectionDetailsID 检查详情ID
     */
    void finishInspection(Integer inspectionDetailsID);


}
