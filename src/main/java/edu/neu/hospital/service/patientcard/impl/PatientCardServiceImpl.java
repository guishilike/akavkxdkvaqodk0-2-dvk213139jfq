package edu.neu.hospital.service.patientcard.impl;

import edu.neu.hospital.bean.basicTableBean.Patient;
import edu.neu.hospital.bean.basicTableBean.PatientCard;
import edu.neu.hospital.bean.basicTableBean.PatientCardFeeRecord;
import edu.neu.hospital.dao.basicTableDao.PatientCardDao;
import edu.neu.hospital.dao.basicTableDao.PatientCardFeeRecordDao;
import edu.neu.hospital.dao.basicTableDao.PatientDao;
import edu.neu.hospital.service.patientcard.PatientCardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author LiJie
 * @date 2019/6/10 16:33
 */
@Service
public class PatientCardServiceImpl implements PatientCardService {

    @Resource
    PatientDao patientDao;

    @Resource
    PatientCardDao patientCardDao;

    @Resource
    PatientCardFeeRecordDao pcfRecDao;

    @Override
    public int applyCard(Patient patient, String passwd, Integer appearUserID) {

        //根据身份证号查找数据库中的患者信息
        if (null == patientDao.selectByIdCardNo(patient.getIdentityCardNo())) {//若数据库中没有同身份证号的患者信息
            //插入一条患者信息
            patient.setAppearUserID(appearUserID);
            patient.setAppearDate(new Date());
            patientDao.insertSelective(patient);
        }

        PatientCard patientCard = new PatientCard();
        patientCard.setPatientName(patient.getPatientName());
        patientCard.setPatientID(patientDao.selectByIdCardNo(patient.getIdentityCardNo()).getId());
        patientCard.setPasswd(passwd);
        patientCard.setMoney(BigDecimal.ZERO);
        patientCard.setAppearUserID(appearUserID);
        patientCard.setAppearDate(new Date());
        return patientCardDao.insertSelective(patientCard);
    }

    @Override
    public int changePasswd(Integer id, String newPasswd, Integer changeUserID) {

        PatientCard patientCard = patientCardDao.selectByPrimaryKey(id);
        patientCard.setPasswd(newPasswd);
        patientCard.setChangeUserID(changeUserID);
        patientCard.setChangeDate(new Date());

        return patientCardDao.updateByPrimaryKey(patientCard);
    }

    @Override
    public BigDecimal searchBalance(Integer id) {


        return patientCardDao.selectByPrimaryKey(id).getMoney();
    }

    @Override
    public int recharge(Integer id, BigDecimal money, Integer appearUserID) {

        PatientCard patientCard = patientCardDao.selectByPrimaryKey(id);
        patientCard.setMoney(money.add(patientCard.getMoney()));
        //增加一条充值记录
        PatientCardFeeRecord pcfRec = new PatientCardFeeRecord();
        pcfRec.setCardID(id);
        pcfRec.setAmount(money);
        pcfRec.setType("1");
        pcfRec.setAppearUserID(appearUserID);
        pcfRec.setAppearDate(new Date());
        pcfRecDao.insertSelective(pcfRec);

        return patientCardDao.updateByPrimaryKey(patientCard);
    }

}
