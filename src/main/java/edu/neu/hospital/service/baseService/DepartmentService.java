package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.basicTableBean.Department;
import edu.neu.hospital.bean.baseBean.DepartmentView;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface DepartmentService {
    /**
     *  查找科室信息
     * @param deptCategoryID 科室分类ID
     * @param deptTypeID 科室类别ID
     * @return 科室视图信息
     */
    public List<DepartmentView> findDepartments(Integer deptCategoryID, Integer deptTypeID);
    /**
     * 删除id对应的科室
     * @param id 要删除科室的id
     * @param userID 用户id
     */
    public void deleteById(Integer id,Integer userID);
    /**
     * 根据所选的id删除对应的科室
     * @param ids 要删除科室的idDTO
     * @param userID 用户id
     */
    public void deleteByChoose(IdDTO ids, Integer userID);
    /**
     * 列出所有科室类型或科室分类
     * @param state state=0表示列出科室类型，state=1表示列出科室分类
     * @return
     */
    public List<NameCodeDTO> findALLDeptTypeOrCategoryId(int state);
    /**
     * 添加新的科室
     * @param department 要添加的科室
     * @param userID 用户id
     */
    public void add(Department department,Integer userID);
    /**
     * 修改科室信息
     * @param department 要修改的科室
     * @param userID 用户名称
     */
    public void change(Department department,Integer userID);
    /**
     * 根据科室名或科室编号查找科室信息
     * @param nameOrCode 科室名或编号
     * @return 科室视图列表
     */
    public List<DepartmentView> findDepartmentByNameOrCode(String nameOrCode);
    /**
     * 查重
     * @param department 要进行查重的科室
     * @param state state=0表示添加时查重，state=1表示修改时查重
     * @return
     */
    public boolean checkContent(Department department, int state);

    /**
     * 获取所有科室名称和科室编号
     * @return
     */
    public List<NameCodeDTO> getAllDeptNamesAndDeptCodes();
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
