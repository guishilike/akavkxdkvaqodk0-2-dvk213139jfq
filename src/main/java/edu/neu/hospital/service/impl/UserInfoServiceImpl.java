package edu.neu.hospital.service.impl;

import edu.neu.hospital.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> findUserInfo() {
        return null;
    }
}
