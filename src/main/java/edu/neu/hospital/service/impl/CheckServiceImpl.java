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
    public List<Check> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd) {

        CheckExample checkExample = new CheckExample();
        checkExample.clear();
        CheckExample.Criteria criteria = checkExample.createCriteria();

        if(realName != null){
            criteria.andRealNameEqualTo(realName);
        }
        if(departmentName != null){
            criteria.andDeptNameEqualTo(departmentName);
        }
        if(dateStart != null){
            criteria.andFeeAppearDateGreaterThan(dateStart);
        }
        if(dateEnd != null){
            criteria.andFeeAppearDateLessThan(dateEnd);
        }
        List<Check> list = checkDao.selectByExample(checkExample);
        return list;
    }
}