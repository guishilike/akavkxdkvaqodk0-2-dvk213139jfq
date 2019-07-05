package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.bean.basicTableBean.Department;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.service.baseService.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceImplTest {
    @Autowired
    DepartmentService departmentService;


    @Test
    public void findDepartments() {
        List<DepartmentView> namesAndCodes=departmentService.findDepartments(1,120);
        System.out.println(namesAndCodes);
    }

    @Test
    public void deleteById() {
        departmentService.deleteById(1,1);
    }

    @Test
    public void deleteByChoose() {
        List<Integer> ids=new ArrayList<>();
        ids.add(2);
        ids.add(3);
        IdDTO idDTO=new IdDTO();
        idDTO.setId(ids);
        departmentService.deleteByChoose(idDTO,1);
    }

    @Test
    public void findALLDeptTypeOrCategoryId() {
        System.out.println(departmentService.findALLDeptTypeOrCategoryId(0));
        System.out.println(departmentService.findALLDeptTypeOrCategoryId(1));
    }

    @Test
    public void add() {
        Department department=new Department();
        department.setDeptName("未知科室");
        department.setDeptCode("WZKS");
        department.setDeptCategoryID(1);
        department.setDeptCategoryID(120);
        departmentService.add(department,1);
    }

    @Test
    public void change() {
        Department department=new Department();
        department.setId(1);
        department.setDeptName("心理血管");
        departmentService.change(department,1);
    }

    @Test
    public void findDepartmentByNameOrCode() {
        System.out.println(departmentService.findDepartmentByNameOrCode("未知科室"));
    }

    @Test
    public void checkContent() {
        Department department=new Department();
        department.setDeptName("未知科室");
        System.out.println(departmentService.checkContent(department,1));
        System.out.println(departmentService.checkContent(department,0));
    }

    @Test
    public void getAllDeptNamesAndDeptCodes() {
        System.out.println(departmentService.getAllDeptNamesAndDeptCodes());
    }

}