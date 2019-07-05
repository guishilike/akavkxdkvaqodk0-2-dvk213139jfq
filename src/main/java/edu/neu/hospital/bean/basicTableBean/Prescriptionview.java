package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;

/**
 * prescriptionview
 * @author 
 */
public class Prescriptionview implements Serializable {
    /**
     * 处方编号
     */
    private Integer id;

    /**
     * 病历号
     */
    private Integer medicalRecordID;

    /**
     * 医生编号
     */
    private Integer doctorID;

    private Integer mark;

    /**
     * 病历号
     */
    private String medicalRecordNo;

    /**
     * 登录名
     */
    private String doctorName;

    /**
     * 真名
     */
    private String doctorRealName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(String medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorRealName() {
        return doctorRealName;
    }

    public void setDoctorRealName(String doctorRealName) {
        this.doctorRealName = doctorRealName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Prescriptionview other = (Prescriptionview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()))
            && (this.getMedicalRecordNo() == null ? other.getMedicalRecordNo() == null : this.getMedicalRecordNo().equals(other.getMedicalRecordNo()))
            && (this.getDoctorName() == null ? other.getDoctorName() == null : this.getDoctorName().equals(other.getDoctorName()))
            && (this.getDoctorRealName() == null ? other.getDoctorRealName() == null : this.getDoctorRealName().equals(other.getDoctorRealName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        result = prime * result + ((getMedicalRecordNo() == null) ? 0 : getMedicalRecordNo().hashCode());
        result = prime * result + ((getDoctorName() == null) ? 0 : getDoctorName().hashCode());
        result = prime * result + ((getDoctorRealName() == null) ? 0 : getDoctorRealName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", mark=").append(mark);
        sb.append(", medicalRecordNo=").append(medicalRecordNo);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", doctorRealName=").append(doctorRealName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}