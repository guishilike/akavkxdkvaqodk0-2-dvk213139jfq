package edu.neu.hospital.service;

import edu.neu.hospital.bean.Fmeditem;
import edu.neu.hospital.bean.Fmeditemview;
import edu.neu.hospital.dto.IdDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FmeditemService {

    /**
     * 用Excle表导入到数据库
     * @param file Excle文件
     * @return 是否成功
     * @throws IOException
     */
    int uploadXls (MultipartFile file) throws IOException;

    /**
     * 从数据库导出
     */
    void createExcle();

    /**
     * 添加非药品项目
     */
    public void add(Fmeditem fmeditem);

    /**
     *修改非药品项目
     */
    public void change(Fmeditem fmeditem);

    /**
     * 根据ID删除
     * @param id 非药品项目ID
     */
    public void deleteById(Integer id);

    /**
     * 根据选择的ID删除
     * @param ids
     */
    public void deleteByChoose(IdDTO ids);

    /**
     * 根据传参查找
     * @param deptID 使用科室ID
     * @param type 类型
     * @return
     */
    public List<Fmeditemview> find(Integer deptID, Integer type);
}
