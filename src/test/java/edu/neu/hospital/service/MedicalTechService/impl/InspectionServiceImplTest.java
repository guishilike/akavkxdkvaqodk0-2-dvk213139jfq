package edu.neu.hospital.service.MedicalTechService.impl;

import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.bean.inspectionBean.InspectFormView;
import edu.neu.hospital.bean.inspectionBean.InspectMatReView;
import edu.neu.hospital.bean.inspectionBean.InspectMedReView;
import edu.neu.hospital.bean.inspectionBean.InspectReView;
import edu.neu.hospital.config.CustomDateConverter;
import edu.neu.hospital.dto.IdDTO;
import edu.neu.hospital.service.MedicalTechService.InspectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InspectionServiceImplTest {
    @Autowired
    private InspectionService inspectionService;
    @Autowired
    private CustomDateConverter customDateConverter;

    @Test
    public void inspectformview() {
        Date date=customDateConverter.convert("2019-06-10");
        List<InspectFormView> inspectFormViews=inspectionService.inspectformview("1",date,1,142);
        System.out.println(inspectFormViews.toString());
    }

    @Test
    public void searchFMedItem() {
         List<FMedItem> fMedItemList=inspectionService.searchFMedItem();
        System.out.println(fMedItemList.toString());
    }

    @Test
    public void inspectreview() {
        List<InspectReView> inspectReViewList=inspectionService.inspectreview(1);
        System.out.println(inspectReViewList.toString());
    }



    @Test
    public void inspectmatreview() {
        List<InspectMatReView> inspectMatReViewsList=inspectionService.inspectmatreview(1);
        System.out.println(inspectMatReViewsList);
    }

    @Test
    public void inspectmedreview() {
        List<InspectMedReView> inspectMedReViewList=inspectionService.inspectmedreview(1);
        System.out.println(inspectMedReViewList.toString());
    }

    @Test
    public void deleteMedMat() {
        inspectionService.deleteMedMat(1,1);
    }

    @Test
    public void deleteMedMatByList() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO medMatListIdDTO=new IdDTO();
        medMatListIdDTO.setId(integerList);
        inspectionService.deleteMedMatByList(medMatListIdDTO,1);
    }

    @Test
    public void updateMedMat() {
        MedicinesMaterialsList medicinesMaterialsList=new MedicinesMaterialsList();
        medicinesMaterialsList.setId(1);
        BigDecimal dosage=new BigDecimal(4);
        medicinesMaterialsList.setDosage(dosage);
        inspectionService.updateMedMat(medicinesMaterialsList,1);
    }

    @Test
    public void searchDrugs() {
        List<Drugs> drugsList=inspectionService.searchDrugs("大");
        System.out.println(drugsList.toString());
    }

    @Test
    public void searchMaterials() {
        List<Materials> materialsList=inspectionService.searchMaterials("小");
        System.out.println(materialsList.toString());
    }

    @Test
    public void insertMedMat() {
        MedicinesMaterialsList medicinesMaterialsList=new MedicinesMaterialsList();
        medicinesMaterialsList.setId(1);
        medicinesMaterialsList.setMedicinesMaterialsID(1);
        medicinesMaterialsList.setMatOrMedType("0");
        BigDecimal dosage=new BigDecimal(4);
        medicinesMaterialsList.setDosage(dosage);
        inspectionService.insertMedMat(1,medicinesMaterialsList);
    }

    @Test
    public void approveMat() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO matIdDTO=new IdDTO();
        matIdDTO.setId(integerList);
        inspectionService.approveMat(matIdDTO,1);
    }

    @Test
    public void approveMed() {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        IdDTO medIdDTO=new IdDTO();
        medIdDTO.setId(integerList);
        inspectionService.approveMed(medIdDTO,1);
    }

    @Test
    public void approveInspectionDetails() {
        inspectionService.approveInspectionDetails(1);
    }

    @Test
    public void registerInspectionDetails() {
        inspectionService.registerInspectionDetails(1);
    }

    @Test
    public void importInspectResult() {
        InspectionResultWithBLOBs inspectionResultWithBLOBs=new InspectionResultWithBLOBs();
        inspectionResultWithBLOBs.setView("皮肤色变");
        inspectionResultWithBLOBs.setDiagnosis("中毒");
        inspectionService.importInspectResult(inspectionResultWithBLOBs,1);
    }

    @Test
    public void updateInspectResult() {
        InspectionResultWithBLOBs inspectionResultWithBLOBs=new InspectionResultWithBLOBs();
        inspectionResultWithBLOBs.setView("皮肤严重烧伤");
        inspectionResultWithBLOBs.setDiagnosis("烧伤");
        inspectionService.updateInspectResult(inspectionResultWithBLOBs,1);
    }

    @Test
    public void importInspectResultImages() {
        InspectionResultImage inspectionResultImage=new InspectionResultImage();
        inspectionResultImage.setImageName("脑部CT");
        inspectionResultImage.setCatalog("123456.jpg");
        inspectionService.importInspectResultImages(inspectionResultImage,1);
    }

    @Test
    public void deleteInspectResultImages() {
        inspectionService.deleteInspectResultImages("123456.jpg",1);
    }

    @Test
    public void finishInspection() {
        inspectionService.finishInspection(1);
    }
}