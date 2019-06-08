package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * medicalrecord
 * @author 
 */
public class Medicalrecord implements Serializable {
    /**
     * 病例ID
     */
    private Integer id;

    /**
     * 病历号
     */
    private String medicalrecordno;

    /**
     * 患者ID
     */
    private Integer patientid;

    /**
     * 诊断状态
     */
    private String diagnosisstatus;

    private String status;

    private Integer appearuserid;

    private Integer changeuserid;

    private Date appeardate;

    private Date changedate;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicalrecordno() {
        return medicalrecordno;
    }

    public void setMedicalrecordno(String medicalrecordno) {
        this.medicalrecordno = medicalrecordno;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getDiagnosisstatus() {
        return diagnosisstatus;
    }

    public void setDiagnosisstatus(String diagnosisstatus) {
        this.diagnosisstatus = diagnosisstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(Integer appearuserid) {
        this.appearuserid = appearuserid;
    }

    public Integer getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(Integer changeuserid) {
        this.changeuserid = changeuserid;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
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
        Medicalrecord other = (Medicalrecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalrecordno() == null ? other.getMedicalrecordno() == null : this.getMedicalrecordno().equals(other.getMedicalrecordno()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getDiagnosisstatus() == null ? other.getDiagnosisstatus() == null : this.getDiagnosisstatus().equals(other.getDiagnosisstatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalrecordno() == null) ? 0 : getMedicalrecordno().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getDiagnosisstatus() == null) ? 0 : getDiagnosisstatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medicalrecordno=").append(medicalrecordno);
        sb.append(", patientid=").append(patientid);
        sb.append(", diagnosisstatus=").append(diagnosisstatus);
        sb.append(", status=").append(status);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", changedate=").append(changedate);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}