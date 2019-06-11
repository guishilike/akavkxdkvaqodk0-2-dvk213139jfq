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

    /**
     *
     * @param userID 传入一个int类型的userID
     * @return 返回根据用户ID查找到的user对象找不到为null
     */
    @Override
    public User findUserInfo(int userID) {
        UserExample userExample = new UserExample();
        userExample.clear();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(userID);
        User user = userDao.selectByPrimaryKey(userID);
        return user;
    }

    /**
     *
     * @param user2 User类型的user，根据这个user的属性更新数据库送对应的user
     * @return 返回更新后的user对象
     */
    @Override
    public User updateUserInfo(User user2) {
//        userDao.updateByPrimaryKeySelective(user2);
        Date date = new Date();
        Boolean b = true;
        UserExample userExample = new UserExample();
        userExample.clear();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andStatusEqualTo("1");
        criteria.andUserNameEqualTo(user2.getUserName());
        criteria.andIdNotEqualTo(user2.getId());
        List<User> list2 = userDao.selectByExample(userExample);
        if(userDao.countByExample(userExample) != 0){
            b=false;
        }
        user2.setStatus("1");
        user2.setChangeUserID(user2.getId());
        user2.setChangeDate(date);
        if(b){
            int id1 = userDao.updateByPrimaryKeySelective(user2);
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
//        if(userDao.)
//
//
//
//    }
//            int id = userDao.updateByPrimaryKey(user);
//            return userDao.selectByPrimaryKey(id);
//        }else{
//            return null;
//        }
//    }


    /**
     *
     * @param realName 用户的真实姓名
     * @return 根据用户姓名查找到的用户工作量统计的list
     */
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
