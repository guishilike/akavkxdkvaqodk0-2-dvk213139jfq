package edu.neu.hospital.utils;

import edu.neu.hospital.exception.FileTypeException;
import edu.neu.hospital.exception.GettingTypeException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.springframework.web.multipart.MultipartFile;


public class XMLValidateAndSetting {
    //检查是不是xls文件
    public static boolean validateType(MultipartFile file) {

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
            System.out.println("error occurs while getting file type.");
            return false;
        } catch (FileTypeException e) {
            System.out.println("the file introduced is not .xls file.");
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
        System.out.println(cellValue);
        return cellValue;
    }
}
