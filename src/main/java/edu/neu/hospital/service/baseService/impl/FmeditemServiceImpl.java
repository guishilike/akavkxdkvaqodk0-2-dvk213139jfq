package edu.neu.hospital.service.baseService.impl;


import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.dao.basicTableDao.FMedItemDao;
import edu.neu.hospital.dao.baseDao.FMedItemViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.basicTableExample.FMedItemExample;
import edu.neu.hospital.example.baseExample.FMedItemViewExample;

import edu.neu.hospital.service.baseService.FmeditemService;
import edu.neu.hospital.utils.XMLValidateAndSetting;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
    FMedItemDao fmeditemDao;
    @Resource
    FMedItemViewDao fmeditemviewDao;


    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



    @Override
    public void add(FMedItem fmeditem, Integer userID) {
        fmeditem.setStatus("1");
        fmeditem.setAppearUserId(userID);
        fmeditem.setAppearDate(new Date());
        fmeditemDao.insert(fmeditem);
    }

    @Override
    public void change(FMedItem fmeditem, Integer userID) {
        fmeditem.setChangeUserId(userID);
        fmeditem.setAppearDate(new Date());
        fmeditemDao.updateByPrimaryKeySelective(fmeditem);
    }

    @Override
    public void deleteById(Integer id,Integer userID) {
        FMedItem fmeditem = fmeditemDao.selectByPrimaryKey(id);
        if(fmeditem!=null) {
            fmeditem.setStatus("0");
            fmeditem.setChangeUserId(userID);
            fmeditem.setChangeDate(new Date());
            fmeditemDao.updateByPrimaryKeySelective(fmeditem);
        }
    }

    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for(int i=0;i<ids.getId().size();i++){
            FMedItem fmeditem = fmeditemDao.selectByPrimaryKey(ids.getId().get(i));
            if(fmeditem != null){
                fmeditem.setStatus("0");
                fmeditem.setChangeUserId(userID);
                fmeditem.setChangeDate(new Date());
                fmeditemDao.updateByPrimaryKeySelective(fmeditem);
            }
        }
    }

    @Override
    public List<FmeditemView> find(Integer deptID, Integer recordType) {
        FMedItemViewExample fmeditemviewExample = new FMedItemViewExample();
        fmeditemviewExample.clear();
        FMedItemViewExample.Criteria criteria = fmeditemviewExample.createCriteria();
        if(deptID != null){
            criteria.andDeptIDEqualTo(deptID);
        }
        if(recordType != null){
            criteria.andRecordTypeEqualTo(recordType);
        }
        List<FmeditemView> list = fmeditemviewDao.selectByExample(fmeditemviewExample);
        return list;
    }

    @Override
    public List<FmeditemView> findByNameOrCode(String nameOrCode) {
        FMedItemViewExample example=new FMedItemViewExample();
        FMedItemViewExample.Criteria criteria1=example.createCriteria();
        FMedItemViewExample.Criteria criteria2=example.createCriteria();
        criteria1.andNameEqualTo(nameOrCode);
        criteria2.andMnemonicCodeEqualTo(nameOrCode);
        example.or(criteria2);
        return fmeditemviewDao.selectByExample(example);
    }

    @Override
    public boolean checkContent(FMedItem fmeditem, int state) {
        FMedItemViewExample example=new FMedItemViewExample();
        FMedItemViewExample.Criteria criteria=example.createCriteria();
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
        if (!XMLValidateAndSetting.validateType(file)) {

            return -1;
        }
        List<FMedItem> FMedItemList = new ArrayList<FMedItem>();
        FMedItem fmeditem = null;
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
            fmeditem = new FMedItem();
            FMedItemList.add(fmeditem);
            Row row = sheet.getRow(i);
            fmeditem.setId(Integer.valueOf(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(0))) );
            fmeditem.setCode(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(1)));
            fmeditem.setName(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(2)));
//            XSSFCell cell3= (XSSFCell) row.getCell(3);
//            cell3.setCellType(CellType.STRING);
//            fmeditem.setFormat(cell3.getStringCellValue());
//            XSSFCell cell4= (XSSFCell) row.getCell(4);
//            cell4.setCellType(CellType.STRING);
//            fmeditem.setPrice(cell4.getStringCellValue());
            fmeditem.setFormat(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(3)));
            fmeditem.setPrice(BigDecimal.valueOf(Double.valueOf(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(4)))));
            fmeditem.setExpClassID(Integer.valueOf(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(5))));
            fmeditem.setDeptID(Integer.valueOf(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(6))));
            fmeditem.setMnemonicCode(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(7)));
            fmeditem.setRecordType(Integer.valueOf(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(8))));
            try {
                fmeditem.setAppearDate(simpleDateFormat.parse(XMLValidateAndSetting.getStringValueFromCell((XSSFCell)row.getCell(9))));
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
        if (!FMedItemList.isEmpty()) {
            return fmeditemDao.uploadFmeditemInfo(FMedItemList);
        }
//		logger.debug("last row = " + sheet.getLastRowNum());
        return 0;
    }


    /**
     * 数据库导出Excle
     */
    @Override
    public File createExcle() {
        FMedItemExample fmeditemExample = new FMedItemExample();
        fmeditemExample.clear();
        FMedItemExample.Criteria criteria = fmeditemExample.createCriteria();
        List<FMedItem> listresult = fmeditemDao.selectByExample(fmeditemExample);
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



}
