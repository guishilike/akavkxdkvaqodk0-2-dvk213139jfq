package edu.neu.hospital.service.loginAndInfoService;


import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.bean.finaceBean.WorkLoadStatistics;

import java.util.List;


public interface UserInfoService {
    /**
     *
     * @param userID 传入一个int类型的userID
     * @return 返回根据用户ID查找到的user对象找不到为null
     */
    UserView findUserInfo(int userID);

    /**
     *
     * @param user User类型的user，根据这个user的属性更新数据库送对应的user
     * @return 返回更新后的user对象
     */
    User updateUserInfo(User user);
//    User updateUserInfo(int id,String userName,String realName,String passwd);

    /**
     *
     * @param realName 用户的真实姓名
     * @return 根据用户姓名查找到的用户工作量统计的list
     */
    List<WorkLoadStatistics> showMyWorkloadstatistics(String realName);
}
