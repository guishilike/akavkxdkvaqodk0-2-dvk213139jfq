package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.example.basicTableExample.PatientExample;
import edu.neu.hospital.example.basicTableExample.PatientMedicalRecExample;
import edu.neu.hospital.service.outPatientService.MedicalRecHomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class MedicalRecHomeServiceImpl implements MedicalRecHomeService {

    @Resource
    MedicalRecHomeDao medicalRecHomeDao;

    @Resource
    PatientMedicalRecDao patientMedicalRecDao;

    @Resource
    PatientDao patientDao;
    @Resource
    MedicalRecHomeTemplateDao medicalRecHomeTemplateDao;
    @Resource
    CommonDiagnosisDao commonDiagnosisDao;
    @Resource
    MedicalRecordDao medicalRecordDao;


    //存那些暂存的病历首页（取出的时候该查病历号）
    static List<MedicalRecHome> medicalRecHomes = new LinkedList<MedicalRecHome>();


    /**
     * 查询患者:通过患者病历号
     * @param medicalRecID 病历号
     * @return患者

    @Override
    public Patient findPatient_recID(Integer medicalRecID) {
        //先在view里用病历号查patientID，在用id在patient里查patient
        PatientMedicalRecExample patientMedicalRecExample = new PatientMedicalRecExample();
        PatientMedicalRecExample.Criteria criteria = patientMedicalRecExample.createCriteria();
        if( medicalRecID != null){
            criteria.andMedicalRecIDEqualTo(medicalRecID);
        }
        Integer patientID =  patientMedicalRecDao.selectByExample(patientMedicalRecExample).get(0).getPatientID();


        return patientDao.selectByPrimaryKey(patientID);
    } */

    /**
     * 查询患者:通过患者名字
     * @param  nameOrMedicalRecNo 患者名或病历ID
     * @return 一个该名字的患者List
     */
    @Override
    public List<Patient> findPatient(String nameOrMedicalRecNo) {
        System.out.println("传入" + nameOrMedicalRecNo);
        PatientExample patientExample = new PatientExample();

        PatientExample.Criteria criteria1 = patientExample.createCriteria();
        PatientExample.Criteria criteria2 = patientExample.createCriteria();
        System.out.println("1111111");
        List<Patient> patients1 = new LinkedList<>();
        if( nameOrMedicalRecNo != null){
            criteria1.andPatientNameEqualTo(nameOrMedicalRecNo);//根据名字
            System.out.println("根据名字查到辣");
            patients1 = patientDao.selectByExample(patientExample);

        }
        //根据病历ID
        System.out.println("根据病历no查");


        //先在view里用病历号查patientID，在用id在patient里查patient
        PatientMedicalRecExample patientMedicalRecExample = new PatientMedicalRecExample();
        PatientMedicalRecExample.Criteria criteria = patientMedicalRecExample.createCriteria();
        if( nameOrMedicalRecNo != null){
            criteria.andMedicalRecordNoEqualTo(nameOrMedicalRecNo);
        }
        List<PatientMedicalRec> list = patientMedicalRecDao.selectByExample(patientMedicalRecExample);
        List<Integer> patientID =  new LinkedList<>();
        for( int i = 0 ; i < list.size() ; i ++) {
            patientID.add(list.get(i).getPatientID());
            System.out.println("病历查，病人id" + patientID);
            patients1 .add(patientDao.selectByPrimaryKey(list.get(i).getPatientID()));
        }



        return patients1;
    }

    /**
     * 暂存病历首页
     * @param medicalRecHome 病历首页
     * @return 是否存上了
     */
    @Override
    public boolean tempStore(MedicalRecHome medicalRecHome) {
        //设一个static串存着
        return true;

    }

    /**
     * 使用暂存的病历首页，根据病历ID找
     * @param medicalRecID
     * @return 返回找到的病历首页
     */
    @Override
    public MedicalRecHome use_TempStore(Integer medicalRecID) {
        for( int i = 0 ; i < medicalRecHomes.size() ; i ++){
            MedicalRecHome medicalRecHome = medicalRecHomes.get(i);
            if( medicalRecHome.getMedicalRecId() == medicalRecID){
                return medicalRecHome;
            }
        }
        //找不到就建一个新的
        return new MedicalRecHome();
    }

    /**
     * 看是否填写全（判断所有需要填写的字段是否非空即可
     * @param recHome
     * @return
     */
    @Override
    public boolean is_medicalHome_complete(MedicalRecHome recHome) {
        boolean flag = true;
        if( recHome.getMedicalRecId() == null) flag = false;
        if(recHome.getChiefComplaint() == null) flag = false;
        if( recHome.getCurrentMedicalHistory() == null ) flag = false;
        if (recHome .getCurrentTreatmentSituation() == null ) flag = false;
        if (recHome.getPastMedicalHistory() == null) flag = false;
        if( recHome.getAllergies() == null) flag = false;
        if (( recHome.getPhysicalExamination() == null)) flag = false;
        if ( recHome.getInitialDiagnosis() == null) flag = false;
        if ( recHome.getInitialDiagnosisType() == null) flag = false;
        if ( recHome.getInspectRecommend() == null) flag = false;
        if ( recHome.getAttention() == null) flag = false;
        return false;
    }

    /**
     * 提交
     * @param medicalRecHome
     * @param userID
     * @return
     */
    @Override
    public int add(MedicalRecHome medicalRecHome, Integer userID) {
        medicalRecHome.setStatus("1");
        medicalRecHome.setAppearDate(new Date());
        medicalRecHome.setDoctorId(userID);
        return medicalRecHomeDao.insert(medicalRecHome);
        /*if(is_medicalHome_complete( medicalRecHome)){
            return medicalRecHomeDao.insert(medicalRecHome);
        }else{
            System.out.println("未填写完整");
            return -1;
        }*/



    }

    /**
     * 存为病历首页模板
     * @param medicalRecHomeTemplate
     * @param userID
     * @return
     */
    @Override
    public int save_Template(MedicalRecHomeTemplate medicalRecHomeTemplate, Integer userID) {
        medicalRecHomeTemplate.setStatus("1");
        medicalRecHomeTemplate.setAppearDate(new Date());
        medicalRecHomeTemplate.setDoctorId(userID);
        return medicalRecHomeTemplateDao.insert(medicalRecHomeTemplate);
    }



    /**
     * 使用病历模板
     * @param recHomeTemplateID
     * @return
     */
    @Override
    public MedicalRecHomeTemplate use_Template(Integer recHomeTemplateID) {
        return medicalRecHomeTemplateDao.selectByPrimaryKey(recHomeTemplateID);
    }

    /**
     * 使用常用诊断
     * @param commonDiagnosisID
     * @return
     */
    @Override
    public CommonDiagnosis use_CommonDiagnosis(Integer commonDiagnosisID) {
        return commonDiagnosisDao.selectByPrimaryKey(commonDiagnosisID);
    }

    /**
     * 查看历史病历
     * @param patientID
     * @return 该患者ID下的所有病历
     */
    @Override
    public List<MedicalRecord> searchHistoryRec(Integer patientID) {
        //先在view里查该患者id对应的病历IDList，然后在病历表里查对应病历
        PatientMedicalRecExample patientMedicalRecExample = new PatientMedicalRecExample();
        PatientMedicalRecExample.Criteria criteria = patientMedicalRecExample.createCriteria();
        List<PatientMedicalRec> patientMedicalRecs = new LinkedList<PatientMedicalRec>();
        if(patientID != null){
            criteria.andPatientIDEqualTo(patientID);
        }
        patientMedicalRecs = patientMedicalRecDao.selectByExample(patientMedicalRecExample);
        System.out.println(patientMedicalRecs.size());
        List<MedicalRecord> medicalRecords = new LinkedList<MedicalRecord>();
        for(int i = 0 ;i < patientMedicalRecs.size() ; i ++){
            Integer medicalRecordID =  patientMedicalRecs.get(i).getMedicalRecID();
            System.out.println(medicalRecordID);
            medicalRecords.add(medicalRecordDao.selectByPrimaryKey(medicalRecordID));
        }
        return medicalRecords;
    }
}
