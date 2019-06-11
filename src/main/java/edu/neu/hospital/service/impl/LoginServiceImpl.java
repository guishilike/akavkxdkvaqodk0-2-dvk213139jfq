package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.dao.UserDao;
import edu.neu.hospital.example.UserExample;
import edu.neu.hospital.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UserDao userDao;

    /**
     *
     * @param user 用户类型的User需要取到用户名和密码检查是否能登录
     * @return int类型的用户ID不能登录返回-1
     */
    @Override
    public int check(User user) {
        UserExample userExample =new UserExample();
        userExample.clear();
        UserExample.Criteria criteria =userExample.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        criteria.andPasswdEqualTo(user.getPasswd());
        List<User> list = userDao.selectByExample(userExample);
        if(list.isEmpty()){
            return -1;
        }else {
            int i = -1;
            for (User user1 :list){
                i = user1.getId();
            }
            return i;
        }
    }

    @Override
    public User findByID(int id) {
        UserExample userExample =new UserExample();
        userExample.clear();
        UserExample.Criteria criteria =userExample.createCriteria();
        return userDao.selectByPrimaryKey(id);
    }
}
