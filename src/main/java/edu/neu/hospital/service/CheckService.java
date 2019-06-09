package edu.neu.hospital.service;

import edu.neu.hospital.bean.Check;

import java.util.Date;
import java.util.List;

public interface CheckService {
    List<Check> findByInfo(String userName, String departmentName, Date dateStart, Date dateEnd);

}
