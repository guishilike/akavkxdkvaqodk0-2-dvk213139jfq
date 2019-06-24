package edu.neu.hospital.service.MedicalTechService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.inspectionBean.*;
import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.dao.inspectionDao.*;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.DrugsExample;
import edu.neu.hospital.example.basicTableExample.InspectionResultImageExample;
import edu.neu.hospital.example.basicTableExample.MaterialsExample;
import edu.neu.hospital.example.basicTableExample.MedicinesMaterialsListExample;
import edu.neu.hospital.example.inspectionExample.*;
import edu.neu.hospital.service.MedicalTechService.InspectionService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class InspectionServiceImpl implements InspectionService {
    RegexProcess regexProcess = new RegexProcess();
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


    /**
     * 检查搜索表单信息
     *
     * @param search   检查搜索表单搜索框的内容
     * @param date     检查搜索表单限制日期
     * @param itemName 检查搜索表单项目名称
     * @param mark     检查表单项目标识
     * @return 检查搜索结果表单信息
     */

    public List<InspectFormView> inspectformview(String search, Date date, String itemName, Integer mark) {
        InspectFormViewExample inspectformviewExample = new InspectFormViewExample();
        //默认按时间升序显示
        inspectformviewExample.getOrderByClause("inspectionAppearDate asc");
        InspectFormViewExample.Criteria criteria = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria1 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria2 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria3 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria4 = inspectformviewExample.createCriteria();
        InspectFormViewExample.Criteria criteria5 = inspectformviewExample.createCriteria();
        //查询匹配限制日期、项目名称、标识的项目
        criteria.andIsDrawnEqualTo(131);
        criteria1.andIsDrawnEqualTo(131);
        criteria2.andIsDrawnEqualTo(131);
        criteria3.andIsDrawnEqualTo(131);
        criteria4.andIsDrawnEqualTo(131);
        criteria5.andIsDrawnEqualTo(131);
        criteria.andIsAbolishedEqualTo(150);
        criteria1.andIsAbolishedEqualTo(150);
        criteria2.andIsAbolishedEqualTo(150);
        criteria3.andIsAbolishedEqualTo(150);
        criteria4.andIsAbolishedEqualTo(150);
        criteria5.andIsAbolishedEqualTo(150);
        if (mark != null) {
            if (mark == 134) {
                criteria.andIsPaidEqualTo(mark);
                criteria1.andIsPaidEqualTo(mark);
                criteria2.andIsPaidEqualTo(mark);
                criteria3.andIsPaidEqualTo(mark);
                criteria4.andIsPaidEqualTo(mark);
                criteria5.andIsPaidEqualTo(mark);
            } else if (mark == 137) {
                criteria.andIsCheckedEqualTo(141);
                criteria1.andIsCheckedEqualTo(141);
                criteria2.andIsCheckedEqualTo(141);
                criteria3.andIsCheckedEqualTo(141);
                criteria4.andIsCheckedEqualTo(141);
                criteria5.andIsCheckedEqualTo(141);
                criteria.andIsRegisteredEqualTo(mark);
                criteria1.andIsRegisteredEqualTo(mark);
                criteria2.andIsRegisteredEqualTo(mark);
                criteria3.andIsRegisteredEqualTo(mark);
                criteria4.andIsRegisteredEqualTo(mark);
                criteria5.andIsRegisteredEqualTo(mark);
            } else if (mark == 142) {
                criteria.andIsPaidEqualTo(133);
                criteria1.andIsPaidEqualTo(133);
                criteria2.andIsPaidEqualTo(133);
                criteria3.andIsPaidEqualTo(133);
                criteria4.andIsPaidEqualTo(133);
                criteria5.andIsPaidEqualTo(133);
                criteria.andIsCheckedEqualTo(mark);
                criteria1.andIsCheckedEqualTo(mark);
                criteria2.andIsCheckedEqualTo(mark);
                criteria3.andIsCheckedEqualTo(mark);
                criteria4.andIsCheckedEqualTo(mark);
                criteria5.andIsCheckedEqualTo(mark);
            } else if (mark == 144||mark == 145) {
                criteria.andIsRegisteredEqualTo(136);
                criteria1.andIsRegisteredEqualTo(136);
                criteria2.andIsRegisteredEqualTo(136);
                criteria3.andIsRegisteredEqualTo(136);
                criteria4.andIsRegisteredEqualTo(136);
                criteria5.andIsRegisteredEqualTo(136);
                criteria.andIsExecutedEqualTo(mark);
                criteria1.andIsExecutedEqualTo(mark);
                criteria2.andIsExecutedEqualTo(mark);
                criteria3.andIsExecutedEqualTo(mark);
                criteria4.andIsExecutedEqualTo(mark);
                criteria5.andIsExecutedEqualTo(mark);
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
        }
        if (itemName != null) {
            criteria.andFmeditemNameEqualTo(itemName);
            criteria1.andFmeditemNameEqualTo(itemName);
            criteria2.andFmeditemNameEqualTo(itemName);
            criteria3.andFmeditemNameEqualTo(itemName);
            criteria4.andFmeditemNameEqualTo(itemName);
            criteria5.andFmeditemNameEqualTo(itemName);
        }
        //返回表单搜索内容作搜索关联匹配查询
        if (search != null) {
            //去除空格
            String searchd = regexProcess.regexProcess02(search);
            criteria.andFmeditemCodeLike("%" + searchd + "%");
            criteria1.andFmeditemMnemonicCodeLike("%" + searchd + "%");
            criteria2.andPatientNameLike("%" + searchd + "%");
            criteria3.andRealNameLike("%" + searchd + "%");
            if (regexProcess.regexProcess03(search)){
               criteria4.andFmeditemIdEqualTo(Integer.valueOf(search));
            }
            if (regexProcess.regexProcess03(search)){
                criteria5.andInspectionIdEqualTo(Integer.valueOf(search));
            }
        }
        inspectformviewExample.or(criteria1);
        inspectformviewExample.or(criteria2);
        inspectformviewExample.or(criteria3);

        return inspectformviewDao.selectByExample(inspectformviewExample);
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
     * 删除药品材料表单信息
     *
     * @param medMatListID 药品材料关联编号
     */
    public void deleteMedMat(Integer medMatListID) {

        MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
        medicinesmaterialslist.setId(medMatListID);
        medicinesmaterialslist.setStatus("0");
        medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
    }

    /**
     * 批量删除药品材料表单信息
     *
     * @param medMatListIDs 药品材料关联编号列表
     */
    public void deleteMedMatByList(IdDTO medMatListIDs) {
        List<Integer> medMatListIDlist = medMatListIDs.getId();
        for (Integer ID : medMatListIDlist) {
            MedicinesMaterialsList medicinesmaterialslist = new MedicinesMaterialsList();
            medicinesmaterialslist.setId(ID);
            medicinesmaterialslist.setStatus("0");
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
        }

    }


    /**
     * 修改药品材料表单信息
     *
     * @param medicinesmaterialslist 药品材料表单信息
     */
    public void updateMedMat(MedicinesMaterialsList medicinesmaterialslist) {
        medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
    }


    /**
     * 搜索药品信息
     *
     * @param search 药品表单信息
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
        drugsExample.or(criteria1);
        drugsExample.or(criteria2);
        return drugsDao.selectByExample(drugsExample);
    }

    /**
     * 搜索材料信息
     *
     * @param search 材料表单信息
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
        materialsExample.or(criteria1);
        return materialsDao.selectByExample(materialsExample);
    }


    /**
     * 添加药品材料表单信息
     *
     * @param medicinesmaterialslist 药品材料表单信息
     */
    public void insertMedMat(Integer userID, MedicinesMaterialsList medicinesmaterialslist) {
        medicinesmaterialslist.setAppearUserID(userID);
        medicinesmaterialslist.setAppearDate(new Date());
        medicinesmaterialslist.setStatus("1");
        medicinesmaterialslistDao.insert(medicinesmaterialslist);
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
            medicinesmaterialslist.setId(ID);
            medicinesmaterialslist.setIsDrawn(136);
            medicinesmaterialslist.setIsPaid(134);
            medicinesmaterialslist.setIsChecked(141);
            medicinesmaterialslist.setIsAbolished(150);
            medicinesmaterialslist.setIsRegistered(137);
            medicinesmaterialslist.setIsExecuted(146);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);


            InspectMatReViewExample inspectmatreviewExample=new InspectMatReViewExample();
            InspectMatReViewExample.Criteria criteriaM=inspectmatreviewExample.createCriteria();
            criteriaM.andMedicinesMaterialsIDEqualTo(ID);
            InspectMatReview inspectmatreview=inspectmatreviewDao.selectByExample(inspectmatreviewExample).get(0);

            InspectFormViewExample inspectformviewExample=new InspectFormViewExample();
            InspectFormViewExample.Criteria criteriaF=inspectformviewExample.createCriteria();
            criteriaF.andInspectionDetailsIDEqualTo(inspectmatreview.getItemsDetailID());
            InspectFormView inspectformview=inspectformviewDao.selectByExample(inspectformviewExample).get(0);


            BigDecimal total=inspectmatreview.getDosage().multiply(inspectmatreview.getPrice());
            Fee fee=new Fee();
            fee.setMedicalRecordID(inspectformview.getMedicalrecordId());
            fee.setExpID(4);
            fee.setAppearUserID(userID);
            fee.setFeeAppearDate(new Date());
            fee.setPayStatus(134);
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
            medicinesmaterialslist.setIsDrawn(136);
            medicinesmaterialslist.setIsPaid(134);
            medicinesmaterialslist.setIsChecked(141);
            medicinesmaterialslist.setIsAbolished(150);
            medicinesmaterialslist.setIsRegistered(137);
            medicinesmaterialslist.setIsExecuted(146);
            medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);


            InspectMedReViewExample inspectmedreviewExample=new InspectMedReViewExample();
            InspectMedReViewExample.Criteria criteriaM=inspectmedreviewExample.createCriteria();
            criteriaM.andMedicinesMaterialsIDEqualTo(ID);
            InspectMedReView inspectmedreview=inspectmedreviewDao.selectByExample(inspectmedreviewExample).get(0);

            InspectFormViewExample inspectformviewExample=new InspectFormViewExample();
            InspectFormViewExample.Criteria criteriaF=inspectformviewExample.createCriteria();
            criteriaF.andInspectionDetailsIDEqualTo(inspectmedreview.getItemsDetailID());
            InspectFormView inspectformview=inspectformviewDao.selectByExample(inspectformviewExample).get(0);


            BigDecimal total=inspectmedreview.getDosage().multiply(inspectmedreview.getDrugsPrice());
            Fee fee=new Fee();
            fee.setMedicalRecordID(inspectformview.getMedicalrecordId());
            fee.setChargeItemID(medicinesmaterialslist.getMedicinesMaterialsID());
            if(medicinesmaterialslist.getMatOrMedType()=="0") {
                fee.setExpID(22);
            }
            if(medicinesmaterialslist.getMatOrMedType()=="1") {
                fee.setExpID(4);
            }
            fee.setAppearUserID(userID);
            fee.setFeeAppearDate(new Date());
            fee.setPayStatus(134);
            fee.setFee(total);
            feeDao.insert(fee);
        }

    }


    /**
     * 完成审核检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     */
    public void approveInspectionDetails(Integer inspectionDetailsID) {
            InspectionDetails inspectiondetails=new InspectionDetails();
            inspectiondetails.setId(inspectionDetailsID);
            inspectiondetails.setIsChecked(141);
            inspectiondetailsDao.updateByPrimaryKeySelective(inspectiondetails);
    }


    /**
     * 登记检查项目表单信息
     *
     * @param inspectionDetailsID 药品材料关联编号列表
     * @return  登记结果
     */
    public String registerInspectionDetails(Integer inspectionDetailsID) {
        String result="可以登记";
        InspectionDetails inspectiondetails=inspectiondetailsDao.selectByPrimaryKey(inspectionDetailsID);

        MedicinesMaterialsListExample medicinesmaterialslistExample=new MedicinesMaterialsListExample();
        MedicinesMaterialsListExample.Criteria criteria=medicinesmaterialslistExample.createCriteria();
        criteria.andItemsDetailIDEqualTo(inspectionDetailsID);
        criteria.andIsAbolishedEqualTo(150);
        List<MedicinesMaterialsList> medMatList=medicinesmaterialslistDao.selectByExample(medicinesmaterialslistExample);
        for (MedicinesMaterialsList medicinesmaterialslist : medMatList) {
            if(medicinesmaterialslist.getIsPaid()==134) {
                result = "药品材料未缴费";
            }else if(medicinesmaterialslist.getIsChecked()==142){
                result = "药品材料未通过审核";
            }
        }
        if(result.equals("可以登记")){
            for (MedicinesMaterialsList medicinesmaterialslist : medMatList){
              medicinesmaterialslist.setIsRegistered(136);
              medicinesmaterialslistDao.updateByPrimaryKeySelective(medicinesmaterialslist);
            }
            inspectiondetails.setIsChecked(136);
            inspectiondetailsDao.updateByPrimaryKeySelective(inspectiondetails);
            result="登记成功";
        }
        return result;
    }



    /**
     * 导入检查结果表单
     *
     * @param inspectionresultWithBLOBs 检查结果
     * @param userID 录入结果用户
     */
    public void importInspectResult(InspectionResultWithBLOBs inspectionresultWithBLOBs, Integer userID) {
        inspectionresultWithBLOBs.setDoctorID(userID);
        inspectionresultWithBLOBs.setAppearDate(new Date());
        inspectionresultWithBLOBs.setStatus("1");
        inspectionresultDao.insert(inspectionresultWithBLOBs);
    }

    /**
     * 删除检查结果表单
     *
     * @param  inspectionresultWithBLOBsID 检查结果编号
     */
    public void deleteInspectResult(Integer inspectionresultWithBLOBsID) {
        inspectionresultDao.deleteByPrimaryKey(inspectionresultWithBLOBsID);
    }


    /**
     * 导入检查结果图片
     *
     * @param inspectionresultimage 结果图片信息
     * @param userID 导入图片用户
     * @param catalog  图片名称
     */
    public void importInspectResultImages(InspectionResultImage inspectionresultimage, Integer userID, String catalog) {

        inspectionresultimage.setCatalog(catalog);
        inspectionresultimage.setStatus("1");
        inspectionresultimage.setAppearUserID(userID);
        inspectionresultimage.setAppearUserDate(new Date());
        inspectionresultimageDao.insert(inspectionresultimage);
    }


    /**
     * 删除检查结果图片
     *
     * @param  catalog 图片名称
     */
    public void deleteInspectResultImages(String catalog) {
        InspectionResultImageExample inspectionresultimageExample = new InspectionResultImageExample();
        InspectionResultImageExample.Criteria criteria = inspectionresultimageExample.createCriteria();
        InspectionResultImage inspectionresultimage;
        criteria.andCatalogEqualTo(catalog);
        inspectionresultimage = inspectionresultimageDao.selectByExample(inspectionresultimageExample).get(0);
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
    }
}

