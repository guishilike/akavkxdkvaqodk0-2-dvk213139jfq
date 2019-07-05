package edu.neu.hospital.service.baseService.impl;

import edu.neu.hospital.bean.baseBean.RegistrationLevelView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.RegistrationLevelDetails;
import edu.neu.hospital.dao.baseDao.RegistrationLevelViewDao;
import edu.neu.hospital.dao.basicTableDao.ConstantItemDao;
import edu.neu.hospital.dao.basicTableDao.RegistrationLevelDetailsDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.example.baseExample.RegistrationLevelViewExample;
import edu.neu.hospital.service.baseService.RegistrationLevelService;
import edu.neu.hospital.utils.FileManage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RegistrationLevelServiceImpl implements RegistrationLevelService {
    @Resource
    RegistrationLevelViewDao registrationlevelviewDao;
    @Resource
    RegistrationLevelDetailsDao registrationleveldetailsDao;
    @Resource
    ConstantItemDao constantitemDao;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
//    @CacheEvict(value="constantItem")
    public void add(ConstantItem constantitem, Integer userID) {
        constantitem.setConstantTypeID(13);
        constantitem.setAppearDate(new Date());
        constantitem.setApearUserID(userID);
        constantitem.setStatus("1");
        constantitemDao.insert(constantitem);
        //添加挂号级别详情表
        RegistrationLevelDetails details = new RegistrationLevelDetails();
        details.setRegisteredLevelID(constantitem.getId());
        details.setStatus("1");
        registrationleveldetailsDao.insert(details);
    }

    //列出所有的挂号级别
    @Override
//    @CachePut(value="constantItem",key="'findAllRegistrationLevel'")
    public List<RegistrationLevelView> findAll() {
        return registrationlevelviewDao.selectByExample(new RegistrationLevelViewExample());
    }

    //根据id删除挂号级别
    @Override
//    @CacheEvict(value="constantItem")
    public void deleteByID(Integer id, Integer userID) {
        ConstantItem constantitem = constantitemDao.selectByPrimaryKey(id);
        if (constantitem != null) {
            constantitem.setStatus("0");
            constantitem.setChangeUserID(userID);
            constantitem.setChangeDate(new Date());
            RegistrationLevelDetails details = new RegistrationLevelDetails();
            details.setId(registrationlevelviewDao.findSequenceIdById(id));
            details.setStatus("0");
            constantitemDao.updateByPrimaryKeySelective(constantitem);
            registrationleveldetailsDao.updateByPrimaryKeySelective(details);
        }
    }

    @Override
//    @Cacheable(value="constantItem",key="'findRegistrationLevelByCodeOrName'")
    public List<RegistrationLevelView> findByCodeOrName(String codeOrName) {
        RegistrationLevelViewExample example = new RegistrationLevelViewExample();
        RegistrationLevelViewExample.Criteria criteria1 = example.createCriteria();
        RegistrationLevelViewExample.Criteria criteria2 = example.createCriteria();
        criteria1.andRegisteredCodeEqualTo(codeOrName);
        criteria2.andRegisteredNameEqualTo(codeOrName);
        example.or(criteria2);
        return registrationlevelviewDao.selectByExample(example);
    }

    @Override
//    @CacheEvict(value="constantItem")
    public void deleteByChoose(IdDTO ids, Integer userID) {
        for (Integer id : ids.getId()) {
            ConstantItem constantitem = constantitemDao.selectByPrimaryKey(id);
            if (constantitem != null) {
                constantitem.setStatus("0");
                RegistrationLevelDetails details = new RegistrationLevelDetails();
                constantitem.setChangeUserID(userID);
                constantitem.setChangeDate(new Date());
                details.setId(registrationlevelviewDao.findSequenceIdById(id));
                details.setStatus("0");
                constantitemDao.updateByPrimaryKeySelective(constantitem);
                registrationleveldetailsDao.updateByPrimaryKeySelective(details);
            }
        }

    }

    @Override
//    @CacheEvict(value="constantItem")
    public void change(ConstantItem constantitem, Integer userID) {
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);
    }

    @Override
//    @CacheEvict(value="constantItem")
    public void changeDetails(RegistrationLevelDetails details, Integer userID) {
        if(details.getIsDefault()!=null&&details.getIsDefault().equals("1"))
            registrationleveldetailsDao.clearDefault();
        registrationleveldetailsDao.updateByPrimaryKeySelective(details);
        ConstantItem constantitem = new ConstantItem();
        System.out.println(details.getId());
        constantitem.setId(registrationlevelviewDao.findIdBySequenceId(details.getId()));
        constantitem.setChangeDate(new Date());
        constantitem.setChangeUserID(userID);
        constantitemDao.updateByPrimaryKeySelective(constantitem);
    }

    @Override
    public List<NameCodeDTO> getAllRegLevNamesAndCode() {
        return constantitemDao.findAllNamesAndCodesByType(13);
    }

    @Override
    public File createExcel() throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/basicXLS";
        String fileName ="registrationLevel.xls";
        List<RegistrationLevelView> results =
                registrationlevelviewDao.selectByExample(new RegistrationLevelViewExample());
        String[] title = {"编号", "挂号级别编码", "挂号级别名称", "顺序号", "是否默认","挂号级别费用",
               "创建时间", "创建人", "修改时间", "修改人"};
        XSSFWorkbook wb = FileManage.createXLSTemplate(title);
        XSSFSheet sheet = wb.getSheet("sheet1");
        XSSFRow row;
        // 写入正式数据
        for (int i = 0; i < results.size(); i++) {
            row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(results.get(i).getId());
            row.createCell(1).setCellValue(results.get(i).getRegisteredCode());
            row.createCell(2).setCellValue(results.get(i).getRegisteredName());
            row.createCell(3).setCellValue(results.get(i).getSequenceID());
            row.createCell(4).setCellValue(results.get(i).getIsDefault());
            row.createCell(5).setCellValue(results.get(i).getRegistrationFee()==null?
                    "":results.get(i).getRegistrationFee().toString());
            if (results.get(i).getAppearDate() != null)
                row.createCell(6).setCellValue(simpleDateFormat.format(results.get(i).getAppearDate()));
            row.createCell(7).setCellValue(results.get(i).getAppearUserName());
            if (results.get(i).getChangeDate() != null)
                row.createCell(8).setCellValue(simpleDateFormat.format(results.get(i).getChangeDate()));
            row.createCell(9).setCellValue(results.get(i).getChangeUserName());
        }
        return FileManage.createXLSFile(wb, path, fileName);
    }


}
