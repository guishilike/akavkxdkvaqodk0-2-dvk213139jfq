package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.CommonInspection;
import edu.neu.hospital.bean.basicTableBean.CommonInspectionView;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.dao.baseDao.FMedItemViewDao;
import edu.neu.hospital.dao.basicTableDao.CommonInspectionDao;
import edu.neu.hospital.dao.basicTableDao.CommonInspectionViewDao;
import edu.neu.hospital.dao.basicTableDao.FMedItemDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.CommonInspectionExample;
import edu.neu.hospital.example.basicTableExample.CommonInspectionViewExample;
import edu.neu.hospital.example.basicTableExample.FMedItemExample;
import edu.neu.hospital.service.outPatientService.CommonInspectionService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommonInspectionServiceImpl implements CommonInspectionService {

    @Resource
    CommonInspectionDao commonInspectionDao;

    @Resource
    FMedItemDao fMedItemDao;
    @Resource
    FMedItemViewDao fMedItemViewDao;

    @Resource
    CommonInspectionViewDao commonInspectionViewDao;

    RegexProcess regexProcess = new RegexProcess();
    /**
     * 列出该位医生的常用诊断
     * @param doctorID
     * @return
     */
    @Override
    public List<CommonInspectionView> listCommonInspection(Integer doctorID) {
        CommonInspectionViewExample commonInspectionViewExample = new CommonInspectionViewExample();
        CommonInspectionViewExample.Criteria criteria = commonInspectionViewExample.createCriteria();
        if( doctorID != null){
            criteria.andDoctorIDEqualTo(doctorID);
        }
        return commonInspectionViewDao.selectByExample(commonInspectionViewExample);
    }

    /**
     * 增加一个常用诊断
     * @param doctorID
     * @param inspectionID
     * @return
     */
    @Override
    public Integer addCommonInspection(Integer doctorID, Integer inspectionID) {
        CommonInspection commonInspection = new CommonInspection();
        commonInspection.setAppearUserID(doctorID);
        commonInspection.setDoctorID(doctorID);
        commonInspection.setfMedItemID(inspectionID);
        //commonInspection.setAppearDate(new Date());
        commonInspection.setStatus("1");
        return commonInspectionDao.insert(commonInspection);

    }

    /**
     * 批量增加为常用诊断
     * @param doctorID
     * @param idDTO
     * @return
     */
    @Override
    public boolean addCommonInspectionList(Integer doctorID, IdDTO idDTO) {
        List<Integer> ids = idDTO.getId();
        for (int i = 0; i < ids.size() ; i ++){
            this.addCommonInspection(doctorID , ids.get(i));
        }
        return true;
    }

    /**
     * 模糊查询一个检查
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
     * @param commonInspectionID
     * @param userID
     * @return
     */
    @Override
    public Integer deleteCommonInspection(Integer commonInspectionID, Integer userID) {
        //搜到后给status置0
        CommonInspection commonInspection = commonInspectionDao.selectByPrimaryKey(commonInspectionID);
        commonInspection.setStatus("0");
        commonInspection.setChangeUserID(userID);
       // commonInspection.setChangeDate(new Date());
        commonInspectionDao.updateByPrimaryKeySelective(commonInspection);
        return commonInspectionID;
    }

    /**
     * 批量删除
     * @param idDTO
     * @param userID
     * @return
     */
    @Override
    public boolean deleteCommonInspectionList(IdDTO idDTO, Integer userID) {
        List<Integer> ids = idDTO.getId();
        for( int i  =0  ;i < ids.size() ; i++){
            this.deleteCommonInspection(ids.get(i) , userID);
        }
        return true;
    }

    /**
     * 更新，返回被更新的ID
     * @param commonInspection
     * @param userID
     * @return
     */
    @Override
    public Integer updateCommonInspection(CommonInspection commonInspection, Integer userID) {
        //commonInspection.setChangeDate(new Date());
        commonInspection.setChangeUserID(userID);
        commonInspectionDao.updateByPrimaryKeySelective(commonInspection);
        return commonInspection.getId();
    }

    /**@Override
     * 根据id显示该条常用诊断
     * @param commonInspectionID
     * @return
     */
    public CommonInspection searchCommonInspection(Integer commonInspectionID) {
        return commonInspectionDao.selectByPrimaryKey(commonInspectionID);
    }
    @Override
    public List<NameCodeDTO> getAllFMedItemNamesAndCodes() {
        return fMedItemViewDao.selectAllFMedNamesAndCodes();
    }
}



