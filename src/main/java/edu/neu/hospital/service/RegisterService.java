package edu.neu.hospital.service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author LiJie
 * @date 2019/6/10 10:40
 */
public interface RegisterService {

    /**
     * 挂号
     *
     * @param isHaveCard        是否有就诊卡，1表示有，0表示无
     * @param patientName       患者名字
     * @param identityCardNo    身份证号
     * @param gender            性别
     * @param birthday          出生日期
     * @param familyAddress     家庭住址
     * @param passwd            就诊卡密码
     * @param registeredLevelID 挂号级别ID
     * @param departmentID      科室ID
     * @param doctorID          医生ID
     * @param seeDoctorDate     看诊时间
     * @param regSourceID       挂号来源ID
     * @param payID             收费类别ID
     * @param expense           费用
     * @return 1
     */
    int addRegisteredInfo(String isHaveCard, String patientName, String identityCardNo,
                          String gender, Date birthday, String familyAddress, String passwd,
                          Integer registeredLevelID, Integer departmentID,
                          Integer doctorID, Date seeDoctorDate, Integer regSourceID,
                          Integer payID, BigDecimal expense);

}
