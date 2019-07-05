package edu.neu.hospital.service.registerAndCharge.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.tollBean.*;
import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dao.tollDao.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.FeeExample;
import edu.neu.hospital.example.basicTableExample.PatientCardExample;
import edu.neu.hospital.example.tollExample.*;
import edu.neu.hospital.service.registerAndCharge.TollService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
public class TollServiceImpl implements TollService {
    private RegexProcess regexProcess = new RegexProcess();
    @Resource
    private FeeDao feeDao;
   
    @Resource
    private PatientCardDao patientcardDao;
    @Resource
    private PatientCardFeeRecordDao patientcardfeerecordDao;

    @Resource
    private TollInspectViewDao tollinspectviewDao;
    @Resource
    private TollDisposalViewDao tolldisposalviewDao;
    @Resource
    private TollPresViewDao tollpresviewDao;
    @Resource 
    private TollMatViewDao tollmatviewDao;
    @Resource
    private TollMedViewDao tollmedviewDao;
    @Resource
    private TollRegViewDao tollregviewDao;
    @Resource
    private FeeviewDao feeviewDao;
    @Resource
    private DailySettleViewDao dailysettleviewDao;
    
    @Resource
    private InspectionDetailsDao inspectiondetailsDao;
    @Resource
    private DisposalDetailsDao disposalDetailsDao;
    @Resource
    private PrescriptionDetailDao prescriptiondetailDao;
    @Resource 
    private MedicinesMaterialsListDao medicinesmaterialslistDao;
    @Resource
    private RegistrationInfoDao registrationinfoDao;
    @Resource
    private DailySettlementDao dailysettlementDao;
    @Resource
    private MedicalRecordDao medicalRecordDao;



    /**
     * 收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     */

    private void setCrireria(FeeExample.Criteria criteria, String search, Date startDate, Date endDate, Integer payStatus){

        if ((startDate != null) && (endDate != null)) {
            criteria.andFeeAppearDateBetween(startDate, endDate);
        }
        if(payStatus!=null){
            criteria.andPayStatusEqualTo(payStatus);
        }
        //返回表单搜索内容作搜索关联匹配查询
        if (search != null &&!search.equals("")) {
            //去除空格
            String searchd = regexProcess.regexProcess02(search);
            if (regexProcess.regexProcess03(searchd)){
                criteria.andMedicalRecordIDEqualTo(Integer.valueOf(searchd));
            }
        }
    }


    /**
     * 检查收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    public List<TollInspectView> tollInspection(String search, Date startDate, Date endDate, Integer payStatus) {
        List<TollInspectView> tollInspectViewList = new ArrayList<>();
        FeeExample feeExample = new FeeExample();
        FeeExample.Criteria criteria = feeExample.createCriteria();
        setCrireria(criteria,search,startDate,endDate,payStatus);
        List<Fee> feeList = feeDao.selectByExample(feeExample);
        for (Fee fee : feeList) {
            if (fee.getExpID() == 3||fee.getExpID() == 5||fee.getExpID() == 7||fee.getExpID() == 9||fee.getExpID() == 11) {
                TollInspectViewExample tollinspectviewExample = new TollInspectViewExample();
                TollInspectViewExample.Criteria criteriaV = tollinspectviewExample.createCriteria();
                criteriaV.andMedicalRecordIDEqualTo(fee.getMedicalRecordID());
                criteriaV.andChargeItemIDEqualTo(fee.getChargeItemID());
                criteriaV.andExpIDEqualTo(fee.getExpID());
                tollInspectViewList.addAll(tollinspectviewDao.selectByExample(tollinspectviewExample));
            }
        }
        return tollInspectViewList;

    }


    /**
     * 处置收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    public List<TollDisposalView> tolldisposal(String search, Date startDate, Date endDate, Integer payStatus) {
        List<TollDisposalView> tollDisposalViewList = new ArrayList<>();

        FeeExample feeExample = new FeeExample();
        FeeExample.Criteria criteria = feeExample.createCriteria();

        setCrireria(criteria,search,startDate,endDate,payStatus);
        List<Fee> feeList = feeDao.selectByExample(feeExample);
        for (Fee fee : feeList) {
            if (fee.getExpID() == 16) {
                TollDisposalViewExample tolldisposalviewExample = new TollDisposalViewExample();
                TollDisposalViewExample.Criteria criteriaV = tolldisposalviewExample.createCriteria();
                criteriaV.andMedicalRecordIDEqualTo(fee.getMedicalRecordID());
                criteriaV.andChargeItemIDEqualTo(fee.getChargeItemID());
                criteriaV.andExpIDEqualTo(fee.getExpID());
                tollDisposalViewList.addAll(tolldisposalviewDao.selectByExample(tolldisposalviewExample));
            }
        }
        return tollDisposalViewList;

    }



    /**
     * 处方收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    public List<TollPresView> tollpres(String search, Date startDate, Date endDate, Integer payStatus) {
        List<TollPresView> tollPresViewList = new ArrayList<>();

        FeeExample feeExample = new FeeExample();
        FeeExample.Criteria criteria = feeExample.createCriteria();

        setCrireria(criteria,search,startDate,endDate,payStatus);
        List<Fee> feeList = feeDao.selectByExample(feeExample);
        for (Fee fee : feeList) {
            if (fee.getExpID() == 13||fee.getExpID() == 14||fee.getExpID() == 15) {
                TollPresViewExample tollpresviewExample = new TollPresViewExample();
                TollPresViewExample.Criteria criteriaV = tollpresviewExample.createCriteria();
                criteriaV.andMedicalRecordIDEqualTo(fee.getMedicalRecordID());
                criteriaV.andChargeItemIDEqualTo(fee.getChargeItemID());
                criteriaV.andExpIDEqualTo(fee.getExpID());
                tollPresViewList.addAll(tollpresviewDao.selectByExample(tollpresviewExample));
            }
        }
        return tollPresViewList;

    }


    /**
     * 材料收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    public List<TollMatView> tollmat(String search, Date startDate, Date endDate, Integer payStatus) {
        List<TollMatView> tollMatViewList = new ArrayList<>();

        FeeExample feeExample = new FeeExample();
        FeeExample.Criteria criteria = feeExample.createCriteria();

        setCrireria(criteria,search,startDate,endDate,payStatus);
        List<Fee> feeList = feeDao.selectByExample(feeExample);
        for (Fee fee : feeList) {
            if (fee.getExpID() == 4||fee.getExpID() == 6||fee.getExpID() == 8||fee.getExpID() == 10||fee.getExpID() == 12||fee.getExpID() ==17 ) {
                TollMatViewExample tollmatviewExample = new TollMatViewExample();
                TollMatViewExample.Criteria criteriaV = tollmatviewExample.createCriteria();
                criteriaV.andMedicalRecordIDEqualTo(fee.getMedicalRecordID());
                criteriaV.andChargeItemIDEqualTo(fee.getChargeItemID());
                criteriaV.andExpIDEqualTo(fee.getExpID());
                tollMatViewList.addAll(tollmatviewDao.selectByExample(tollmatviewExample));
            }
        }
        return tollMatViewList;

    }


    /**
     * 项目药品收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    public List<TollMedView> tollmed(String search, Date startDate, Date endDate, Integer payStatus) {
        List<TollMedView> tollMedViewList = new ArrayList<>();

        FeeExample feeExample = new FeeExample();
        FeeExample.Criteria criteria = feeExample.createCriteria();

        setCrireria(criteria,search,startDate,endDate,payStatus);
        List<Fee> feeList = feeDao.selectByExample(feeExample);
        for (Fee fee : feeList) {
            if (fee.getExpID() == 22||fee.getExpID() == 23) {
                TollMedViewExample tollmedviewExample = new TollMedViewExample();
                TollMedViewExample.Criteria criteriaV = tollmedviewExample.createCriteria();
                criteriaV.andMedicalRecordIDEqualTo(fee.getMedicalRecordID());
                criteriaV.andChargeItemIDEqualTo(fee.getChargeItemID());
                criteriaV.andExpIDEqualTo(fee.getExpID());
                tollMedViewList.addAll(tollmedviewDao.selectByExample(tollmedviewExample));
            }
        }
        return tollMedViewList;

    }


    /**
     * 挂号收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    public List<TollRegView> tollreg(String search, Date startDate, Date endDate, Integer payStatus) {
        List<TollRegView> tollRegViewList = new ArrayList<>();

        FeeExample feeExample = new FeeExample();
        FeeExample.Criteria criteria = feeExample.createCriteria();

        setCrireria(criteria,search,startDate,endDate,payStatus);
        List<Fee> feeList = feeDao.selectByExample(feeExample);
        for (Fee fee : feeList) {
            if (fee.getExpID() == 1) {
                TollRegViewExample tollregviewExample = new TollRegViewExample();
                TollRegViewExample.Criteria criteriaV = tollregviewExample.createCriteria();
                criteriaV.andMedicalRecordIDEqualTo(fee.getMedicalRecordID());
                criteriaV.andChargeItemIDEqualTo(fee.getChargeItemID());
                criteriaV.andExpIDEqualTo(fee.getExpID());
                tollRegViewList.addAll(tollregviewDao.selectByExample(tollregviewExample));
            }
        }
        return tollRegViewList;

    }
    
    /**
     * 缴费
     *
     * @param feeIDs 缴费编号
     * @param tollManID 收费员编号
     * @return 缴费结果
     */
    public String toll(IdDTO feeIDs, Integer tollManID) {
        String result = "缴费成功";


        List<Integer> feeIDList = feeIDs.getId();
        Fee feeSearch = feeDao.selectByPrimaryKey(feeIDList.get(0));
        Integer patientID=medicalRecordDao.selectByPrimaryKey(feeSearch.getMedicalRecordID()).getPatientID();

        PatientCardExample patientCardExample=new PatientCardExample();
        PatientCardExample.Criteria criteria=patientCardExample.createCriteria();
        criteria.andPatientIDEqualTo(patientID);

        PatientCard patientcard = patientcardDao.selectByExample(patientCardExample).get(0);


        BigDecimal feeExpected = new BigDecimal(0);
        for (Integer feeID : feeIDList) {
            Fee fee = feeDao.selectByPrimaryKey(feeID);
            feeExpected=feeExpected.add(fee.getFee());
        }


        if (feeExpected.compareTo(patientcard.getMoney()) > 0) {
            result = "余额不足";
            return result;
        }
        BigDecimal feeTotal = new BigDecimal(0);
        for (Integer feeID : feeIDList) {
            Fee fee = feeDao.selectByPrimaryKey(feeID);
            if (fee.getExpID() == 3||fee.getExpID() == 5||fee.getExpID() == 7||fee.getExpID() == 9||fee.getExpID() == 11) {
                fee.setTollManID(tollManID);
                fee.setTollDate(new Date());
                fee.setPayStatus(133);
                feeDao.updateByPrimaryKeySelective(fee);
                InspectionDetails inspectiondetails = inspectiondetailsDao.selectByPrimaryKey(fee.getChargeItemID());
                inspectiondetails.setIsPaid(133);
                inspectiondetailsDao.updateByPrimaryKeySelective(inspectiondetails);
                feeTotal=feeTotal.add(fee.getFee());
            }
            else if(fee.getExpID() == 16){
                fee.setTollManID(tollManID);
                fee.setTollDate(new Date());
                fee.setPayStatus(133);
                feeDao.updateByPrimaryKeySelective(fee);
                DisposalDetails disposaldetials= disposalDetailsDao.selectByPrimaryKey(fee.getChargeItemID());
                disposaldetials.setIsPaid(133);
                disposalDetailsDao.updateByPrimaryKeySelective(disposaldetials);
                feeTotal=feeTotal.add(fee.getFee());
            }
            else if(fee.getExpID() == 13||fee.getExpID() == 14||fee.getExpID() == 15){
                fee.setTollManID(tollManID);
                fee.setTollDate(new Date());
                fee.setPayStatus(133);
                feeDao.updateByPrimaryKeySelective(fee);
                PrescriptionDetail prescriptiondetail=prescriptiondetailDao.selectByPrimaryKey(fee.getChargeItemID());
                prescriptiondetail.setIsPaid(133);
                prescriptiondetailDao.updateByPrimaryKeySelective(prescriptiondetail);
                feeTotal=feeTotal.add(fee.getFee());
            }
            else if(fee.getExpID() == 4||fee.getExpID() == 6||fee.getExpID() == 8||fee.getExpID() == 10||fee.getExpID() == 12||fee.getExpID() == 17
                    ||fee.getExpID() == 22||fee.getExpID() == 23){
                fee.setTollManID(tollManID);
                fee.setTollDate(new Date());
                fee.setPayStatus(133);
                feeDao.updateByPrimaryKeySelective(fee);
                MedicinesMaterialsList medicinesmaterialslist=medicinesmaterialslistDao.selectByPrimaryKey(fee.getChargeItemID());
                medicinesmaterialslist.setIsPaid(133);
                medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
                feeTotal=feeTotal.add(fee.getFee());
            }
            else if(fee.getExpID() == 1){
                fee.setTollManID(tollManID);
                fee.setTollDate(new Date());
                fee.setPayStatus(133);
                feeDao.updateByPrimaryKeySelective(fee);
                PrescriptionDetail prescriptiondetail=prescriptiondetailDao.selectByPrimaryKey(fee.getChargeItemID());
                prescriptiondetail.setIsPaid(133);
                prescriptiondetailDao.updateByPrimaryKeySelective(prescriptiondetail);
                feeTotal=feeTotal.add(fee.getFee());
            }
        }
        PatientCardFeeRecord patientcardfeerecord=new PatientCardFeeRecord();
        setPatientFeeRecord(patientcardfeerecord,patientcard,"0",feeTotal,tollManID);
        patientcard.setMoney(patientcard.getMoney().subtract(feeTotal));
        patientcardDao.updateByPrimaryKeySelective(patientcard);
        return result;
    }



    /**
     * 退费
     *
     * @param feeIDs 退费编号
     * @param tollManID 收费员编号
     * @return 退费结果
     */
    public String refund(IdDTO feeIDs, Integer tollManID) {
        String result = "退费成功";


        List<Integer> feeIDList = feeIDs.getId();
        Fee feeSearch = feeDao.selectByPrimaryKey(feeIDList.get(0));
        Integer patientID=medicalRecordDao.selectByPrimaryKey(feeSearch.getMedicalRecordID()).getPatientID();

        PatientCardExample patientCardExample=new PatientCardExample();
        PatientCardExample.Criteria criteria=patientCardExample.createCriteria();
        criteria.andPatientIDEqualTo(patientID);
        PatientCard patientcard = patientcardDao.selectByExample(patientCardExample).get(0);

        BigDecimal feeTotal = new BigDecimal(0);
        for (Integer feeID : feeIDList) {
            Fee fee = feeDao.selectByPrimaryKey(feeID);
            if(fee.getDateStatus()==147){
                return "已日结";
            }
            if (fee.getExpID() == 3||fee.getExpID() == 5||fee.getExpID() == 7||fee.getExpID() == 9||fee.getExpID() == 11) {
                InspectionDetails inspectiondetails = inspectiondetailsDao.selectByPrimaryKey(fee.getChargeItemID());
                if(inspectiondetails.getIsRegistered()==137){
                fee.setTollManID(tollManID);
                fee.setTollDate(new Date());
                fee.setPayStatus(135);
                feeDao.updateByPrimaryKeySelective(fee);
                inspectiondetails.setIsPaid(135);
                inspectiondetailsDao.updateByPrimaryKeySelective(inspectiondetails);
                    feeTotal=feeTotal.add(fee.getFee());
                }else if(inspectiondetails.getIsChecked()==136){
                     result="检查已登记";
                     return result;
                }
            }
            else if(fee.getExpID() == 16){
                DisposalDetails disposaldetials= disposalDetailsDao.selectByPrimaryKey(fee.getChargeItemID());
                if(disposaldetials.getIsRegistered()==137) {
                    fee.setTollManID(tollManID);
                    fee.setTollDate(new Date());
                    fee.setPayStatus(135);
                    feeDao.updateByPrimaryKeySelective(fee);
                    disposaldetials.setIsPaid(135);
                    disposalDetailsDao.updateByPrimaryKeySelective(disposaldetials);
                    feeTotal=feeTotal.add(fee.getFee());
                }
                else if(disposaldetials.getIsRegistered()==136){
                    result="处置已登记";
                    return result;
                }
            }
            else if(fee.getExpID() == 13||fee.getExpID() == 14||fee.getExpID() == 15){
                PrescriptionDetail prescriptiondetail=prescriptiondetailDao.selectByPrimaryKey(fee.getChargeItemID());
                if(prescriptiondetail.getIsGotDrugs()==140||prescriptiondetail.getIsGotDrugs()==139){
                    fee.setTollManID(tollManID);
                    fee.setTollDate(new Date());
                    fee.setPayStatus(135);
                    feeDao.updateByPrimaryKeySelective(fee);
                    prescriptiondetail.setIsPaid(135);
                    prescriptiondetailDao.updateByPrimaryKeySelective(prescriptiondetail);
                    feeTotal=feeTotal.add(fee.getFee());
                }else if(prescriptiondetail.getIsGotDrugs()==138){
                    result="未退药";
                    return  result;
                }

            }
            else if(fee.getExpID() == 4||fee.getExpID() == 6||fee.getExpID() == 8||fee.getExpID() == 10||fee.getExpID() == 12||fee.getExpID() == 17
                    ||fee.getExpID() == 22||fee.getExpID() == 23){
                MedicinesMaterialsList medicinesmaterialslist=medicinesmaterialslistDao.selectByPrimaryKey(fee.getChargeItemID());
                if(medicinesmaterialslist.getIsRegistered()==137) {
                    fee.setTollManID(tollManID);
                    fee.setTollDate(new Date());
                    fee.setPayStatus(135);
                    feeDao.updateByPrimaryKeySelective(fee);
                    medicinesmaterialslist.setIsPaid(135);
                    medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
                    feeTotal=feeTotal.add(fee.getFee());
                }else if(medicinesmaterialslist.getIsRegistered()==136){
                    result="药品材料已登记";
                    return  result;
                }
            }
            else if(fee.getExpID() == 1){
                System.out.println(fee.getChargeItemID());
                Registrationinfo registrationinfo=registrationinfoDao.selectByPrimaryKey(fee.getChargeItemID());
                if(registrationinfo.getRegistrationStatus().equals("2")) {
                    fee.setTollManID(tollManID);
                    fee.setTollDate(new Date());
                    fee.setPayStatus(135);
                    feeDao.updateByPrimaryKeySelective(fee);
                    feeTotal = feeTotal.add(fee.getFee());
                }else {
                    result="未退号";
                    return  result;
                }
            }
        }
        PatientCardFeeRecord patientcardfeerecord=new PatientCardFeeRecord();
        setPatientFeeRecord(patientcardfeerecord,patientcard,"1",feeTotal,tollManID);
        patientcard.setMoney(patientcard.getMoney().add(feeTotal));
        patientcardDao.updateByPrimaryKeySelective(patientcard);

        return result;
    }


    /**
     * 添加病人费用记录
     *  @param patientcardfeerecord  病人费用记录
     * @param patientcard   就诊卡
     * @param type  费用类型：支付或充值
     * @param feeTotal 总费用
     * @param tollManID 收费员编号
     */
    private void setPatientFeeRecord(PatientCardFeeRecord patientcardfeerecord, PatientCard patientcard, String type, BigDecimal feeTotal, Integer tollManID){
        patientcardfeerecord.setCardID(patientcard.getId());
        patientcardfeerecord.setAmount(feeTotal);
        patientcardfeerecord.setType(type);
        patientcardfeerecord.setAppearUserID(tollManID);
        patientcardfeerecord.setAppearDate(new Date());
        patientcardfeerecordDao.insert(patientcardfeerecord);
    }


    /**
     * 日结
     *
     * @param tollManID 日结员编号
     * @param endDate 日结日期
     * @return 日结结果
     */
    public Map<String,Date> dailySettle(Integer tollManID, Date endDate){
        Map<String,Date> result=new HashMap<>();
        DailySettleViewExample dailysettleviewExample=new DailySettleViewExample();
        DailySettleViewExample.Criteria criteria=dailysettleviewExample.createCriteria();
        criteria.andUserIDEqualTo(tollManID);
        List<DailySettleView> dailySettleViewList = dailysettleviewDao.selectByExample(dailysettleviewExample);
        Date startDate=new Date();
        if(dailySettleViewList.size()==0){
            CustomDateConverter customDateConverter=new CustomDateConverter();
            startDate=customDateConverter.getLastDay(startDate);
        }else {

            for(DailySettleView dailySettleView:dailySettleViewList){
            startDate= dailySettleView.getEndTime();
            }
            if(endDate.compareTo(startDate)<=0){
                result.put("已日结",null);
                return result;
            }
        }
        BigDecimal amount=new BigDecimal("0");
        List<FeeView> feeViewList =dailySettleFee(tollManID,startDate,endDate);
        for(FeeView feeview: feeViewList){
            if(feeview.getPayStatus()==133) {
                amount=amount.add(feeview.getFee());
            }
        }
        DailySettlement dailysettlement=new DailySettlement();
        dailysettlement.setAmount(amount);
        dailysettlement.setStartTime(startDate);
        dailysettlement.setEndTime(endDate);
        dailysettlement.setUserID(tollManID);
        dailysettlement.setStatus("1");
        dailysettlementDao.insert(dailysettlement);
        result.put("日结成功",startDate);
        return  result;
    }




    /**
     * 日结信息查询
     *
     * @param tollManID 日结员编号
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 日结信息
     */
    public  List<DailySettleView>  dailySettleSearch(Integer tollManID, Date startDate, Date endDate){
        DailySettleViewExample dailysettleviewExample=new DailySettleViewExample();
        DailySettleViewExample.Criteria criteria=dailysettleviewExample.createCriteria();
        if(startDate!=null&&endDate!=null) {
            criteria.andStartTimeBetween(startDate, endDate);
            criteria.andEndTimeBetween(startDate, endDate);
        }
        criteria.andUserIDEqualTo(tollManID);
        return dailysettleviewDao.selectByExample(dailysettleviewExample);
    }


    /**
     * 日结收费查询
     *
     * @param tollManID 日结员编号
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 日结收费信息
     */
       public List<FeeView> dailySettleFee (Integer tollManID, Date startDate, Date endDate){
           FeeViewExample feeviewExample = new FeeViewExample();
           FeeViewExample.Criteria criteriaF = feeviewExample.createCriteria();
           criteriaF.andTollManIDEqualTo(tollManID);
           criteriaF.andTollDateBetween(startDate,endDate);
           return feeviewDao.selectByExample(feeviewExample);
       }



}
