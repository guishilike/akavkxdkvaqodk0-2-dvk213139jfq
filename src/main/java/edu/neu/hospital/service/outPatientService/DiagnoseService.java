package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.baseBean.DiseaseView;
import edu.neu.hospital.bean.basicTableBean.Diagnosis;
import edu.neu.hospital.bean.basicTableBean.DiagnosisView;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;


import java.util.List;

public interface DiagnoseService {
    //1.	确诊（修改诊断表
    public boolean defineDiagnose(Integer diagnosisID, Integer userID);




    //诊断的一些操作
    //增
    public  boolean addDiagnosis(Diagnosis diagnosis, Integer userID);
    public boolean addDiagnosisList(DataListDTO<Diagnosis> diagnosisList, Integer userID);
    public List<DiseaseView> searchDisease(String str);
    //删

    public  boolean deleteDiagnosis(Integer diagnosisID, Integer userID);
    public boolean deleteDiagnosisList(IdDTO diagnosisIDs, Integer userID);
    //改
    //主诊、疑似等都在此处设置
    public boolean updateDiagnosis(Diagnosis diagnosis, Integer userID);

    //查
    public Diagnosis searchDiagnosis(Integer diagnosisID);

    public  List<DiagnosisView> getIndexDiagnosis(Integer medicalRecordID);

    public List<Disease> listDisease();

}
