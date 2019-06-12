package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.MedicalRecord;
import edu.neu.hospital.bean.Patient;
import edu.neu.hospital.bean.PatientCard;
import edu.neu.hospital.bean.RegistrationInfo;
import edu.neu.hospital.dao.MedicalRecordDao;
import edu.neu.hospital.dao.PatientCardDao;
import edu.neu.hospital.dao.PatientDao;
import edu.neu.hospital.dao.RegistrationInfoDao;
import edu.neu.hospital.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LiJie
 * @date 2019/6/10 10:41
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    PatientDao patientDao;

    @Resource
    PatientCardDao patientCardDao;

    @Resource
    MedicalRecordDao medRecDao;

    @Resource
    RegistrationInfoDao regInfoDao;

    @Override
    public int addRegisteredInfo(String isHaveCard, Patient patient, String passwd, RegistrationInfo regInfo) {

        if (isHaveCard.equals("0")) { //若无就诊卡

            //根据身份证号查找数据库中的患者信息
            if (null == patientDao.selectByIdCardNo(patient.getIdentityCardNo())) {//若数据库中没有同身份证号的患者信息
                //插入一条患者信息
                patientDao.insert(patient);
            }
            //插入就诊卡信息
            PatientCard patientCard = new PatientCard();
            patientCard.setPatientName(patient.getPatientName());
            patientCard.setPatientID(patientDao.selectByIdCardNo(patient.getIdentityCardNo()).getId());
            patientCard.setPasswd(passwd);

            patientCardDao.insert(patientCard);
        }

        //按照当前系统时间生成17位病历号
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String medRecNo = sdf.format(new Date());
        //查表，根据身份证号获取patientID
        Integer patientID = patientDao.selectByIdCardNo(patient.getIdentityCardNo()).getId();
        //插入一条病历记录
        MedicalRecord medRec = new MedicalRecord();
        medRec.setMedicalRecordNo(medRecNo);
        medRec.setPatientID(patientID);
        medRecDao.insert(medRec);

        //插入一条挂号信息
        //查表，根据病历号获取病例ID
        Integer medRecID = medRecDao.selectByMedRecNo(medRecNo).getId();

        regInfo.setMedicalRecordID(medRecID);
        regInfo.setPatientID(patientID);
        regInfo.setRegistrationDate(new Date());

        return 0;
    }
}
