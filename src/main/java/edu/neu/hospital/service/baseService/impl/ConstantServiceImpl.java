package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.example.basicTableExample.ConstantItemExample;
import edu.neu.hospital.service.baseService.ConstantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConstantServiceImpl implements ConstantService {
    @Resource
    ConstantItemDao constantitemDao;

    @Override
    public boolean checkContent(ConstantItem constantitem, int state, int typeID) {
        ConstantItemExample example = new ConstantItemExample();
        ConstantItemExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1");
        criteria.andConstantNameEqualTo(constantitem.getConstantName());
        criteria.andConstantTypeIDEqualTo(typeID);
        if (state == 1)
            criteria.andIdNotEqualTo(constantitem.getId());

        criteria.andConstantTypeIDEqualTo(12);
        if (constantitemDao.countByExample(example) > 0)
            return false;
        else
            return true;

    }

    @Override
    public List<ConstantItem> findByTypeID(Integer typeID) {

        return constantitemDao.findByTypeID(typeID);
    }
}
