package edu.neu.hospital.service;

import edu.neu.hospital.bean.User;
import edu.neu.hospital.bean.Workloadstatistics;

import java.util.List;

public interface UserInfoService {
    User findUserInfo(int userID);
    User upDateUserInfo(User user);
    List<Workloadstatistics> showMyWorkloadstatistics(String userName);
}
