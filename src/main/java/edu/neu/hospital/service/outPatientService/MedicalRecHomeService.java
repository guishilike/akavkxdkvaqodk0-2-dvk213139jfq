package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.*;

import java.util.List;

public interface MedicalRecHomeService {
    //1.	查询患者:通过患者病历号或者姓名
    //public Patient findPatient_recID(Integer medicalRecID);
    public List<PatientMedicalRec> findPatient(String nameOrMedicalRecID);
    //2.	暂存病历首页
    public boolean tempStore(MedicalRecHome medicalRecHome);

    //使用该患者暂存的病历（医生可在不同患者间切换，返回某一患者界面时，根据病历号，找出暂存的病历首页
    public MedicalRecHome use_TempStore(Integer medicalRecID);

    //检查所有项目是否填写完整
    public boolean is_medicalHome_complete(MedicalRecHome recHome);

    //3.	提交病历首页（其实没用上ID）
    public int add(MedicalRecHome medicalRecHome, Integer userID);

    //4.	清屏

    //5.	存为模板，其实没用上ID，，，，
    public int save_Template(MedicalRecHomeTemplate medicalRecHomeTemplate, Integer userID);
    //6.	引用病历模板
    public MedicalRecHomeTemplate use_Template(Integer recHomeTemplateID);
    //7.	常用诊断管理（此处为引用常用诊断，管理另外写service)
    public CommonDiagnosis use_CommonDiagnosis(Integer commonDiagnosisID);

    //8.	查看历史病历
    public List<MedicalRecord> searchHistoryRec(Integer patientID);


    public List<PatientMedicalRec> listPatientNoDiagnosis();
}
