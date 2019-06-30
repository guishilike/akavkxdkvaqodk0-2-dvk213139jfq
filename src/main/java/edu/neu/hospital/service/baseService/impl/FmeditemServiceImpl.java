package edu.neu.hospital.service.baseService.impl;


import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.dao.baseDao.DepartmentViewDao;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.FMedItemDao;
import edu.neu.hospital.dao.baseDao.FMedItemViewDao;
import edu.neu.hospital.dao.finaceDao.ExpenseClassViewDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;

import edu.neu.hospital.example.baseExample.FMedItemViewExample;

import edu.neu.hospital.service.baseService.FmeditemService;
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
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FmeditemServiceImpl implements FmeditemService {

    @Resource
    FMedItemDao fmeditemDao;
    @Resource
    FMedItemViewDao fmeditemviewDao;
    @Resource
    ExpenseClassViewDao expenseClassViewDao;
    @Resource
    DepartmentViewDao departmentViewDao;
    @Resource
    ConstantItemDao constantItemDao;


    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    public void add(FMedItem fmeditem, Integer userID) {
        fmeditem.setStatus("1");
        fmeditem.setCode(new Date().toString());
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
    public void deleteById(Integer id, Integer userID) {
        FMedItem fmeditem = fmeditemDao.selectByPrimaryKey(id);
        if (fmeditem != null) {
            fmeditem.setStatus("0");
            fmeditem.setChangeUserId(userID);
            fmeditem.setChangeDate(new Date());
            fmeditemDao.updateByPrimaryKeySelective(fmeditem);
        }
    }

    @Override
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (int i = 0; i < ids.getId().size(); i++) {
            FMedItem fmeditem = fmeditemDao.selectByPrimaryKey(ids.getId().get(i));
            if (fmeditem != null) {
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
        if (deptID != null) {
            criteria.andDeptIDEqualTo(deptID);
        }
        if (recordType != null) {
            criteria.andRecordTypeEqualTo(recordType);
        }
        List<FmeditemView> list = fmeditemviewDao.selectByExample(fmeditemviewExample);
        return list;
    }

    @Override
    public List<FmeditemView> findByNameOrCode(String nameOrCode) {
        FMedItemViewExample example = new FMedItemViewExample();
        FMedItemViewExample.Criteria criteria1 = example.createCriteria();
        FMedItemViewExample.Criteria criteria2 = example.createCriteria();
        criteria1.andNameEqualTo(nameOrCode);
        criteria2.andMnemonicCodeEqualTo(nameOrCode);
        example.or(criteria2);
        return fmeditemviewDao.selectByExample(example);
    }

    @Override
    public boolean checkContent(FMedItem fmeditem, int state) {
        FMedItemViewExample example = new FMedItemViewExample();
        FMedItemViewExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(fmeditem.getName());
        if (state == 1)
            criteria.andIdNotEqualTo(fmeditem.getId());
        if (fmeditemviewDao.countByExample(example) > 0)
            return false;
        else
            return true;
    }

    @Override
    public List<NameCodeDTO> getAllFMedItemNamesAndCodes() {

        return fmeditemviewDao.selectAllFMedNamesAndCodes();
    }

    @Override
    public List<NameCodeDTO> getAllFMedItemTypeNamesAndCodes() {
        return constantItemDao.findAllNamesAndCodesByType(20);
    }

    @Override
    public List<NameCodeDTO> getAllDeptNamesAndDeptCodes() {
        return departmentViewDao.selectAllDeptNamesAndCodesByDeptType(121);
    }

    @Override
    public List<NameCodeDTO> getAllExpClassNamesAndDeptCodes() {
        return expenseClassViewDao.selectAllExpClass();
    }


    /**
     * excle导入数据库
     *
     * @param file Excle文件
     * @return 成功失败
     * @throws IOException
     */
    @Override
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException {
        //标识文件内容是否有错
        Boolean state = true;
        FMedItem fmeditem;
        Workbook book;
        try {
            book = new XSSFWorkbook(file.getInputStream());
            System.out.println("success");
        } catch (Exception e) {
            book = new HSSFWorkbook(file.getInputStream());
        }
        Sheet sheet = book.getSheetAt(0);

        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            try {
                fmeditem = new FMedItem();
                Row row = sheet.getRow(i);
                fmeditem.setMnemonicCode(row.getCell(0).toString());
                fmeditem.setName(row.getCell(1).toString());
                fmeditem.setFormat(row.getCell(2).toString());
                row.getCell(3).setCellType(CellType.STRING);
                fmeditem.setPrice(BigDecimal.valueOf(Double.valueOf(row.getCell(3).toString())));
                String expClassName=row.getCell(4).toString();
                fmeditem.setExpClassID(expenseClassViewDao.getIDByName(expClassName));
                String deptName=row.getCell(5).toString();
                fmeditem.setDeptID(departmentViewDao.getIDByName(deptName));
                String fMedItemType=row.getCell(6).toString();
                fmeditem.setRecordType(constantItemDao.findIdByName(fMedItemType,20).getId());
                //遇到重复是否继续执行
                if (checkContent(fmeditem, 0)) {
                    add(fmeditem, userID);
                } else if (repeatCoverage) {
                    fmeditem.setId(fmeditemviewDao.getIDByName(row.getCell(1).toString()));
                    fmeditemDao.updateByPrimaryKeySelective(fmeditem);
                }

            } catch (Exception e) {
                //遇到错误是否继续执行
                state = false;
                if (errorHappenContinue)
                    continue;
                else
                    return false;

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
//		logger.debug("last row = " + sheet.getLastRowNum());
        file.getInputStream().close();
        return state;
    }


    /**
     * 数据库导出Excle
     */
    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName = "fMedItem.xls";
        List<FmeditemView> results = fmeditemviewDao.selectByExample(new FMedItemViewExample());
        String[] title = {"编号", "项目编码", "项目名称", "项目规格", "价格", "所属费用科目", "执行科室",
                "项目类型", "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        for (int i = 0; i < results.size(); i++) {
            // 创建行
            row = sheet.createRow(i + 1);
            // 序号
            row.createCell(0).setCellValue(results.get(i).getId().toString());
            row.createCell(1).setCellValue(results.get(i).getMnemonicCode());
            row.createCell(2).setCellValue(results.get(i).getName());
            row.createCell(3).setCellValue(results.get(i).getFormat());
            row.createCell(4).setCellValue(results.get(i).getPrice().toString());
            row.createCell(5).setCellValue(results.get(i).getExpClassName());
            row.createCell(6).setCellValue(results.get(i).getDeptName());
            row.createCell(7).setCellValue(results.get(i).getTypeName());
            if (results.get(i).getAppearDate() != null)
                row.createCell(8).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(9).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(10).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(11).setCellValue(results.get(i).getChangeUserName());

        }

        File file = FileManage.createXLSFile(wb, path, fileName);
        return file;
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
    public File createXLSTemplate() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLSTemplate";
        String fileName = "fMedItemTemplate.xls";
        String[] title = { "编码", "项目名称", "规格", "价格", "费用类型", "执行科室", "项目类别"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        return FileManage.createXLSFile(wb, path, fileName);
    }


}
