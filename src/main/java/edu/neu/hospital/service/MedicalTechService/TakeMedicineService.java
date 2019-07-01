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
     * @param startDate   取药搜索表单限制开始日期
     * @param endDate 取药搜索表单限制结束日期
     * @return 取药搜索结果表单信息
     */

    List<TakeMedicineFormView> takemedicineformview(String search, Date startDate,Date endDate);

    /**
     * 显示处方详情
     *
     * @param prescriptionID 处方ID
     * @param mark 取药标记
     * @return 处方详情
     */
    List<TakeMedDetailsView> takemeddetailsview(Integer prescriptionID,Integer mark);

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
