package edu.neu.hospital.service;

import edu.neu.hospital.bean.Fmeditem;
import edu.neu.hospital.bean.Fmeditemview;
import edu.neu.hospital.dto.IdDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FmeditemService {
    /**
     * 用Excle表导入到数据库
     *
     * @param file Excle文件
     * @return 是否成功
     * @throws IOException
     */
    public int uploadXls(MultipartFile file) throws IOException;

    /**
     * 从数据库导出
     */
    public File createExcle();

    /**
     * 添加非药品项目
     */
    public void add(Fmeditem fmeditem, Integer userID);

    /**
     * 修改非药品项目
     */
    public void change(Fmeditem fmeditem, Integer userID);

    /**
     * 根据ID删除
     *
     * @param id 非药品项目ID
     */
    public void deleteById(Integer id, Integer userID);

    /**
     * 根据选择的ID删除
     *
     * @param ids
     */
    public void deleteByChoose(IdDTO ids, Integer userID);

    /**
     * 根据科室名称或科室类型查找
     *
     * @param deptID     使用科室名称ID
     * @param recordType 科室类型ID
     * @return
     */
    public List<Fmeditemview> find(Integer deptID, Integer recordType);

    /**
     * 根据科室名称或编码查询
     *
     * @param nameOrCode 使用科室名称ID
     * @return
     */
    public List<Fmeditemview> findByNameOrCode(String nameOrCode);

    /**
     * 查重
     *
     * @param fmeditem 要查重的项目
     * @state state state=0表示添加时查重，state=1表示修改时查重
     */
    public boolean checkContent(Fmeditem fmeditem, int state);
}