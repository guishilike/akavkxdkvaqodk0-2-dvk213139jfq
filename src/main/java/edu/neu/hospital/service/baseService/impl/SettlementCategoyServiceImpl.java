package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.SettleCategoryDetails;
import edu.neu.hospital.bean.baseBean.SettleCategoryView;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.SettleCategoryDetailsDao;
import edu.neu.hospital.dao.baseDao.SettleCategoryViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.baseExample.SettleCategoryViewExample;
import edu.neu.hospital.service.baseService.SettlementCategoryService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SettlementCategoyServiceImpl implements SettlementCategoryService {
    @Resource
    ConstantItemDao constantitemDao;
    @Resource
    SettleCategoryViewDao settlecategoryviewDao;
    @Resource
    SettleCategoryDetailsDao settlecategorydetailsDao;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    @CacheEvict(value="constantItem")
    public void add(ConstantItem constantitem, Integer userID) {
        constantitem.setStatus("1");
        constantitem.setAppearDate(new Date());
        constantitem.setApearUserID(userID);
        constantitem.setConstantTypeID(12);
        constantitemDao.insert(constantitem);
        SettleCategoryDetails details = new SettleCategoryDetails();
        //添加挂号级别详情表
        details.setSettleCategoryID(constantitem.getId());
        details.setStatus("1");
        settlecategorydetailsDao.insert(details);
    }

    @Override
    @CachePut(value="constantItem",key="'findAllSettlementCategory'")
    public List<SettleCategoryView> findAll() {
        return settlecategoryviewDao.selectByExample(new SettleCategoryViewExample());
    }

    @Override
    @CacheEvict(value="constantItem")
    public void deleteByID(Integer id, Integer userID) {

        ConstantItem settleCategory = constantitemDao.selectByPrimaryKey(id);
        if(settleCategory!=null) {
            SettleCategoryDetails settlecategorydetails = new SettleCategoryDetails();
            settlecategorydetails.setId(settlecategoryviewDao.findSequenceIdById(id));
            settlecategorydetails.setStatus("0");
            settleCategory.setStatus("0");
            settleCategory.setChangeUserID(userID);
            settleCategory.setChangeDate(new Date());
            constantitemDao.updateByPrimaryKeySelective(settleCategory);
            settlecategorydetailsDao.updateByPrimaryKeySelective(settlecategorydetails);
        }

    }

    @Override
    @Cacheable(value="constantItem",key="'findByCodeOrName'")
    public List<SettleCategoryView> findByCodeOrName(String codeOrName) {
        SettleCategoryViewExample example = new SettleCategoryViewExample();
        SettleCategoryViewExample.Criteria criteria1 = example.createCriteria();
        SettleCategoryViewExample.Criteria criteria2 = example.createCriteria();
        criteria1.andSettleCategoryCodeEqualTo(codeOrName);
        criteria2.andSettleCategoryNameEqualTo(codeOrName);
        example.or(criteria2);
        return settlecategoryviewDao.selectByExample(example);
    }

    @Override
    @CacheEvict(value="constantItem")
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (Integer id:ids.getId()) {
            ConstantItem settleCategory = constantitemDao.selectByPrimaryKey(id);
            if(settleCategory!=null) {
                settleCategory.setStatus("0");
                settleCategory.setChangeUserID(userID);
                settleCategory.setChangeDate(new Date());
                SettleCategoryDetails settlecategorydetails = new SettleCategoryDetails();
                settlecategorydetails.setStatus("0");
                settlecategorydetails.setId(settlecategoryviewDao.findSequenceIdById(id));
                constantitemDao.updateByPrimaryKeySelective(settleCategory);
                settlecategorydetailsDao.updateByPrimaryKeySelective(settlecategorydetails);
            }
        }

    }

    @Override
    @CacheEvict(value="constantItem")
    public void change(ConstantItem constantitem, Integer userID) {
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);

    }

    @Override
    @CacheEvict(value="constantItem")
    public void changeDetails(SettleCategoryDetails details, Integer userID) {
        settlecategorydetailsDao.updateByPrimaryKeySelective(details);
        ConstantItem constantitem = new ConstantItem();
        constantitem.setId(settlecategoryviewDao.findIdBySequenceId(details.getId()));
        constantitem.setChangeUserID(userID);
        constantitem.setChangeDate(new Date());
        constantitemDao.updateByPrimaryKeySelective(constantitem);

    }

    @Override
    @Cacheable(value="constantItem",key="'getAllSetCatNamesAndCode'")
    public List<NameCodeDTO> getAllSetCatNamesAndCode() {
        return constantitemDao.findAllNamesAndCodesByType(12);
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName ="settleCategory.xls";
        List<SettleCategoryView> results =
                settlecategoryviewDao.selectByExample(new SettleCategoryViewExample());
        String[] title = {"编号", "结算类别编码", "结算类别名称", "顺序号", "阙值1","阙值2","阙值3",
                "比例1","比例2","比例3","比例4","创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        // 写入正式数据
        for (int i = 0; i < results.size(); i++) {
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId());
            row.createCell(1).setCellValue(results.get(i).getSettleCategoryCode());
            row.createCell(2).setCellValue(results.get(i).getSettleCategoryName());
            row.createCell(3).setCellValue(results.get(i).getSequenceID());
            row.createCell(4).setCellValue(results.get(i).getThresnold1()==null?
                    "":results.get(i).getThresnold1().toString());
            row.createCell(5).setCellValue(results.get(i).getThresnold2()==null?
                    "":results.get(i).getThresnold2().toString());
            row.createCell(6).setCellValue(results.get(i).getThresnold3()==null?
                    "":results.get(i).getThresnold3().toString());

            row.createCell(7).setCellValue(results.get(i).getProportion1()==null?
                    "":results.get(i).getProportion1().toString());
            row.createCell(8).setCellValue(results.get(i).getProportion2()==null?
                    "":results.get(i).getProportion2().toString());
            row.createCell(9).setCellValue(results.get(i).getProportion3()==null?
                    "":results.get(i).getProportion3().toString());

            if (results.get(i).getAppearDate() != null)
                row.createCell(10).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(11).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(12).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(13).setCellValue(results.get(i).getChangeUserName());
        }
        return  FileManage.createXLSFile(wb, path, fileName);
    }


}
