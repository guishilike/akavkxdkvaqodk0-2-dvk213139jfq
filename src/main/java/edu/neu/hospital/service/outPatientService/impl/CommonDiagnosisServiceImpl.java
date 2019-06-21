package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.CommonDiagnosis;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.dao.basicTableDao.CommonDiagnosisDao;
import edu.neu.hospital.dao.basicTableDao.DiseaseDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.CommonDiagnosisExample;
import edu.neu.hospital.example.basicTableExample.DiseaseExample;
import edu.neu.hospital.service.outPatientService.CommonDiagnosisService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CommonDiagnosisServiceImpl implements CommonDiagnosisService {
    @Resource
    CommonDiagnosisDao commonDiagnosisDao;

    @Resource
    DiseaseDao diseaseDao;

    RegexProcess regexProcess = new RegexProcess();

    /**
     * 列出该位医生的常用诊断
     *
     * @return
     */
    @Override
    public List<CommonDiagnosis> listCommonDiagnosis(Integer doctorID) {
        CommonDiagnosisExample commonDiagnosisExample = new CommonDiagnosisExample();
        CommonDiagnosisExample.Criteria criteria = commonDiagnosisExample.createCriteria();
        if (doctorID != null) {
            criteria.andDoctorIDEqualTo(doctorID);
        }
        return commonDiagnosisDao.selectByExample(commonDiagnosisExample);
    }

    /**
     * 增加一个常用诊断
     *
     * @return
     */
    @Override
    public Integer addCommonDiagnosis(Integer doctorID, Integer diagnosisID) {
        CommonDiagnosis commonDiagnosis = new CommonDiagnosis();
        commonDiagnosis.setAppearUserID(doctorID);
        commonDiagnosis.setDoctorID(doctorID);
        commonDiagnosis.setDiagnosisID(diagnosisID);
        commonDiagnosis.setAppearDate(new Date());
        commonDiagnosis.setStatus("1");
        return commonDiagnosisDao.insert(commonDiagnosis);

    }

    /**
     * 批量增加为常用诊断
     *
     * @return
     */
    @Override
    public boolean addCommonDiagnosisList(Integer doctorID, IdDTO idDTO) {
        List<Integer> ids = idDTO.getId();
        for (int i = 0; i < ids.size(); i++) {
            this.addCommonDiagnosis(doctorID, ids.get(i));
        }
        return true;
    }

    /**
     * 模糊查询一个病
     *
     * @return
     */
    @Override
    public List<Disease> searchDisease(String str) {
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        DiseaseExample.Criteria criteria1 = diseaseExample.createCriteria();
        DiseaseExample.Criteria criteria2 = diseaseExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();

        if (str != null) {
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andDiseaseIcdLike("%" + searchd + "%");

        }
        diseaseExample.or(criteria1);
        diseaseExample.or(criteria2);
        return diseaseDao.selectByExample(diseaseExample);
    }

    /**
     * 删除一个常用诊断
     *
     * @return
     */
    @Override
    public Integer deleteCommonDiagnosis(Integer commonDiagnosisID, Integer userID) {
        //搜到后给status置0
        CommonDiagnosis commonDiagnosis = commonDiagnosisDao.selectByPrimaryKey(commonDiagnosisID);
        commonDiagnosis.setStatus("0");
        commonDiagnosis.setChangeUserID(userID);
        commonDiagnosis.setChangeDate(new Date());
        commonDiagnosisDao.updateByPrimaryKeySelective(commonDiagnosis);
        return commonDiagnosisID;
    }

    /**
     * 批量删除
     *
     * @return
     */
    @Override
    public boolean deleteCommonDiagnosisList(IdDTO idDTO, Integer userID) {
        List<Integer> ids = idDTO.getId();
        for (int i = 0; i < ids.size(); i++) {
            this.deleteCommonDiagnosis(ids.get(i), userID);
        }
        return true;
    }

    /**
     * 更新，返回被更新的ID
     *
     * @return
     */
    @Override
    public Integer updateCommonDiagnosis(CommonDiagnosis commonDiagnosis, Integer userID) {
        commonDiagnosis.setChangeDate(new Date());
        commonDiagnosis.setChangeUserID(userID);
        commonDiagnosisDao.updateByPrimaryKeySelective(commonDiagnosis);
        return commonDiagnosis.getId();
    }

    /**
     * @return
     * @Override 根据id显示该条常用诊断
     */
    public CommonDiagnosis searchCommonDiagnosis(Integer commonDiagnosisID) {
        return commonDiagnosisDao.selectByPrimaryKey(commonDiagnosisID);
    }
}
