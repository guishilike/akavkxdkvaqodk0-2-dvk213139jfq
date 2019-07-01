package edu.neu.hospital.service.finaceService.impl;


import edu.neu.hospital.bean.basicTableBean.Fee;
import edu.neu.hospital.bean.finaceBean.CheckWork;
import edu.neu.hospital.dao.basicTableDao.FeeDao;
import edu.neu.hospital.dao.finaceDao.CheckWorkDao;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.example.finaceExample.CheckWorkExample;
import edu.neu.hospital.service.finaceService.CheckworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CheckworkServiceImpl implements CheckworkService {
    @Resource
    CheckWorkDao checkworkDao;
    @Resource
    FeeDao feeDao;

    /**
     * 根据信息查找
     * @param realName 用户真实姓名
     * @param deptName 部门名称
     * @param dateStart 开始日期
     * @param dateEnd 结束日期
     * @return Checkwork核对类型的list
     */
    @Override
    public List<CheckWork> findByInfo(String realName, String deptName, Date dateStart, Date dateEnd) {
        CheckWorkExample checkworkExample = new CheckWorkExample();
        checkworkExample.clear();
        CheckWorkExample.Criteria criteria = checkworkExample.createCriteria();
        if((realName != null)&&(!realName.equals("")))
            criteria.andRealNameEqualTo(realName);
        if((deptName != null)&&(!deptName.equals(""))){
            criteria.andDeptNameEqualTo(deptName);}
        if(dateStart != null)
            criteria.andFeeAppearDateGreaterThan(dateStart);
        if(dateEnd != null)
            criteria.andFeeAppearDateLessThan(dateEnd);
        List<CheckWork> list = checkworkDao.selectByExample(checkworkExample);
        return list;
    }

    /**
     * 根据id更新核对状态
     * @param feeID 前端返回的id
     * @param userID 更改用户的ID
     */
    @Override
    public void updateById(Integer feeID, Integer userID) {
//        System.out.println("impl中的feeID是"+feeID);
        Fee fee = feeDao.selectByPrimaryKey(feeID);
        if(fee != null){
//            System.out.println("找到了对应的fee！");
            fee.setCheckStatus("已对账");
            fee.setChangeUserID(userID);
            fee.setFeeChangeDate(new Date());
            feeDao.updateByPrimaryKeySelective(fee);
        }
    }

    /**
     * 根据ID数组更新核对状态
     * @param feeIDs 前端返回的ID数组
     * @param userID 更新的用户ID
     */
    @Override
    public void updateByChoose(IdDTO feeIDs, Integer userID) {
        for (Integer id : feeIDs.getId()){
            Fee fee = feeDao.selectByPrimaryKey(id);
            if(fee != null){
                fee.setCheckStatus("已对账");
                fee.setChangeUserID(userID);
                fee.setFeeChangeDate(new Date());
                feeDao.updateByPrimaryKeySelective(fee);
            }
        }
    }



}
