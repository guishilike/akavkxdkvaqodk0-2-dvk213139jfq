package edu.neu.hospital.service.loginAndInfoService;


import edu.neu.hospital.bean.basicTableBean.User;

public interface LoginService {
    /**
     * 登录检查
     * @param user 用户类型的User需要取到用户名和密码检查是否能登录
     * @return int类型的用户ID不能登录返回-1
     */
    int check(User user);

    /**
     * 根据用户ID查找user对象
     * @param id 用户ID
     * @return user对象
     */
    User findByID(int id);
}
