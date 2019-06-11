package edu.neu.hospital.service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊卡服务，包括申请就诊卡，修改密码和费用管理
 *
 * @author LiJie
 * @date 2019/6/10 16:30
 */
public interface PatientCardService {


    /**
     * 申请就诊卡
     *
     * @param patientName    患者名字
     * @param identityCardNo 身份证号
     * @param gender         性别
     * @param birthday       出生日期
     * @param familyAddress  家庭住址
     * @param passwd         就诊卡密码
     */
    void applyCard(String patientName, String identityCardNo, String gender,
                   Date birthday, String familyAddress, String passwd);


    /**
     * 修改就诊卡密码
     *
     * @param id        就诊卡
     * @param newPasswd 新密码
     */
    void changePasswd(Integer id, String newPasswd);

    /**
     * 查询就诊卡余额
     *
     * @param id 就诊卡id
     * @return 返回余额
     */
    BigDecimal searchBalance(Integer id);

    /**
     * 就诊卡充值
     *
     * @param id    就诊卡id
     * @param money 充值金额
     */
    void recharge(Integer id, BigDecimal money);
}
