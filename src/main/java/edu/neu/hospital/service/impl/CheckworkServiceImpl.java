package edu.neu.hospital.service.impl;


import edu.neu.hospital.bean.Checkwork;
import edu.neu.hospital.dao.CheckworkDao;
import edu.neu.hospital.example.CheckworkExample;
import edu.neu.hospital.service.CheckworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CheckworkServiceImpl implements CheckworkService {
    @Resource
    CheckworkDao checkworkDao;

    /**
     *
     * @param realName 用户真实姓名
     * @param departmentName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Checkwork核对类型的list
     */
    @Override
    public List<Checkwork> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd) {
        CheckworkExample checkworkExample = new CheckworkExample();
        checkworkExample.clear();
        CheckworkExample.Criteria criteria = checkworkExample.createCriteria();
        if(realName != null)
            criteria.andRealNameEqualTo(realName);
        if(departmentName != null)
            criteria.andDeptNameEqualTo(departmentName);
        if(dateStart != null)
            criteria.andFeeAppearDateGreaterThan(dateStart);
        if(dateEnd != null)
            criteria.andFeeAppearDateLessThan(dateEnd);
        List<Checkwork> list = checkworkDao.selectByExample(checkworkExample);
        return list;
    }
}
