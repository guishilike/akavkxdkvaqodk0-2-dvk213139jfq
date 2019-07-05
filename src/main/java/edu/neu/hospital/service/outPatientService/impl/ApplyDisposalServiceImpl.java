package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.baseDao.FMedItemViewDao;
import edu.neu.hospital.dao.basicTableDao.*;

import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.baseExample.FMedItemViewExample;
import edu.neu.hospital.example.basicTableExample.*;
import edu.neu.hospital.service.outPatientService.ApplyDisposalService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class ApplyDisposalServiceImpl implements ApplyDisposalService {

   //静态链表
    static  List<List<DisposalDetails>> disposalDetailsList = new LinkedList<List<DisposalDetails>>();
    RegexProcess regexProcess = new RegexProcess();

    @Resource
    DisposalDao disposalDao;
    @Resource
    DisposalDetailsDao disposalDetialsDao;
    @Resource
    CommonDiposalsDao commonDiposalsDao;
    @Resource
    FMedItemDao fMedItemDao;

    @Resource
    DisposalDetailsDao disposalDetailsDao;

    @Resource
    FeeDao feeDao;
    @Resource
    DisposalFeeDao disposalFeeDao;

    @Resource
    DisposalDetailsViewDao disposalDetailsViewDao;

    @Resource
    FMedItemViewDao fMedItemViewDao;

    @Resource
    ProjectTemplateViewDao projectTemplateViewDao;

    @Resource
    ProjectTemplateDao projectTemplateDao;

    @Override
    public boolean checkIsHaven(Integer medicalRecordID) {
        DisposalExample disposalExample = new DisposalExample();
        DisposalExample.Criteria criteria = disposalExample.createCriteria();
        criteria.andMedicalRecordIDEqualTo(medicalRecordID);
        if( disposalDao.selectByExample(disposalExample).size() == 0){
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteDisposalDetailsByID(Integer disposalDetailsId, Integer userID) {
        DisposalDetails disposalDetails = disposalDetailsDao.selectByPrimaryKey(disposalDetailsId);
        disposalDetails.setStatus("0");
        disposalDetailsDao.updateByPrimaryKeySelective(disposalDetails);
        return true;
    }


    @Override
    public Disposal newDisposal(Disposal disposal, Integer userID) {

        disposal.setAppearUserID(userID);
        disposal.setAppearDate(new Date());
        disposal.setDoctorID(userID);
        boolean isHaven = this.checkIsHaven(disposal.getMedicalRecordID());
        if( isHaven){
            DisposalExample disposalExample = new DisposalExample();
            DisposalExample.Criteria criteria = disposalExample.createCriteria();
            criteria.andMedicalRecordIDEqualTo(disposal.getMedicalRecordID());

            return disposalDao.selectByExample(disposalExample).get(0);
        }else{
            Integer id = disposalDao.insert(disposal);
            return disposalDao.selectByPrimaryKey(id);
        }

    }
//增加项目

    /**
     *
     * @param disposal
     * @param disposalDetialsList
     * @param userID
     * @return
     */
    @Override
    public int addDisposalDetailsList(Disposal disposal , DataListDTO disposalDetialsList , Integer userID){
        List<DisposalDetails> list = disposalDetialsList.getData();
        this.newDisposal(disposal , userID);
        for( int i = 0 ; i < list.size() ; i ++){
            DisposalDetails disposalDetails = list.get(i);
            disposalDetails.setDisposalID(disposal.getId());
            disposalDetails.setAppearUserID(userID);
            disposalDetails.setAppearDate( new Date());
            disposalDetails.setStatus("1");
            disposalDetails.setIsDrawn(132);
            disposalDetails.setIsAbolished(150);
            disposalDetails.setIsExecuted(144);
            disposalDetails.setIsChecked(142);
            disposalDetails.setIsPaid(134);
            disposalDetails.setIsRegistered(137);
            disposalDetialsDao.insert(disposalDetails);
        }
        return list.size();
    }

    @Override
    public int addDisposalDetails(Disposal disposal, DisposalDetails disposalDetails, Integer userID) {
        this.newDisposal(disposal , userID);
        disposalDetails.setAppearUserID(userID);
        disposalDetails.setStatus("1");
        disposalDetails.setIsDrawn(132);
        disposalDetails.setIsAbolished(150);
        disposalDetails.setIsExecuted(144);
        disposalDetails.setIsChecked(142);
        disposalDetails.setIsPaid(134);
        disposalDetails.setIsRegistered(137);

        disposalDetails.setAppearDate(new Date());
        disposalDetialsDao.insert(disposalDetails);
        return 1;

    }
    /**
     * 模糊查询一个处置
     * @param str
     * @return
     */
    @Override
    public List<FMedItem> searchDisposal(String str) {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria1 = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria2 = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria3 = fMedItemExample.createCriteria();
        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andMnemonicCodeLike("%" + searchd + "%");
            criteria3.andRecordTypeEqualTo(119);
        }
        fMedItemExample.or(criteria1);
        fMedItemExample.or(criteria2);
        return fMedItemDao.selectByExample(fMedItemExample);
    }

    @Override
    public boolean tmpStore(DataListDTO aList) {
       /*List<DisposalDetails> list = aList.getData();
        Integer disposalID = list.get(0).getDisposalID();
        for( int i = 0; i< disposalDetailsList.size() ; i ++){
            if( disposalDetailsList.get(i).get(0).getDisposalID().equals(disposalID)){
                List<DisposalDetails> index = disposalDetailsList.get(i);
                index.addAll(list);
                disposalDetailsList.set(i , index);
            }else{
                disposalDetailsList.add(list);
            }

        }*/
        return true;
    }

    @Override
    public List<DisposalDetails> drawDisposalDetails(IdDTO disposalDetailsIdList, Integer userID) {
        List<Integer> ids = disposalDetailsIdList.getId();
        List<DisposalDetails> list = new LinkedList<>();
        for( int i = 0 ; i < ids.size() ; i++){
            Integer disposalDetailsID = ids.get(i);
            if( disposalDetailsID != null) {
                DisposalDetails disposalDetails = new DisposalDetails();
                 if(disposalDetails.getStatus().equals("1")){
                     disposalDetails.setId(disposalDetailsID);
                     disposalDetails.setIsDrawn(131);
                     disposalDetails.setChangeUserID(userID);
                     disposalDetails.setChangeDate( new Date());
                     disposalDetialsDao.updateByPrimaryKeySelective(disposalDetails);
                     list.add(disposalDetails);
                 }


            }
        }
        return list;
    }

    @Override
    public List<DisposalDetails> deleteDisposalDetails(IdDTO disposalDetailsIdList, Integer userID) {
        List<Integer> ids = disposalDetailsIdList.getId();
        List<DisposalDetails> list = new LinkedList<>();

        for( int i = 0 ; i < ids.size() ; i++){
            Integer disposalDetailsID = ids.get(i);
            if( disposalDetailsID != null) {
                DisposalDetails disposalDetails = new DisposalDetails();
                disposalDetails = disposalDetialsDao.selectByPrimaryKey(disposalDetailsID);
                if( disposalDetails.getIsDrawn() != 131){
                    disposalDetails.setStatus("0");
                    disposalDetails.setChangeUserID(userID);
                    disposalDetails.setChangeDate( new Date());
                    disposalDetialsDao.updateByPrimaryKeySelective(disposalDetails);
                }
                list.add(disposalDetails);
            }
        }
        return list;
    }

    @Override
    public List<DisposalDetails> abolishDisposalDetails(IdDTO disposalDetailsIdList, Integer userID) {
        List<Integer> ids = disposalDetailsIdList.getId();
        List<DisposalDetails> list = new LinkedList<>();

        for( int i = 0 ; i < ids.size() ; i++){
            Integer disposalDetailsID = ids.get(i);
            if( disposalDetailsID != null) {
                DisposalDetails disposalDetails = new DisposalDetails();
                disposalDetails = disposalDetialsDao.selectByPrimaryKey(disposalDetailsID);
                if( disposalDetails.getIsDrawn() == 131 && disposalDetails.getIsAbolished() != 149 && disposalDetails.getStatus().equals("1")){
                    disposalDetails.setIsAbolished(149);
                    disposalDetails.setChangeUserID(userID);
                    disposalDetails.setChangeDate( new Date());
                    disposalDetialsDao.updateByPrimaryKeySelective(disposalDetails);
                    list.add(disposalDetails);
                }
            }
        }
        return list;
    }

    @Override
    public CommonDiposals useCommonDisposal(Integer commonDisposalID) {
        return commonDiposalsDao.selectByPrimaryKey(commonDisposalID);
    }


    @Override
    public Fee addProjectFee ( Integer disposalDetailID , Integer userID) {
        DisposalFeeExample disposalFeeExample = new DisposalFeeExample();
        DisposalFeeExample.Criteria criteria = disposalFeeExample.createCriteria();

        criteria.andDisposalDetailsIDEqualTo(disposalDetailID);
        //criteria.andDisposalIDEqualTo(disposalID);
        DisposalFee disposalFee = disposalFeeDao.selectByExample(disposalFeeExample).get(0);
        BigDecimal num = new BigDecimal(disposalFee.getNumber().toString());
        BigDecimal total = num.multiply(disposalFee.getPrice());
        Fee fee = new Fee();
        fee.setMedicalRecordID(disposalFee.getMedicalRecordID());
        fee.setExpID(disposalFee.getExpClassID());
        fee.setFee(total);
        fee.setPayStatus(134);
        fee.setDateStatus(148);
        fee.setFeeCategoryID(disposalFee.getPaymentCategoryID());
        fee.setAppearUserID(userID);
        fee.setFeeAppearDate(new Date());
        feeDao.insert(fee);




        return null;
    }

    @Override
    public List<FMedItem> listDisposal() {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();

        criteria.andRecordTypeEqualTo(119);

        return fMedItemDao.selectByExample(fMedItemExample);
    }

    public List<DisposalDetailsView> listIndexDisposal(Integer medicalRecordID){
        DisposalDetailsViewExample disposalDetailsViewExample = new DisposalDetailsViewExample();
        DisposalDetailsViewExample.Criteria criteria = disposalDetailsViewExample.createCriteria();
        criteria.andMedicalRecordIDEqualTo(medicalRecordID);
        return disposalDetailsViewDao.selectByExample(disposalDetailsViewExample);

    }


    public FmeditemView getIndexFMedItem(DisposalDetails disposalDetails){
        Integer fMedItemID = disposalDetails.getfMedItemID();
        FMedItemViewExample fMedItemViewExample = new FMedItemViewExample();
        FMedItemViewExample.Criteria criteria = fMedItemViewExample.createCriteria();
        criteria.andIdEqualTo(fMedItemID);
        return fMedItemViewDao.selectByExample(fMedItemViewExample).get(0);


    }



    @Override
    public ProjectTemplate use_Check(Integer projectTemplateID  , Integer disposalID ,Integer userID) {
        ProjectTemplateViewExample projectTemplateViewExample = new ProjectTemplateViewExample();
        ProjectTemplateViewExample.Criteria criteria = projectTemplateViewExample.createCriteria();
        criteria.andIdEqualTo(projectTemplateID);
        List<ProjectTemplateView> projectTemplateViewList = projectTemplateViewDao.selectByExample(projectTemplateViewExample);
        Disposal disposal = disposalDao.selectByPrimaryKey(disposalID);
        for( int i = 0 ; i < projectTemplateViewList.size() ; i ++){

            DisposalDetails disposalDetails = new DisposalDetails();
            disposalDetails.setDisposalID(disposalID);
            disposalDetails.setfMedItemID(projectTemplateViewList.get(i).getRelevantID());
            disposalDetails.setNumber(projectTemplateViewList.get(i).getDosage());
            this.addDisposalDetails( disposal,disposalDetails ,userID);
        }
        return projectTemplateDao.selectByPrimaryKey(projectTemplateID);
    }


}
