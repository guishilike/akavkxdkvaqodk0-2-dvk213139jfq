package edu.neu.hospital.service;

import edu.neu.hospital.bean.Checkwork;

import java.util.Date;
import java.util.List;

public interface CheckworkService {
    List<Checkwork> findByInfo(String realName, String departmentName, Date dateStart, Date dateEnd);
}
