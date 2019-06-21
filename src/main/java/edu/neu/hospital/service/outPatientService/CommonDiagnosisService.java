package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.CommonDiagnosis;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.dto.IdDTO;

import java.util.List;

public interface CommonDiagnosisService {
    //常用诊断管理
    //列出
    //根据医生ID列出他的常用诊断
    public List<CommonDiagnosis> listCommonDiagnosis(Integer doctorID);

    //增
    public Integer addCommonDiagnosis(Integer doctorID, Integer diagnosisID);
    //批量增
    public boolean addCommonDiagnosisList(Integer doctorID, IdDTO idDTO);
    public List<Disease> searchDisease(String str);
    //删
    public Integer deleteCommonDiagnosis(Integer commonDiagnosisID, Integer userID);
    //批量删
    public boolean deleteCommonDiagnosisList(IdDTO idDTO, Integer userID);
    //改
    public Integer updateCommonDiagnosis(CommonDiagnosis commonDiagnosis, Integer userID);

    //查
    public CommonDiagnosis searchCommonDiagnosis(Integer commonDiagnosisID);
}
