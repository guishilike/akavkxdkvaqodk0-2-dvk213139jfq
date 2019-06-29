package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dao.baseDao.DepartmentViewDao;
import edu.neu.hospital.dao.baseDao.UserViewDao;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.UserDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.UserNameAndPassDTO;
import edu.neu.hospital.example.baseExample.UserViewExample;
import edu.neu.hospital.example.basicTableExample.UserExample;
import edu.neu.hospital.service.baseService.UserService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Resource
    UserViewDao userviewDao;
    @Resource
    ConstantItemDao constantItemDao;
    @Resource
    DepartmentViewDao departmentViewDao;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    //列出用户
    public List<UserView> findUsers(Integer deptID, Integer typeID) {
        UserViewExample userviewExample = new UserViewExample();
        UserViewExample.Criteria criteria = userviewExample.createCriteria();
        if (deptID != null)
            criteria.andDepartmentIDEqualTo(deptID);
        if (typeID != null)
            criteria.andTypeIDEqualTo(typeID);

        return userviewDao.selectByExample(userviewExample);
    }

    @Override
    public void deleteById(Integer id, Integer userID) {
        User user = userDao.selectByPrimaryKey(id);
        if (user != null) {
            user.setChangeUserID(userID);
            user.setChangeDate(new Date());
            user.setStatus("0");
            userDao.updateByPrimaryKeySelective(user);
        }
    }

    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (Integer id : ids.getId()) {
            User user = userDao.selectByPrimaryKey(id);
            if (user != null) {
                user.setChangeUserID(userID);
                user.setChangeDate(new Date());
                user.setStatus("0");
                userDao.updateByPrimaryKeySelective(user);
            }
        }
    }


    @Override
    public void add(User user, Integer userID) {
        user.setAppearUserID(userID);
        user.setStatus("1");
        user.setAppearDate(new Date());
        userDao.insert(user);
    }

    @Override
    public void change(User user, Integer userID) {
        user.setChangeUserID(userID);
        user.setChangeDate(new Date());
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public boolean checkContent(User user, int state) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (state == 1)
            criteria.andIdNotEqualTo(user.getId());
        criteria.andUserNameEqualTo(user.getUserName());
        criteria.andStatusEqualTo("1");
        if (userDao.countByExample(example) > 0)
            return false;
        else
            return true;
    }

    //设置默认用户名和密码
    @Override
    public UserNameAndPassDTO setDefaultNameAndPass() {
        String userName = UUID.randomUUID() + "";
        String password = "123456";
        return new UserNameAndPassDTO(userName, password);
    }

    //根据真名或登录名查找用户
    @Override
    public List<UserView> findUserByName(String name) {
        UserViewExample example = new UserViewExample();
        UserViewExample.Criteria criteria1 = example.createCriteria();
        UserViewExample.Criteria criteria2 = example.createCriteria();
        criteria1.andRealNameEqualTo(name);
        criteria2.andUserNameEqualTo(name);
        example.or(criteria2);
        return userviewDao.selectByExample(example);
    }

    @Override
    public List<NameCodeDTO> getAllUserNamesAndUserIDs() {
        return userviewDao.selectAllUserNamesAndUserIDs();
    }

    @Override
    public List<NameCodeDTO> getAllRankNamesAndCodes() {
        return constantItemDao.findAllNamesAndCodesByType(8);
    }

    @Override
    public List<NameCodeDTO> getAllUserTypeNamesAndCodes() {
        return constantItemDao.findAllNamesAndCodesByType(18);
    }

    @Override
    public boolean uploadXls(MultipartFile file, Integer operateUserID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        //标识文件内容是否有错
        Boolean state = true;
        User user;
        Workbook book;
        try {
            book = new XSSFWorkbook(file.getInputStream());
//            System.out.println("success");
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);
//        System.out.println("开始写入信息");
        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                user = new User();
                Row row = sheet.getRow(i);
//                System.out.println(row.getCell(2));
                row.getCell(0).setCellType(CellType.STRING);
                user.setUserName(row.getCell(0).toString());
                row.getCell(1).setCellType(CellType.STRING);
                user.setPasswd(row.getCell(1).toString());
                System.out.println(row.getCell(1).toString());
                user.setRealName(row.getCell(2).toString());
                String deptName = row.getCell(3).toString();
                user.setDepartmentID(departmentViewDao.getIDByName(deptName));
                String userType = row.getCell(4).toString();
                Integer userTypeID = constantItemDao.findIdByName(userType, 18).getId();
                user.setTypeID(userTypeID);
                if (userTypeID == 108 || userTypeID == 109) {
                    String userRank = row.getCell(5).toString();
                    user.setRankID(constantItemDao.findIdByName(userRank, 8).getId());
                    String isSchedule = row.getCell(6).toString();
                    if (isSchedule != null && isSchedule.equals("Y"))
                        user.setIsSchedule("1");
                    else
                        user.setIsSchedule("0");
                }

                //遇到重复是否继续执行
                if (checkContent(user, 0)) {
                    add(user, operateUserID);
                } else if (repeatCoverage) {
                    user.setId(userviewDao.getIDByName(row.getCell(1).toString()));
                    userDao.updateByPrimaryKeySelective(user);
                }
            } catch (Exception e) {
                //遇到错误是否继续执行
                state = false;
                if (errorHappenContinue)
                    continue;
                else
                    return false;
            }
        }
        file.getInputStream().close();
        return state;
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName = "user.xls";
        List<UserView> results = userviewDao.selectByExample(new UserViewExample());
        String[] title = {"编号", "登录名", "密码", "真实姓名", "所属科室",
                "用户类别", "医生职称", "是否值班", "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        // 写入正式数据
        for (int i = 0; i < results.size(); i++) {
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId());
            row.createCell(1).setCellValue(results.get(i).getUserName());
            row.createCell(2).setCellValue(results.get(i).getPasswd());
            row.createCell(3).setCellValue(results.get(i).getRealName());
            row.createCell(4).setCellValue(results.get(i).getDeptName());
            row.createCell(5).setCellValue(results.get(i).getType());
            row.createCell(6).setCellValue(results.get(i).getRank());
            row.createCell(7).setCellValue(results.get(i).getIsSchedule().equals("1") ? "是" : "否");
            if (results.get(i).getAppearDate() != null)
                row.createCell(8).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(9).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(10).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(11).setCellValue(results.get(i).getChangeUserName());
        }
        File file = FileManage.createXLSFile(wb, path, fileName);
        return file;
    }

    @Override
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName = "userTemplate.xls";
        String[] title = {"登录名", "密码", "真实姓名", "所属科室", "用户类别", "医生职称", "是否排班"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }
}
