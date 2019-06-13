package edu.neu.hospital.service;

import edu.neu.hospital.bean.Expenseclass;
import edu.neu.hospital.bean.Expenseclassview;
import edu.neu.hospital.dto.IdDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ExpenseclassService {

    int uploadXls (MultipartFile file) throws IOException;

    void createExcle();

    public void add(Expenseclass expenseclass);

    public void change(Expenseclass expenseclass);

    /**
     * 根据ID删除
     * @param id 非药品项目ID
     */
    public void deleteById(Integer id);

    /**
     * 根据选择的ID删除
     * @param ids
     */
    public void deleteByChoose(IdDTO ids);

    public List<Expenseclassview> find(String code,String name);
}
