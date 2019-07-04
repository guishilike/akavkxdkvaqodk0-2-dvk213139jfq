package edu.neu.hospital.service.medicalTechService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.inspectionBean.*;
import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dao.inspectionDao.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.*;
import edu.neu.hospital.example.inspectionExample.*;
import edu.neu.hospital.service.medicalTechService.InspectionService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class InspectionServiceImpl implements InspectionService {
    private RegexProcess regexProcess = new RegexProcess();
    @Resource
    private InspectFormViewDao inspectformviewDao;
    @Resource
    private InspectReViewDao InspectreviewDao;
    @Resource
    private InspectMedReViewDao inspectmedreviewDao;
    @Resource
    private InspectMatReViewDao inspectmatreviewDao;
    @Resource
    private MedicinesMaterialsListDao medicinesmaterialslistDao;
    @Resource
    private DrugsDao drugsDao;
    @Resource
    private MaterialsDao materialsDao;
    @Resource
    private InspectionResultDao inspectionresultDao;
    @Resource
    private InspectionResultImageDao inspectionresultimageDao;
    @Resource
    private InspectMedPlateViewDao inspectmedplateviewDao;
    @Resource
    private InspectMatPlateViewDao inspectmatplateviewDao;
    @Resource
    private InspectionDetailsDao inspectiondetailsDao;
    @Resource
    private FeeDao feeDao;
    @Resource
    private  FMedItemDao fMedItemDao;
    @Resource
    private RegistrationInfoDao registrationInfoDao;
    /**
     * 检查搜索表单信息
     *
     * @param search   检查搜索表单搜索框的内容
     * @param date     检查搜索表单限制日期
     * @param itemID 检查搜索表单项目名称
     * @param mark     检查表单项目标识
     * @return 检查搜索结果表单信息
     */

    public List<InspectFormView> inspectformview(String search, Date date, Integer itemID, Integer mark) {
        InspectFormViewExample inspectformviewExample = new InspectFormViewExample();

        InspectFormViewExample.Criteria criteria = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria1 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria2 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria3 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria4 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria5 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria6 = inspectformviewExample.createCriteria();
        //查询匹配限制日期、项目名称、标识的项目
        criteria.andIsDrawnEqualTo(131);
        criteria1.andIsDrawnEqualTo(131);
        criteria2.andIsDrawnEqualTo(131);
        criteria3.andIsDrawnEqualTo(131);
        criteria4.andIsDrawnEqualTo(131);
        criteria5.andIsDrawnEqualTo(131);
        criteria6.andIsDrawnEqualTo(131);
        criteria.andIsAbolishedEqualTo(150);
        criteria1.andIsAbolishedEqualTo(150);
        criteria2.andIsAbolishedEqualTo(150);
        criteria3.andIsAbolishedEqualTo(150);
        criteria4.andIsAbolishedEqualTo(150);
        criteria5.andIsAbolishedEqualTo(150);
        criteria6.andIsAbolishedEqualTo(150);
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
                criteria.andIsCheckedEqualTo(141);
                criteria1.andIsCheckedEqualTo(141);
                criteria2.andIsCheckedEqualTo(141);
                criteria3.andIsCheckedEqualTo(141);
                criteria4.andIsCheckedEqualTo(141);
                criteria5.andIsCheckedEqualTo(141);
                criteria6.andIsCheckedEqualTo(141);
                criteria.andIsRegisteredEqualTo(mark);
                criteria1.andIsRegisteredEqualTo(mark);
                criteria2.andIsRegisteredEqualTo(mark);
                criteria3.andIsRegisteredEqualTo(mark);
                criteria4.andIsRegisteredEqualTo(mark);
                criteria5.andIsRegisteredEqualTo(mark);
                criteria6.andIsRegisteredEqualTo(mark);
            } else if (mark == 142) {
                criteria.andIsPaidEqualTo(133);
                criteria1.andIsPaidEqualTo(133);
                criteria2.andIsPaidEqualTo(133);
                criteria3.andIsPaidEqualTo(133);
                criteria4.andIsPaidEqualTo(133);
                criteria5.andIsPaidEqualTo(133);
                criteria6.andIsPaidEqualTo(133);
                criteria.andIsCheckedEqualTo(mark);
                criteria1.andIsCheckedEqualTo(mark);
                criteria2.andIsCheckedEqualTo(mark);
                criteria3.andIsCheckedEqualTo(mark);
                criteria4.andIsCheckedEqualTo(mark);
                criteria5.andIsCheckedEqualTo(mark);
                criteria6.andIsCheckedEqualTo(mark);
            } else if (mark == 144||mark == 145) {
                criteria.andIsRegisteredEqualTo(136);
                criteria1.andIsRegisteredEqualTo(136);
                criteria2.andIsRegisteredEqualTo(136);
                criteria3.andIsRegisteredEqualTo(136);
                criteria4.andIsRegisteredEqualTo(136);
                criteria5.andIsRegisteredEqualTo(136);
                criteria5.andIsRegisteredEqualTo(136);
                criteria6.andIsRegisteredEqualTo(136);
                criteria.andIsExecutedEqualTo(mark);
                criteria1.andIsExecutedEqualTo(mark);
                criteria2.andIsExecutedEqualTo(mark);
                criteria3.andIsExecutedEqualTo(mark);
                criteria4.andIsExecutedEqualTo(mark);
                criteria5.andIsExecutedEqualTo(mark);
                criteria6.andIsExecutedEqualTo(mark);
            }
        }

        if (date != null) {
            Date nextDay = new CustomDateConverter().getNextDay(date);
            criteria.andInspectionAppearDateBetween(date, nextDay);
            criteria1.andInspectionAppearDateBetween(date, nextDay);
            criteria2.andInspectionAppearDateBetween(date, nextDay);
            criteria3.andInspectionAppearDateBetween(date, nextDay);
            criteria4.andInspectionAppearDateBetween(date, nextDay);
            criteria5.andInspectionAppearDateBetween(date, nextDay);
            criteria6.andInspectionAppearDateBetween(date, nextDay);
        }
        if (itemID != null ) {
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
            if (regexProcess.regexProcess03(searchd)){
               criteria4.andFmeditemIdEqualTo(Integer.valueOf(searchd));
            }
            if (regexProcess.regexProcess03(searchd)){
                criteria5.andInspectionIdEqualTo(Integer.valueOf(searchd));
            }
            criteria6.andFmeditemNameLike("%" + searchd + "%");
        }
        inspectformviewExample.or(criteria1);
        inspectformviewExample.or(criteria2);
        inspectformviewExample.or(criteria3);
        if(search!=null&&regexProcess.regexProcess03(regexProcess.regexProcess02(search))){
        inspectformviewExample.or(criteria4);
        }
        if(search!=null&&regexProcess.regexProcess03(regexProcess.regexProcess02(search))){
        inspectformviewExample.or(criteria5);
        }
        inspectformviewExample.or(criteria6);

        return inspectformviewDao.selectByExample(inspectformviewExample);
    }


    /**
     * searchFMedItem
     *
     * @return 非药品项目列表
     */
    public List<FMedItem> searchFMedItem(){
        FMedItemExample fMedItemExample=new FMedItemExample();
        FMedItemExample.Criteria criteria=fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria1=fMedItemExample.createCriteria();
        criteria.andRecordTypeEqualTo(117);
        criteria1.andRecordTypeEqualTo(118);
        criteria.andStatusEqualTo("1");
        criteria1.andStatusEqualTo("1");
        fMedItemExample.or(criteria1);
        return fMedItemDao.selectByExample(fMedItemExample);
    }


    /**
     * 检查审查表单信息
     *
     * @param inspectionDetailsID 检查审查表单检查关联编号
     * @return 检查审查表单信息
     */

    public List<InspectReView> inspectreview(Integer inspectionDetailsID) {
        InspectReViewExample inspectreviewExample = new InspectReViewExample();
        InspectReViewExample.Criteria criteria = inspectreviewExample.createCriteria();
        //查询匹配检查关联编号的项目
        if (inspectionDetailsID != null) {
            criteria.andInspectiondetailsIdEqualTo(inspectionDetailsID);
        }
        return InspectreviewDao.selectByExample(inspectreviewExample);
    }

    /**
     * 组套查询相关药品
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 药品列表
     */
     public List<InspectMedPlateView> inspectmedplateview(String fMedItemName, String search){
         InspectMedPlateViewExample inspectmedplateviewExample=new InspectMedPlateViewExample();
         InspectMedPlateViewExample.Criteria criteria=inspectmedplateviewExample.createCriteria();
         InspectMedPlateViewExample.Criteria criteria1=inspectmedplateviewExample.createCriteria();
         criteria.andNameLike("fMedItemName");
         criteria1.andNameLike("search");
         inspectmedplateviewExample.or(criteria1);
         return inspectmedplateviewDao.selectByExample(inspectmedplateviewExample);
     }

    /**
     * 组套查询相关材料
     *
     * @param  fMedItemName 项目名称
     * @param search 搜索内容
     * @return 材料列表
     */
    public List<InspectMatPlateView> inspectmatplateview(String fMedItemName, String search){
        InspectMatPlateViewExample inspectmatplateviewExample=new InspectMatPlateViewExample();
        InspectMatPlateViewExample.Criteria criteria=inspectmatplateviewExample.createCriteria();
        InspectMatPlateViewExample.Criteria criteria1=inspectmatplateviewExample.createCriteria();
        criteria.andPlateNameLike("fMedItemName");
        criteria1.andPlateNameLike("search");
        inspectmatplateviewExample.or(criteria1);
        return inspectmatplateviewDao.selectByExample(inspectmatplateviewExample);
    }


    /**
     * 查询项目材料
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    public List<InspectMatReView> inspectmatreview(Integer itemsDetailID ){
        InspectMatReViewExample inspectMatReViewExample=new InspectMatReViewExample();
        InspectMatReViewExample.Criteria criteria=inspectMatReViewExample.createCriteria();
        criteria.andItemsDetailIDEqualTo(itemsDetailID);
        return inspectmatreviewDao.selectByExample(inspectMatReViewExample);
    }

    /**
     * 查询项目药品
     * @param itemsDetailID 项目详情编号
     * @return 材料列表
     */
    public List<InspectMedReView> inspectmedreview(Integer itemsDetailID ){
        InspectMedReViewExample inspectMedReViewExample=new InspectMedReViewExample();
        InspectMedReViewExample.Criteria criteria=inspectMedReViewExample.createCriteria();
        criteria.andItemsDetailIDEqualTo(itemsDetailID);
        return inspectmedreviewDao.selectByExample(inspectMedReViewExample);
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
            medicinesmaterialslist.setChangeUserID(userID);
            medicinesmaterialslist.setChangeDate(new Date());
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }

    }




    /**
     * 修改药品材料表单信息
     *
     * @param medicinesmaterialslist 药品材料表单信息
     * @param userID 修改人编号
     * @return 药品材料修改结果
     */
    public String updateMedMat(MedicinesMaterialsList medicinesmaterialslist,Integer userID) {
        MedicinesMaterialsListExample medicinesMaterialsListExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesMaterialsListExample.createCriteria();
        criteria.andIdNotEqualTo(medicinesmaterialslist.getId());

        criteria.andMedicinesMaterialsIDEqualTo(medicinesmaterialslist.getMedicinesMaterialsID());
        criteria.andStatusEqualTo("1");
        if(medicinesmaterialslistDao.countByExample(medicinesMaterialsListExample)>0){
            return "检查检验药品材料已存在";
        }
        medicinesmaterialslist.setChangeUserID(userID);
        medicinesmaterialslist.setChangeDate(new Date());
        medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
            return "检查检验药品材料修改成功";
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
            criteria1.andDrugsNameLike("%" + searchd + "%");
            criteria2.andMnemonicCodeLike("%" + searchd + "%");
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
            criteria.andCodeLike("%" + searchd + "%");
            criteria1.andNameLike("%" + searchd + "%");

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
     * @return 药品材料修改结果
     */
    public String insertMedMat(Integer userID, MedicinesMaterialsList medicinesmaterialslist) {

        MedicinesMaterialsListExample medicinesMaterialsListExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesMaterialsListExample.createCriteria();
        criteria.andMedicinesMaterialsIDEqualTo(medicinesmaterialslist.getMedicinesMaterialsID());
        criteria.andStatusEqualTo("1");
        if(medicinesmaterialslistDao.countByExample(medicinesMaterialsListExample)>0){
            return "检查检验药品材料已存在";
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
        return "检查检验药品材料添加成功";
    }


    /**
     * 批准材料表单信息
     *
     * @param matListIDs 药品材料关联编号列表
     */
    public void approveMat(IdDTO matListIDs,Integer userID) {
        List<Integer> medMatListIDlist = matListIDs.getId();
        for (Integer ID : medMatListIDlist) {
            MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();

            medicinesmaterialslist.setIsDrawn(131);
            medicinesmaterialslist.setIsPaid(134);
            medicinesmaterialslist.setIsChecked(141);
            medicinesmaterialslist.setIsAbolished(150);
            medicinesmaterialslist.setIsRegistered(137);
            medicinesmaterialslist.setIsExecuted(146);
            medicinesmaterialslist.setId(ID);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);


            InspectMatReViewExample inspectmatreviewExample=new InspectMatReViewExample();
            InspectMatReViewExample.Criteria criteriaM=inspectmatreviewExample.createCriteria();
            criteriaM.andMedicinesMaterialsIDEqualTo(ID);
            InspectMatReView inspectmatreview=inspectmatreviewDao.selectByExample(inspectmatreviewExample).get(0);

            InspectFormViewExample inspectformviewExample=new InspectFormViewExample();
            InspectFormViewExample.Criteria criteriaF=inspectformviewExample.createCriteria();
            criteriaF.andInspectionDetailsIDEqualTo(inspectmatreview.getItemsDetailID());
            InspectFormView inspectformview=inspectformviewDao.selectByExample(inspectformviewExample).get(0);

            RegistrationInfoExample registrationInfoExample=new RegistrationInfoExample();
            RegistrationInfoExample.Criteria criteriaR=registrationInfoExample.createCriteria();
            criteriaR.andMedicalRecordIDEqualTo(inspectformview.getMedicalrecordId());
            List<Registrationinfo> registrationinfoList=registrationInfoDao.selectByExample(registrationInfoExample);


            BigDecimal total=inspectmatreview.getDosage().multiply(inspectmatreview.getPrice());
            Fee fee=new Fee();
            fee.setMedicalRecordID(inspectformview.getMedicalrecordId());
            fee.setFeeCategoryID(registrationinfoList.get(0).getPaymentCategoryID());
            fee.setChargeItemID(inspectmatreview.getMedMatListID());
            fee.setExpID(4);
            fee.setAppearUserID(userID);
            fee.setFeeAppearDate(new Date());
            fee.setPayStatus(134);
            fee.setStatus("1");
            fee.setDateStatus(148);
            fee.setCheckStatus("未对账");
            fee.setFee(total);

            feeDao.insert(fee);
        }

    }

    /**
     * 批准药品表单信息
     *
     * @param medListIDs 药品材料关联编号列表
     */
    public void approveMed(IdDTO medListIDs,Integer userID) {
        List<Integer> medListIDlist = medListIDs.getId();
        for (Integer ID : medListIDlist) {
            MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
            medicinesmaterialslist.setId(ID);
            medicinesmaterialslist.setIsDrawn(131);
            medicinesmaterialslist.setIsPaid(134);
            medicinesmaterialslist.setIsChecked(141);
            medicinesmaterialslist.setIsAbolished(150);
            medicinesmaterialslist.setIsRegistered(137);
            medicinesmaterialslist.setIsExecuted(146);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);


            InspectMedReViewExample inspectmedreviewExample=new InspectMedReViewExample();
            InspectMedReViewExample.Criteria criteriaM=inspectmedreviewExample.createCriteria();
            criteriaM.andMedMatListIDEqualTo(ID);
            InspectMedReView inspectmedreview=inspectmedreviewDao.selectByExample(inspectmedreviewExample).get(0);

            InspectFormViewExample inspectformviewExample=new InspectFormViewExample();
            InspectFormViewExample.Criteria criteriaF=inspectformviewExample.createCriteria();
            criteriaF.andInspectionDetailsIDEqualTo(inspectmedreview.getItemsDetailID());
            InspectFormView inspectformview=inspectformviewDao.selectByExample(inspectformviewExample).get(0);


            BigDecimal total=inspectmedreview.getDosage().multiply(inspectmedreview.getDrugsPrice().multiply(inspectmedreview.getReimbursement()));

            RegistrationInfoExample registrationInfoExample=new RegistrationInfoExample();
            RegistrationInfoExample.Criteria criteriaR=registrationInfoExample.createCriteria();
            criteriaR.andMedicalRecordIDEqualTo(inspectformview.getMedicalrecordId());

            List<Registrationinfo> registrationinfoList=registrationInfoDao.selectByExample(registrationInfoExample);



            Fee fee=new Fee();
            fee.setMedicalRecordID(inspectformview.getMedicalrecordId());
            fee.setFeeCategoryID(registrationinfoList.get(0).getPaymentCategoryID());
            fee.setChargeItemID(inspectmedreview.getMedMatListID());

            fee.setExpID(22);
            fee.setAppearUserID(userID);
            fee.setFeeAppearDate(new Date());
            fee.setPayStatus(134);
            fee.setFee(total);
            fee.setStatus("1");
            fee.setDateStatus(148);
            fee.setCheckStatus("未对账");
            feeDao.insert(fee);
        }

    }


    /**
     * 完成审核检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     * @return 审核结果
     */
    public String approveInspectionDetails(Integer inspectionDetailsID) {
        String result="完成审核";
        MedicinesMaterialsListExample medicinesmaterialslistExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesmaterialslistExample.createCriteria();
        criteria.andItemsTypeNotEqualTo(119);
        criteria.andItemsDetailIDEqualTo(inspectionDetailsID);
        List<MedicinesMaterialsList> medMatList=medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
              if(medicinesmaterialslist.getIsChecked()!=141){
                result = "检查检验药品材料未通过审核";
                return result;
            }
        }
            InspectionDetails inspectiondetails=new InspectionDetails();
            inspectiondetails.setId(inspectionDetailsID);
            inspectiondetails.setIsChecked(141);
            inspectiondetailsDao.updateByPrimaryKeySelective(inspectiondetails);
            return  result;
    }


    /**
     * 登记检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     * @return  登记结果
     */
    public String registerInspectionDetails(Integer inspectionDetailsID) {
        String result;
        InspectionDetails inspectiondetails=inspectiondetailsDao.selectByPrimaryKey(inspectionDetailsID);

        MedicinesMaterialsListExample medicinesmaterialslistExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesmaterialslistExample.createCriteria();
        criteria.andItemsTypeNotEqualTo(119);
        criteria.andItemsDetailIDEqualTo(inspectionDetailsID);
        criteria.andIsAbolishedEqualTo(150);
        List<MedicinesMaterialsList> medMatList=medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
            if(medicinesmaterialslist.getIsPaid()==134) {
                result = "检查检验药品材料未缴费";
                return result;
            }else if(medicinesmaterialslist.getIsChecked()==142){
                result = "检查检验药品材料未通过审核";
                return result;
            }
        }
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList){
          medicinesmaterialslist.setIsRegistered(136);
          medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }
        inspectiondetails.setIsRegistered(136);
        inspectiondetailsDao.updateByPrimaryKeySelective(inspectiondetails);
        result="检查检验登记成功";
        return result;
    }



    /**
     * 导入检查结果表单
     *
     * @param inspectionresultWithBLOBs 检查结果
     * @param userID 录入结果用户
     * @return 检查结果表单
     */
    public InspectionResultWithBLOBs importInspectResult(InspectionResultWithBLOBs inspectionresultWithBLOBs, Integer userID) {
        inspectionresultWithBLOBs.setDoctorID(userID);
        inspectionresultWithBLOBs.setAppearUserID(userID);
        inspectionresultWithBLOBs.setAppearDate(new Date());
        inspectionresultWithBLOBs.setStatus("1");
        inspectionresultDao.insert(inspectionresultWithBLOBs);
        return inspectionresultWithBLOBs;
    }

    /**
     * 重新录入检查结果表单
     *
     * @param  inspectionresultWithBLOBs 检查结果
     * @param  userID 删除检查结果用户
     * @return 检查结果表单
     */
    public InspectionResultWithBLOBs updateInspectResult(InspectionResultWithBLOBs inspectionresultWithBLOBs,Integer userID) {
        inspectionresultWithBLOBs.setChangeUserID(userID);
        inspectionresultWithBLOBs.setChangeDate(new Date());
        inspectionresultDao.updateByPrimaryKeySelective(inspectionresultWithBLOBs);
        return inspectionresultWithBLOBs;
    }


    /**
     * 导入检查结果图片
     *
     * @param inspectionresultimage 结果图片信息
     * @param userID 导入图片用户
     */
    public void importInspectResultImages(InspectionResultImage inspectionresultimage, Integer userID) {
        inspectionresultimage.setStatus("1");
        inspectionresultimage.setAppearUserID(userID);
        inspectionresultimage.setAppearUserDate(new Date());
        inspectionresultimageDao.insert(inspectionresultimage);
    }


    /**
     * 删除检查结果图片
     *
     * @param  catalog 图片名称
     * @param  userID 删除检查结果图片用户编号
     */
    public void deleteInspectResultImages(String catalog,Integer userID) {
        InspectionResultImageExample inspectionresultimageExample = new InspectionResultImageExample();
        InspectionResultImageExample.Criteria criteria = inspectionresultimageExample.createCriteria();
        InspectionResultImage inspectionresultimage;
        criteria.andCatalogEqualTo(catalog);
        inspectionresultimage = inspectionresultimageDao.selectByExample(inspectionresultimageExample).get(0);
        inspectionresultimage.setChangeUserDate(new Date());
        inspectionresultimage.setAppearUserID(userID);
        inspectionresultimage.setStatus("0");
        inspectionresultimageDao.updateByPrimaryKeySelective(inspectionresultimage);
    }

    /**
     * 完成检查
     *
     * @param inspectionDetailsID 检查详情ID
     */
    public void finishInspection(Integer inspectionDetailsID){
        InspectionDetails inspectiondetails=new InspectionDetails();
        inspectiondetails.setId(inspectionDetailsID);
        inspectiondetails.setIsExecuted(145);
        inspectiondetailsDao.updateByPrimaryKeySelective( inspectiondetails);

        MedicinesMaterialsListExample medicinesmaterialslistExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesmaterialslistExample.createCriteria();
        criteria.andItemsTypeNotEqualTo(119);
        criteria.andItemsDetailIDEqualTo(inspectionDetailsID);
        criteria.andIsAbolishedEqualTo(150);
        List<MedicinesMaterialsList> medMatList=medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList){
            medicinesmaterialslist.setIsExecuted(145);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }
    }
}


