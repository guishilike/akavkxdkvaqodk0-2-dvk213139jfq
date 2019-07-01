package edu.neu.hospital.service.registerAndCharge;

import edu.neu.hospital.bean.baseBean.RegistrationListView;
import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.bean.basicTableBean.Registrationinfo;
import edu.neu.hospital.bean.basicTableBean.User;

import java.util.List;

/**
 * 挂号服务
 *
 * @author LiJie
 * @date 2019/6/10 10:40
 */
public interface RegisterService {

    /**
     * 挂号
     *
     * @param isHaveCard   是否有就诊卡，1表示有，0表示无
     * @param patient      患者信息。包含：
     *                     * patientName       患者名字
     *                     * identityCardNo    身份证号
     *                     * gender            性别
     *                     * birthday          出生日期
     *                     * familyAddress     家庭住址
     * @param passwd       就诊卡密码
     * @param regInfo      挂号信息。包含：
     *                     * registeredLevelID 挂号级别ID
     *                     * departmentID      科室ID
     *                     * doctorID          医生ID
     *                     * seeDoctorDate     看诊时间
     *                     * regSourceID       挂号来源ID
     *                     * payID             收费类别ID
     *                     * expense           费用
     * @param appearUserID 执行挂号的人的ID
     * @return int: 1表示挂号成功; 0表示挂号失败
     */
    int addRegisteredInfo(String isHaveCard, Patient patient, String passwd,
                          Registrationinfo regInfo, Integer appearUserID);


    List<RegistrationListView> getAll();

    User findUserByID(Integer id);

}
