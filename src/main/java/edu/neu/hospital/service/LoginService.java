package edu.neu.hospital.service;

import edu.neu.hospital.bean.User;


public interface LoginService {
    /**
     *
     * @param user 用户类型的User需要取到用户名和密码检查是否能登录
     * @return int类型的用户ID不能登录返回-1
     */
    int check(User user);
    User findByID(int id);
}
