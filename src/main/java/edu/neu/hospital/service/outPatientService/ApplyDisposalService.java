package edu.neu.hospital.service.outPatientService;

import edu.neu.hospital.bean.baseBean.FmeditemView;
import edu.neu.hospital.bean.basicTableBean.*;
import edu.neu.hospital.dto.DataListDTO;
import edu.neu.hospital.dto.IdDTO;


import java.util.List;

public interface ApplyDisposalService {

    //新建该患者的disposal
    //首先判断Disposal表里是否已经有该病例的检查了
    public boolean checkIsHaven(Integer medicalRecordID);
    public Disposal newDisposal(Disposal disposal, Integer userID);
    //1.	新增项目
    public int addDisposalDetailsList(Disposal disposal, DataListDTO disposalDetialsList, Integer userID);
    public int addDisposalDetails(Disposal disposal, DisposalDetails disposalDetails, Integer userID);
    //添加新项目时可使用模糊匹配搜索
    public  List<FMedItem> searchDisposal(String str);
    //2.	暂存项目
    public  boolean tmpStore(DataListDTO dataListDTO);
    //3.	开立项目
    public List<DisposalDetails> drawDisposalDetails(IdDTO disposalDetailsIdList, Integer userID);

    //4.	删除项目(未开立
    public List<DisposalDetails> deleteDisposalDetails(IdDTO disposalDetailsIdList, Integer userID) ;
    //5.	作废项目（已开立，但未登记
    public List<DisposalDetails> abolishDisposalDetails(IdDTO disposalDetailsIdList, Integer userID);

    //9.	常用项目管理（此次为引用
    public CommonDiposals useCommonDisposal(Integer commonDisposalID);
    //开立时向fee中插一条未缴费的记录
    public Fee addProjectFee(Integer disposalDetailID, Integer userID);
    public   List<FMedItem> listDisposal();
    public List<DisposalDetailsView> listIndexDisposal(Integer medicalRecordID);
    public FmeditemView getIndexFMedItem(DisposalDetails disposalDetails);

    public boolean deleteDisposalDetailsByID(Integer disposalDetailsId, Integer userID) ;

    public ProjectTemplate use_Check(Integer projectTemplateID  , Integer disposalID ,Integer userID) ;

}
