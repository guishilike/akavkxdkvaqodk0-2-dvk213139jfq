package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;
import edu.neu.hospital.bean.basicTableBean.SettleCategoryDetails;
import edu.neu.hospital.bean.baseBean.SettleCategoryView;
import edu.neu.hospital.dto.IdDTO;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 结算类别管理服务
 */
@Service
public interface SettlementCategoryService {
    /**
     * 添加结算类别
     * @param constantitem 要添加的结算类别信息
     * @param userID 用户id
     */
    public void add(ConstantItem constantitem, Integer userID);
    /**
     * 列出所有结算类别详情
     * @return 结算类别视图列表
     */
    public List<SettleCategoryView> findAll();
    /**
     * 根据id删除结算类别
     * @param id 要删除的结算类别id
     * @param userID 用户id
     */
    public void deleteByID(Integer id,Integer userID);
    /**
     * 根据编码或名称列出结算类别
     * @param codeOrName 要查找的结算类别的编码或名称
     * @return 结算类别视图列表
     */
    public List<SettleCategoryView> findByCodeOrName(String codeOrName);
    /**
     * 删除选中的结算类别
     * @param ids 要删除的结算类别的idDTO
     * @param userID 用户id
     */
    public void deleteByChoose(IdDTO ids, Integer userID);
    /**
     * 修改结算类别
     * @param constantitem 修改结算类别所需的信息
     * @param userID  用户id
     */
    public void change(ConstantItem constantitem, Integer userID);
    /**
     * 修改结算类别详情
     * @param details 修改结算类别详情所需的信息
     * @param userID  用户id
     */
    public void changeDetails(SettleCategoryDetails details, Integer userID);


}
