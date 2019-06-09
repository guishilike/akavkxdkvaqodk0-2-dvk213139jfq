package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.bean.Workloadstatistics;
import edu.neu.hospital.dao.UserDao;
import edu.neu.hospital.dao.WorkloadstatisticsDao;
import edu.neu.hospital.example.UserExample;
import edu.neu.hospital.example.WorkloadstatisticsExample;
import edu.neu.hospital.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserDao userDao;
    WorkloadstatisticsDao workloadstatisticsDao;

    @Override
    public User findUserInfo(int userID) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(userID);
        User user = userDao.selectByPrimaryKey(userID);
        return user;
    }

    @Override
    public User upDateUserInfo(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andIdNotEqualTo(user.getId());
        List<User> list = userDao.selectByExample(userExample);
        if(list == null){
            int id = userDao.updateByPrimaryKey(user);
            return userDao.selectByPrimaryKey(id);
        }else{
            return null;
        }
    }

    @Override
    public List<Workloadstatistics> showMyWorkloadstatistics(String userName) {
        WorkloadstatisticsExample workstatisticsExample = new WorkloadstatisticsExample();
        WorkloadstatisticsExample.Criteria criteria = workstatisticsExample.createCriteria();
        criteria.andRealnameEqualTo(userName);
        List<Workloadstatistics> list = workloadstatisticsDao.selectByExample(workstatisticsExample);
        return list;
    }
}
