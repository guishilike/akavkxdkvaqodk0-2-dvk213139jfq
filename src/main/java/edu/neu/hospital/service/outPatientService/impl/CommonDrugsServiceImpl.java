package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.CommonDrugs;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.dao.basicTableDao.CommonDrugsDao;
import edu.neu.hospital.dao.basicTableDao.DrugsDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.CommonDrugsExample;
import edu.neu.hospital.example.basicTableExample.DrugsExample;
import edu.neu.hospital.service.outPatientService.CommonDrugService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CommonDrugsServiceImpl implements CommonDrugService {
    @Resource
    CommonDrugsDao commonDrugsDao;
    @Resource
    DrugsDao drugsDao;
    RegexProcess regexProcess = new RegexProcess();
    /**
     * 列出该位医生的常用药
     * @param doctorID
     * @return
     */
    @Override
    public List<CommonDrugs> listCommonDrugs(Integer doctorID) {
        CommonDrugsExample commonDrugsExample = new CommonDrugsExample();
        CommonDrugsExample.Criteria criteria = commonDrugsExample.createCriteria();
        if( doctorID != null){
            criteria.andDoctorIDEqualTo(doctorID);
        }
        return commonDrugsDao.selectByExample(commonDrugsExample);
    }

    /**
     * 增加一个常用诊断
     * @param doctorID
     * @param drugID
     * @return
     */
    @Override
    public Integer addCommonDrugs(Integer doctorID, Integer drugID) {
        CommonDrugs commonDrugs = new CommonDrugs();
        commonDrugs.setAppearUserID(doctorID);
        commonDrugs.setDoctorID(doctorID);
        commonDrugs.setDrugID(drugID);
        commonDrugs.setAppearDate(new Date());
        commonDrugs.setStatus("1");
        return commonDrugsDao.insert(commonDrugs);

    }

    /**
     * 批量增加为常用诊断
     * @param doctorID
     * @param idDTO
     * @return
     */
    @Override
    public boolean addCommonDrugsList(Integer doctorID, IdDTO idDTO) {
        List<Integer> ids = idDTO.getId();
        for (int i = 0; i < ids.size() ; i ++){
            this.addCommonDrugs(doctorID , ids.get(i));
        }
        return true;
    }

    /**
     * 模糊查询一个病
     * @param str
     * @return
     */
    @Override
    public List<Drugs> searchDrugs(String str) {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        DrugsExample.Criteria criteria1 = drugsExample.createCriteria();
        DrugsExample.Criteria criteria2 = drugsExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();

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

    /**
     * 删除一个常用诊断
     * @param commonDrugsID
     * @param userID
     * @return
     */
    @Override
    public Integer deleteCommonDrugs(Integer commonDrugsID, Integer userID) {
        //搜到后给status置0
        CommonDrugs commonDrugs = commonDrugsDao.selectByPrimaryKey(commonDrugsID);
        commonDrugs.setStatus("0");
        commonDrugs.setChangeUserID(userID);
        commonDrugs.setChangeDate(new Date());
        commonDrugsDao.updateByPrimaryKeySelective(commonDrugs);
        return commonDrugsID;
    }

    /**
     * 批量删除
     * @param idDTO
     * @param userID
     * @return
     */
    @Override
    public boolean deleteCommonDrugsList(IdDTO idDTO, Integer userID) {
        List<Integer> ids = idDTO.getId();
        for( int i  =0  ;i < ids.size() ; i++){
            this.deleteCommonDrugs(ids.get(i) , userID);
        }
        return true;
    }

    /**
     * 更新，返回被更新的ID
     * @param commonDrugs
     * @param userID
     * @return
     */
    @Override
    public Integer updateCommonDrugs(CommonDrugs commonDrugs, Integer userID) {
        commonDrugs.setChangeDate(new Date());
        commonDrugs.setChangeUserID(userID);
        commonDrugsDao.updateByPrimaryKeySelective(commonDrugs);
        return commonDrugs.getId();
    }

    /**@Override
     * 根据id显示该条常用诊断
     * @param commonDrugsID
     * @return
     */
    public CommonDrugs searchCommonDrugs(Integer commonDrugsID) {
        return commonDrugsDao.selectByPrimaryKey(commonDrugsID);
    }
}


