package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.Patient;
import edu.neu.hospital.bean.PatientCard;
import edu.neu.hospital.dao.PatientCardDao;
import edu.neu.hospital.dao.PatientDao;
import edu.neu.hospital.service.PatientCardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

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
    public int applyCard(Patient patient, String passwd) {

        //根据身份证号查找数据库中的患者信息
        if (null == patientDao.selectByIdCardNo(patient.getIdentityCardNo())) {//若数据库中没有同身份证号的患者信息
            //插入一条患者信息
            patientDao.insert(patient);
        }

        PatientCard patientCard = new PatientCard();
        patientCard.setPatientName(patient.getPatientName());
        patientCard.setPatientID(patientDao.selectByIdCardNo(patient.getIdentityCardNo()).getId());
        patientCard.setPasswd(passwd);

        return patientCardDao.insert(patientCard);
    }

    @Override
    public int changePasswd(Integer id, String newPasswd) {

        PatientCard patientCard = patientCardDao.selectByPrimaryKey(id);

        patientCard.setPasswd(newPasswd);

        return patientCardDao.updateByPrimaryKey(patientCard);
    }

    @Override
    public BigDecimal searchBalance(Integer id) {


        return patientCardDao.selectByPrimaryKey(id).getMoney();
    }

    @Override
    public int recharge(Integer id, BigDecimal money) {

        PatientCard patientCard = patientCardDao.selectByPrimaryKey(id);

        patientCard.setMoney(money.add(patientCard.getMoney()));

        return patientCardDao.updateByPrimaryKey(patientCard);
    }
}
