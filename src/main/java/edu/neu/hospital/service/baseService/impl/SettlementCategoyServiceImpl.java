package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.SettleCategoryDetails;
import edu.neu.hospital.bean.baseBean.SettleCategoryView;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.SettleCategoryDetailsDao;
import edu.neu.hospital.dao.baseDao.SettleCategoryViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.baseExample.SettleCategoryViewExample;
import edu.neu.hospital.service.baseService.SettlementCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
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
    public List<SettleCategoryView> findAll() {
        return settlecategoryviewDao.selectByExample(new SettleCategoryViewExample());
    }

    @Override
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
    public void change(ConstantItem constantitem, Integer userID) {
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);

    }

    @Override
    public void changeDetails(SettleCategoryDetails details, Integer userID) {
        settlecategorydetailsDao.updateByPrimaryKeySelective(details);
        ConstantItem constantitem = new ConstantItem();
        constantitem.setId(settlecategoryviewDao.findIdBySequenceId(details.getId()));
        constantitem.setChangeUserID(userID);
        constantitem.setChangeDate(new Date());
        constantitemDao.updateByPrimaryKeySelective(constantitem);

    }


}
