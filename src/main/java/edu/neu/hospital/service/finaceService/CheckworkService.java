package edu.neu.hospital.service.finaceService;


import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.dto.IdDTO;

import java.util.Date;
import java.util.List;

public interface CheckworkService {
    /**
     *
     * @param realName 用户真实姓名
     * @param deptName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Checkwork核对类型的list
     */
    List<CheckWork> findByInfo(String realName, String deptName, Date dateStart, Date dateEnd);

    public void updateById(Integer id,Integer userID);

    public void updateByChoose(IdDTO ids, Integer userID);

}
