package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.Diagnosis;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.dao.basicTableDao.CommonDiagnosisDao;
import edu.neu.hospital.dao.basicTableDao.DiagnosisDao;
import edu.neu.hospital.dao.basicTableDao.DiseaseDao;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.DiagnosisExample;
import edu.neu.hospital.example.basicTableExample.DiseaseExample;
import edu.neu.hospital.service.outPatientService.DiagnoseService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DiagnoseServiceImpl implements DiagnoseService {

    @Resource
    DiagnosisDao diagnosisDao;

    @Resource
    CommonDiagnosisDao commonDiagnosisDao;

    @Resource
    DiseaseDao diseaseDao;

    RegexProcess regexProcess = new RegexProcess();

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
    public List<Disease> searchDisease(String str) {
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        DiseaseExample.Criteria criteria1 = diseaseExample.createCriteria();
        DiseaseExample.Criteria criteria2 = diseaseExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();
        System.out.println("1-----");
        if( str != null){
            System.out.println("2-----");
            String searchd = regexProcess.regexProcess02(str);
            System.out.println("21-----");
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andDiseaseIcdLike("%" + searchd + "%");


        }
        diseaseExample.or(criteria1);
        diseaseExample.or(criteria2);
        System.out.println("3-----");
        return diseaseDao.selectByExample(diseaseExample);
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
}
