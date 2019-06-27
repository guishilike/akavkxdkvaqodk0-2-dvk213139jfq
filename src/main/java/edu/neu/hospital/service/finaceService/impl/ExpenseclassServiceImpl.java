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
import edu.neu.hospital.utils.XMLValidateAndSetting;
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
    public int uploadXls(MultipartFile file,int userID) throws IOException {

        if (!XMLValidateAndSetting.validateType(file)) {
            return -1;
        }
        File file1 = new File(ResourceUtils.getURL("classpath:").getPath() + "static/excle/" + file.getOriginalFilename());
        file.transferTo(file1);
        InputStream is=new FileInputStream(file1);
        ExpenseClass expenseclass = null;
        Workbook book = null;
        try {
            book = new XSSFWorkbook(is);
        } catch (Exception e) {
            try {
                book = new HSSFWorkbook(is);
                System.out.println("hffs");
            }catch (Exception e2){
                System.out.println("false");
                return -1;
            }
        }
        Sheet sheet = book.getSheetAt(0);
        for (int i = sheet.getFirstRowNum() + 2; i <= sheet.getLastRowNum(); i++) {
            expenseclass = new ExpenseClass();
            Row row = sheet.getRow(i);
//            expenseclass.setId(Integer.valueOf(row.getCell(0).toString()) );
            expenseclass.setCode(row.getCell(1).toString());
//            getStringValueFromCell((XSSFCell)row.getCell(1))
            System.out.println(row.getCell(1).toString());
            expenseclass.setName(row.getCell(2).toString());
            System.out.println(row.getCell(2).toString());
            if(checkContent(expenseclass,0)){
                add(expenseclass,userID);
            }
        }
        return 0;
    }

    @Override
    public File createExcle() {
        ExpenseClassExample expenseclassExample = new ExpenseClassExample();
        expenseclassExample.clear();
        ExpenseClassExample.Criteria criteria = expenseclassExample.createCriteria();
        List<ExpenseClass> listresult = expenseclassDao.selectByExample(expenseclassExample);
        // 1.创建HSSFWorkbook，一个HSSFWorkbook对应一个Excel文件
        XSSFWorkbook wb = new XSSFWorkbook();
        // 2.在workbook中添加一个sheet,对应Excel文件中的sheet
        XSSFSheet sheet = wb.createSheet("sheet1");
        // 3.设置表头，即每个列的列名
        String[] titel = {"id","Code","Name","Format","Price","ExpClassID","DeptID","MnemonicCode","RecordType","CreationDate"};
        // 3.1创建第一行
        XSSFRow row = sheet.createRow(0);
        // 将列名写入
        for (int i = 0; i < titel.length; i++) {
            // 给列写入数据,创建单元格，写入数据
            row.createCell(i).setCellValue(titel[i]);
        }
        // 写入正式数据
        for (int i = 0; i < listresult.size(); i++) {
            // 创建行
            row = sheet.createRow(i+1);
            // 序号
            row.createCell(0).setCellValue(listresult.get(i).getId().toString());
            row.createCell(1).setCellValue(listresult.get(i).getCode());
            row.createCell(2).setCellValue(listresult.get(i).getName());

            // 医院名称
//            row.createCell(1).setCellValue(listresult.get(i).get("rowKey1").toString());
//            sheet.autoSizeColumn(1, true);
//            // 业务类型
//            row.createCell(2).setCellValue(listresult.get(i).get("rowKey2").toString());
//            // 异常信息
//            row.createCell(3).setCellValue(listresult.get(i).get("rowKey3").toString());
//            // 数量
//            row.createCell(4).setCellValue(listresult.get(i).get("rowKey4").toString());
        }


        try {
            File file=new File("ExpenseClass.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            wb.write(fileOutputStream);
            fileOutputStream.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
//        /**
//         * 上面的操作已经是生成一个完整的文件了，只需要将生成的流转换成文件即可；
//         * 下面的设置宽度可有可无，对整体影响不大
//         */
//        // 设置单元格宽度
//        int curColWidth = 0;
//        for (int i = 0; i <= titel.length; i++) {
//            // 列自适应宽度，对于中文半角不友好，如果列内包含中文需要对包含中文的重新设置。
//            sheet.autoSizeColumn(i, true);
//            // 为每一列设置一个最小值，方便中文显示
//            curColWidth = sheet.getColumnWidth(i);
//            if(curColWidth<2500){
//                sheet.setColumnWidth(i, 2500);
//            }
//            // 第3列文字较多，设置较大点。
//            sheet.setColumnWidth(3, 8000);
//        }
//        return wb;
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
