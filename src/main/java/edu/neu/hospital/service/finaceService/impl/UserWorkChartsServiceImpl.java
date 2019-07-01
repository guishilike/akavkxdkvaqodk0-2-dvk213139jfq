package edu.neu.hospital.service.finaceService.impl;

import edu.neu.hospital.bean.finaceBean.UserWorkCharts;
import edu.neu.hospital.dao.finaceDao.UserWorkChartsDao;
import edu.neu.hospital.example.finaceExample.UserWorkChartsExample;
import edu.neu.hospital.service.finaceService.UserWorkChartsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserWorkChartsServiceImpl implements UserWorkChartsService {
    @Resource
    UserWorkChartsDao userWorkChartsDao;

    @Override
    public List<UserWorkCharts> list() {
        UserWorkChartsExample userWorkChartsExample = new UserWorkChartsExample();
        userWorkChartsExample.clear();
        UserWorkChartsExample.Criteria criteria = userWorkChartsExample.createCriteria();
        List<UserWorkCharts> list = userWorkChartsDao.selectByExample(userWorkChartsExample);
        return list;
    }
}
