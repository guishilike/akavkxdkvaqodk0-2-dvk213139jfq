package edu.neu.hospital.service.medicalTechService.impl;


import edu.neu.hospital.bean.basicTableBean.PrescriptionDetail;

import edu.neu.hospital.bean.takeMedicineBean.TakeMedDetailsView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedicineFormView;
import edu.neu.hospital.dao.TakeMedicineDao.TakeMedDetailsViewDao;
import edu.neu.hospital.dao.TakeMedicineDao.TakeMedicineFormViewDao;
import edu.neu.hospital.dao.basicTableDao.PrescriptionDetailDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.takeMedicineExample.TakeMedDetailsViewExample;
import edu.neu.hospital.example.takeMedicineExample.TakeMedicineFormViewExample;
import edu.neu.hospital.service.medicalTechService.TakeMedicineService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class TakeMedicineServiceImpl implements TakeMedicineService {
    private RegexProcess regexProcess = new RegexProcess();
    @Resource
    private TakeMedicineFormViewDao takemedicineformviewDao;

    @Resource
    private TakeMedDetailsViewDao takemeddetailsviewDao;
    @Resource
    private PrescriptionDetailDao prescriptiondetailDao;


    /**
     * 取药搜索表单信息
     *
     * @param search 取药搜索表单搜索框的内容
     * @param startDate 取药搜索表单限制开始日期
     * @param endDate 取药搜索表单限制结束日期
     * @return 取药搜索结果表单信息
     */

    public List<TakeMedicineFormView> takemedicineformview(String search, Date startDate,Date endDate) {
        TakeMedicineFormViewExample takemedicineformviewExample = new TakeMedicineFormViewExample();
 
        TakeMedicineFormViewExample.Criteria criteria = takemedicineformviewExample.createCriteria();
        TakeMedicineFormViewExample.Criteria criteria1 = takemedicineformviewExample.createCriteria();
        TakeMedicineFormViewExample.Criteria criteria2 = takemedicineformviewExample.createCriteria();
        //查询匹配限制日期、标识的项目


        criteria.andMarkEqualTo(151);
        criteria1.andMarkEqualTo(151);
        criteria2.andMarkEqualTo(151);

        if (startDate != null&&endDate!=null) {
            criteria.andAppearDateBetween(startDate, endDate);
            criteria1.andAppearDateBetween(startDate, endDate);
            criteria2.andAppearDateBetween(startDate, endDate);
        }
        //返回表单搜索内容作搜索关联匹配查询
        if (search != null) {
            //去除空格
            String searchd = regexProcess.regexProcess02(search);
            criteria.andPatientNameLike("%" + searchd + "%");
            if (regexProcess.regexProcess03(search)) {
                criteria1.andIdEqualTo(Integer.valueOf(search));
                takemedicineformviewExample.or(criteria1);
            }
            if (regexProcess.regexProcess03(search)) {
                criteria2.andMedicalRecordIDEqualTo(Integer.valueOf(search));
                takemedicineformviewExample.or(criteria2);
            }
        }

        return takemedicineformviewDao.selectByExample(takemedicineformviewExample);

    }


    /**
     * 显示处方详情
     *
     * @param prescriptionID 处方ID
     * @param mark 取药标记
     * @return 处方详情
     */
    public List<TakeMedDetailsView> takemeddetailsview(Integer prescriptionID,Integer mark) {

        TakeMedDetailsViewExample takemeddetailsviewExample = new TakeMedDetailsViewExample();
        TakeMedDetailsViewExample.Criteria criteria = takemeddetailsviewExample.createCriteria();
        if(mark==138||mark==139||mark==140){
            criteria.andIsPaidEqualTo(133);
            criteria.andIsGotDrugsEqualTo(mark);
        }
        else if(mark==134){
            criteria.andIsPaidEqualTo(mark);
        }
        criteria.andPrescriptionIDEqualTo(prescriptionID);
        return takemeddetailsviewDao.selectByExample(takemeddetailsviewExample);
    }

    /**
     * 批量取药
     *
     * @param presdetailsIDs 取药编号列表
     * @param userID 取药人编号
     */
    public void takeMedicine(IdDTO presdetailsIDs, Integer userID) {
        List<Integer> presdetailsIDList = presdetailsIDs.getId();
        for (Integer ID : presdetailsIDList) {
            PrescriptionDetail prescriptiondetail = prescriptiondetailDao.selectByPrimaryKey(ID);
            prescriptiondetail.setIsGotDrugs(138);
            prescriptiondetail.setChangeUserID(userID);
            prescriptiondetail.setChangeDate(new Date());
            prescriptiondetailDao.updateByPrimaryKeySelective(prescriptiondetail);
        }
    }



    /**
     * 批量退药
     *
     * @param  presdetailsIDs 退药编号列表
     * @param userID 退药人编号
     */
    public void withdrawMedicine(IdDTO presdetailsIDs, Integer userID) {
        List<Integer> presdetailsIDList = presdetailsIDs.getId();
        for (Integer ID : presdetailsIDList) {
            PrescriptionDetail prescriptiondetail = prescriptiondetailDao.selectByPrimaryKey(ID);
            prescriptiondetail.setIsGotDrugs(140);
            prescriptiondetail.setChangeUserID(userID);
            prescriptiondetail.setChangeDate(new Date());
            prescriptiondetailDao.updateByPrimaryKeySelective(prescriptiondetail);
        }
    }



}










