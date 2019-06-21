package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.MedicalRecHomeTemplate;
import edu.neu.hospital.dao.basicTableDao.MedicalRecHomeTemplateDao;
import edu.neu.hospital.dao.basicTableDao.UserDepartDao;
import edu.neu.hospital.example.basicTableExample.MedicalRecHomeTemplateExample;
import edu.neu.hospital.example.basicTableExample.UserDepartExample;
import edu.neu.hospital.service.outPatientService.MedicalRecHomeTempService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class MedicalRecHomeTempServiceImpl implements MedicalRecHomeTempService {
    @Resource
    MedicalRecHomeTemplateDao medicalRecHomeTemplateDao;

    @Resource
    UserDepartDao userDepartDao;

    RegexProcess regexProcess = new RegexProcess();
    @Override
    public boolean addMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate, Integer userID) {
        medicalRecHomeTemplate.setAppearDate(new Date());
        medicalRecHomeTemplate.setDoctorId( userID);
        medicalRecHomeTemplate.setStatus("1");
        medicalRecHomeTemplateDao.insert(medicalRecHomeTemplate);

        return true;
    }

    @Override
    public Integer updateMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate, Integer userID) {
        medicalRecHomeTemplate.setChangeDate(new Date());
        //感觉缺修改人，，，
        medicalRecHomeTemplateDao.updateByPrimaryKeySelective(medicalRecHomeTemplate);

        return null;
    }

    @Override
    public Integer deleteMedicalRecHomeTemplate(Integer medicalRecHomeTemplateID, Integer userID) {

        MedicalRecHomeTemplate medicalRecHomeTemplate = medicalRecHomeTemplateDao.selectByPrimaryKey(medicalRecHomeTemplateID);
        medicalRecHomeTemplate.setChangeDate(new Date());
        medicalRecHomeTemplate.setStatus("0");
        medicalRecHomeTemplateDao.updateByPrimaryKeySelective(medicalRecHomeTemplate);
        return medicalRecHomeTemplateID;
    }

    @Override
    public List<MedicalRecHomeTemplate> findMedicalRecHomeTemplate(String str) {
        MedicalRecHomeTemplateExample medicalRecHomeTemplateExample = new MedicalRecHomeTemplateExample();
        MedicalRecHomeTemplateExample.Criteria criteria = medicalRecHomeTemplateExample.createCriteria();
        MedicalRecHomeTemplateExample.Criteria criteria1 = medicalRecHomeTemplateExample.createCriteria();
        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andChiefCompliantLike("%" + searchd + "%");
        }
        medicalRecHomeTemplateExample.or(criteria1);
        return medicalRecHomeTemplateDao.selectByExample(medicalRecHomeTemplateExample);
    }

    @Override
    public List<Integer> getThisDoctorTemp(Integer userID) {
        //返回该医生的模板
        List<Integer> lists = new LinkedList<>();
        MedicalRecHomeTemplateExample medicalRecHomeTemplateExample = new MedicalRecHomeTemplateExample();
        List<MedicalRecHomeTemplate> medicalRecHomeTemplates = medicalRecHomeTemplateDao.selectByExample(medicalRecHomeTemplateExample);
        //取该医生所在科室
        UserDepartExample userDepartExample = new UserDepartExample();
        UserDepartExample.Criteria criteria = userDepartExample.createCriteria();
        criteria.andIdEqualTo(userID);
        Integer departID = userDepartDao.selectByExample(userDepartExample).get(0).getDepartmentID();
        //首先，范围是个人，doctorid==userID
        for( int i = 0 ; i < medicalRecHomeTemplates.size() ; i++){
            MedicalRecHomeTemplate m= medicalRecHomeTemplates.get(i);
            if( m.getDoctorId() == userID && m.getType() == 106 && !lists.contains(m.getId())) {
                lists.add(m.getId());
                continue;
            }
            //取当前医生所在科室
            UserDepartExample userDepartExample1 = new UserDepartExample();
            UserDepartExample.Criteria criteria1 = userDepartExample.createCriteria();
            criteria.andIdEqualTo(userID);
            Integer departID1 = userDepartDao.selectByExample(userDepartExample).get(0).getDepartmentID();

            //范围是科室，科室=userID 的科室



            if( m.getType() == 105 && departID == departID1 && !lists.contains(m.getId() )){
                lists.add(m.getId());
                continue;
            }
            //范围是全院
            if( m.getType() == 104 && !lists.contains(m.getId() )){
                lists.add(m.getId());
                continue;
            }
        }


        return lists;
    }
}
