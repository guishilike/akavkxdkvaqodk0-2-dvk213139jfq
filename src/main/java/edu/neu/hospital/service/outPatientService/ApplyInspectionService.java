package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;


import java.util.List;

public interface ApplyInspectionService {
    //新建该患者的inspection
    //首先判断Inspection表里是否已经有该病例的检查了
    public boolean checkIsHaven(Integer medicalRecordID);
    public boolean newInspection(Inspection inspection, Integer userID);
    //1.	新增项目
    public int addInspectionDetailsList(Inspection inspection, DataListDTO inspectionDetailsList, Integer userID);
    public int addInspectionDetails(Inspection inspection, InspectionDetails inspectionDetails, Integer userID);
    //模糊查询
    public List<FMedItem> searchInspections(String str) ;
    //2.	暂存项目
    public  boolean tmpStore(DataListDTO aList);
    //3.	开立项目
    public List<InspectionDetails> drawInspectionDetails(IdDTO inspectionDetailsIdList, Integer userID);

    //4.	删除项目(未开立
    public List<InspectionDetails> deleteInspectionDetails(IdDTO inspectionDetailsIdList, Integer userID) ;
    //5.	作废项目（已开立，但未登记
    public List<InspectionDetails> abolishInspectionDetails(IdDTO inspectionDetailsIdList, Integer userID);
    //6.	存为组套
    public Integer saveTemplate(ProjectTemplate projectTemplate, Integer userID);
    public boolean  saveTemplateDetails(DataListDTO lists, Integer userID);
    //7.	引用组套
    public ProjectTemplate use_Check(Integer projectTemplateID);
    //8.	查看检查结果
    public List<InspectionResult>    lookInspectionRes(Integer inspectionDetailsID);
    //9.	常用项目管理（此次为引用
    public CommonInspection useCommonInspection(Integer commonInspectionID);
    //开立时向fee中插一条未缴费的记录
    public Fee addProjectFee(  Integer inspectionDetailID  , Integer userID);


    public   List<FMedItem> listInspection();



}
