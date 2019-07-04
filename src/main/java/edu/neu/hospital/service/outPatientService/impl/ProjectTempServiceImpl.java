package edu.neu.hospital.service.outPatientService.impl;

import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.basicTableBean.ProjectTemplate;
import edu.neu.hospital.bean.basicTableBean.ProjectTemplateDetail;
import edu.neu.hospital.dao.basicTableDao.FMedItemDao;
import edu.neu.hospital.dao.basicTableDao.ProjectTemplateDao;
import edu.neu.hospital.dao.basicTableDao.ProjectTemplateDetailDao;
import edu.neu.hospital.dao.basicTableDao.UserDepartDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.FMedItemExample;
import edu.neu.hospital.example.basicTableExample.ProjectTemplateExample;
import edu.neu.hospital.example.basicTableExample.UserDepartExample;
import edu.neu.hospital.service.outPatientService.ProjectTempService;
import edu.neu.hospital.utils.RegexProcess;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProjectTempServiceImpl implements ProjectTempService {

    @Resource
    ProjectTemplateDao projectTemplateDao;
    @Resource
    ProjectTemplateDetailDao projectTemplateDetailDao;


    @Resource
    UserDepartDao userDepartDao;

    @Resource
    FMedItemDao fMedItemDao;

    RegexProcess regexProcess = new RegexProcess();

    @Override
    public List<ProjectTemplate> getThisDoctorTemp(Integer userID) {
        //返回该医生的模板
        List<ProjectTemplate> lists = new LinkedList<>();
        ProjectTemplateExample projectTemplateExample = new ProjectTemplateExample();
        ProjectTemplateExample.Criteria criteria0 = projectTemplateExample.createCriteria();

        List<ProjectTemplate> projectTemplates = projectTemplateDao.selectByExample(projectTemplateExample);
        System.out.println(projectTemplates.size()+ "总长度！   ");
        //取该医生所在科室
        UserDepartExample userDepartExample = new UserDepartExample();
        UserDepartExample.Criteria criteria = userDepartExample.createCriteria();
        criteria.andIdEqualTo(userID);
        Integer departID = userDepartDao.selectByExample(userDepartExample).get(0).getDepartmentID();
        //首先，范围是个人，doctorid==userID
        for( int i = 0 ; i < projectTemplates.size() ; i++){
            ProjectTemplate m= projectTemplates.get(i);
            if( m.getDoctorId() == userID && m.getArea() == 106 && !lists.contains(m)) {
                lists.add(m);
                System.out.println("增一个个人的");
                continue;
            }
            //取当前医生所在科室
            UserDepartExample userDepartExample1 = new UserDepartExample();
            UserDepartExample.Criteria criteria1 = userDepartExample.createCriteria();
            criteria1.andIdEqualTo(userID);
            Integer departID1 = userDepartDao.selectByExample(userDepartExample).get(0).getDepartmentID();

            //范围是科室，科室=userID 的科室



            if( m.getArea() == 105 && departID == departID1 && !lists.contains(m )){
                lists.add(m);
                System.out.println("增加一个科室的");
                continue;
            }
            //范围是全院
            if( m.getArea() == 104 && !lists.contains(m )){
                System.out.println("赠一个全院的");
                lists.add(m);
                continue;
            }
        }
        return lists;
    }

    @Override
    public boolean addProjectTemplate(ProjectTemplate projectTemplate, Integer userID) {
        projectTemplate.setAppearUserID(userID);
        projectTemplate.setDoctorId(userID);
        projectTemplate.setAppearDate(new Date());
        projectTemplate.setStatus("1");
        projectTemplateDao.insert(projectTemplate);
        return true;
    }

    @Override
    public Integer updateProjectTemplate(ProjectTemplate projectTemplate, Integer userID) {
        projectTemplate.setChangeDate(new Date());
        projectTemplate.setChangeUserID(userID);
        projectTemplateDao.updateByPrimaryKeySelective(projectTemplate);
        return projectTemplate.getId();
    }

    @Override
    public Integer deleteProjectTemplate(Integer projectTemplateID, Integer userID) {


        ProjectTemplate projectTemplate = projectTemplateDao.selectByPrimaryKey(projectTemplateID);
        projectTemplate.setStatus("0");
        projectTemplate.setChangeDate(new Date());
        projectTemplate.setChangeUserID(userID);
        projectTemplateDao.updateByPrimaryKeySelective(projectTemplate);

        return projectTemplateID;
    }

    @Override
    public boolean deleteProjectTemplateList(IdDTO idDTO, Integer userID) {
        List<Integer> ids = idDTO.getId();
        for( int  i =0 ; i< ids.size() ; i ++){
            deleteProjectTemplate(ids.get(i) , userID);
        }
        return true;
    }

    /**
     * 模糊匹配
     * @param str
     * @return
     */
    @Override
    public List<ProjectTemplate> findProjectTemplate(String str) {

        ProjectTemplateExample projectTemplateExample = new ProjectTemplateExample();
        ProjectTemplateExample.Criteria criteria = projectTemplateExample.createCriteria();
        ProjectTemplateExample.Criteria criteria1 = projectTemplateExample.createCriteria();
        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andTemplateCodeLike("%" + searchd + "%");

        }

        projectTemplateExample.or(criteria1);
        return projectTemplateDao.selectByExample(projectTemplateExample);

    }

    @Override
    public boolean addProjectTmpDetails(Integer projectTempID , ProjectTemplateDetail projectTemplateDetail, Integer userID) {

        projectTemplateDetail.setAppearUserID(userID);
        projectTemplateDetail.setCheckTemplateId( projectTempID);
        projectTemplateDetail.setAppearDate(new Date());
        projectTemplateDetail.setStatus("1");
        projectTemplateDetailDao.insert(projectTemplateDetail);
        return true;
    }

    @Override
    public Integer deleteProjectTmpDetails(Integer projectTemplateDetailID, Integer userID) {
        ProjectTemplateDetail projectTemplateDetail = projectTemplateDetailDao.selectByPrimaryKey(projectTemplateDetailID);
        projectTemplateDetail.setStatus("0");
        projectTemplateDetail.setChangeDate(new Date());
        projectTemplateDetail.setChangeUserID(userID);
        projectTemplateDetailDao.updateByPrimaryKeySelective(projectTemplateDetail);

        return projectTemplateDetailID;
    }

    @Override
    public boolean deleteProjectTmpDetailsList(IdDTO idDTO, Integer userID) {
        List<Integer> ids = idDTO.getId();
        for( int i = 0; i< ids.size() ; i ++){
            deleteProjectTmpDetails(ids.get(i) , userID);
        }
        return true;
    }

    @Override
    public Integer updateProjectTmpDetails(ProjectTemplateDetail projectTemplateDetail, Integer userID) {
        ProjectTemplateDetail index = projectTemplateDetailDao.selectByPrimaryKey(projectTemplateDetail.getId());
        index.setChangeUserID(userID);
        index.setChangeDate(new Date());
        projectTemplateDetailDao.updateByPrimaryKey(index);

        return index.getId();
    }

    @Override
    public ProjectTemplateDetail findProjectDetails(Integer projectTemplateDetailsID) {
        return projectTemplateDetailDao.selectByPrimaryKey(projectTemplateDetailsID);
    }

    @Override
    public List<FMedItem> searchProject(String str) {
        FMedItemExample fMedItemExample = new FMedItemExample();
        FMedItemExample.Criteria criteria = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria1 = fMedItemExample.createCriteria();
        FMedItemExample.Criteria criteria2 = fMedItemExample.createCriteria();
        // DiseaseExample.Criteria criteria3 = diseaseExample.createCriteria();

        if( str != null){
            String searchd = regexProcess.regexProcess02(str);
            criteria.andNameLike("%" + searchd + "%");
            criteria1.andCodeLike("%" + searchd + "%");
            criteria2.andMnemonicCodeLike("%" + searchd + "%");

        }
        fMedItemExample.or(criteria1);
        fMedItemExample.or(criteria2);
        return fMedItemDao.selectByExample(fMedItemExample);

    }
}
