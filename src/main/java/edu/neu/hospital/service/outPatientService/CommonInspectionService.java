package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.CommonInspection;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.dto.IdDTO;

import java.util.List;

public interface CommonInspectionService {

    //常用检查管理
    //列出
    //根据医生ID列出他的常用检查
    public List<CommonInspection> listCommonInspection(Integer doctorID);

    //增
    public Integer addCommonInspection(Integer doctorID, Integer inspectionID);
    //批量增
    public boolean addCommonInspectionList(Integer doctorID, IdDTO idDTO);
    //删
    public Integer deleteCommonInspection(Integer commonInspectionID, Integer userID);
    //批量删
    public boolean deleteCommonInspectionList(IdDTO idDTO, Integer userID);
    //改
    public Integer updateCommonInspection(CommonInspection commonInspection, Integer userID);

    //查
    public CommonInspection searchCommonInspection(Integer commonInspectionID);
    public List<FMedItem> searchDiposal(String str);

}
