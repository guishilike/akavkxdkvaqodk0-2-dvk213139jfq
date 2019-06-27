package edu.neu.hospital.service.baseService;

import edu.neu.hospital.bean.basicTableBean.ConstantItem;

import java.util.List;

public interface ConstantService {
    //查重,state=0表示添加时查重，state=1表示修改时查重
    boolean checkContent(ConstantItem constantitem, int state, int typeID);

    List<ConstantItem> findByTypeID(Integer typeID);
}
