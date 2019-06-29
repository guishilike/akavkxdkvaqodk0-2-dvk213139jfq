package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.baseBean.RegistrationLevelView;
import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.RegistrationLevelDetails;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface RegistrationLevelService {
    //添加挂号级别

    /**
     * 添加挂号级别
     * @param constantitem 要添加的挂号级别信息
     * @param userID 用户id
     */
    public void add(ConstantItem constantitem, Integer userID);

    /**
     * 列出挂号级别详情
     * @return List<RegistrationLevelView>
     */
    public List<RegistrationLevelView> findAll();
    /**
     * 根据id删除挂号级别
     * @param id 要删除的挂号级别的详情
     * @param userID 用户id
     */
    public void deleteByID(Integer id,Integer userID);

    /**
     * 根据编码或名称列出挂号级别
     * @param codeOrName 挂号级别的编码或名称
     * @return List<RegistrationLevelView>
     */
    public List<RegistrationLevelView> findByCodeOrName(String codeOrName);
    /**
     * 删除选中的挂号级别
     * @param ids 要删除的挂号级别的IdDTO
     * @param userID 用户id
     */
    public void deleteByChoose(IdDTO ids, Integer userID);

    /**
     * 修改挂号级别
     * @param constantitem 修改挂号级别所需的信息
     * @param userID 用户id
     */
    public void change(ConstantItem constantitem, Integer userID);
    /**
     * 修改挂号级别详情
     * @param details  修改挂号级别详情所需的信息
     * @param userID 用户id
     */
    public void changeDetails(RegistrationLevelDetails details, Integer userID);
    /**
     * 获得所有挂号级别的名称和编号
     * @return
     */
    public List<NameCodeDTO> getAllSetCatNamesAndCode();
    /**
     * 从数据库导出
     */
    public File createExcel() throws IOException;

}
