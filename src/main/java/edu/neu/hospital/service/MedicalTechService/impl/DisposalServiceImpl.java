package edu.neu.hospital.service.MedicalTechService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.disposalBean.*;

import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dao.disposalDao.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.*;
import edu.neu.hospital.example.disposalExample.*;
import edu.neu.hospital.service.MedicalTechService.DisposalService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class DisposalServiceImpl implements DisposalService {
    private RegexProcess regexProcess = new RegexProcess();
    @Resource
    private DisposalFormViewDao DisposalformviewDao;
    @Resource
    private DisposalReViewDao DisposalreviewDao;
    @Resource
    private DisposalMedReViewDao DisposalmedreviewDao;
    @Resource
    private DisposalMatReViewDao DisposalmatreviewDao;
    @Resource
    private MedicinesMaterialsListDao medicinesmaterialslistDao;
    @Resource
    private DrugsDao drugsDao;
    @Resource
    private MaterialsDao materialsDao;
    @Resource
    private DisposalMedPlateViewDao DisposalmedplateviewDao;
    @Resource
    private DisposalMatPlateViewDao DisposalmatplateviewDao;
    @Resource
    private DisposalDetailsDao disposaldetailsDao;
    @Resource
    private FeeDao feeDao;
    @Resource
    private FMedItemDao fMedItemDao;
@Resource
private  RegistrationInfoDao registrationInfoDao;

    /**
     * 处置搜索表单信息
     *
     * @param search   处置搜索表单搜索框的内容
     * @param date     处置搜索表单限制日期
     * @param itemID 处置搜索表单项目编号
     * @param mark     处置表单项目标识
     * @return 处置搜索结果表单信息
     */

    public List<DisposalFormView> disposalformview(String search, Date date, Integer itemID, Integer mark) {
        DisposalFormViewExample disposalformviewExample = new DisposalFormViewExample();

        DisposalFormViewExample.Criteria criteria = disposalformviewExample.createCriteria();
        DisposalFormViewExample.Criteria criteria1 = disposalformviewExample.createCriteria();
        DisposalFormViewExample.Criteria criteria2 = disposalformviewExample.createCriteria();
        DisposalFormViewExample.Criteria criteria3 = disposalformviewExample.createCriteria();
        DisposalFormViewExample.Criteria criteria4 = disposalformviewExample.createCriteria();
        DisposalFormViewExample.Criteria criteria5 = disposalformviewExample.createCriteria();
        DisposalFormViewExample.Criteria criteria6 = disposalformviewExample.createCriteria();
        //查询匹配限制日期、项目名称、标识的项目
        criteria.andIsAbolishedEqualTo(150);
        criteria1.andIsAbolishedEqualTo(150);
        criteria2.andIsAbolishedEqualTo(150);
        criteria3.andIsAbolishedEqualTo(150);
        criteria4.andIsAbolishedEqualTo(150);
        criteria5.andIsAbolishedEqualTo(150);
        criteria6.andIsAbolishedEqualTo(150);
        criteria.andIsDrawnEqualTo(131);
        criteria1.andIsDrawnEqualTo(131);
        criteria2.andIsDrawnEqualTo(131);
        criteria3.andIsDrawnEqualTo(131);
        criteria4.andIsDrawnEqualTo(131);
        criteria5.andIsDrawnEqualTo(131);
        criteria6.andIsDrawnEqualTo(131);

        if (mark != null) {
            if (mark == 134) {
                criteria.andIsPaidEqualTo(mark);
                criteria1.andIsPaidEqualTo(mark);
                criteria2.andIsPaidEqualTo(mark);
                criteria3.andIsPaidEqualTo(mark);
                criteria4.andIsPaidEqualTo(mark);
                criteria5.andIsPaidEqualTo(mark);
                criteria6.andIsPaidEqualTo(mark);
            } else if (mark == 137) {
                criteria.andIsRegisteredEqualTo(mark);
                criteria1.andIsRegisteredEqualTo(mark);
                criteria2.andIsRegisteredEqualTo(mark);
                criteria3.andIsRegisteredEqualTo(mark);
                criteria4.andIsRegisteredEqualTo(mark);
                criteria5.andIsRegisteredEqualTo(mark);
                criteria6.andIsRegisteredEqualTo(mark);
                criteria.andIsCheckedEqualTo(141);
                criteria1.andIsCheckedEqualTo(141);
                criteria2.andIsCheckedEqualTo(141);
                criteria3.andIsCheckedEqualTo(141);
                criteria4.andIsCheckedEqualTo(141);
                criteria5.andIsCheckedEqualTo(141);
                criteria6.andIsCheckedEqualTo(141);
            } else if (mark == 142) {

                criteria.andIsCheckedEqualTo(mark);
                criteria1.andIsCheckedEqualTo(mark);
                criteria2.andIsCheckedEqualTo(mark);
                criteria3.andIsCheckedEqualTo(mark);
                criteria4.andIsCheckedEqualTo(mark);
                criteria5.andIsCheckedEqualTo(mark);
                criteria6.andIsCheckedEqualTo(mark);
                criteria.andIsPaidEqualTo(133);
                criteria1.andIsPaidEqualTo(133);
                criteria2.andIsPaidEqualTo(133);
                criteria3.andIsPaidEqualTo(133);
                criteria4.andIsPaidEqualTo(133);
                criteria5.andIsPaidEqualTo(133);
                criteria6.andIsPaidEqualTo(133);
            } else if (mark == 144 || mark == 145) {
                criteria.andIsExecutedEqualTo(mark);
                criteria1.andIsExecutedEqualTo(mark);
                criteria2.andIsExecutedEqualTo(mark);
                criteria3.andIsExecutedEqualTo(mark);
                criteria4.andIsExecutedEqualTo(mark);
                criteria5.andIsExecutedEqualTo(mark);
                criteria6.andIsExecutedEqualTo(mark);
                criteria.andIsRegisteredEqualTo(136);
                criteria1.andIsRegisteredEqualTo(136);
                criteria2.andIsRegisteredEqualTo(136);
                criteria3.andIsRegisteredEqualTo(136);
                criteria4.andIsRegisteredEqualTo(136);
                criteria5.andIsRegisteredEqualTo(136);
                criteria6.andIsRegisteredEqualTo(136);
            }
        }

        if (date != null) {
            Date nextDay = new CustomDateConverter().getNextDay(date);
            criteria.andDisposalAppearDateBetween(date, nextDay);
            criteria1.andDisposalAppearDateBetween(date, nextDay);
            criteria2.andDisposalAppearDateBetween(date, nextDay);
            criteria3.andDisposalAppearDateBetween(date, nextDay);
            criteria4.andDisposalAppearDateBetween(date, nextDay);
            criteria5.andDisposalAppearDateBetween(date, nextDay);
            criteria6.andDisposalAppearDateBetween(date, nextDay);

        }
        if (itemID != null) {

            criteria.andFmeditemIdEqualTo(itemID);
            criteria1.andFmeditemIdEqualTo(itemID);
            criteria2.andFmeditemIdEqualTo(itemID);
            criteria3.andFmeditemIdEqualTo(itemID);
            criteria4.andFmeditemIdEqualTo(itemID);
            criteria5.andFmeditemIdEqualTo(itemID);
            criteria6.andFmeditemIdEqualTo(itemID);
        }
        //返回表单搜索内容作搜索关联匹配查询
        if (search != null) {
            //去除空格
            String searchd = regexProcess.regexProcess02(search);

            criteria.andFmeditemCodeLike("%" + searchd + "%");
            criteria1.andFmeditemMnemonicCodeLike("%" + searchd + "%");
            criteria2.andPatientNameLike("%" + searchd + "%");
            criteria3.andRealNameLike("%" + searchd + "%");
            criteria4.andFmeditemNameLike("%" + searchd + "%");
            if (regexProcess.regexProcess03(search)) {
                criteria5.andDisposalIdEqualTo(Integer.valueOf(search));
            }
            if (regexProcess.regexProcess03(search)) {
                criteria6.andFmeditemIdEqualTo(Integer.valueOf(search));
            }

        }


        disposalformviewExample.or(criteria1);
        disposalformviewExample.or(criteria2);

        disposalformviewExample.or(criteria3);
        disposalformviewExample.or(criteria4);
        if(search!=null&&regexProcess.regexProcess03(regexProcess.regexProcess02(search))){
            disposalformviewExample.or(criteria5);
        }
        if(search!=null&&regexProcess.regexProcess03(regexProcess.regexProcess02(search))) {
            disposalformviewExample.or(criteria6);
        }


        return DisposalformviewDao.selectByExample(disposalformviewExample);
    }


    /**
     * searchFMedItem
     *
     * @return 非药品项目列表
     */
    public List<FMedItem> searchFMedItem() {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();
        criteria.andRecordTypeEqualTo(119);
        criteria.andStatusEqualTo("1");
        return fMedItemDao.selectByExample(fMedItemExample);
    }


    /**
     * 处置审查表单信息
     *
     * @param disposalDetailsID 处置审查表单处置关联编号
     * @return 处置审查表单信息
     */

    public List<DisposalReView> disposalreview(Integer disposalDetailsID) {
        DisposalReViewExample DisposalreviewExample = new DisposalReViewExample();
        DisposalReViewExample.Criteria criteria = DisposalreviewExample.createCriteria();
        //查询匹配处置关联编号的项目
        if (disposalDetailsID != null) {
            criteria.andDisposaldetailsIdEqualTo(disposalDetailsID);
        }
        return DisposalreviewDao.selectByExample(DisposalreviewExample);
    }


    /**
     * 查询项目材料
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    public List<DisposalMatReView> disposalmatreview(Integer itemsDetailID ){
        DisposalMatReViewExample disposalMatReViewExample=new DisposalMatReViewExample();
        DisposalMatReViewExample.Criteria criteria=disposalMatReViewExample.createCriteria();
        criteria.andItemsDetailIDEqualTo(itemsDetailID);
        return DisposalmatreviewDao.selectByExample(disposalMatReViewExample);
    }

    /**
     * 查询项目药品
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    public List<DisposalMedReView> disposalmedreview(Integer itemsDetailID ){
        DisposalMedReViewExample disposalMedReViewExample=new DisposalMedReViewExample();
        DisposalMedReViewExample.Criteria criteria=disposalMedReViewExample.createCriteria();
        criteria.andItemsDetailIDEqualTo(itemsDetailID);
        return DisposalmedreviewDao.selectByExample(disposalMedReViewExample);
    }

    /**
     * 组套查询相关药品
     *
     * @param fMedItemName 项目名称
     * @param search       搜索内容
     * @return 药品列表
     */
    public List<DisposalMedPlateView> disposalmedplateview(String fMedItemName, String search) {
        DisposalMedPlateViewExample DisposalmedplateviewExample = new DisposalMedPlateViewExample();
        DisposalMedPlateViewExample.Criteria criteria = DisposalmedplateviewExample.createCriteria();
        DisposalMedPlateViewExample.Criteria criteria1 = DisposalmedplateviewExample.createCriteria();
        criteria.andNameLike("fMedItemName");
        criteria1.andNameLike("search");
        DisposalmedplateviewExample.or(criteria1);
        return DisposalmedplateviewDao.selectByExample(DisposalmedplateviewExample);
    }

    /**
     * 组套查询相关材料
     *
     * @param fMedItemName 项目名称
     * @param search       搜索内容
     * @return 材料列表
     */
    public List<DisposalMatPlateView> disposalmatplateview(String fMedItemName, String search) {
        DisposalMatPlateViewExample DisposalmatplateviewExample = new DisposalMatPlateViewExample();
        DisposalMatPlateViewExample.Criteria criteria = DisposalmatplateviewExample.createCriteria();
        DisposalMatPlateViewExample.Criteria criteria1 = DisposalmatplateviewExample.createCriteria();
        criteria.andPlateNameLike("fMedItemName");
        criteria1.andPlateNameLike("search");
        DisposalmatplateviewExample.or(criteria1);
        return DisposalmatplateviewDao.selectByExample(DisposalmatplateviewExample);
    }


    /**
     * 删除药品材料表单信息
     *
     * @param medMatListID 药品材料关联编号
     * @param userID 修改人编号
     */
    public void deleteMedMat(Integer medMatListID,Integer userID) {

        MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
        medicinesmaterialslist.setId(medMatListID);
        medicinesmaterialslist.setStatus("0");
        medicinesmaterialslist.setChangeUserID(userID);
        medicinesmaterialslist.setChangeDate(new Date());
        medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
    }

    /**
     * 批量删除药品材料表单信息
     *
     * @param medMatListIDs 药品材料关联编号列表
     * @param userID 修改人编号
     */
    public void deleteMedMatByList(IdDTO medMatListIDs,Integer userID) {
        List<Integer> medMatListIDlist = medMatListIDs.getId();
        for (Integer ID : medMatListIDlist) {
            MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
            medicinesmaterialslist.setId(ID);
            medicinesmaterialslist.setStatus("0");
            medicinesmaterialslist.setChangeDate(new Date());
            medicinesmaterialslist.setChangeUserID(userID);

            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }

    }


    /**
     * 修改药品材料表单信息
     *
     * @param medicinesmaterialslist 药品材料表单信息
     * @param userID 修改人编号
     */
    public String updateMedMat(MedicinesMaterialsList medicinesmaterialslist,Integer userID) {

        MedicinesMaterialsListExample medicinesMaterialsListExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesMaterialsListExample.createCriteria();
        criteria.andIdNotEqualTo(medicinesmaterialslist.getId());
        criteria.andStatusEqualTo("1");
        criteria.andMedicinesMaterialsIDEqualTo(medicinesmaterialslist.getMedicinesMaterialsID());

        if(medicinesmaterialslistDao.countByExample(medicinesMaterialsListExample)>0){
            return "处置药品材料已存在";
        }


        medicinesmaterialslist.setChangeUserID(userID);
        medicinesmaterialslist.setChangeDate(new Date());
        medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        return "处置药品材料修改成功";
    }


    /**
     * 搜索药品信息
     *
     * @param search 药品表单信息
     * @return 药品信息
     */
    public List<Drugs> searchDrugs(String search) {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        DrugsExample.Criteria criteria1 = drugsExample.createCriteria();
        DrugsExample.Criteria criteria2 = drugsExample.createCriteria();
        //返回表单搜索内容作搜索关联匹配查询
        if (search != null) {
            //去除空格
            String searchd = regexProcess.regexProcess02(search);
            //模糊匹配
            criteria.andDrugsCodeLike("%" + searchd + "%");
            criteria1.andMnemonicCodeLike("%" + searchd + "%");
            criteria2.andDrugsNameLike("%" + searchd + "%");

        }
        criteria.andStatusEqualTo("1");
        criteria1.andStatusEqualTo("1");
        criteria2.andStatusEqualTo("1");
        drugsExample.or(criteria1);
        drugsExample.or(criteria2);
        return drugsDao.selectByExample(drugsExample);
    }

    /**
     * 搜索材料信息
     *
     * @param search 材料表单信息
     * @return 材料信息
     */
    public List<Materials> searchMaterials(String search) {
        MaterialsExample materialsExample = new MaterialsExample();
        MaterialsExample.Criteria criteria = materialsExample.createCriteria();
        MaterialsExample.Criteria criteria1 = materialsExample.createCriteria();
        //返回表单搜索内容作搜索关联匹配查询
        if (search != null) {
            //去除空格
            String searchd = regexProcess.regexProcess02(search);
            //模糊匹配
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
        }
        criteria.andStatusEqualTo("1");
        criteria1.andStatusEqualTo("1");
        materialsExample.or(criteria1);
        return materialsDao.selectByExample(materialsExample);
    }


    /**
     * 添加药品材料表单信息
     *
     * @param medicinesmaterialslist 药品材料表单信息
     */
    public String insertMedMat(Integer userID, MedicinesMaterialsList medicinesmaterialslist) {


        MedicinesMaterialsListExample medicinesMaterialsListExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesMaterialsListExample.createCriteria();

        criteria.andStatusEqualTo("1");
        criteria.andMedicinesMaterialsIDEqualTo(medicinesmaterialslist.getMedicinesMaterialsID());

        if(medicinesmaterialslistDao.countByExample(medicinesMaterialsListExample)>0){
            return "处置药品材料已存在";
        }
        medicinesmaterialslist.setIsDrawn(131);
        medicinesmaterialslist.setIsPaid(134);
        medicinesmaterialslist.setIsChecked(142);
        medicinesmaterialslist.setIsAbolished(150);
        medicinesmaterialslist.setIsRegistered(137);
        medicinesmaterialslist.setIsExecuted(146);
        medicinesmaterialslist.setAppearUserID(userID);
        medicinesmaterialslist.setAppearDate(new Date());
        medicinesmaterialslist.setStatus("1");
        medicinesmaterialslistDao.insert(medicinesmaterialslist);
        return "处置药品材料添加成功";
    }


    /**
     * 批准材料表单信息
     *
     * @param matListIDs 药品材料关联编号列表
     */
    public void approveMat(IdDTO matListIDs, Integer userID) {
        List<Integer> medMatListIDlist = matListIDs.getId();
        for (Integer ID : medMatListIDlist) {
            MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
            medicinesmaterialslist.setId(ID);
            medicinesmaterialslist.setIsDrawn(131);
            medicinesmaterialslist.setIsPaid(134);
            medicinesmaterialslist.setIsAbolished(150);
            medicinesmaterialslist.setIsChecked(141);
            medicinesmaterialslist.setIsRegistered(137);
            medicinesmaterialslist.setIsExecuted(146);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);


            DisposalMatReViewExample DisposalmatreviewExample = new DisposalMatReViewExample();
            DisposalMatReViewExample.Criteria criteriaM = DisposalmatreviewExample.createCriteria();
            criteriaM.andMedMatListIDEqualTo(ID);
            DisposalMatReView disposalmatreview = DisposalmatreviewDao.selectByExample(DisposalmatreviewExample).get(0);

            DisposalFormViewExample disposalformviewExample = new DisposalFormViewExample();
            DisposalFormViewExample.Criteria criteriaF = disposalformviewExample.createCriteria();
            criteriaF.andDisposaldetailsIDEqualTo(disposalmatreview.getItemsDetailID());
            DisposalFormView Disposalformview = DisposalformviewDao.selectByExample(disposalformviewExample).get(0);


            RegistrationInfoExample registrationInfoExample=new RegistrationInfoExample();
            RegistrationInfoExample.Criteria criteriaR=registrationInfoExample.createCriteria();
            criteriaR.andMedicalRecordIDEqualTo(Disposalformview.getMedicalrecordId());

            List<Registrationinfo> registrationInfoList=registrationInfoDao.selectByExample(registrationInfoExample);

            BigDecimal total = disposalmatreview.getDosage().multiply(disposalmatreview.getPrice());
            Fee fee = new Fee();
            fee.setFeeCategoryID(registrationInfoList.get(0).getPaymentCategoryID());
            fee.setMedicalRecordID(Disposalformview.getMedicalrecordId());
            fee.setChargeItemID(disposalmatreview.getMedMatListID());
            fee.setExpID(17);
            fee.setStatus("1");
            fee.setDateStatus(148);
            fee.setCheckStatus("未对账");
            fee.setPayStatus(134);
            fee.setFee(total);
            fee.setAppearUserID(userID);
            fee.setFeeAppearDate(new Date());
            feeDao.insert(fee);
        }

    }

    /**
     * 批准药品表单信息
     *
     * @param medListIDs 药品材料关联编号列表
     */
    public void approveMed(IdDTO medListIDs, Integer userID) {
        List<Integer> medListIDlist = medListIDs.getId();
        for (Integer ID : medListIDlist) {
            MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
            medicinesmaterialslist.setId(ID);

            medicinesmaterialslist.setIsDrawn(131);
            medicinesmaterialslist.setIsAbolished(150);
            medicinesmaterialslist.setIsPaid(134);
            medicinesmaterialslist.setIsChecked(141);
            medicinesmaterialslist.setIsRegistered(137);
            medicinesmaterialslist.setIsExecuted(146);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);


            DisposalMedReViewExample disposalmedreviewExample = new DisposalMedReViewExample();
            DisposalMedReViewExample.Criteria criteriaM = disposalmedreviewExample.createCriteria();
            criteriaM.andMedMatListIDEqualTo(ID);
            DisposalMedReView disposalmedreview = DisposalmedreviewDao.selectByExample(disposalmedreviewExample).get(0);

            DisposalFormViewExample disposalformviewExample = new DisposalFormViewExample();
            DisposalFormViewExample.Criteria criteriaF = disposalformviewExample.createCriteria();
            criteriaF.andDisposaldetailsIDEqualTo(disposalmedreview.getItemsDetailID());
            DisposalFormView disposalformview = DisposalformviewDao.selectByExample(disposalformviewExample).get(0);




            RegistrationInfoExample registrationInfoExample=new RegistrationInfoExample();
            RegistrationInfoExample.Criteria criteriaR=registrationInfoExample.createCriteria();
            criteriaR.andMedicalRecordIDEqualTo(disposalformview.getMedicalrecordId());

            List<Registrationinfo> registrationinfoList=registrationInfoDao.selectByExample(registrationInfoExample);

            BigDecimal total = disposalmedreview.getDosage().multiply(disposalmedreview.getDrugsPrice());
            Fee fee = new Fee();
            fee.setMedicalRecordID(disposalformview.getMedicalrecordId());
            fee.setFeeCategoryID(registrationinfoList.get(0).getPaymentCategoryID());
            fee.setChargeItemID(disposalmedreview.getMedMatListID());
            fee.setExpID(23);
            fee.setStatus("1");
            fee.setPayStatus(134);
            fee.setDateStatus(148);
            fee.setCheckStatus("未对账");
            fee.setAppearUserID(userID);
            fee.setFeeAppearDate(new Date());
            fee.setFee(total);
            feeDao.insert(fee);
        }

    }


    /**
     * 完成审核处置项目表单信息
     *
     * @param disposalDetailsID 药品材料关联编号列表
     * @return 审核结果
     */
    public String approvedisposalDetails(Integer disposalDetailsID) {
        String result="完成审核";
        MedicinesMaterialsListExample medicinesmaterialslistExample = new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria = medicinesmaterialslistExample.createCriteria();
        criteria.andItemsTypeEqualTo(119);
        criteria.andItemsDetailIDEqualTo(disposalDetailsID);
        List<MedicinesMaterialsList> medMatList = medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
            if (medicinesmaterialslist.getIsChecked() != 141) {
                result = "处置药品材料未通过审核";
                return result;
            }
        }
        DisposalDetails disposaldetails = new DisposalDetails();
        disposaldetails.setId(disposalDetailsID);
        disposaldetails.setIsChecked(141);
        disposaldetailsDao.updateByPrimaryKeySelective(disposaldetails);
        return result;
    }


    /**
     * 登记处置项目表单信息
     *
     * @param disposalDetailsID 药品材料关联编号列表
     * @return 登记结果
     */
    public String registerdisposalDetails(Integer disposalDetailsID) {
        String result;
        DisposalDetails disposaldetails = disposaldetailsDao.selectByPrimaryKey(disposalDetailsID);

        MedicinesMaterialsListExample medicinesmaterialslistExample = new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria = medicinesmaterialslistExample.createCriteria();
        criteria.andIsAbolishedEqualTo(150);
        criteria.andItemsTypeEqualTo(119);
        criteria.andItemsDetailIDEqualTo(disposalDetailsID);
        List<MedicinesMaterialsList> medMatList = medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
            System.out.println(medicinesmaterialslist.getId());
            if (medicinesmaterialslist.getIsPaid() == 134) {
                result = "处置药品材料未缴费";
                return result;
            } else if (medicinesmaterialslist.getIsChecked() == 142) {
                result = "处置药品材料未通过审核";
                return result;
            }
        }
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
            medicinesmaterialslist.setIsRegistered(136);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }
        disposaldetails.setIsRegistered(136);
        disposaldetailsDao.updateByPrimaryKeySelective(disposaldetails);
        result = "处置登记成功";
        return result;
    }


    /**
     * 完成处置
     * @param disposalDetailsID 处置详情编号
     */
    public void finishDisposal(Integer disposalDetailsID) {
        DisposalDetails disposaldetails = new DisposalDetails();
        disposaldetails.setId(disposalDetailsID);
        disposaldetails.setIsExecuted(145);
        disposaldetailsDao.updateByPrimaryKeySelective(disposaldetails);

        MedicinesMaterialsListExample medicinesmaterialslistExample = new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria = medicinesmaterialslistExample.createCriteria();
        criteria.andIsAbolishedEqualTo(150);
        criteria.andItemsTypeEqualTo(119);
        criteria.andItemsDetailIDEqualTo(disposalDetailsID);
        List<MedicinesMaterialsList> medMatList = medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
            medicinesmaterialslist.setIsExecuted(145);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }


    }

}
