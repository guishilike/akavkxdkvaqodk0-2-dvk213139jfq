package edu.neu.hospital.service.finaceService.impl;

import edu.neu.hospital.bean.finaceBean.DepartmentWorkCharts;
import edu.neu.hospital.dao.finaceDao.DepartmentWorkChartsDao;
import edu.neu.hospital.example.finaceExample.DepartmentWorkChartsExample;
import edu.neu.hospital.service.finaceService.DepartmentWorkChartsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentWorkChartsServiceImpl implements DepartmentWorkChartsService {
    @Resource
    DepartmentWorkChartsDao departmentWorkChartsDao;

    /**
     * 查找科室工作量统计图表的数组
     * @return 科室工作量统计的图表数组
     */
    @Override
    public List<DepartmentWorkCharts> list() {
        DepartmentWorkChartsExample departmentWorkChartsExample = new DepartmentWorkChartsExample();
        departmentWorkChartsExample.clear();
        DepartmentWorkChartsExample.Criteria criteria = departmentWorkChartsExample.createCriteria();
        List<DepartmentWorkCharts> list = departmentWorkChartsDao.selectByExample(departmentWorkChartsExample);
        return list;
    }
}
