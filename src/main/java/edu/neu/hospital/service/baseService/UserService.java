package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.baseBean.UserView;
import edu.neu.hospital.bean.basicTableBean.User;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.dto.NameCodeDTO;
import edu.neu.hospital.dto.UserNameAndPassDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface UserService {
    /**
     * 查找用户信息
     * @param deptID 科室ID
     * @param typeID 用户类型ID
     * @return List<UserView>
     */
    public List<UserView> findUsers(Integer deptID, Integer typeID);
    /**
     * 查找id对应的用户
     * @param id 要删除的用户id
     * @param userID 进行删除操作的用户id
     */
    public void deleteById(Integer id,Integer userID);
    /**
     * 根据所选的id删除对应的用户
     * @param ids 要删除用户的idDTO
     * @param userID 进行批量删除操作的用户id
     */
    public void deleteByChoose(IdDTO ids, Integer userID);

    /**
     * 添加新的用户
     * @param user 要添加的用户信息
     * @param userID 进行添加操作的用户ID
     */
    public void add(User user,Integer userID);

    /**
     * 修改用户信息
     * @param user 修改所需的用户信息
     * @param userID 进行修改操作的用户ID
     */
    public void change(User user, Integer userID);
    /**
     * 查重
     * @param user 要进行查重的用户信息
     * @param state state=0表示添加时查重，state=1表示修改时查重
     * @return
     */
    public boolean checkContent(User user, int state);

    /**
     * 设置默认用户名和密码
     * @return UserNameAndPassDTO
     */
    public UserNameAndPassDTO setDefaultNameAndPass();
    /**
     * 根据用户名或登录名查找用户
     * @param name 用户名或登录名
     * @return
     */
    public List<UserView> findUserByName(String name);

    /**
     * 获取所有用户名和用户id
     * @return
     */

    public List<NameCodeDTO> getAllUserNamesAndUserIDs();

    /**
     * 获取所有用户类型的
     * @return
     */
    public List<NameCodeDTO> getAllRankNamesAndCodes();

    List<NameCodeDTO> getAllUserTypeNamesAndCodes();

    /**
     * 用Excle表导入到数据库
     * @param file Excle文件
     * @param errorHappenContinue 错误发生时是否继续
     * @param repeatCoverage  遇到重复信息是否覆盖
     * @throws IOException 抛出的 IO异常
     * @return
     */
    public boolean uploadXls(MultipartFile file, Integer operateUserID, boolean errorHappenContinue, boolean repeatCoverage) throws IOException;

    /**
     * 从数据库导出
     */
    public File createExcel() throws IOException;
    /**
     * 创建下载模板
     * @return
     */
    public File createXLSTemplate() throws IOException;

    User findUserByID(Integer id);

}
