package edu.neu.hospital.controller.baseController;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
@Controller
@RequestMapping("fileManage")
@CrossOrigin
public class FileManageController {
    /**
     * 下载文件
     * @param fileName 下载的文件名
     * @param response Http回应
     * @return resultDTO
     */
    @RequestMapping("/downloadXLS")
    public @ResponseBody String
    downloadFile(String fileName,String pos,HttpServletResponse response) {
        try {
            System.out.println(fileName);
            String realPath = ResourceUtils.getURL("classpath:").getPath() + pos;
            File file = new File(realPath, fileName);
            response.setContentType("application/force-download");// 设置强制下载不打开
            response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
            response.setHeader("Access-Control-Allow-Credentials","true"); //是否支持cookie跨域
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                System.out.println("success");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
