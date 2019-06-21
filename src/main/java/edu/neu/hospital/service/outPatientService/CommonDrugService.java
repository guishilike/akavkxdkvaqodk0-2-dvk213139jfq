package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.CommonDrugs;
import edu.neu.hospital.bean.basicTableBean.Drugs;
import edu.neu.hospital.dto.IdDTO;

import java.util.List;

public interface CommonDrugService {

    //常用药管理
    //列出
    //根据医生ID列出他的常用药
    public List<CommonDrugs> listCommonDrugs(Integer doctorID);

    //增
    public Integer addCommonDrugs(Integer doctorID, Integer drugID);
    //批量增
    public boolean addCommonDrugsList(Integer doctorID, IdDTO idDTO);
    public List<Drugs> searchDrugs(String str);
    //删
    public Integer deleteCommonDrugs(Integer commonDrugsID, Integer userID);
    //批量删
    public boolean deleteCommonDrugsList(IdDTO idDTO, Integer userID);
    //改
    public Integer updateCommonDrugs(CommonDrugs commonDrugs, Integer userID);

    //查
    public CommonDrugs searchCommonDrugs(Integer commonDrugsID);
}
