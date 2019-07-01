package edu.neu.hospital.service.finaceService;

import edu.neu.hospital.bean.finaceBean.UserWorkCharts;

import java.util.List;

public interface UserWorkChartsService {
    /**
     * 查找个人工作量统计图表的数组
     * @return 个人工作量统计的图表数组
     */
    List<UserWorkCharts> list();
}
