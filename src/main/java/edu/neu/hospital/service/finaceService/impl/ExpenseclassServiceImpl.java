package edu.neu.hospital.service.finaceService.impl;

import edu.neu.hospital.bean.basicTableBean.ExpenseClass;
import edu.neu.hospital.bean.finaceBean.ExpenseClassView;
import edu.neu.hospital.dao.basicTableDao.ExpenseClassDao;
import edu.neu.hospital.dao.finaceDao.ExpenseClassViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.ExpenseClassExample;
import edu.neu.hospital.example.finaceExample.ExpenseClassViewExample;
import edu.neu.hospital.exception.FileTypeException;
import edu.neu.hospital.exception.GettingTypeException;
import edu.neu.hospital.service.finaceService.ExpenseclassService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//import edu.neu.hospital.utils.RegexProcess;

@Service
public class ExpenseclassServiceImpl implements ExpenseclassService {

    Date date = new Date();

    @Resource
    ExpenseClassDao expenseclassDao;
    @Resource
    ExpenseClassViewDao expenseclassviewDao;

    Logger logger = LoggerFactory.getLogger(this.getClass());
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public boolean uploadXls(MultipartFile file,int userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        Boolean state=true;
        File file1 = new File(ResourceUtils.getURL("classpath:").getPath() + "static/financeExcle/" + file.getOriginalFilename());
        file.transferTo(file1);
        InputStream is = new FileInputStream(file1);
        ExpenseClass expenseClass;
        Workbook book;
        try {
            book = new XSSFWorkbook(is);
        } catch (Exception e) {
            book = new HSSFWorkbook(is);
        }
        Sheet sheet = book.getSheetAt(0);
        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                expenseClass = new ExpenseClass();
                Row row = sheet.getRow(i);
                expenseClass.setCode(row.getCell(1).toString());
                System.out.println(row.getCell(1).toString());
                expenseClass.setName(row.getCell(2).toString());
                System.out.println(row.getCell(2).toString());
                expenseClass.setStatus("1");
                if (checkContent(expenseClass, 0)) {
                    expenseClass.setAppearDate(new Date());
                    expenseClass.setAppearUserID(userID);
                    add(expenseClass, userID);
                } else if (repeatCoverage) {
                    expenseClass.setChangeDate(new Date());
                    expenseClass.setChangerUserID(userID);
                    expenseclassDao.updateByPrimaryKeySelective(expenseClass);
                }
            } catch (Exception e) {
                //遇到错误是否继续执行
                state=false;
                if (errorHappenContinue)
                    continue;
                else
                    return false;
            }
        }
        return state;
    }

    @Override
    public File createExcle() throws IOException{
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/financeExcle";
        String fileName ="ExpenseClass.xls";
        List<ExpenseClassView> results = expenseclassviewDao.selectByExample(new ExpenseClassViewExample());
        String[] title = {"编号", "费用编码", "费用名称",
                "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        for (int i = 0; i < results.size(); i++) {
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId());
            row.createCell(1).setCellValue(results.get(i).getCode());
            row.createCell(2).setCellValue(results.get(i).getName());
            if (results.get(i).getAppearDate() != null){
                row.createCell(3).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
                row.createCell(4).setCellValue(results.get(i).getAppearUserName());}
            if (results.get(i).getChangeDate() != null){
                row.createCell(5).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
                row.createCell(6).setCellValue(results.get(i).getChangeUserName());}
        }
        File file = FileManage.createXLSFile(wb, path, fileName);
        return file;

    }

    @Override
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName ="departmentTemplate.xls";
        String[] title = {"费用编码", "费用名称"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }

    @Override
    public void add(ExpenseClass expenseclass, Integer userID) {
        expenseclass.setStatus("1");
        expenseclass.setAppearDate(new Date());
        expenseclass.setAppearUserID(userID);
        expenseclassDao.insert(expenseclass);
    }

    @Override
    public void change(ExpenseClass expenseclass, Integer userID) {
        expenseclass.setChangeDate(new Date());
        expenseclass.setChangerUserID(userID);
        expenseclassDao.updateByPrimaryKeySelective(expenseclass);
    }

    @Override
    public void deleteById(Integer id,Integer userID) {
        ExpenseClassExample expenseclassExample = new ExpenseClassExample();
        expenseclassExample.clear();
        ExpenseClassExample.Criteria criteria = expenseclassExample.createCriteria();
        if(id != null){
            ExpenseClass expenseclass = expenseclassDao.selectByPrimaryKey(id);
            if(expenseclass != null){
                expenseclass.setStatus("0");
                expenseclass.setChangeDate(new Date());
                expenseclass.setChangerUserID(userID);
                expenseclassDao.updateByPrimaryKeySelective(expenseclass);
            }
        }
    }

    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for(int i=0;i<ids.getId().size();i++){
            ExpenseClass expenseclass = expenseclassDao.selectByPrimaryKey(ids.getId().get(i));
            if(expenseclass != null){
                expenseclass.setStatus("0");
                expenseclass.setChangeDate(new Date());
                expenseclass.setChangerUserID(userID);
                expenseclassDao.updateByPrimaryKeySelective(expenseclass);
            }
        }
    }

    @Override
    public List<ExpenseClassView> find(String code, String name) {
        ExpenseClassViewExample expenseclassviewExample = new ExpenseClassViewExample();
        expenseclassviewExample.clear();
        ExpenseClassViewExample.Criteria criteria = expenseclassviewExample.createCriteria();
        if(code != null){
//            RegexProcess regexProcess = new RegexProcess();
//            code = regexProcess.regexProcess02(code);
            criteria.andCodeLike("%" + code + "%");
        }
        if(name != null){
//            RegexProcess regexProcess = new RegexProcess();
//            name = regexProcess.regexProcess02(name);
            criteria.andNameLike("%"+name+"%");
        }
        List<ExpenseClassView> list = expenseclassviewDao.selectByExample(expenseclassviewExample);
        return list;
    }

    @Override
    public boolean checkContent(ExpenseClass expenseclass, int state) {
        ExpenseClassViewExample expenseclassviewExample = new ExpenseClassViewExample();
        expenseclassviewExample.clear();
        ExpenseClassViewExample.Criteria criteria = expenseclassviewExample.createCriteria();
        criteria.andCodeEqualTo(expenseclass.getCode());
        if(state==1)
            criteria.andIdNotEqualTo(expenseclass.getId());
        if(expenseclassviewDao.countByExample(expenseclassviewExample) > 0)
            return false;
        else
            return true;
    }

    //检查是不是xls文件
    private boolean validateType(MultipartFile file) {
        String fileType;
        try {
            //get MultipartFile original filename to validateAndSetting file type.
            String fileName = file.getOriginalFilename();
            fileType = fileName.substring(fileName.lastIndexOf('.'),
                    fileName.lastIndexOf('s') + 1);
            if (fileType.isEmpty() || !fileType.toLowerCase().equals(".xls")) {
                throw new FileTypeException("the file introduced is not .xls file.");
            }
        } catch (GettingTypeException e) {
            logger.error("error occurs while getting file type.");
            return false;
        } catch (FileTypeException e) {
            logger.error("the file introduced is not .xls file.");
            return false;
        }
        return true;
    }

    //将单元格格式变成字符串
    public static String getStringValueFromCell(XSSFCell cell) {
        String cellValue="";
        if (cell.getCellType()!= CellType.STRING) {
            cell.setCellType(CellType.STRING);
            cellValue = cell.getStringCellValue();
        }
        return cellValue;
    }

}
