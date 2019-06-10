package edu.neu.hospital.service;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.bean.Workloadstatistics;

import java.util.List;

public interface UserInfoService {

    User findUserInfo(int userID);
    User updateUserInfo(User user);
//    User updateUserInfo(int id,String userName,String realName,String passwd);
    List<Workloadstatistics> showMyWorkloadstatistics(String userName);
}
