package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.baseBean.DiseaseView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.DiseaseCategory;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.DiseaseDao;
import edu.neu.hospital.dao.basicTableDao.DiseaseCategoryDao;
import edu.neu.hospital.dao.baseDao.DiseaseViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.DiseaseCategoryExample;
import edu.neu.hospital.example.basicTableExample.DiseaseViewExample;
import edu.neu.hospital.service.baseService.DiseaseService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Resource
    DiseaseViewDao diseaseviewDao;
    @Resource
    DiseaseDao diseaseDao;
    @Resource
    ConstantItemDao constantitemDao;
    @Resource
    DiseaseCategoryDao diseasecategoryDao;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    @CachePut(value = "disease",key="'diseaseCategory'+#diseaseCategoryID+'dicaTypeID'+#dicaTypeID")
    public List<DiseaseView> findDiseasesByCategory(Integer diseaseCategoryID,Integer dicaTypeID) {
        DiseaseViewExample example=new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria=example.createCriteria();
        if(diseaseCategoryID!=null)
            criteria.andDiseaseCatagoryIdEqualTo(diseaseCategoryID);
        if(dicaTypeID!=null)
            criteria.andDicaTypeIDEqualTo(dicaTypeID);
        return diseaseviewDao.selectByExample(example);
    }

    @Override
    @CacheEvict(value="disease")
    public void deleteById(Integer id, Integer userID) {
        Disease disease=diseaseDao.selectByPrimaryKey(id);
        if(disease!=null) {
            disease.setStatus("0");
            disease.setChangeDate(new Date());
            disease.setChangeUserId(userID);
            diseaseDao.updateByPrimaryKeySelective(disease);
        }
    }

    @Override
    @CacheEvict(value="disease")
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for(Integer id:ids.getId()){
            Disease disease=diseaseDao.selectByPrimaryKey(id);
            if(disease!=null) {
                disease.setStatus("0");
                disease.setChangeDate(new Date());
                disease.setChangeUserId(userID);
                diseaseDao.updateByPrimaryKeySelective(disease);
            }
        }

    }

    @Override
    @Cacheable(value="constantItem",key="'findAllNamesAndCodesByType'")
    public List<NameCodeDTO> findALLDicaType() {
        return constantitemDao.findAllNamesAndCodesByType(22);
    }

    @Override
    @Cacheable(value="diseaseCategory")
    public List<NameCodeDTO> findALLDiseaseCategory() {
        return diseasecategoryDao.findAll();
    }

    @Override
    @Cacheable(value="diseaseCategory",key="'id'+#id")
    public List<NameCodeDTO> findAllDiseaseCategoryByDicaTypeID(Integer id) {
        return diseasecategoryDao.findByTypeID(id);
    }

    @Override
    @CacheEvict("disease")
    public void add(Disease disease,Integer userID) {
        disease.setStatus("1");
        disease.setAppearUserId(userID);
        disease.setAppearDate(new Date());
        diseaseDao.insert(disease);
    }

    @Override
    @CacheEvict("disease")
    public void change(Disease disease,Integer userID) {
        disease.setChangeDate(new Date());
        disease.setChangeUserId(userID);
        diseaseDao.updateByPrimaryKeySelective(disease);
    }

    @Override
    @Cacheable(value="disease",key="'nameOrCode'+#nameOrCode")
    public List<DiseaseView> findDiseaseByNameOrCode(String nameOrCode) {
        DiseaseViewExample example=new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria1=example.createCriteria();
        DiseaseViewExample.Criteria criteria2=example.createCriteria();
        criteria1.andCodeLike("%"+nameOrCode+"%");
        criteria2.andNameLike("%"+nameOrCode+"%");
        example.or(criteria2);
        return diseaseviewDao.selectByExample(example);
    }

    @Override
    public boolean checkDiseaseContent(Disease disease, int state) {
        DiseaseViewExample example=new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria=example.createCriteria();
        criteria.andDiseaseIcdEqualTo(disease.getDiseaseIcd());
        criteria.andNameEqualTo(disease.getName());
        if(state==1)
            criteria.andIdNotEqualTo(disease.getId());
        return diseaseviewDao.countByExample(example)==0;
    }

    @Override
    @CacheEvict(value = "constantItem")
    public void addDicaType(ConstantItem constantitem, Integer userID) {
        constantitem.setConstantTypeID(22);
        constantitem.setStatus("1");
        constantitem.setApearUserID(userID);
        constantitem.setAppearDate(new Date());
        constantitemDao.insert(constantitem);
    }

    @Override
    @CacheEvict(value = "constantItem")
    public void deleteDicaType(Integer id,Integer userID) {
        ConstantItem constantitem=constantitemDao.selectByPrimaryKey(id);
        if(constantitem!=null) {
            constantitem.setStatus("0");
            constantitem.setChangeUserID(userID);
            constantitem.setChangeDate(new Date());
            constantitemDao.updateByPrimaryKeySelective(constantitem);
        }
    }

    @Override
    @CacheEvict(value = "constantItem")
    public void changeDicaType(ConstantItem constantitem, Integer userID) {
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);
    }

    @Override
    @CacheEvict(value = "diseaseCategory")
    public void addDiseaseCategory(DiseaseCategory diseasecategory, Integer userID) {
        diseasecategory.setAppearDate(new Date());
        diseasecategory.setAppearUserId(userID);
        diseasecategory.setStatus("1");
        diseasecategoryDao.insert(diseasecategory);
    }

    @Override
    @CacheEvict(value = "diseaseCategory")
    public void deleteDiseaseCategory(Integer id,Integer userID) {
         DiseaseCategory diseasecategory=diseasecategoryDao.selectByPrimaryKey(id);
         if(diseasecategory!=null) {
             diseasecategory.setChangeUserId(userID);
             diseasecategory.setChangeDate(new Date());
             diseasecategory.setStatus("0");
             diseasecategoryDao.updateByPrimaryKeySelective(diseasecategory);
         }
    }

    @Override
    @CacheEvict(value = "diseaseCategory")
    public void changeDiseaseCategory(DiseaseCategory diseasecategory, Integer userID) {
        diseasecategory.setChangeDate(new Date());
        diseasecategory.setChangeUserId(userID);
        diseasecategoryDao.updateByPrimaryKeySelective(diseasecategory);

    }

    @Override
    public boolean checkDiseaseCategoryContent(DiseaseCategory diseasecategory, int state) {
        DiseaseCategoryExample example=new DiseaseCategoryExample();
        DiseaseCategoryExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo("1");
        criteria.andDicaTypeEqualTo(diseasecategory.getDicaType());
        criteria.andNameEqualTo(diseasecategory.getName());
        if(state==1)
            criteria.andIdNotEqualTo(diseasecategory.getId());
        return diseasecategoryDao.countByExample(example)==0;
    }

    @Override
    @Cacheable(value="disease",key="'getAllDiseaseNamesAndDeptCodes'")
    public List<NameCodeDTO> getAllDiseaseNamesAndDeptCodes() {
        return diseaseviewDao.selectAllDiseaseNamesAndCodes();
    }

    @Override
    @CacheEvict(value="disease")
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        //标识文件内容是否有错
        boolean state = true;
        Disease disease;
        Workbook book;
        try {
            book = new XSSFWorkbook(file.getInputStream());
            System.out.println("success");
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);

        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                disease = new Disease();
                Row row = sheet.getRow(i);
                disease.setCode(row.getCell(0).toString());
                disease.setName(row.getCell(1).toString());
                row.getCell(2).setCellType(CellType.STRING);
                disease.setDiseaseIcd(row.getCell(2).toString());
                String dicaTypeName=row.getCell(3).toString();
                 int dicaTypeID=constantitemDao.findIdByName(dicaTypeName,22).getId();
                 disease.setDiseaseCatagoryId(diseasecategoryDao.
                         findByName(row.getCell(4).toString(),dicaTypeID).getId());

                //遇到重复是否继续执行
                if (checkDiseaseContent(disease, 0)) {
                    add(disease, userID);
                } else if (repeatCoverage) {
                    disease.setId(diseaseviewDao.getIDByName(row.getCell(1).toString()));
                    diseaseDao.updateByPrimaryKeySelective(disease);
                }

            } catch (Exception e) {
                //遇到错误是否继续执行
                state = false;
                if (!errorHappenContinue)
                    return false;

            }

        }
        file.getInputStream().close();
        return state;
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName = "disease.xls";
        List<DiseaseView> results = diseaseviewDao.selectByExample(new DiseaseViewExample());
        String[] title = {"编号", "助记编码", "疾病名称", "国际ICD编码", "所属分类",
                                    "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        for (int i = 0; i < results.size(); i++) {
            // 创建行
            row = sheet.createRow(i + 1);
            // 序号
            row.createCell(0).setCellValue(results.get(i).getId().toString());
            row.createCell(1).setCellValue(results.get(i).getCode());
            row.createCell(2).setCellValue(results.get(i).getName());
            row.createCell(3).setCellValue(results.get(i).getDiseaseIcd());
            row.createCell(4).setCellValue(results.get(i).getDicaTypeName()+"/"+results.get(i).getDiseaseCategoryName());
            if (results.get(i).getAppearDate() != null)
                row.createCell(5).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(6).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(7).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(8).setCellValue(results.get(i).getChangeUserName());

        }
        return FileManage.createXLSFile(wb, path, fileName);
    }

    @Override
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName = "diseaseTemplate.xls";
        String[] title = { "助记编码", "疾病名称", "国际ACD编码", "疾病类别分类", "疾病类别"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }
}
