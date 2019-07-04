package edu.neu.hospital.service.MedicalTechService.impl;

import edu.neu.hospital.bean.takeMedicineBean.TakeMedDetailsView;
import edu.neu.hospital.bean.takeMedicineBean.TakeMedicineFormView;
import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.service.MedicalTechService.TakeMedicineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TakeMedicineServiceImplTest {
    @Autowired
    private TakeMedicineService takeMedicineService;
    @Autowired
    private CustomDateConverter customDateConverter;
    @Test
    public void takemedicineformview() {
        Date startDate=customDateConverter.convert("2019-06-10");
        Date endDate=customDateConverter.convert("2019-07-10");
        List<TakeMedicineFormView> takeMedicineFormViewsList=takeMedicineService.takemedicineformview("1",startDate,endDate);
        System.out.println(takeMedicineFormViewsList);
    }

    @Test
    public void takemeddetailsview() {
        List<TakeMedDetailsView> takeMedDetailsViewList=takeMedicineService.takemeddetailsview(1,138);
        System.out.println(takeMedDetailsViewList);
    }

    @Test
    public void takeMedicine() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO presdetiaisIDs=new IdDTO();
        presdetiaisIDs.setId(integerList);
        takeMedicineService.takeMedicine(presdetiaisIDs,1);
    }

    @Test
    public void withdrawMedicine() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO presdetiaisIDs=new IdDTO();
        presdetiaisIDs.setId(integerList);
        takeMedicineService.withdrawMedicine(presdetiaisIDs,1);

    }
}