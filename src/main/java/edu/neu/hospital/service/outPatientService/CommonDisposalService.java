package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.basicTableBean.CommonDiposals;
import edu.neu.hospital.bean.basicTableBean.CommonDisposalsView;
import edu.neu.hospital.bean.basicTableBean.FMedItem;
import edu.neu.hospital.dto.IdDTO;

import java.util.List;

public interface CommonDisposalService {

    //常用处置管理
    //列出
    //根据医生ID列出他的常用处置
    public List<CommonDisposalsView> listCommonDiposals(Integer doctorID);

    //增
    public Integer addCommonDiposals(Integer doctorID, Integer diposalID);
    //批量增
    public boolean addCommonDiposalsList(Integer doctorID, IdDTO idDTO);

    public List<FMedItem> searchDiposal(String str);
    //删
    public Integer deleteCommonDiposals(Integer commonDiposalsID, Integer userID);
    //批量删
    public boolean deleteCommonDiposalsList(IdDTO idDTO, Integer userID);
    //改
    public Integer updateCommonDiposals(CommonDiposals commonDiposals, Integer userID);

    //查
    public CommonDiposals searchCommonDiposals(Integer commonDiposalsID);
}
