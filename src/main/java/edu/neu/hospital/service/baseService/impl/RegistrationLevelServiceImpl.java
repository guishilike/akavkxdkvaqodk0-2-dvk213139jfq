package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.baseBean.RegistrationLevelView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.RegistrationLevelDetails;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.RegistrationLevelDetailsDao;
import edu.neu.hospital.dao.baseDao.RegistrationLevelViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.baseExample.RegistrationLevelViewExample;
import edu.neu.hospital.service.baseService.RegistrationLevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RegistrationLevelServiceImpl implements RegistrationLevelService {
    @Resource
    RegistrationLevelViewDao registrationlevelviewDao;
    @Resource
    RegistrationLevelDetailsDao registrationleveldetailsDao;
    @Resource
    ConstantItemDao constantitemDao;


    @Override
    public void add(ConstantItem constantitem, Integer userID) {
        constantitem.setConstantTypeID(13);
        constantitem.setAppearDate(new Date());
        constantitem.setApearUserID(userID);
        constantitem.setStatus("1");
        constantitemDao.insert(constantitem);
        //添加挂号级别详情表
        RegistrationLevelDetails details = new RegistrationLevelDetails();
        details.setRegisteredLevelID(constantitem.getId());
        details.setStatus("1");
        registrationleveldetailsDao.insert(details);
    }

    //列出所有的挂号级别
    @Override
    public List<RegistrationLevelView> findAll() {
        return registrationlevelviewDao.selectByExample(new RegistrationLevelViewExample());
    }

    //根据id删除挂号级别
    @Override
    public void deleteByID(Integer id, Integer userID) {
        ConstantItem constantitem = constantitemDao.selectByPrimaryKey(id);
        if (constantitem != null) {
            constantitem.setStatus("0");
            constantitem.setChangeUserID(userID);
            constantitem.setChangeDate(new Date());
            RegistrationLevelDetails details = new RegistrationLevelDetails();
            details.setId(registrationlevelviewDao.findSequenceIdById(id));
            details.setStatus("0");
            constantitemDao.updateByPrimaryKeySelective(constantitem);
            registrationleveldetailsDao.updateByPrimaryKeySelective(details);
        }
    }

    @Override
    public List<RegistrationLevelView> findByCodeOrName(String codeOrName) {
        RegistrationLevelViewExample example = new RegistrationLevelViewExample();
        RegistrationLevelViewExample.Criteria criteria1 = example.createCriteria();
        RegistrationLevelViewExample.Criteria criteria2 = example.createCriteria();
        criteria1.andRegisteredCodeEqualTo(codeOrName);
        criteria2.andRegisteredNameEqualTo(codeOrName);
        example.or(criteria2);
        return registrationlevelviewDao.selectByExample(example);
    }

    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (Integer id : ids.getId()) {
            ConstantItem constantitem = constantitemDao.selectByPrimaryKey(id);
            if (constantitem != null) {
                constantitem.setStatus("0");
                RegistrationLevelDetails details = new RegistrationLevelDetails();
                constantitem.setChangeUserID(userID);
                constantitem.setChangeDate(new Date());
                details.setId(registrationlevelviewDao.findSequenceIdById(id));
                details.setStatus("0");
                constantitemDao.updateByPrimaryKeySelective(constantitem);
                registrationleveldetailsDao.updateByPrimaryKeySelective(details);
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
    public void changeDetails(RegistrationLevelDetails details, Integer userID) {
        registrationleveldetailsDao.updateByPrimaryKeySelective(details);
        ConstantItem constantitem = new ConstantItem();
        constantitem.setId(registrationlevelviewDao.findIdBySequenceId(details.getId()));
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);
    }


}
