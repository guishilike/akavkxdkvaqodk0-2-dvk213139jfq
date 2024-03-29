package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.baseBean.DiseaseView;
import edu.neu.hospital.bean.basicTableBean.DiagnosisView;
import edu.neu.hospital.bean.basicTableBean.Diagnosis;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.dao.baseDao.DiseaseViewDao;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.*;
import edu.neu.hospital.service.outPatientService.DiagnoseService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class    DiagnoseServiceImpl implements DiagnoseService {

    @Resource
    DiagnosisDao diagnosisDao;

    @Resource
    DiseaseViewDao diseaseViewDao;
    @Resource
    CommonDiagnosisDao commonDiagnosisDao;

    @Resource
    DiseaseDao diseaseDao;

    RegexProcess regexProcess = new RegexProcess();

    @Resource
    DiagnosisViewDao diagnosisViewDao;

    @Resource
    DrugsDao drugsDao;

    /**
     * 确诊
     * @param diagnosisID
     * @return
     */
    @Override
    public boolean defineDiagnose(Integer diagnosisID ,Integer userID) {
        Diagnosis diagnosis = diagnosisDao.selectByPrimaryKey(diagnosisID);
        diagnosis.setDefiedMark("1");
        diagnosis.setChangeDate(new Date());
        diagnosis.setChangeUserID( userID);
        diagnosisDao.updateByPrimaryKeySelective(diagnosis);
        return true;
    }


    @Override
    public boolean addDiagnosis(Diagnosis diagnosis, Integer userID) {
        diagnosis.setAppearDate(new Date());
        diagnosis.setAppearUserID(userID);
        diagnosis.setStatus("1");
        diagnosisDao.insert(diagnosis);
        return true;
    }

    @Override
    public boolean addDiagnosisList(DataListDTO<Diagnosis> diagnosisList, Integer userID) {
        List<Diagnosis> diagnoses = diagnosisList.getData();
        System.out.println("lili-----" + diagnoses.size());
        for( Diagnosis diagnosis : diagnoses){
            System.out.println(diagnosis.toString());
            diagnosis.setChangeUserID(userID);
            diagnosis.setAppearUserID(userID);
            diagnosis.setStatus("1");
            diagnosisDao.insert(diagnosis);
        }

        return true;
    }

    /**
     * 模糊查询一个病
     * @param str
     * @return
     */
    @Override
    public List<DiseaseView> searchDisease(String str) {
        DiseaseViewExample diseaseViewExample = new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria = diseaseViewExample.createCriteria();
        DiseaseViewExample.Criteria criteria1 = diseaseViewExample.createCriteria();
        DiseaseViewExample.Criteria criteria2 = diseaseViewExample.createCriteria();
        //DiseaseViewExample.Criteria criteria3 = diseaseViewExample.createCriteria();
        System.out.println("1-----");
        if( str != null){
            System.out.println("2-----");
            String searchd = regexProcess.regexProcess02(str);
            System.out.println("21-----");
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andDiseaseIcdLike("%" + searchd + "%");
        }
        diseaseViewExample.or(criteria1);
        diseaseViewExample.or(criteria2);


        System.out.println("3-----");
        return diseaseViewDao.selectByExample(diseaseViewExample);
    }

    @Override
    public boolean deleteDiagnosis(Integer diagnosisID, Integer userID) {


        Diagnosis diagnosis = diagnosisDao.selectByPrimaryKey(diagnosisID);
        diagnosis.setStatus("0");
        diagnosis.setChangeUserID( userID);
        diagnosis.setChangeDate( new Date());
        diagnosisDao.updateByPrimaryKeySelective( diagnosis);

        return true;
    }

    @Override
    public boolean deleteDiagnosisList(IdDTO diagnosisIDs, Integer userID) {
        List<Integer> ids = diagnosisIDs.getId();
        for( int i = 0 ; i< ids.size() ; i ++){
            this.deleteDiagnosis(ids.get(i) , userID);
        }
        return true;
    }

    @Override
    public boolean updateDiagnosis(Diagnosis diagnosis, Integer userID) {

        DiagnosisExample diagnosisExample = new DiagnosisExample();
        DiagnosisExample.Criteria criteria = diagnosisExample.createCriteria();
        criteria.andIdEqualTo(diagnosis.getId());
        System.out.println("id" + diagnosis.getId());
       Diagnosis index = diagnosisDao.selectByPrimaryKey(diagnosis.getId());
       if( index .getStatus() .equals("0")){
           return false;
       }
        diagnosis.setChangeDate( new Date());
             diagnosis.setChangeUserID( userID);
             diagnosisDao.updateByPrimaryKeySelective(diagnosis);
             return true;

       // return false;
    }

    @Override
    public Diagnosis searchDiagnosis(Integer diagnosisID) {
        System.out.println(diagnosisID);
        System.out.println(diagnosisDao.selectByPrimaryKey(diagnosisID).toString());
        return diagnosisDao.selectByPrimaryKey(diagnosisID);
    }

    @Override
    public List<DiagnosisView> getIndexDiagnosis(Integer medicalRecordID) {
        DiagnosisViewExample diagnosisViewExample = new DiagnosisViewExample();
        DiagnosisViewExample.Criteria criteria = diagnosisViewExample.createCriteria();
        criteria.andMedicalRecordIDEqualTo(medicalRecordID);

        return diagnosisViewDao.selectByExample(diagnosisViewExample);
    }


    public List<Disease> listDisease(){
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        return diseaseDao.selectByExample(diseaseExample);
    }



    public Integer getDiseaseID(String str){
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        DiseaseExample.Criteria criteria1 = diseaseExample.createCriteria();
        criteria.andNameEqualTo(str);
        criteria1.andCodeEqualTo(str);
        diseaseExample.or(criteria1);
        return  diseaseDao.selectByExample(diseaseExample).get(0).getId();
    }
}
