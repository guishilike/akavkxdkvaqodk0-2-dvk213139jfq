package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.dao.basicTableDao.UserDao;
import edu.neu.hospital.dao.baseDao.UserViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.UserNameAndPassDTO;
import edu.neu.hospital.example.basicTableExample.UserExample;
import edu.neu.hospital.example.baseExample.UserViewExample;
import edu.neu.hospital.service.baseService.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Resource
    UserViewDao userviewDao;

    @Override
    //列出用户
    public List<UserView> findUsers(Integer deptID, Integer typeID) {
        UserViewExample userviewExample = new UserViewExample();
        UserViewExample.Criteria criteria = userviewExample.createCriteria();
        if (deptID != null)
            criteria.andDepartmentIDEqualTo(deptID);
        if (typeID != null)
            criteria.andTypeIDEqualTo(typeID);

        return userviewDao.selectByExample(userviewExample);
    }

    @Override
    public void deleteById(Integer id, Integer userID) {
        User user = userDao.selectByPrimaryKey(id);
        if (user != null) {
            user.setChangeUserID(userID);
            user.setChangeDate(new Date());
            user.setStatus("0");
            userDao.updateByPrimaryKeySelective(user);
        }
    }

    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (Integer id:ids.getId()) {
            User user = userDao.selectByPrimaryKey(id);
            if (user != null) {
                user.setChangeUserID(userID);
                user.setChangeDate(new Date());
                user.setStatus("0");
                userDao.updateByPrimaryKeySelective(user);
            }
        }
    }


    @Override
    public void add(User user,Integer userID) {
        user.setAppearUserID(userID);
        user.setStatus("1");
        user.setAppearDate(new Date());
        userDao.insert(user);
    }

    @Override
    public void change(User user,Integer userID) {
        user.setChangeUserID(userID);
        user.setChangeDate(new Date());
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public boolean checkContent(User user, int state) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (state == 1)
            criteria.andIdNotEqualTo(user.getId());
        criteria.andUserNameEqualTo(user.getUserName());
        criteria.andStatusEqualTo("1");
        if (userDao.countByExample(example) > 0)
            return false;
        else
            return true;
    }

    //设置默认用户名和密码
    @Override
    public UserNameAndPassDTO setDefaultNameAndPass() {
        String userName = UUID.randomUUID() + "";
        String password = "123456";
        return new UserNameAndPassDTO(userName, password);
    }

    //根据真名或登录名查找用户
    @Override
    public List<UserView> findUserByName(String name) {
        UserViewExample example = new UserViewExample();
        UserViewExample.Criteria criteria1 = example.createCriteria();
        UserViewExample.Criteria criteria2 = example.createCriteria();
        criteria1.andRealNameEqualTo(name);
        criteria2.andUserNameEqualTo(name);
        example.or(criteria2);
        return userviewDao.selectByExample(example);
    }
}
