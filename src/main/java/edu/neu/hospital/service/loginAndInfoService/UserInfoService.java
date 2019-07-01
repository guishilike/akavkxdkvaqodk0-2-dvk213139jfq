package edu.neu.hospital.service.loginAndInfoService;


import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;

import java.util.List;


public interface UserInfoService {
    /**
     *查找用户信息
     * @param userID 传入一个int类型的userID
     * @return 返回根据用户ID查找到的user对象找不到为null
     */
    UserView findUserInfo(int userID);

    /**
     * 更新用户信息
     * @param user User类型的user，根据这个user的属性更新数据库送对应的user
     * @return 返回更新后的user对象
     */
    User updateUserInfo(User user);

    /**
     * 更新用户密码
     * @param userID 用户ID
     * @param oldPasswd 旧密码
     * @param newPasswd 新密码
     * @return 是否更新密码成功
     */
    int updatePasswd(int userID ,String oldPasswd,String newPasswd);
//    User updateUserInfo(int id,String userName,String realName,String passwd);

    /**
     * 显示用户工作量
     * @param realName 用户的真实姓名
     * @return 根据用户姓名查找到的用户工作量统计的list
     */
    List<WorkLoadStatistics> showMyWorkloadstatistics(String realName);
}
