package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.MedicalRecHomeTemplate;

import java.util.List;

public interface MedicalRecHomeTempService {
    //病历模板管理
    //增删改查
    //1.	新增病历模板：输入病历模板编码、病历模板名称、模板适用范围（个人、科室、全院）、病历内容：包括主诉、现病史、体格检查、初步诊断（西医）或初步诊断（中医），点击“保存”，保存模板。
   public boolean addMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate, Integer userID);
    //2.	修改模板：对病历模板信息进行修改，只能对自己创建的模板进行修改。
    public Integer updateMedicalRecHomeTemp(MedicalRecHomeTemplate medicalRecHomeTemplate, Integer userID);
    //3.	删除模板：对病历模板进行删除，只能对自己创建的模板进行删除。

    public Integer deleteMedicalRecHomeTemplate(Integer medicalRecHomeTemplateID, Integer userID);
    //4.	查询病历模板：可以根据模板编码、名称、类型、创建人进行模板查询。
    //此时不需要考虑权限
    //模糊查询
    public List<MedicalRecHomeTemplate> findMedicalRecHomeTemplate(String str);
    //该医生能看到的模板
    public List<Integer> getThisDoctorTemp(Integer userID);


}
