package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.example.basicTableExample.DrugsExample;
import edu.neu.hospital.example.basicTableExample.PrescriptionDetailExample;
import edu.neu.hospital.service.outPatientService.ApplyPrescriptionService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class ApplyPrescriptionServiceImpl implements ApplyPrescriptionService {

    @Resource
    PrescriptionDao prescriptionDao;

    @Resource
    PrescriptionDetailDao prescriptionDetailDao;

    static List<List<PrescriptionDetail>> lists =new LinkedList<>();

    RegexProcess regexProcess = new RegexProcess();
    @Resource
    DrugsDao drugsDao;

    @Resource
    ProjectTemplateDao projectTemplateDao;

    @Resource
    ProjectTemplateDetailDao projectTemplateDetailDao;

    @Resource
    CommonDrugsDao commonDrugsDao;

    @Override
    public boolean addPrescription(Prescription prescription, Integer userID) {
        prescription.setAppearDate(new Date());
        prescription.setAppearUserID(userID);
        prescription.setStatus("1");
        prescriptionDao.insert(prescription);
        return true;
    }

    @Override
    public void tmpStore(DataListDTO prescriptionDetails ){

        List<PrescriptionDetail> list = prescriptionDetails.getData();
        //Integer prescriptionID = list.get(0).getPrescriptionID();

        lists.add(list);


    }

    @Override
    public boolean drawPrescription(Integer prescriptionID, Integer userID) {

        if( prescriptionID != null){
            Prescription prescription = new Prescription();
            prescription.setChangeDate(new Date());
            prescription.setChangeUserID(userID);
            prescription.setIsDrawn(131);
            prescription.setId(prescriptionID);

            prescriptionDao.updateByPrimaryKeySelective(prescription);

        }

        //将对应的detail也置1
        PrescriptionDetailExample prescriptionDetailExample = new PrescriptionDetailExample();
        PrescriptionDetailExample.Criteria criteria = prescriptionDetailExample.createCriteria();
        criteria.andPrescriptionIDEqualTo(prescriptionID);

        List<PrescriptionDetail> prescriptionDetails = prescriptionDetailDao.selectByExample(prescriptionDetailExample);
        for(int i = 0; i< prescriptionDetails.size() ; i ++){
            PrescriptionDetail p = prescriptionDetails.get(i);
            p.setIsDrawn(131);
            p.setChangeDate(new Date());
            p.setChangeUserID( userID);
            prescriptionDetailDao.updateByPrimaryKeySelective(p);
        }
        return true;
    }

    @Override
    public boolean deletePrescription(Integer prescriptionID, Integer userID) {

        if( prescriptionID != null ){
            Prescription prescription = prescriptionDao.selectByPrimaryKey(prescriptionID);
            if( prescription.getIsDrawn()!= 131){
                prescription.setChangeDate(new Date());
                prescription.setChangeUserID(userID);
                prescription.setStatus("0");


                prescriptionDao.updateByPrimaryKeySelective(prescription);
            }


        }

        //将对应的detail也置1
        PrescriptionDetailExample prescriptionDetailExample = new PrescriptionDetailExample();
        PrescriptionDetailExample.Criteria criteria = prescriptionDetailExample.createCriteria();
        criteria.andPrescriptionIDEqualTo(prescriptionID);

        List<PrescriptionDetail> prescriptionDetails = prescriptionDetailDao.selectByExample(prescriptionDetailExample);
        for(int i = 0; i< prescriptionDetails.size() ; i ++){

            PrescriptionDetail p = prescriptionDetails.get(i);
            if( p.getIsDrawn() != 131){
                p.setChangeDate(new Date());
                p.setChangeUserID( userID);
                p.setStatus("0");
                prescriptionDetailDao.updateByPrimaryKeySelective(p);
            }



        }
        return true;
    }

    @Override
    public boolean abolishPrescription(Integer prescriptionID, Integer userID) {
        Prescription prescription = prescriptionDao.selectByPrimaryKey(prescriptionID);
        if( prescription.getStatus().equals("0")) return false;
        prescription.setIsAbolished(149);
        prescription.setChangeUserID(userID);
        prescription.setChangeDate(new Date());
        return true;

    }

    @Override
    public boolean addDrugs(Integer prescriptionID, PrescriptionDetail prescriptionDetail, Integer userID) {
        prescriptionDetail.setPrescriptionID( prescriptionID);
        prescriptionDetail.setAppearUserID(userID);
        prescriptionDetail.setAppearDate( new Date());
        prescriptionDetail.setIsDrawn(132);
        prescriptionDetail.setIsAbolished(150);

        prescriptionDetail.setIsPaid(134);

        prescriptionDetailDao.insert(prescriptionDetail);
        return true;
    }

    @Override
    public boolean deleteDrugs(Integer prescriptionID, Integer prescriptionDetailID, Integer userID) {
        PrescriptionDetail prescriptionDetail = prescriptionDetailDao.selectByPrimaryKey(prescriptionDetailID);
        prescriptionDetail.setChangeUserID(userID);
        prescriptionDetail.setChangeDate(new Date());
        prescriptionDetail.setStatus("0");
        prescriptionDetailDao.updateByPrimaryKeySelective(prescriptionDetail);
        return true;
    }

    @Override
    public List<Drugs> searchDrugs(String str) {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        DrugsExample.Criteria criteria1 = drugsExample.createCriteria();
        DrugsExample.Criteria criteria2 = drugsExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();
        DrugsExample.Criteria criteria3 = drugsExample.createCriteria();

        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andDrugsNameLike("%" + searchd + "%");
            criteria1.andDrugsCodeLike("%" + searchd + "%");
            criteria2.andMnemonicCodeLike("%" + searchd + "%");

        }
        drugsExample.or(criteria1);
        drugsExample.or(criteria2);
        return drugsDao.selectByExample(drugsExample);
    }

    @Override
    public Integer saveTemplate(ProjectTemplate projectTemplate, Integer userID) {

        projectTemplate.setAppearDate(new Date());
        projectTemplate.setAppearUserID( userID);
        projectTemplateDao.insert(projectTemplate);
        return projectTemplate.getId();
    }

    @Override
    public boolean saveTemplateDetails(DataListDTO lists, Integer userID) {

        List<ProjectTemplateDetail> list = lists.getData();
        for(int i = 0 ; i < list.size() ; i++){
            ProjectTemplateDetail projectTemplateDetail =  list.get(i);
            projectTemplateDetail.setAppearDate(new Date());
            projectTemplateDetail.setAppearUserID(userID);
            projectTemplateDetailDao.insert(projectTemplateDetail);
        }
        return true;
    }

    @Override
    public ProjectTemplate use_Check(Integer projectTemplateID) {
        return projectTemplateDao.selectByPrimaryKey(projectTemplateID);
    }

    @Override
    public CommonDrugs useCommonDrugs(Integer commonDrugsID) {
        return commonDrugsDao.selectByPrimaryKey(commonDrugsID);
    }
}
