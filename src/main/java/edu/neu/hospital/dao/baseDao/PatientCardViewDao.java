package edu.neu.hospital.dao.baseDao;

import edu.neu.hospital.bean.baseBean.PatientCardView;
import edu.neu.hospital.example.baseExample.PatientCardViewExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientCardViewDao {
    long countByExample(PatientCardViewExample example);

    int deleteByExample(PatientCardViewExample example);

    int insert(PatientCardView record);

    int insertSelective(PatientCardView record);

    List<PatientCardView> selectByExample(PatientCardViewExample example);

    int updateByExampleSelective(@Param("record") PatientCardView record, @Param("example") PatientCardViewExample example);

    int updateByExample(@Param("record") PatientCardView record, @Param("example") PatientCardViewExample example);

    @Select("select * from patientcardview where id = #{id}")
    PatientCardView selectByID(Integer id);
}