package edu.neu.hospital.service.finaceService;

import edu.neu.hospital.bean.finaceBean.DepartmentWorkCharts;

import java.util.List;


public interface DepartmentWorkChartsService {

    /**
     * 查找科室工作量统计图表的数组
     * @return 科室工作量统计的图表数组
     */
    List<DepartmentWorkCharts> list();
}
