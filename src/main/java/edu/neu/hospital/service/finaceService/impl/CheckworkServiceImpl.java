package edu.neu.hospital.service.finaceService.impl;



import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.dao.finaceDao.CheckWorkDao;
import edu.neu.hospital.example.finaceExample.CheckWorkExample;
import edu.neu.hospital.service.finaceService.CheckworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CheckworkServiceImpl implements CheckworkService {
    @Resource
    CheckWorkDao checkworkDao;

    /**
     *
     * @param realName 用户真实姓名
     * @param departmentName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Checkwork核对类型的list
     */
    @Override
    public List<CheckWork> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd) {
        CheckWorkExample checkworkExample = new CheckWorkExample();
        checkworkExample.clear();
        CheckWorkExample.Criteria criteria = checkworkExample.createCriteria();
        if(realName != null)
            criteria.andRealNameEqualTo(realName);
        if(departmentName != null)
            criteria.andDeptNameEqualTo(departmentName);
        if(dateStart != null)
            criteria.andFeeAppearDateGreaterThan(dateStart);
        if(dateEnd != null)
            criteria.andFeeAppearDateLessThan(dateEnd);
        List<CheckWork> list = checkworkDao.selectByExample(checkworkExample);
        return list;
    }
}
