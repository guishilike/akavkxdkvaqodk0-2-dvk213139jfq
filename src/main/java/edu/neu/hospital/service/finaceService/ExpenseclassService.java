package edu.neu.hospital.service.finaceService;

import edu.neu.hospital.bean.basicTableBean.ExpenseClass;
import edu.neu.hospital.bean.finaceBean.ExpenseClassView;
import edu.neu.hospital.dto.IdDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface ExpenseclassService {

    /**
     * 上传excle文件
     * @param file excle文件
     * @param userID 用户ID （修改人）
     * @param errorHappenContinue 遇到作物时是否继续
     * @param repeatCoverage 有重复是否覆盖
     * @return 是否更新成功
     * @throws IOException
     */
    public boolean uploadXls(MultipartFile file,int userID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException;

    /**
     * 创建excl文件
     * @return 文件类型的excle文件
     * @throws IOException
     */
    public File createExcle()throws IOException;

    /**
     * 创建excle模板
     * @return file类型的excle模板
     * @throws IOException
     */
    public File createXLSTemplate() throws IOException;

    /**
     * 增加
     * @param expenseclass 费用类型对象
     */
    public void add(ExpenseClass expenseclass, Integer userID);

    /**
     * 修改
     * @param expenseclass 新的费用类型对象
     */
    public void change(ExpenseClass expenseclass, Integer userID);

    /**
     * 根据ID删除
     * @param id 费用类型ID
     */
    public void deleteById(Integer id, Integer userID);

    /**
     * 根据选择的ID删除
     * @param ids 前端返回的选择的费用类型ID数组
     */
    public void deleteByChoose(IdDTO ids, Integer userID);

    /**
     * 查找费用类型的方法
     * @param code 费用类型编码
     * @param name 费用类型名称
     * @return List<ExpenseClassView>类型的ResultDTO 费用类型信息
     */
    public List<ExpenseClassView> find(String code, String name);

    /**
     * 查重
     * @param expenseclass 费用类型对象
     * @param state 查重状态
     * @return 是否有重复
     */
    public boolean checkContent(ExpenseClass expenseclass, int state);
}
