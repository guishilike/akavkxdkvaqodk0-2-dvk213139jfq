package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.CommonDiposals;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.dao.basicTableDao.CommonDiposalsDao;
import edu.neu.hospital.dao.basicTableDao.FMedItemDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.CommonDiposalsExample;
import edu.neu.hospital.example.basicTableExample.FMedItemExample;
import edu.neu.hospital.service.outPatientService.CommonDisposalService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommonDisposalServiceImp implements CommonDisposalService {
    @Resource
    CommonDiposalsDao commonDiposalsDao;
    @Resource
    FMedItemDao fMedItemDao;

    RegexProcess regexProcess = new RegexProcess();
    /**
     * 列出该位医生的常用诊断
     * @param doctorID
     * @return
     */
    @Override
    public List<CommonDiposals> listCommonDiposals(Integer doctorID) {
        CommonDiposalsExample commonDiposalsExample = new CommonDiposalsExample();
        CommonDiposalsExample.Criteria criteria = commonDiposalsExample.createCriteria();
        if( doctorID != null){
            criteria.andDoctorIDEqualTo(doctorID);
        }
        return commonDiposalsDao.selectByExample(commonDiposalsExample);
    }

    /**
     * 增加一个常用诊断
     * @param doctorID
     * @param diposalID
     * @return
     */
    @Override
    public Integer addCommonDiposals(Integer doctorID, Integer diposalID) {
        CommonDiposals commonDiposals = new CommonDiposals();
        System.out.println("1");
        commonDiposals.setAppearUserID(doctorID);
        commonDiposals.setDoctorID(doctorID);
        commonDiposals.setDiposalID(diposalID);
        System.out.println("2");
        //commonDiposals.setAppearDate(new Date());
        commonDiposals.setStatus("1");
        System.out.println(commonDiposals.toString());
        return commonDiposalsDao.insert(commonDiposals);

    }

    /**
     * 批量增加为常用诊断
     * @param doctorID
     * @param idDTO
     * @return
     */
    @Override
    public boolean addCommonDiposalsList(Integer doctorID, IdDTO idDTO) {
        List<Integer> ids = idDTO.getId();
        for (int i = 0; i < ids.size() ; i ++){
            this.addCommonDiposals(doctorID , ids.get(i));
        }
        return true;
    }

    /**
     * 模糊查询一个处置
     * @param str
     * @return
     */
    @Override
    public List<FMedItem> searchDiposal(String str) {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria1 = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria2 = fMedItemExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();

        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andMnemonicCodeLike("%" + searchd + "%");

        }
        fMedItemExample.or(criteria1);
        fMedItemExample.or(criteria2);
        return fMedItemDao.selectByExample(fMedItemExample);
    }

    /**
     * 删除一个常用诊断
     * @param commonDiposalsID
     * @param userID
     * @return
     */
    @Override
    public Integer deleteCommonDiposals(Integer commonDiposalsID, Integer userID) {
        //搜到后给status置0
        CommonDiposals commonDiposals = commonDiposalsDao.selectByPrimaryKey(commonDiposalsID);
        commonDiposals.setStatus("0");
        commonDiposals.setChangeUserID(userID);
        //commonDiposals.setChangeDate(new Date());
        commonDiposalsDao.updateByPrimaryKeySelective(commonDiposals);
        return commonDiposalsID;
    }

    /**
     * 批量删除
     * @param idDTO
     * @param userID
     * @return
     */
    @Override
    public boolean deleteCommonDiposalsList(IdDTO idDTO, Integer userID) {
        List<Integer> ids = idDTO.getId();
        for( int i  =0  ;i < ids.size() ; i++){
            this.deleteCommonDiposals(ids.get(i) , userID);
        }
        return true;
    }

    /**
     * 更新，返回被更新的ID
     * @param commonDiposals
     * @param userID
     * @return
     *
     */
    @Override
    public Integer updateCommonDiposals(CommonDiposals commonDiposals, Integer userID) {
        //commonDiposals.setChangeDate(new Date());
        Integer id = commonDiposals.getId();
        CommonDiposals index = commonDiposalsDao.selectByPrimaryKey(id);
        if(index.getStatus().equals("0")) return -1;
        commonDiposals.setChangeUserID(userID);
        commonDiposalsDao.updateByPrimaryKeySelective(commonDiposals);
        return commonDiposals.getId();
    }

    /**@Override
     * 根据id显示该条常用诊断
     * @param commonDiposalsID
     * @return
     */
    public CommonDiposals searchCommonDiposals(Integer commonDiposalsID) {
        return commonDiposalsDao.selectByPrimaryKey(commonDiposalsID);
    }
}

