package edu.neu.hospital.service.registerAndCharge.impl;

import edu.neu.hospital.bean.baseBean.RegistrationListView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dao.baseDao.RegistrationListViewDao;
import edu.neu.hospital.dao.basicTableDao.*;
import edu.neu.hospital.example.baseExample.RegistrationListViewExample;
import edu.neu.hospital.example.basicTableExample.FeeExample;
import edu.neu.hospital.service.registerAndCharge.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    FeeDao feeDao;

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
        int medRecID = medRec.getId();

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

        Date date = new Date();

        //插入一条挂号信息
        regInfo.setMedicalRecordID(medRec.getId());
        regInfo.setPatientID(patientID);
        regInfo.setRegistrationDate(date);
        regInfo.setIsSeenDocator("0");
        regInfo.setRegistrationStatus("1");
        regInfo.setAppearUserID(appearUserID);
        regInfo.setAppearDate(date);

        regInfoDao.insertSelective(regInfo);
        int regInfoID = regInfo.getId();

        //插入一条收费信息
        Fee fee = new Fee();
        fee.setMedicalRecordID(medRecID);
        fee.setFeeCategoryID(regInfo.getPaymentCategoryID());
        fee.setChargeItemID(regInfoID);
        fee.setExpID(1);
        fee.setFee(regInfo.getExpense());
        fee.setAppearUserID(appearUserID);
        fee.setFeeAppearDate(date);
        fee.setPayStatus(134);
        fee.setDateStatus(148);
        fee.setStatus("1");
        fee.setCheckStatus("未对账");
        feeDao.insertSelective(fee);

        System.out.println(regInfo.toString() + "\n");

        return 1;
    }

    @Override
    public List<RegistrationListView> find(Date start, Date end) {

        RegistrationListViewExample example = new RegistrationListViewExample();
        RegistrationListViewExample.Criteria criteria = example.createCriteria();

        if (start != null)
            criteria.andRegistrationDateGreaterThanOrEqualTo(start);
        if (end != null) {

            Calendar c = Calendar.getInstance();
            c.setTime(end);
            c.add(Calendar.DAY_OF_MONTH,1);
            end = c.getTime();
            criteria.andRegistrationDateLessThanOrEqualTo(end);
        }


        example.setOrderByClause("registrationDate desc");

        return regListViewDao.selectByExample(example);
    }

    @Override
    public RegistrationListView selectByMedRecID(String medRecNo) {
        return regListViewDao.selectByMedRecID(medRecNo);
    }

    @Override
    public User findUserByID(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int retreat(Integer id) {

        Registrationinfo regInfo = regInfoDao.selectByPrimaryKey(id);
        if (regInfo.getIsSeenDocator().equals("0") && regInfo.getRegistrationStatus().equals("1")) {
            regInfo.setRegistrationStatus("0");
            regInfoDao.updateByPrimaryKeySelective(regInfo);

            FeeExample example = new FeeExample();
            FeeExample.Criteria criteria = example.createCriteria();

            criteria.andChargeItemIDEqualTo(regInfo.getId());
            criteria.andExpIDEqualTo(1);

            List<Fee> fees = feeDao.selectByExample(example);
            if(fees.size() == 1){
                fees.get(0).setPayStatus(3);
            } else {
                System.out.println("error retreat");
            }

            return 1;
        }
        return 0;
    }
}
