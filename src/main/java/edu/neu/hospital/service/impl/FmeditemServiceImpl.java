package edu.neu.hospital.service.impl;

import edu.neu.hospital.bean.Fmeditem;
import edu.neu.hospital.bean.Fmeditemview;
import edu.neu.hospital.dao.FmeditemDao;
import edu.neu.hospital.dao.FmeditemviewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.FmeditemExample;
import edu.neu.hospital.example.FmeditemviewExample;
import edu.neu.hospital.exception.FileTypeException;
import edu.neu.hospital.exception.GettingTypeException;
import edu.neu.hospital.service.FmeditemService;
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
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FmeditemServiceImpl implements FmeditemService {

    @Resource
    FmeditemDao fmeditemDao;
    @Resource
    FmeditemviewDao fmeditemviewDao;

    Logger logger = LoggerFactory.getLogger(this.getClass());
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



    @Override
    public void add(Fmeditem fmeditem, Integer userID) {
        fmeditem.setStatus("1");
        fmeditem.setAppearUserId(userID);
        fmeditem.setAppearDate(new Date());
        fmeditemDao.insert(fmeditem);
    }

    @Override
    public void change(Fmeditem fmeditem,Integer userID) {
        fmeditem.setChangeUserId(userID);
        fmeditem.setAppearDate(new Date());
        fmeditemDao.updateByPrimaryKeySelective(fmeditem);
    }

    @Override
    public void deleteById(Integer id,Integer userID) {
        Fmeditem fmeditem = fmeditemDao.selectByPrimaryKey(id);
        if(fmeditem!=null) {
            fmeditem.setStatus("0");
            fmeditem.setChangeUserId(userID);
            fmeditem.setChangeDate(new Date());
            fmeditemDao.updateByPrimaryKeySelective(fmeditem);
        }
    }

    @Override
    public void deleteByChoose(IdDTO ids,Integer userID) {
        for(int i=0;i<ids.getId().size();i++){
            Fmeditem fmeditem = fmeditemDao.selectByPrimaryKey(ids.getId().get(i));
            if(fmeditem != null){
                fmeditem.setStatus("0");
                fmeditem.setChangeUserId(userID);
                fmeditem.setChangeDate(new Date());
                fmeditemDao.updateByPrimaryKeySelective(fmeditem);
            }
        }
    }

    @Override
    public List<Fmeditemview> find(Integer deptID, Integer recordType) {
        FmeditemviewExample fmeditemviewExample = new FmeditemviewExample();
        fmeditemviewExample.clear();
        FmeditemviewExample.Criteria criteria = fmeditemviewExample.createCriteria();
        if(deptID != null){
            criteria.andDeptIDEqualTo(deptID);
        }
        if(recordType != null){
            criteria.andRecordTypeEqualTo(recordType);
        }
        List<Fmeditemview> list = fmeditemviewDao.selectByExample(fmeditemviewExample);
        return list;
    }

    @Override
    public List<Fmeditemview> findByNameOrCode(String nameOrCode) {
        FmeditemviewExample example=new FmeditemviewExample();
        FmeditemviewExample.Criteria criteria1=example.createCriteria();
        FmeditemviewExample.Criteria criteria2=example.createCriteria();
        criteria1.andNameEqualTo(nameOrCode);
        criteria2.andMnemonicCodeEqualTo(nameOrCode);
        example.or(criteria2);
        return fmeditemviewDao.selectByExample(example);
    }

    @Override
    public boolean checkContent(Fmeditem fmeditem, int state) {
        FmeditemviewExample example=new FmeditemviewExample();
        FmeditemviewExample.Criteria criteria=example.createCriteria();
        criteria.andCodeEqualTo(fmeditem.getCode());
        if(state==1)
            criteria.andIdNotEqualTo(fmeditem.getId());
        if(fmeditemviewDao.countByExample(example)>0)
            return false;
        else
            return true;
    }

    /**
     * excle导入数据库
     * @param file Excle文件
     * @return 成功失败
     * @throws IOException
     */
    @Override
    public int uploadXls(MultipartFile file) throws IOException {
        if (!validateType(file)) {

            return -1;
        }
        List<Fmeditem> fmeditemList = new ArrayList<Fmeditem>();
        Fmeditem fmeditem = null;
        Workbook book = null;
        try {
            book = new XSSFWorkbook(file.getInputStream());
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);
        //for debug: show the name of sheet that we get
//		logger.debug("sheet name = " + book.getSheetAt(0));
        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            fmeditem = new Fmeditem();
            fmeditemList.add(fmeditem);
            Row row = sheet.getRow(i);
            fmeditem.setId(Integer.valueOf(getStringValueFromCell((XSSFCell)row.getCell(0))) );
            fmeditem.setCode( getStringValueFromCell((XSSFCell)row.getCell(1)));
            fmeditem.setName( getStringValueFromCell((XSSFCell)row.getCell(2)));
//            XSSFCell cell3= (XSSFCell) row.getCell(3);
//            cell3.setCellType(CellType.STRING);
//            fmeditem.setFormat(cell3.getStringCellValue());
//            XSSFCell cell4= (XSSFCell) row.getCell(4);
//            cell4.setCellType(CellType.STRING);
//            fmeditem.setPrice(cell4.getStringCellValue());
            fmeditem.setFormat(getStringValueFromCell((XSSFCell)row.getCell(3)));
            fmeditem.setPrice(BigDecimal.valueOf(Double.valueOf(getStringValueFromCell((XSSFCell)row.getCell(4)))));
            fmeditem.setExpClassID(Integer.valueOf(getStringValueFromCell((XSSFCell)row.getCell(5))));
            fmeditem.setDeptID(Integer.valueOf(getStringValueFromCell((XSSFCell)row.getCell(6))));
            fmeditem.setMnemonicCode(getStringValueFromCell((XSSFCell)row.getCell(7)));
            fmeditem.setRecordType(Integer.valueOf(getStringValueFromCell((XSSFCell)row.getCell(8))));
            try {
                fmeditem.setAppearDate(simpleDateFormat.parse(getStringValueFromCell((XSSFCell)row.getCell(9))));
            } catch (ParseException e) {
                e.printStackTrace();
            }


//			Iterator<Cell> cells = row.cellIterator();
//			while(cells.hasNext()){
//				//TODO modify this function by append method "getCellValueType()
//				//now this function is so stupid.
//				Cell cell = cells.next();
//				if(i>0){
//					logger.debug(String.valueOf(cell.getNumericCellValue()));
//				}else{
//					logger.debug(cell.getStringCellValue());
//				}
//			}
        }
        if (!fmeditemList.isEmpty()) {
            return fmeditemDao.uploadFmeditemInfo(fmeditemList);
        }
//		logger.debug("last row = " + sheet.getLastRowNum());
        return 0;
    }


    /**
     * 数据库导出Excle
     */
    @Override
    public File createExcle() {
        FmeditemExample fmeditemExample = new FmeditemExample();
        fmeditemExample.clear();
        FmeditemExample.Criteria criteria = fmeditemExample.createCriteria();
        List<Fmeditem> listresult = fmeditemDao.selectByExample(fmeditemExample);
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
            row.createCell(3).setCellValue(listresult.get(i).getFormat());
            row.createCell(4).setCellValue(listresult.get(i).getPrice().toString());
            row.createCell(5).setCellValue(listresult.get(i).getExpClassID().toString());
            row.createCell(6).setCellValue(listresult.get(i).getDeptID().toString());
            row.createCell(7).setCellValue(listresult.get(i).getMnemonicCode());
            row.createCell(8).setCellValue(listresult.get(i).getRecordType());
            row.createCell(9).setCellValue(simpleDateFormat.format(listresult.get(i).getAppearDate()));

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
            File file=new File("fmeditem.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            wb.write(fileOutputStream);
            fileOutputStream.close();
            return  file;
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


    //检查是不是xls文件
    private boolean validateType(MultipartFile file) {
        String fileType;
        try {
            //get MultipartFile original filename to validate file type.
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
