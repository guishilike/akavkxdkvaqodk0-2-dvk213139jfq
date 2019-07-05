package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.example.basicTableExample.*;
import edu.neu.hospital.service.outPatientService.ApplyPrescriptionService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class ApplyPrescriptionServiceImpl implements ApplyPrescriptionService {

    @Resource
    PrescriptionDao prescriptionDao;

    @Resource
    PrescriptionDetailDao prescriptionDetailDao;

    static List<List<PrescriptionDetail>> lists = new LinkedList<>();

    RegexProcess regexProcess = new RegexProcess();
    @Resource
    DrugsDao drugsDao;

    @Resource
    ProjectTemplateDao projectTemplateDao;

    @Resource
    ProjectTemplateDetailDao projectTemplateDetailDao;

    @Resource
    CommonDrugsDao commonDrugsDao;

    @Resource
    PrescriptionFeeDao prescriptionFeeDao;
    @Resource
    DrugsviewDao drugsViewDao;

    @Resource
    FeeDao feeDao;
    @Resource
    PrescriptionviewDao prescriptionViewDao;
    @Resource
    PrescriptionDetailViewDao PrescriptionDetailViewDao;


    @Override
    public boolean addPrescription(Prescription prescription, Integer userID) {
        prescription.setAppearDate(new Date());
        prescription.setAppearUserID(userID);
        prescription.setDoctorID(userID);
        prescription.setMark(131);
        prescription.setStatus("1");
        prescriptionDao.insert(prescription);
        return true;
    }

    @Override
    public void tmpStore(DataListDTO prescriptionDetails) {

        List<PrescriptionDetail> list = prescriptionDetails.getData();
        //Integer prescriptionID = list.get(0).getPrescriptionID();

        lists.add(list);


    }

    @Override
    public boolean drawPrescription(Integer prescriptionID, Integer userID) {

        if (prescriptionID != null) {
            Prescription prescription = new Prescription();
            prescription.setChangeDate(new Date());
            prescription.setChangeUserID(userID);
            prescription.setMark(131);
            prescription.setId(prescriptionID);

            prescriptionDao.updateByPrimaryKeySelective(prescription);

        }

        //将对应的detail也置1
        PrescriptionDetailExample prescriptionDetailExample = new PrescriptionDetailExample();
        PrescriptionDetailExample.Criteria criteria = prescriptionDetailExample.createCriteria();
        criteria.andPrescriptionIDEqualTo(prescriptionID);

        List<PrescriptionDetail> prescriptionDetails = prescriptionDetailDao.selectByExample(prescriptionDetailExample);
        for (int i = 0; i < prescriptionDetails.size(); i++) {
            PrescriptionDetail p = prescriptionDetails.get(i);
            p.setIsDrawn(131);
            p.setChangeDate(new Date());
            p.setChangeUserID(userID);
            prescriptionDetailDao.updateByPrimaryKeySelective(p);
        }
        return true;
    }

    @Override
    public Fee addProjectFee(Integer prescriptionDetailID, Integer userID) {
        PrescriptionFeeExample prescriptionFeeExample = new PrescriptionFeeExample();
        PrescriptionFeeExample.Criteria criteria = prescriptionFeeExample.createCriteria();
        criteria.andPrescriptionDetailIDEqualTo(prescriptionDetailID);
        //criteria.andPrescriptionIDEqualTo(prescriptionID);
        PrescriptionFee prescriptionFee = prescriptionFeeDao.selectByExample(prescriptionFeeExample).get(0);
        BigDecimal num = new BigDecimal(prescriptionFee.getDosage().toString());
        BigDecimal total = num.multiply(prescriptionFee.getDrugsPrice());
        Fee fee = new Fee();
        fee.setMedicalRecordID(prescriptionFee.getMedicalRecordID());
        fee.setExpID(prescriptionFee.getDrugsTypeID() - 10);
        fee.setFee(total);
        fee.setPayStatus(134);
        fee.setDateStatus(148);
        fee.setFeeCategoryID(prescriptionFee.getPaymentCategoryID());
        fee.setAppearUserID(userID);
        fee.setFeeAppearDate(new Date());
        feeDao.insert(fee);


        return null;
    }

    @Override
    public boolean deletePrescription(Integer prescriptionID, Integer userID) {

        if (prescriptionID != null) {
            Prescription prescription = prescriptionDao.selectByPrimaryKey(prescriptionID);
            if (prescription.getMark() == 131) {
                prescription.setChangeDate(new Date());
                prescription.setChangeUserID(userID);
                prescription.setMark(149);
                prescriptionDao.updateByPrimaryKeySelective(prescription);
            }


        }

        //将对应的detail也置1
        PrescriptionDetailExample prescriptionDetailExample = new PrescriptionDetailExample();
        PrescriptionDetailExample.Criteria criteria = prescriptionDetailExample.createCriteria();
        criteria.andPrescriptionIDEqualTo(prescriptionID);

        List<PrescriptionDetail> prescriptionDetails = prescriptionDetailDao.selectByExample(prescriptionDetailExample);
        for (int i = 0; i < prescriptionDetails.size(); i++) {

            PrescriptionDetail p = prescriptionDetails.get(i);
            if (p.getIsDrawn() != 131) {
                p.setChangeDate(new Date());
                p.setChangeUserID(userID);
                p.setStatus("0");
                prescriptionDetailDao.updateByPrimaryKeySelective(p);
            }


        }
        return true;
    }

    @Override
    public boolean abolishPrescription(Integer prescriptionID, Integer userID) {
        Prescription prescription = prescriptionDao.selectByPrimaryKey(prescriptionID);
        if (prescription.getStatus().equals("0")) return false;
        prescription.setMark(149);
        prescription.setChangeUserID(userID);
        prescription.setChangeDate(new Date());
        prescriptionDao.updateByPrimaryKeySelective(prescription);
        return true;

    }

    @Override
    public boolean sendPrescription(Integer prescriptionID, Integer userID) {
        Prescription prescription = prescriptionDao.selectByPrimaryKey(prescriptionID);
        if (prescription.getStatus().equals("0")||prescription.getMark()==149)
            return false;
        prescription.setMark(151);
        prescription.setChangeUserID(userID);
        prescription.setChangeDate(new Date());
        List<PrescriptionDetailView> prescriptionDetailViews=findAllPrescriptionDetails(prescriptionID);
        for(int i=0;i<prescriptionDetailViews.size();i++){
          addProjectFee(prescriptionDetailViews.get(i).getId(),userID);
        }
        prescriptionDao.updateByPrimaryKeySelective(prescription);
        return true;

    }

    @Override
    public boolean addDrugs(Integer preID, PrescriptionDetail prescriptionDetail, Integer userID) {
        prescriptionDetail.setPrescriptionID(preID);
        prescriptionDetail.setAppearUserID(userID);
        prescriptionDetail.setAppearDate(new Date());
        prescriptionDetail.setStatus("1");
        if (prescriptionDetail.getIsPaid() == null)
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
    public boolean deleteAllDetails(Integer prescriptionID) {
        PrescriptionDetailExample example = new PrescriptionDetailExample();
        PrescriptionDetailExample.Criteria criteria = example.createCriteria();
        criteria.andPrescriptionIDEqualTo(prescriptionID);
        prescriptionDetailDao.deleteByExample(example);
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

        if (str != null) {
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
        projectTemplate.setAppearUserID(userID);
        projectTemplateDao.insert(projectTemplate);
        return projectTemplate.getId();
    }

    @Override
    public boolean saveTemplateDetails(DataListDTO lists, Integer userID) {

        List<ProjectTemplateDetail> list = lists.getData();
        for (int i = 0; i < list.size(); i++) {
            ProjectTemplateDetail projectTemplateDetail = list.get(i);
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

    @Override
    public List<Drugsview> listDrugs() {
        return drugsViewDao.selectByExample(new DrugsviewExample());
    }

    @Override
    public List<Prescriptionview> findAllPrescription() {
        return prescriptionViewDao.selectByExample(new PrescriptionviewExample());
    }

    @Override
    public List<PrescriptionDetailView> findAllPrescriptionDetails(Integer prescription) {
        PrescriptionDetailViewExample PrescriptionDetailViewExample = new PrescriptionDetailViewExample();
        PrescriptionDetailViewExample.Criteria criteria = PrescriptionDetailViewExample.createCriteria();
        criteria.andPrescriptionIDEqualTo(prescription);
        return PrescriptionDetailViewDao.selectByExample(new PrescriptionDetailViewExample());
    }


}
