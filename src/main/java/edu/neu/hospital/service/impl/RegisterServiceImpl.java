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
import java.math.BigDecimal;
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
    public int addRegisteredInfo(String isHaveCard, String patientName, String identityCardNo,
                                              String gender, Date birthday, String familyAddress, String passwd,
                                              Integer registeredLevelID, Integer departmentID,
                                              Integer doctorID, Date seeDoctorDate, Integer regSourceID,
                                              Integer payID, BigDecimal expense) {

        if (isHaveCard.equals("0")) { //若无就诊卡

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

        //按照当前系统时间生成17位病历号
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String medRecNo = sdf.format(new Date());
        //查表，根据身份证号获取patientID
        Integer patientID = patientDao.selectByIdCardNo(identityCardNo).getId();
        //插入一条病历记录
        MedicalRecord medRec = new MedicalRecord();
        medRec.setMedicalRecordNo(medRecNo);
        medRec.setPatientID(patientID);
        medRecDao.insert(medRec);

        //插入一条挂号信息
        RegistrationInfo regInfo = new RegistrationInfo();
        //查表，根据病历号获取病例ID
        Integer medRecID = medRecDao.selectByMedRecNo(medRecNo).getId();
        regInfo.setMedicalRecordID(medRecID);
        regInfo.setPatientID(patientID);
        regInfo.setRegistrationLevelID(registeredLevelID);
        regInfo.setRegistrationDate(new Date());
        regInfo.setSeeDoctorDate(seeDoctorDate);
        regInfo.setDepartmentID(departmentID);
        regInfo.setDoctorID(doctorID);
        regInfo.setRegistrationSourceID(regSourceID);
        regInfo.setPaymentCategoryID(payID);
        regInfo.setIsSeenDocator("0");//0表示未看诊，1表示已看诊，默认为0
        regInfo.setExpense(expense);
        regInfo.setRegistrationStatus("1");//“1”表示挂号，“2”表示退号，默认为1

        System.out.println(regInfoDao.insert(regInfo));
        return regInfoDao.insert(regInfo);
    }
}
