package edu.neu.hospital.service;

import edu.neu.hospital.bean.Patient;

import java.math.BigDecimal;

/**
 * 就诊卡服务，包括申请就诊卡，查询余额，修改密码和费用管理
 *
 * @author LiJie
 * @date 2019/6/10 16:30
 */
public interface PatientCardService {

    /**
     * 申请就诊卡
     *
     * @param patient      患者信息
     * @param passwd       就诊卡密码
     * @param appearUserID 执行申请的人的ID
     * @return int: 就诊卡id
     */
    int applyCard(Patient patient, String passwd, Integer appearUserID);


    /**
     * 修改就诊卡密码
     *
     * @param id           就诊卡
     * @param newPasswd    新密码
     * @param changeUserID 执行修改的人的ID
     * @return int: 1表示修改成功; 0表示修改失败
     */
    int changePasswd(Integer id, String newPasswd, Integer changeUserID);

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
     * @param id           就诊卡id
     * @param money        充值金额
     * @param appearUserID 执行申请的人的ID
     * @return int: 1表示充值成功; 0表示充值失败
     */
    int recharge(Integer id, BigDecimal money, Integer appearUserID);
}
