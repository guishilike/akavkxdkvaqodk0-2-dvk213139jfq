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
import edu.neu.hospital.example.basicTableExample.DiseaseCategoryExample;
import edu.neu.hospital.example.basicTableExample.DiseaseViewExample;
import edu.neu.hospital.service.baseService.DiseaseService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
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
    @Override
    public List<DiseaseView> findDiseasesByCategory(Integer diseaseCategoryID) {
        DiseaseViewExample example=new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria=example.createCriteria();
        if(diseaseCategoryID!=null)
            criteria.andDiseaseCatagoryIdEqualTo(diseaseCategoryID);
        return diseaseviewDao.selectByExample(example);
    }

    @Override
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
    public List<ConstantItem> findALLDicaType() {
        return constantitemDao.findByTypeID(22);
    }

    @Override
    public List<DiseaseCategory> findAllDiseaseCategoryByDicaTypeID(Integer id) {
        DiseaseCategoryExample example=new DiseaseCategoryExample();
        DiseaseCategoryExample.Criteria criteria=example.createCriteria();
        criteria.andDicaTypeEqualTo(id);
        criteria.andStatusEqualTo("1");
       return diseasecategoryDao.selectByExample(example);
    }

    @Override
    public void add(Disease disease,Integer userID) {
        disease.setStatus("1");
        disease.setAppearUserId(userID);
        disease.setAppearDate(new Date());
        diseaseDao.insert(disease);
    }

    @Override
    public void change(Disease disease,Integer userID) {
        disease.setChangeDate(new Date());
        disease.setChangeUserId(userID);
        diseaseDao.updateByPrimaryKeySelective(disease);
    }

    @Override
    public List<DiseaseView> findDiseaseByNameOrCode(String nameOrCode) {
        DiseaseViewExample example=new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria1=example.createCriteria();
        DiseaseViewExample.Criteria criteria2=example.createCriteria();
        criteria1.andCodeEqualTo(nameOrCode);
        criteria2.andNameEqualTo(nameOrCode);
        example.or(criteria2);
        return diseaseviewDao.selectByExample(example);
    }

    @Override
    public boolean checkDiseaseContent(Disease disease, int state) {
        DiseaseViewExample example=new DiseaseViewExample();
        DiseaseViewExample.Criteria criteria=example.createCriteria();
        criteria.andDiseaseIcdEqualTo(disease.getDiseaseIcd());
        if(state==1)
            criteria.andIdEqualTo(disease.getId());
        if(diseaseviewDao.countByExample(example)>0)
            return false;
        else
            return true;
    }

    @Override
    public void addDicaType(ConstantItem constantitem, Integer userID) {
        constantitem.setConstantTypeID(22);
        constantitem.setStatus("1");
        constantitem.setApearUserID(userID);
        constantitem.setAppearDate(new Date());
        constantitemDao.insert(constantitem);
    }

    @Override
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
    public void changeDicaType(ConstantItem constantitem, Integer userID) {
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);
    }

    @Override
    public void addDiseaseCategory(DiseaseCategory diseasecategory, Integer userID) {
        diseasecategory.setAppearDate(new Date());
        diseasecategory.setAppearUserId(userID);
        diseasecategory.setStatus("1");
        diseasecategoryDao.insert(diseasecategory);
    }

    @Override
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
        if(diseasecategoryDao.countByExample(example)>0)
            return false;
        else
            return true;

    }
}
