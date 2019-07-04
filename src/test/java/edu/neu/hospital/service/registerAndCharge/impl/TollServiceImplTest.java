package edu.neu.hospital.service.registerAndCharge.impl;

import edu.neu.hospital.bean.tollBean.DailySettleView;
import edu.neu.hospital.bean.tollBean.FeeView;
import edu.neu.hospital.bean.tollBean.TollInspectView;
import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.service.registerAndCharge.TollService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TollServiceImplTest {
    @Autowired
    private TollService tollService;
    @Autowired
    private CustomDateConverter customDateConverter;
    @Test
    public void tollInspection() {
        Date startDate=customDateConverter.convert("2019-06-10");
        Date endDate=customDateConverter.convert("2019-07-10");
        List<TollInspectView> tollInspectViews=tollService.tollInspection("1",startDate,endDate,134);
        System.out.println(tollInspectViews);


    }

    @Test
    public void toll() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO tollIDs=new IdDTO();
        tollIDs.setId(integerList);
        tollService.toll(tollIDs,5);
    }

    @Test
    public void refund() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO tollIDs=new IdDTO();
        tollIDs.setId(integerList);
        tollService.refund(tollIDs,5);
    }

    @Test
    public void dailySettle() {
        Date endDate=customDateConverter.convert("2019-07-10");
        tollService.dailySettle(5,endDate);

    }

    @Test
    public void dailySettleSearch() {
        Date startDate=customDateConverter.convert("2019-06-10");
        Date endDate=customDateConverter.convert("2019-07-10");
        List<DailySettleView> dailySettleViewList=tollService.dailySettleSearch(5,startDate,endDate);
        System.out.println(dailySettleViewList.toString());
    }

    @Test
    public void dailySettleFee() {
        Date startDate=customDateConverter.convert("2019-06-10");
        Date endDate=customDateConverter.convert("2019-07-10");
        List<FeeView> feeViews =tollService.dailySettleFee(5,startDate,endDate);
        System.out.println(feeViews.toString());
    }
}