package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.baseDao.InspectionViewDao;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.*;
import edu.neu.hospital.service.outPatientService.ApplyInspectionService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service

public class ApplyInspectionServiceImpl implements ApplyInspectionService {

    @Resource
    InspectionDao inspectionDao;
    @Resource
    InspectionDetailsDao inspectionDetailsDao;
    @Resource
    InspectionViewDao inspectionViewDao;

    @Resource
    ProjectTemplateDao projectTemplateDao;

    @Resource
    InspectionResultDao inspectionResultDao;

    @Resource
    CommonInspectionDao commonInspectionDao;

    @Resource
    ProjectTemplateDetailDao projectTemplateDetailDao;


    RegexProcess regexProcess = new RegexProcess();


    @Resource
    ProjectTemplateViewDao projectTemplateViewDao;
    @Resource
    FMedItemDao fMedItemDao;


    @Resource
    InspectionFeeDao inspectionFeeDao;

    @Resource
    FeeDao feeDao;

    @Resource
    InspectionDetailsViewDao inspectionDetailsViewDao;


    //根据inspectionID判断，存每个人的list
    static List<List<InspectionDetails>> inspectionDetailsList = new LinkedList<List<InspectionDetails>>();

    //新建该患者的inspection
    //首先判断Inspection表里是否已经有该病例的检查了
    @Override
    public boolean checkIsHaven(Integer medicalRecordID) {


        InspectionExample inspectionExample = new InspectionExample();
        InspectionExample.Criteria criteria = inspectionExample.createCriteria();
        criteria.andMedicalRecordIDEqualTo(medicalRecordID);
        if( inspectionDao.selectByExample(inspectionExample).size() == 0 ){

            //表里没有
            return false;
        }
        return true;
    }
    @Override
    public Inspection newInspection(Inspection inspection, Integer userID) {
        inspection.setAppearUserID(userID);
        inspection.setAppearDate(new Date());
        inspection.setDoctorID(userID);
        inspection.setStatus("1");
        boolean isHaven = this.checkIsHaven(inspection.getMedicalRecordID());
        if( isHaven){
            //已存在inspection记录
            InspectionExample inspectionExample = new InspectionExample();
            InspectionExample.Criteria criteria = inspectionExample.createCriteria();
            criteria.andMedicalRecordIDEqualTo(inspection.getMedicalRecordID());

            return inspectionDao.selectByExample(inspectionExample).get(0);
        }else{
            Integer id = inspectionDao.insert(inspection);
            return inspectionDao.selectByPrimaryKey(id);

        }

    }
    //增加项目（相当于点击申请

    /**
     * 增加一堆项目（多选
     * @param inspection
     * @param inspectionDetailsList
     * @param userID
     * @return
     */
    @Override
    public int addInspectionDetailsList(Inspection inspection, DataListDTO inspectionDetailsList, Integer userID) {
        List<InspectionDetails> lists = inspectionDetailsList.getData();

        this.newInspection(inspection ,userID);
        for( int i = 0 ; i< lists.size() ; i ++){
            InspectionDetails inspectionDetails = lists.get(i);
            inspectionDetails.setAppearDate(new Date());
            inspectionDetails.setStatus("1");
            inspectionDetails.setAppearUserID( userID);
            inspectionDetailsDao.insert( inspectionDetails);
        }

        return lists.size();
    }

    /**
     * 增加一个项目
     * @param inspection
     * @param inspectionDetails
     * @param userID
     * @return
     */
    @Override
    public int addInspectionDetails(Inspection inspection, InspectionDetails inspectionDetails, Integer userID) {
        this.newInspection(inspection ,userID);
        inspectionDetails.setAppearUserID(userID);
        inspectionDetails.setAppearDate(new Date());
        inspectionDetails.setStatus("1");

        inspectionDetails.setIsDrawn(132);
        inspectionDetails.setIsAbolished(150);
        inspectionDetails.setIsExecuted(144);
        inspectionDetails.setIsChecked(142);
        inspectionDetails.setIsPaid(134);
        inspectionDetails.setIsRegistered(137);
        inspectionDetailsDao.insert(inspectionDetails);
        return 1;

    }






    /**
     * 暂存检查检验
     * @param aList 检查详细的List
     * @return
     */
    @Override
    public boolean tmpStore(DataListDTO aList) {

        List<InspectionDetails> list = aList.getData();
        Integer  inspectionID = list.get(0).getInspectionID();
        for( int i  =0 ;i < inspectionDetailsList.size() ; i ++){

            if(inspectionDetailsList.get(i).get(0).getInspectionID().equals(inspectionID)){
                List<InspectionDetails> index =  inspectionDetailsList.get(i);
                index.addAll(list);
                inspectionDetailsList.set(i , index);
            }else{
                inspectionDetailsList.add(list);
            }

        }
        return true;
    }

    /**
     * 开立（将isDrawn置131
     * @param inspectionDetailsIdList
     * @param userID
     * @return
     */
    @Override
    public List<InspectionDetails> drawInspectionDetails(IdDTO inspectionDetailsIdList, Integer userID) {
        List<Integer> ids = inspectionDetailsIdList.getId();
        List<InspectionDetails> list = new LinkedList<InspectionDetails>();

        for( int i = 0 ; i < ids.size() ; i++){
            Integer inspectionDetailsID = ids.get(i);
            if( inspectionDetailsID != null) {
                InspectionDetails inspectionDetails = new InspectionDetails();
                inspectionDetails.setId(inspectionDetailsID);
                inspectionDetails.setIsDrawn(131);
                inspectionDetails.setChangeUserID(userID);
                inspectionDetails.setChangeDate( new Date());
                inspectionDetailsDao.updateByPrimaryKeySelective(inspectionDetails);
                this.addProjectFee(inspectionDetailsID , userID);
                list.add(inspectionDetails);

            }
        }
        return list;
    }

    @Override
    public boolean deleteInspectionDetailsByID(Integer inspectionDetailsId, Integer userID) {
        InspectionDetails inspectionDetails = inspectionDetailsDao.selectByPrimaryKey(inspectionDetailsId);
        inspectionDetails.setStatus("0");
        inspectionDetailsDao.updateByPrimaryKeySelective(inspectionDetails);
        return true;
    }

    /**
     * 删除项目(未开立
     * @param inspectionDetailsIdList
     * @param userID
     * @return
     */
    @Override
    public List<InspectionDetails> deleteInspectionDetails(IdDTO inspectionDetailsIdList, Integer userID) {
        List<Integer> ids = inspectionDetailsIdList.getId();
        List<InspectionDetails> list = new LinkedList<InspectionDetails>();

        for( int i = 0 ; i < ids.size() ; i++){
            Integer inspectionDetailsID = ids.get(i);
            if( inspectionDetailsID != null) {
                InspectionDetails inspectionDetails = new InspectionDetails();
                inspectionDetails = inspectionDetailsDao.selectByPrimaryKey(inspectionDetailsID);
                if( inspectionDetails.getIsDrawn() != 131){
                    inspectionDetails.setStatus("0");
                    inspectionDetails.setChangeUserID(userID);
                    inspectionDetails.setChangeDate( new Date());
                    inspectionDetailsDao.updateByPrimaryKeySelective(inspectionDetails);
                    list.add(inspectionDetails);
                }
            }
        }
        return list;
    }

    /**
     * 废除status置2
     * @param inspectionDetailsIdList
     * @param userID
     * @return
     */
    @Override
    public List<InspectionDetails> abolishInspectionDetails(IdDTO inspectionDetailsIdList, Integer userID) {
        List<Integer> ids = inspectionDetailsIdList.getId();
        List<InspectionDetails> list = new LinkedList<InspectionDetails>();
        for( int i = 0 ; i < ids.size() ; i++){
            Integer inspectionDetailsID = ids.get(i);
            if( inspectionDetailsID != null) {
                InspectionDetails inspectionDetails = new InspectionDetails();
                inspectionDetails = inspectionDetailsDao.selectByPrimaryKey(inspectionDetailsID);
                if( inspectionDetails.getIsDrawn() == 131 && inspectionDetails.getIsAbolished() != 149){
                    inspectionDetails.setIsAbolished(149);
                    inspectionDetails.setChangeUserID(userID);
                    inspectionDetails.setChangeDate( new Date());
                    inspectionDetailsDao.updateByPrimaryKeySelective(inspectionDetails);
                    list.add(inspectionDetails);
                }
            }
        }
        return list;
    }

    /**
     * 存为组套（两步，先存组套，在存详细
     * @param projectTemplate
     * @param userID
     * @return
     */
    @Override
    public Integer saveTemplate(ProjectTemplate projectTemplate, Integer userID) {
        projectTemplate.setAppearDate(new Date());
        projectTemplate.setAppearUserID( userID);
        projectTemplateDao.insert(projectTemplate);
        return projectTemplate.getId();
    }

    @Override
    public boolean saveTemplateDetails(DataListDTO list, Integer userID) {
        List<ProjectTemplateDetail> lists = list.getData();
        for(int i = 0 ; i < lists.size() ; i++){
            ProjectTemplateDetail projectTemplateDetail =  lists.get(i);
            projectTemplateDetail.setAppearDate(new Date());
            projectTemplateDetail.setAppearUserID(userID);
            projectTemplateDetailDao.insert(projectTemplateDetail);
        }
        return true;

    }

    @Override
    public ProjectTemplate use_Check(Integer projectTemplateID  , Integer inspectionID ,Integer userID) {
        ProjectTemplateViewExample projectTemplateViewExample = new ProjectTemplateViewExample();
        ProjectTemplateViewExample.Criteria criteria = projectTemplateViewExample.createCriteria();
        criteria.andIdEqualTo(projectTemplateID);
        List<ProjectTemplateView> projectTemplateViewList = projectTemplateViewDao.selectByExample(projectTemplateViewExample);
        Inspection inspection = inspectionDao.selectByPrimaryKey(inspectionID);
        for( int i = 0 ; i < projectTemplateViewList.size() ; i ++){

            InspectionDetails inspectionDetails = new InspectionDetails();
            inspectionDetails.setInspectionID(inspectionID);
            inspectionDetails.setFmedItemID(projectTemplateViewList.get(i).getRelevantID());
            inspectionDetails.setNumber(projectTemplateViewList.get(i).getDosage());
            this.addInspectionDetails( inspection,inspectionDetails ,userID);
        }
        return projectTemplateDao.selectByPrimaryKey(projectTemplateID);
    }

    /**
     * 看结果
     * @param
     * @return
     */
    @Override
    public List<InspectionResult> lookInspectionRes(Integer inspectionDetailsID) {
        InspectionResultExample inspectionResultExample = new InspectionResultExample();
        InspectionResultExample.Criteria criteria = inspectionResultExample.createCriteria();
        criteria.andInspectionDetailsIDEqualTo(inspectionDetailsID);

        return inspectionResultDao.selectByExample(inspectionResultExample);
    }

    @Override
    public CommonInspection useCommonInspection(Integer commonInspectionID) {
        return commonInspectionDao.selectByPrimaryKey(commonInspectionID);
    }


    /**
     * 模糊查询一个处置
     * @param str
     * @return
     */
    @Override
    public List<FMedItem> searchInspections(String str) {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria1 = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria2 = fMedItemExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();
        FMedItemExample.Criteria criteria3 = fMedItemExample.createCriteria();

        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andMnemonicCodeLike("%" + searchd + "%");
            criteria3.andRecordTypeNotEqualTo(119);

        }
        fMedItemExample.or(criteria1);
        fMedItemExample.or(criteria2);
        return fMedItemDao.selectByExample(fMedItemExample);
    }


    @Override
    public Fee addProjectFee ( Integer inspectionDetailID , Integer userID) {
        InspectionFeeExample inspectionFeeExample = new InspectionFeeExample();
        InspectionFeeExample.Criteria criteria = inspectionFeeExample.createCriteria();
        criteria.andInspectiondetailsIDEqualTo(inspectionDetailID);
        //criteria.andInspectionIDEqualTo(inspectionID);
        InspectionFee inspectionFee = inspectionFeeDao.selectByExample(inspectionFeeExample).get(0);
        BigDecimal num = new BigDecimal(inspectionFee.getNumber().toString());
        BigDecimal total = num.multiply(inspectionFee.getPrice());
        Fee fee = new Fee();
        fee.setMedicalRecordID(inspectionFee.getMedicalRecordID());
        fee.setExpID(inspectionFee.getExpClassID());
        fee.setFee(total);
        fee.setPayStatus(134);
        fee.setDateStatus(148);
        fee.setFeeCategoryID(inspectionFee.getPaymentCategoryID());
        fee.setAppearUserID(userID);
        fee.setFeeAppearDate(new Date());
        feeDao.insert(fee);




        return null;
    }

    @Override
    public List<FMedItem> listInspection() {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria1 = fMedItemExample.createCriteria();
        criteria.andRecordTypeEqualTo(117);
        criteria1.andRecordTypeEqualTo(118);
        fMedItemExample.or(criteria1);


        return fMedItemDao.selectByExample(fMedItemExample);
    }



    public List<InspectionDetailsView> listIndexInspection(Integer medicalRecordID){
        InspectionDetailsViewExample inspectionDetailsViewExample = new InspectionDetailsViewExample();
        InspectionDetailsViewExample.Criteria criteria = inspectionDetailsViewExample.createCriteria();
        criteria.andMedicalRecordIDEqualTo(medicalRecordID);
        return inspectionDetailsViewDao.selectByExample(inspectionDetailsViewExample);

    }


}
