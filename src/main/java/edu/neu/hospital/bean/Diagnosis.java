package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * diagnosis
 * @author 
 */
public class Diagnosis implements Serializable {
    private Integer id;

    /**
     * 疾病id
     */
    private Integer diseaseid;

    /**
     * 病历id
     */
    private String medicalresultid;

    /**
     * 主诊标志
     */
    private String subjectmark;

    /**
     * 疑似标志
     */
    private String doubtmark;

    /**
     * 确诊
     */
    private String defiedmark;

    /**
     * 发病日期
     */
    private Date diseasedate;

    private Integer appearuserid;

    private Integer changeuserid;

    private Date appeardate;

    private Date changedate;

    private String status;

    private String reserve1;

    private String reserve2;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiseaseid() {
        return diseaseid;
    }

    public void setDiseaseid(Integer diseaseid) {
        this.diseaseid = diseaseid;
    }

    public String getMedicalresultid() {
        return medicalresultid;
    }

    public void setMedicalresultid(String medicalresultid) {
        this.medicalresultid = medicalresultid;
    }

    public String getSubjectmark() {
        return subjectmark;
    }

    public void setSubjectmark(String subjectmark) {
        this.subjectmark = subjectmark;
    }

    public String getDoubtmark() {
        return doubtmark;
    }

    public void setDoubtmark(String doubtmark) {
        this.doubtmark = doubtmark;
    }

    public String getDefiedmark() {
        return defiedmark;
    }

    public void setDefiedmark(String defiedmark) {
        this.defiedmark = defiedmark;
    }

    public Date getDiseasedate() {
        return diseasedate;
    }

    public void setDiseasedate(Date diseasedate) {
        this.diseasedate = diseasedate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        Diagnosis other = (Diagnosis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiseaseid() == null ? other.getDiseaseid() == null : this.getDiseaseid().equals(other.getDiseaseid()))
            && (this.getMedicalresultid() == null ? other.getMedicalresultid() == null : this.getMedicalresultid().equals(other.getMedicalresultid()))
            && (this.getSubjectmark() == null ? other.getSubjectmark() == null : this.getSubjectmark().equals(other.getSubjectmark()))
            && (this.getDoubtmark() == null ? other.getDoubtmark() == null : this.getDoubtmark().equals(other.getDoubtmark()))
            && (this.getDefiedmark() == null ? other.getDefiedmark() == null : this.getDefiedmark().equals(other.getDefiedmark()))
            && (this.getDiseasedate() == null ? other.getDiseasedate() == null : this.getDiseasedate().equals(other.getDiseasedate()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiseaseid() == null) ? 0 : getDiseaseid().hashCode());
        result = prime * result + ((getMedicalresultid() == null) ? 0 : getMedicalresultid().hashCode());
        result = prime * result + ((getSubjectmark() == null) ? 0 : getSubjectmark().hashCode());
        result = prime * result + ((getDoubtmark() == null) ? 0 : getDoubtmark().hashCode());
        result = prime * result + ((getDefiedmark() == null) ? 0 : getDefiedmark().hashCode());
        result = prime * result + ((getDiseasedate() == null) ? 0 : getDiseasedate().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diseaseid=").append(diseaseid);
        sb.append(", medicalresultid=").append(medicalresultid);
        sb.append(", subjectmark=").append(subjectmark);
        sb.append(", doubtmark=").append(doubtmark);
        sb.append(", defiedmark=").append(defiedmark);
        sb.append(", diseasedate=").append(diseasedate);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", changedate=").append(changedate);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}