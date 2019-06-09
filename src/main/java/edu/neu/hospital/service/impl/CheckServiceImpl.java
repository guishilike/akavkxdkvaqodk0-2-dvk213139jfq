package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.Check;
import edu.neu.hospital.dao.CheckDao;
import edu.neu.hospital.example.CheckExample;
import edu.neu.hospital.service.CheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {
    @Resource
    CheckDao checkDao;


    @Override
    public List<Check> findByInfo(String userName, String departmentName, Date dateStart, Date dateEnd) {
        CheckExample checkExample = new CheckExample();
        CheckExample.Criteria criteria = checkExample.createCriteria();
        if(userName != null){
            criteria.andRealnameEqualTo(userName);
        }
        if(departmentName != null){
            criteria.andDeptnameEqualTo(departmentName);
        }
        if(dateStart != null){
            criteria.andFeeappeardateGreaterThan(dateStart);
        }
        if(dateEnd != null){
            criteria.andFeeappeardateLessThan(dateEnd);
        }
        List<Check> list = checkDao.selectByExample(checkExample);
        return list;
    }
}
