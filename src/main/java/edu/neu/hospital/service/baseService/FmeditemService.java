package edu.neu.hospital.service.baseService;


import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;


public interface FmeditemService {

    /**
     * 添加非药品项目
     */
    public void add(FMedItem fmeditem, Integer userID);

    /**
     *修改非药品项目
     */
    public void change(FMedItem fmeditem, Integer userID);

    /**
     * 根据ID删除
     * @param id 非药品项目ID
     */
    public void deleteById(Integer id, Integer userID);

    /**
     * 根据选择的ID删除
     * @param ids
     */
    public void deleteByChoose(IdDTO ids, Integer userID);

    /**
     * 根据科室名称或科室类型查找
     * @param deptID 使用科室名称ID
     * @param recordType 项目类型ID
     * @return
     */
    public List<FmeditemView> find(Integer deptID, Integer recordType);
    /**
     * 根据项目名称或编码查询
     * @param nameOrCode 使用科室名称ID
     * @return
     */
    public List<FmeditemView> findByNameOrCode(String nameOrCode);
    /**
     * 查重
     * @param fmeditem 要查重的项目
     * @state state state=0表示添加时查重，state=1表示修改时查重
     */
    public boolean checkContent(FMedItem fmeditem, int state);
    /**
     * 获取所有项目名称和项目编号
     * @return
     */

    public List<NameCodeDTO> getAllFMedItemNamesAndCodes();

    /**
     * 获得所有项目类型的名称或编号
     * @return
     */

    public List<NameCodeDTO> getAllFMedItemTypeNamesAndCodes();
    /**
     * 获取所有科室名称和科室编号
     * @return
     */
    public List<NameCodeDTO> getAllDeptNamesAndDeptCodes();
    /**
     * 获取所有费用科目的名称和编号
     * @return
     */
    public List<NameCodeDTO> getAllExpClassNamesAndDeptCodes();
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
