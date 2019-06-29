package edu.neu.hospital.service.MedicalTechService;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.disposalBean.*;
import edu.neu.hospital.dto.IdDTO;


import java.util.Date;
import java.util.List;

public interface DisposalService {
    /**
     *处置搜索表单信息
     *
     * @param search   处置搜索表单搜索框的内容
     * @param date  处置搜索表单限制日期
     * @param itemName  处置搜索表单项目名称
     * @param mark      处置表单项目标识
     * @return 处置搜索结果表单信息
     */
    List<DisposalFormView> disposalformview(String search, Date date, String itemName, Integer mark);


    /**
     * searchFMedItem
     *
     * @return 非药品项目列表
     */
     List<FMedItem> searchFMedItem();

    /**
     * 处置审查表单信息
     *
     * @param disposalionDetailsID 处置审查表单处置关联编号
     * @return 处置审查表单信息
     */
    List<DisposalReView> disposalreview(Integer disposalionDetailsID);

    /**
     * 查询项目材料
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    List<DisposalMatReView> disposalmatreview(Integer itemsDetailID );

    /**
     * 查询项目药品
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    List<DisposalMedReView> disposalmedreview(Integer itemsDetailID );

    /**
     * 组套查询相关药品
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 药品列表
     */
    List<DisposalMedPlateView> disposalmedplateview(String fMedItemName, String search);



    /**
     * 组套查询相关材料
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 材料列表
     */
    List<DisposalMatPlateView> disposalmatplateview(String fMedItemName, String search);


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
     */
    void updateMedMat(MedicinesMaterialsList medicinesmaterialslist,Integer userID);

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
     * 完成审核处置项目表单信息
     *
     * @param disposalDetailsID 药品材料关联编号列表
     */
    void approvedisposalDetails(Integer disposalDetailsID);


    /**
     * 登记处置项目表单信息
     *
     * @param disposalDetailsID 药品材料关联编号列表
     */
     String registerdisposalDetails(Integer disposalDetailsID);

    /**
     * 完成处置
     *
     * @param disposalionDetailsID 处置详情ID
     */
    void finishDisposal(Integer disposalionDetailsID);
}
