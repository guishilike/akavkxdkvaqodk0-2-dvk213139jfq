package edu.neu.hospital.service.MedicalTechService;

import edu.neu.hospital.bean.takeMedicineBean.TakeMedDetailsView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedicineFormView;
import edu.neu.hospital.dto.IdDTO;

import java.util.Date;
import java.util.List;

public interface TakeMedicineService {
    /**
     * 取药搜索表单信息
     *
     * @param search 取药搜索表单搜索框的内容
     * @param date   取药搜索表单限制日期
     * @param mark   取药表单项目标识
     * @return 取药搜索结果表单信息
     */

    List<TakeMedicineFormView> takemedicineformview(String search, Date date, Integer mark);

    /**
     * 显示处方详情
     *
     * @param prescriptionDetailID 处方ID
     * @return 处方详情
     */
    List<TakeMedDetailsView> takemeddetailsview(Integer prescriptionDetailID);

    /**
     * 批量取药
     *
     * @param presdetailsIDs 取药编号列表
     * @param userID 取药人编号
     */
    void takeMedicine(IdDTO presdetailsIDs, Integer userID);

    /**
     * 批量退药
     *
     * @param  presdetailsIDs 退药编号列表
     * @param userID 退药人编号
     */
    void withdrawMedicine(IdDTO presdetailsIDs, Integer userID);
}
