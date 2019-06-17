package edu.neu.hospital.service;

import edu.neu.hospital.bean.Expenseclass;
import edu.neu.hospital.bean.Expenseclassview;
import edu.neu.hospital.dto.IdDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface ExpenseclassService {

    public int uploadXls (MultipartFile file) throws IOException;

    public File createExcle();

    /**
     * 增加
     * @param expenseclass
     */
    public void add(Expenseclass expenseclass, Integer userID);

    /**
     * 修改
     * @param expenseclass
     */
    public void change(Expenseclass expenseclass,Integer userID);

    /**
     * 根据ID删除
     * @param id 非药品项目ID
     */
    public void deleteById(Integer id,Integer userID);

    /**
     * 根据选择的ID删除
     * @param ids
     */
    public void deleteByChoose(IdDTO ids,Integer userID);

    public List<Expenseclassview> find(String code, String name);

    /**
     * 查重
     * @param expenseclass
     * @param state
     * @return
     */
    public boolean checkContent(Expenseclass expenseclass ,int state);
}
