package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Department;
import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.DepartmentDao;
import edu.neu.hospital.dao.baseDao.DepartmentViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.ConstantItemExample;
import edu.neu.hospital.example.basicTableExample.DepartmentExample;
import edu.neu.hospital.example.baseExample.DepartmentViewExample;
import edu.neu.hospital.service.baseService.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    DepartmentViewDao departmentviewDao;
    @Resource
    DepartmentDao departmentDao;
    @Resource
    ConstantItemDao constantitemDao;
//查询科室列表
    @Override
    public List<DepartmentView> findDepartments(Integer deptCategoryID, Integer deptTypeID) {
        DepartmentViewExample example=new DepartmentViewExample();
        DepartmentViewExample.Criteria criteria=example.createCriteria();

        if(deptCategoryID!=null)
        criteria.andDeptCategoryIDEqualTo(deptCategoryID);
        if(deptTypeID!=null)
            criteria.andDeptTypeIDEqualTo(deptTypeID);
        return departmentviewDao.selectByExample(example);
    }

//删除科室
    @Override
    public void deleteById(Integer id,Integer userID) {

            Department department=departmentDao.selectByPrimaryKey(id);
            if(department!=null) {
                department.setStatus("0");
                department.setChangeDate(new Date());
                department.setChangeUserID(userID);
                departmentDao.updateByPrimaryKeySelective(department);
            }

    }
//批量删除科室
    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for(Integer id:ids.getId()){
            Department department=departmentDao.selectByPrimaryKey(id);
            if(department!=null) {
                department.setStatus("0");
                department.setChangeDate(new Date());
                department.setChangeUserID(userID);
                departmentDao.updateByPrimaryKeySelective(department);
            }

        }
    }
    //列出所有科室类型或科室分类的id
    @Override
    public List<NameCodeDTO> findALLDeptTypeOrCategoryId(int i) {
        if(i==0)
            return constantitemDao.findAllNamesAndCodesByType(21);
        else
            return constantitemDao.findAllNamesAndCodesByType(1);

    }

//添加新科室
    @Override
    public void add(Department department,Integer userID) {
        department.setStatus("1");
        department.setAppearUserID(userID);
        department.setAppearDate(new Date());
        departmentDao.insert(department);
    }
//修改科室信息
    @Override
    public void change(Department department,Integer userID) {
        department.setChangeUserID(userID);
        department.setChangeDate(new Date());
        departmentDao.updateByPrimaryKeySelective(department);
    }
//根据科室名称或编号查询科室
    @Override
    public List<DepartmentView> findDepartmentByNameOrCode(String nameOrCode) {
        DepartmentViewExample departmentviewExample =new DepartmentViewExample();
        DepartmentViewExample.Criteria criteria1= departmentviewExample.createCriteria();
        DepartmentViewExample.Criteria criteria2= departmentviewExample.createCriteria();

        criteria1.andDeptNameEqualTo(nameOrCode);
        criteria2.andDeptCodeEqualTo(nameOrCode);
        departmentviewExample.or(criteria2);
        return departmentviewDao.selectByExample(departmentviewExample);
    }
//查重
    @Override
    public boolean checkContent(Department department,int state) {
        DepartmentExample example=new DepartmentExample();
        DepartmentExample.Criteria criteria=example.createCriteria();
        if(state==1)
            criteria.andIdNotEqualTo(department.getId());
        criteria.andDeptNameEqualTo(department.getDeptName());
        criteria.andStatusEqualTo("1");
        if(departmentDao.countByExample(example)>0)
            return false;
        else
            return true;
    }

    @Override
    public List<NameCodeDTO> getAllDeptNamesAndDeptCodes() {
        return departmentviewDao.selectAllDeptNamesAndCodes();
    }


}
