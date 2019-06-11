package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.Patient;
import edu.neu.hospital.bean.PatientCard;
import edu.neu.hospital.dao.PatientCardDao;
import edu.neu.hospital.dao.PatientDao;
import edu.neu.hospital.service.PatientCardService;
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

    @Override
    public void applyCard(String patientName, String identityCardNo, String gender,
                          Date birthday, String familyAddress, String passwd) {

        //根据身份证号查找数据库中的患者信息
        Patient patient = patientDao.selectByIdCardNo(identityCardNo);
        if (patient == null) { //若数据库中没有同身份证号的患者信息
            //插入一条患者信息
            patient = new Patient();
            patient.setPatientName(patientName);
            patient.setIdentityCardNo(identityCardNo);
            patient.setGender(gender);
            patient.setBirthday(birthday);
            patient.setFamilyAddress(familyAddress);
            patientDao.insert(patient);
        }

        PatientCard patientCard = new PatientCard();
        patientCard.setPatientName(patientName);
        patientCard.setPatientID(patientDao.selectByIdCardNo(identityCardNo).getId());
        patientCard.setPasswd(passwd);

    }

    @Override
    public void changePasswd(Integer id, String newPasswd) {

        PatientCard patientCard = patientCardDao.selectByPrimaryKey(id);

        patientCard.setPasswd(newPasswd);

        patientCardDao.updateByPrimaryKey(patientCard);
    }

    @Override
    public BigDecimal searchBalance(Integer id) {


        return patientCardDao.selectByPrimaryKey(id).getMoney();
    }

    @Override
    public void recharge(Integer id, BigDecimal money) {

        PatientCard patientCard = patientCardDao.selectByPrimaryKey(id);

        patientCard.setMoney(money.add(patientCard.getMoney()));

        patientCardDao.updateByPrimaryKey(patientCard);
    }
}
