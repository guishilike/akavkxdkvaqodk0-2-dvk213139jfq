package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;

import java.util.List;

public interface ApplyPrescriptionService {
    //1.	增方
    public boolean addPrescription(Prescription prescription, Integer userID);
    //2.	暂存处方
    public void tmpStore(DataListDTO prescriptionDetails);
    //3.	发送处方(相当于开立
    public boolean drawPrescription(Integer prescriptionID, Integer userID);
    //4.	删除处方
    public boolean deletePrescription(Integer prescriptionID, Integer userID);
    //5.	作废处方
    public  boolean abolishPrescription(Integer prescriptionID, Integer userID);
    //6.	增药、删药：在某个处方中，增加或删除药品。
    // 已发送的处方中，不能再增药或删药。：在增药时，取这个处方的ID，取处方里药的ID，若isDrawn则不能增
    public boolean addDrugs(Integer prescriptionID, PrescriptionDetail prescriptionDetail, Integer userID);
    public   boolean deleteDrugs(Integer prescriptionID, Integer prescriptionDetailID, Integer userID);

    //模糊查询
    public List<Drugs>  searchDrugs(String str);

    //7.	存为组套
    public Integer saveTemplate(ProjectTemplate projectTemplate, Integer userID);
    public boolean  saveTemplateDetails(DataListDTO lists, Integer userID);
    //8	引用组套
    public ProjectTemplate use_Check(Integer projectTemplateID);

    //9.	常用药管理
    public CommonDrugs useCommonDrugs(Integer commonDrugsID);

}
