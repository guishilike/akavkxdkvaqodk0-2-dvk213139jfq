package edu.neu.hospital.utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManage {
    public static XSSFWorkbook createXLSTemplate(String[] title) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        // 2.在workbook中添加一个sheet,对应Excel文件中的sheet
        XSSFSheet sheet = wb.createSheet("sheet1");
        // 3.1创建第一行
        XSSFRow row = sheet.createRow(0);
        // 将列名写入
        for (int i = 0; i < title.length; i++) {
            // 给列写入数据,创建单元格，写入数据
            row.createCell(i).setCellValue(title[i]);
            sheet.setColumnWidth(i, 4000);
        }
        return wb;
    }

    public static File createXLSFile(XSSFWorkbook wb, String path,String fileName) throws IOException {
        File fileDirectory = new File(path);
        if (!fileDirectory.exists()) {
            fileDirectory.mkdir();
        }
        File file = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        wb.write(fileOutputStream);
        fileOutputStream.close();
        return file;
    }
}
