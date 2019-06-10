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
import java.util.Date;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserDao userDao;
    @Resource
    WorkloadstatisticsDao workloadstatisticsDao;

    @Override
    public User findUserInfo(int userID) {
        UserExample userExample = new UserExample();
        userExample.clear();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(userID);
        User user = userDao.selectByPrimaryKey(userID);
        return user;
    }

    @Override
    public User updateUserInfo(User user2) {
        Date date = new Date();
        Boolean b = true;
        UserExample userExample = new UserExample();
        User user = new User();
        UserExample userExample2 = new UserExample();
        userExample.clear();
        userExample2.clear();
        UserExample.Criteria criteria = userExample.createCriteria();
        UserExample.Criteria criteria2 = userExample2.createCriteria();
        criteria.andStatusEqualTo("1");
        criteria2.andStatusEqualTo("1");
        criteria2.andUserNameEqualTo(user2.getUserName());
        List<User> list2 = userDao.selectByExample(userExample2);
        for(User user1:list2){
            if(user1.getId() == user2.getId())
                b = false;
        }
        criteria.andIdEqualTo(user2.getId());
        user.setId(user2.getId());
        if(user2.getUserName() != null)
            user.setUserName(user2.getUserName());
        if(user2.getRealName() != null)
            user.setRealName(user2.getRealName());
        if(user2.getPasswd() != null)
            user.setPasswd(user2.getPasswd());
        if(user2.getDepartmentID() != null)
            user.setDepartmentID(user2.getDepartmentID());
        if(user2.getTypeID() != null)
            user.setTypeID(user2.getTypeID());
        if(user2.getRankID() != null)
            user.setRankID(user2.getRankID());
        if(user2.getIsSchedule() != null)
            user.setIsSchedule(user2.getIsSchedule());
        if(user2.getAppearUserID() != null)
            user.setAppearUserID(user2.getAppearUserID());
        if(user2.getAppearDate() != null)
            user.setAppearDate(user2.getAppearDate());
        if(user2.getPhotoLocation() != null)
            user.setPhotoLocation(user2.getPhotoLocation());
        user.setStatus("1");
        user.setChangeUserID(user2.getId());
        user.setChangeDate(date);
        if(b){
            int id1 = userDao.updateByExample(user,userExample);
            return userDao.selectByPrimaryKey(user2.getId());
        }else{
            return null;
        }
    }

//    @Override
//    public User updateUserInfo(int id, String userName, String realName, String passwd) {
//        Boolean b = true;
//        UserExample userExample = new UserExample();
//        User user = new User();
//        UserExample userExample2 = new UserExample();
//        userExample.clear();
//        userExample2.clear();
//        UserExample.Criteria criteria = userExample.createCriteria();
//        UserExample.Criteria criteria2 = userExample2.createCriteria();
//        criteria.andStatusEqualTo("1");
//        criteria2.andStatusEqualTo("1");
//        criteria2.andUserNameEqualTo(userName);
//        List<User> list2 = userDao.selectByExample(userExample2);
//        for(User user1:list2){
//            if(user1.getId() == id)
//                b = false;
//        }
//        criteria.andIdEqualTo(id);
//        user.setId(id);
//        user.setUserName(userName);
//        user.setRealName(realName);
//        user.setPasswd(passwd);
//        user.setStatus("1");
//        if(b){
//            int id1 = userDao.updateByExample(user,userExample);
//            return userDao.selectByPrimaryKey(id);
//        }else{
//            return null;
//        }
//    }

//    @Override
//    public User updateUserInfo(User user) {
//        UserExample userExample = new UserExample();
//        userExample.clear();
//        UserExample.Criteria criteria = userExample.createCriteria();
//        criteria.andStatusEqualTo("1");
//        criteria.andUserNameEqualTo(user.getUserName());
//        criteria.andIdNotEqualTo(user.getId());
//        List<User> list = userDao.selectByExample(userExample);
//        if(list == null){
//            int id = userDao.updateByPrimaryKey(user);
//            return userDao.selectByPrimaryKey(id);
//        }else{
//            return null;
//        }
//    }



    @Override
    public List<Workloadstatistics> showMyWorkloadstatistics(String realName) {
        WorkloadstatisticsExample workloadstatisticsExample = new WorkloadstatisticsExample();
        workloadstatisticsExample.clear();
        WorkloadstatisticsExample.Criteria criteria = workloadstatisticsExample.createCriteria();
        criteria.andPayStatusEqualTo("1");
        criteria.andRealNameEqualTo(realName);
        List<Workloadstatistics> list = workloadstatisticsDao.selectByExample(workloadstatisticsExample);
        return list;
    }
}
