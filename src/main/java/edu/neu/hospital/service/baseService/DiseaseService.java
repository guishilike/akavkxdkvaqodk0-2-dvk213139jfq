package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.Disease;
import edu.neu.hospital.bean.basicTableBean.DiseaseCategory;
import edu.neu.hospital.bean.baseBean.DiseaseView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface DiseaseService {
    /**
     * 查找疾病信息
     * @param diseaseCategoryID 疾病类型ID
     * @return List<DiseaseView>
     */
    public List<DiseaseView> findDiseasesByCategory(Integer diseaseCategoryID,Integer dicaTypeID);
    /**
     * 删除id对应的疾病
     * @param id 要删除的疾病的id
     * @param userID 用户id
     */
    public void deleteById(Integer id,Integer userID);
    /**
     * 根据所选的id删除对应的疾病
     * @param ids 要删除疾病的idDTO
     * @param userID 用户id
     */
    public void deleteByChoose(IdDTO ids, Integer userID);
    /**
     * 列出所有疾病一级分类
     * @return List<ConstantItem>
     */
    public List<NameCodeDTO> findALLDicaType();
    /**
     * 列出所有疾病二级分类
     */
    public List<NameCodeDTO> findALLDiseaseCategory();
    /**
     * 列出所有根据一级分类id列出所有疾病类型
     * @param id 一级分类的id
     * @return  List<DiseaseCategory>
     */
    public List<NameCodeDTO> findAllDiseaseCategoryByDicaTypeID(Integer id);

    /**
     *  添加新的疾病
     * @param disease 要添加的疾病信息
     * @param userID 用户id
     */
    public void add(Disease disease,Integer userID);
    /**
     * 修改疾病信息
     * @param disease 修改疾病所需的信息
     * @param userID 用户id
     */
    public void change(Disease disease,Integer userID);
    /**
     * 根据疾病名或疾病编号寻找疾病信息
     * @param nameOrCode
     * @return List<DiseaseView>
     */
    public List<DiseaseView> findDiseaseByNameOrCode(String nameOrCode);
    /**
     * 查重
     * @param disease 要查重的疾病
     * @param state state=0表示添加时查重，state=1表示修改时查重
     * @return boolean
     */
    public boolean checkDiseaseContent(Disease disease, int state);
    /**
     * 添加一级目录
     * @param constantitem 要添加的一级目录
     * @param userID 用户id
     */
    public void addDicaType(ConstantItem constantitem, Integer userID);
    /**
     * 删除一级目录
     * @param id 要删除的一级目录的id
     * @param userID 用户id
     */
    public void deleteDicaType(Integer id,Integer userID);
    /**
     * 修改一级目录
     * @param constantitem 要修改的一级目录信息
     * @param userID 用户id
     */
    public void changeDicaType(ConstantItem constantitem, Integer userID);

    /**
     * 添加二级目录
     * @param diseasecategory 要添加的二级目录
     * @param userID 用户id
     */
    public void addDiseaseCategory(DiseaseCategory diseasecategory, Integer userID);
    /**
     * 删除二级目录
     * @param id 要删除的二级目录的id
     * @param userID 用户id
     */
    public void deleteDiseaseCategory(Integer id,Integer userID);
    /**
     * 修改二级目录
     * @param diseasecategory 要修改的二级目录的信息
     * @param userID 用户id
     */
    public void changeDiseaseCategory(DiseaseCategory diseasecategory, Integer userID);

    /**
     * 二级目录查重
     * @param diseasecategory 要进行查重的二级目录
     * @param state state=0表示添加时查重，state=1表示修改时查重
     * @return boolean
     */
    public boolean checkDiseaseCategoryContent(DiseaseCategory diseasecategory, int state);
    /**
     * 获取所有疾病的名称和编号
     * @return
     */
    public List<NameCodeDTO> getAllDiseaseNamesAndDeptCodes();
    /**
     * 用Excle表导入到数据库
     * @param file Excle文件
     * @param errorHappenContinue 错误发生时是否继续
     * @param repeatCoverage  遇到重复信息是否覆盖
     * @throws IOException 抛出的 IO异常
     * @return
     */
    public boolean uploadXls(MultipartFile file, Integer userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException;

    /**
     * 从数据库导出
     */
    public File createExcel() throws IOException;
    /**
     * 创建下载模板
     * @return
     */
    public File createXLSTemplate() throws IOException;
}




