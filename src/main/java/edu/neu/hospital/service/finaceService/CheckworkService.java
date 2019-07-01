package edu.neu.hospital.service.finaceService;


import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.dto.IdDTO;

import java.util.Date;
import java.util.List;

public interface CheckworkService {
    /**
     * 根据信息查找
     * @param realName 用户真实姓名
     * @param deptName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Checkwork核对类型的list
     */
    List<CheckWork> findByInfo(String realName, String deptName, Date dateStart, Date dateEnd);

    /**
     * 根据id更新核对状态
     * @param id 前端返回的id
     * @param userID 更改用户的ID
     */
    public void updateById(Integer id,Integer userID);

    /**
     * 根据ID数组更新核对状态
     * @param ids 前端返回的ID数组
     * @param userID 更新的用户ID
     */
    public void updateByChoose(IdDTO ids, Integer userID);

}
