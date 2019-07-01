package edu.neu.hospital.service.registerAndCharge.impl;

import edu.neu.hospital.bean.baseBean.RegistrationListView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.baseDao.RegistrationListViewDao;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.service.registerAndCharge.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    ScheduleDao scheduleDao;

    @Resource
    MedicalRecordDao medRecDao;

    @Resource
    RegistrationInfoDao regInfoDao;

    @Resource
    RegistrationListViewDao regListViewDao;

    @Resource
    UserDao userDao;

    @Override
    public int addRegisteredInfo(String isHaveCard, Patient patient, String passwd,
                                 Registrationinfo regInfo, Integer appearUserID) {

        if (isHaveCard.equals("0")) { //若无就诊卡

            System.out.println(patient.toString());

            //根据身份证号查找数据库中的患者信息
            if (null == patientDao.selectByIdCardNo(patient.getIdentityCardNo())) {//若数据库中没有同身份证号的患者信息
                //插入一条患者信息
                patient.setAppearUserID(appearUserID);
                patient.setAppearDate(new Date());

                System.out.println(patient.toString() + "\n");
                patientDao.insertSelective(patient);
            }
            //插入就诊卡信息
            PatientCard patientCard = new PatientCard();
            patientCard.setPatientName(patient.getPatientName());
            patientCard.setPatientID(patientDao.selectByIdCardNo(patient.getIdentityCardNo()).getId());
            patientCard.setPasswd(passwd);
            patientCard.setMoney(BigDecimal.ZERO);
            patientCard.setAppearUserID(appearUserID);
            patientCard.setAppearDate(new Date());

            System.out.println(patientCard.toString() + "\n");
            patientCardDao.insertSelective(patientCard);
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
        medRec.setAppearUserID(appearUserID);
        medRec.setAppearDate(new Date());

        System.out.println(medRecDao.toString() + "\n");
        medRecDao.insertSelective(medRec);

        //排班计划中，同一个医生可能多天有排班
        List<Schedule> schedules = scheduleDao.selectByDoctorID(regInfo.getDoctorID());
        Schedule schedule = new Schedule();
        //查找挂号信息中 看诊日期 和 医生排版日期 相同的记录
        for (Schedule value : schedules) {
            schedule = value;
            if (0 == regInfo.getSeeDoctorDate().compareTo(schedule.getOnDutyDate())) {
                break;
            }
        }
        //对该医生的该条记录的排版限额减1
        schedule.setLimitNumber(schedule.getLimitNumber() - 1);
        scheduleDao.updateByPrimaryKeySelective(schedule);

        //插入一条挂号信息
        regInfo.setMedicalRecordID(medRec.getId());
        regInfo.setPatientID(patientID);
        regInfo.setRegistrationDate(new Date());
        regInfo.setIsSeenDocator("0");
        regInfo.setRegistrationStatus("1");
        regInfo.setAppearUserID(appearUserID);
        regInfo.setAppearDate(new Date());

        System.out.println(regInfo.toString() + "\n");

        return regInfoDao.insertSelective(regInfo);
    }

    @Override
    public List<RegistrationListView> getAll() {

        List<RegistrationListView> temp = regListViewDao.selectByExample(new RegistrationListViewExample());
        List<RegistrationListView> list = new ArrayList<>();

        for (int i = temp.size() - 1; i >= 0; i--) {
            list.add(temp.get(i));
        }

        return list;
    }

    @Override
    public User findUserByID(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
