package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.basicTableBean.Department;
import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.DepartmentDao;
import edu.neu.hospital.dao.baseDao.DepartmentViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.basicTableExample.DepartmentExample;
import edu.neu.hospital.example.baseExample.DepartmentViewExample;
import edu.neu.hospital.service.baseService.DepartmentService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
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

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //查询科室列表
    @Override
    @CachePut(value="department",key="'deptCategoryID'+#deptCategoryID+'deptTypeID'+#deptTypeID")
    public List<DepartmentView> findDepartments(Integer deptCategoryID, Integer deptTypeID) {
        DepartmentViewExample example = new DepartmentViewExample();
        DepartmentViewExample.Criteria criteria = example.createCriteria();

        if (deptCategoryID != null)
            criteria.andDeptCategoryIDEqualTo(deptCategoryID);
        if (deptTypeID != null)
            criteria.andDeptTypeIDEqualTo(deptTypeID);

        return departmentviewDao.selectByExample(example);
    }

    //删除科室
    @Override
    @CacheEvict(value="department")
    public void deleteById(Integer id, Integer userID) {

        Department department = departmentDao.selectByPrimaryKey(id);
        if (department != null) {
            department.setStatus("0");
            department.setChangeDate(new Date());
            department.setChangeUserID(userID);
            departmentDao.updateByPrimaryKeySelective(department);
        }

    }

    //批量删除科室
    @Override
    @CacheEvict(value="department")
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (Integer id : ids.getId()) {
            Department department = departmentDao.selectByPrimaryKey(id);
            if (department != null) {
                department.setStatus("0");
                department.setChangeDate(new Date());
                department.setChangeUserID(userID);
                departmentDao.updateByPrimaryKeySelective(department);
            }

        }
    }

    //列出所有科室类型或科室分类的id
    @Override
    @Cacheable(value="constantItem",key="'deptState'+#i")
    public List<NameCodeDTO> findALLDeptTypeOrCategoryId(int i) {
        if (i == 0)
            return constantitemDao.findAllNamesAndCodesByType(21);
        else
            return constantitemDao.findAllNamesAndCodesByType(1);

    }

    //添加新科室
    @Override
    @CacheEvict("department")
    public void add(Department department, Integer userID) {
        department.setStatus("1");
        department.setAppearUserID(userID);
        department.setAppearDate(new Date());
        departmentDao.insert(department);
    }

    //修改科室信息
    @Override
    @CacheEvict("department")
    public void change(Department department, Integer userID) {
        department.setChangeUserID(userID);
        department.setChangeDate(new Date());
        departmentDao.updateByPrimaryKeySelective(department);
    }

    //根据科室名称或编号查询科室
    @Override
    @Cacheable(value="department",key="'nameOrCode'+#nameOrCode")
    public List<DepartmentView> findDepartmentByNameOrCode(String nameOrCode) {
        DepartmentViewExample departmentviewExample = new DepartmentViewExample();
        DepartmentViewExample.Criteria criteria1 = departmentviewExample.createCriteria();
        DepartmentViewExample.Criteria criteria2 = departmentviewExample.createCriteria();

        criteria1.andDeptNameEqualTo(nameOrCode);
        criteria2.andDeptCodeEqualTo(nameOrCode);
        departmentviewExample.or(criteria2);
        return departmentviewDao.selectByExample(departmentviewExample);
    }

    //查重
    @Override
    public boolean checkContent(Department department, int state) {
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        if (state == 1)
            criteria.andIdNotEqualTo(department.getId());
        criteria.andDeptNameEqualTo(department.getDeptName());
        criteria.andStatusEqualTo("1");
        return departmentDao.countByExample(example) ==0;

    }

    @Override
    @Cacheable(value="constantItem",key="'getALLDeptNamesAndDeptCodes'")
    public List<NameCodeDTO> getAllDeptNamesAndDeptCodes() {
        return departmentviewDao.selectAllDeptNamesAndCodes();
    }

    @Override
    @CacheEvict(value="department")
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        //标识文件内容是否有错
        boolean state=true;
        Department department;
        Workbook book;
        try {
            book = new XSSFWorkbook(file.getInputStream());
            System.out.println("success");
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);
        System.out.println("开始写入信息");
        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                department = new Department();
                Row row = sheet.getRow(i);
                row.getCell(0).setCellType(CellType.STRING);
                department.setDeptCode(row.getCell(0).toString());
                department.setDeptName(row.getCell(1).toString());
                String deptTypeName = row.getCell(2).toString();
                NameCodeDTO deptType = constantitemDao.findIdByName(deptTypeName, 21);
                department.setDeptTypeID(deptType.getId());
                String deptCategoryName = row.getCell(3).toString();
                NameCodeDTO deptCategory = constantitemDao.findIdByName(deptCategoryName, 1);
                department.setDeptCategoryID(deptCategory.getId());
                department.setStatus("1");
                //遇到重复是否继续执行
                if (checkContent(department, 0)) {
                    add(department, userID);
                } else if (repeatCoverage) {
                    department.setId(departmentviewDao.getIDByName(row.getCell(1).toString()));
                    departmentDao.updateByPrimaryKeySelective(department);
                }
            } catch (Exception e) {
                //遇到错误是否继续执行
                state=false;
                if (!errorHappenContinue)
                    return false;

            }

        }
        file.getInputStream().close();
        return state;
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName ="department.xls";
        List<DepartmentView> results = departmentviewDao.selectByExample(new DepartmentViewExample());


        String[] title = {"编号", "科室编码", "科室名称", "科室类型", "科室分类",
                "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        // 写入正式数据
        for (int i = 0; i < results.size(); i++) {
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId());
            row.createCell(1).setCellValue(results.get(i).getDeptCode());
            row.createCell(2).setCellValue(results.get(i).getDeptName());
            row.createCell(3).setCellValue(results.get(i).getDeptType());
            row.createCell(4).setCellValue(results.get(i).getDeptCategory());
            if (results.get(i).getAppearDate() != null)
                row.createCell(5).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(6).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(7).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(8).setCellValue(results.get(i).getChangeUserName());
        }
        return FileManage.createXLSFile(wb, path, fileName);

    }

    @Override
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName ="departmentTemplate.xls";
        String[] title = {"科室编码", "科室名称", "科室类型", "科室分类"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }


}
