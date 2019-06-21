package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * diagnosis
 *
 * @author
 */
public class Diagnosis implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 疾病id
     */
    private Integer diseaseID;
    /**
     * 病历id
     */
    private Integer medicalRecordID;
    /**
     * 主诊标志为1
     */
    private String subjectMark;
    /**
     * 疑似标志为1
     */
    private String doubtMark;
    /**
     * 确诊为1，
     */
    private String defiedMark;
    /**
     * 发病日期
     */
    private Date diseaseDate;
    /**
     * 中医西医标志 类别：16  具体：176 中医诊断 ，177西医诊断
     */
    private Integer diagnosisMark;
    private Integer appearUserID;
    private Integer changeUserID;
    private Date appearDate;
    private Date changeDate;
    private String status;
    private String reserve2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(Integer diseaseID) {
        this.diseaseID = diseaseID;
    }

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public String getSubjectMark() {
        return subjectMark;
    }

    public void setSubjectMark(String subjectMark) {
        this.subjectMark = subjectMark;
    }

    public String getDoubtMark() {
        return doubtMark;
    }

    public void setDoubtMark(String doubtMark) {
        this.doubtMark = doubtMark;
    }

    public String getDefiedMark() {
        return defiedMark;
    }

    public void setDefiedMark(String defiedMark) {
        this.defiedMark = defiedMark;
    }

    public Date getDiseaseDate() {
        return diseaseDate;
    }

    public void setDiseaseDate(Date diseaseDate) {
        this.diseaseDate = diseaseDate;
    }

    public Integer getDiagnosisMark() {
        return diagnosisMark;
    }

    public void setDiagnosisMark(Integer diagnosisMark) {
        this.diagnosisMark = diagnosisMark;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
                && (this.getDiseaseID() == null ? other.getDiseaseID() == null : this.getDiseaseID().equals(other.getDiseaseID()))
                && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
                && (this.getSubjectMark() == null ? other.getSubjectMark() == null : this.getSubjectMark().equals(other.getSubjectMark()))
                && (this.getDoubtMark() == null ? other.getDoubtMark() == null : this.getDoubtMark().equals(other.getDoubtMark()))
                && (this.getDefiedMark() == null ? other.getDefiedMark() == null : this.getDefiedMark().equals(other.getDefiedMark()))
                && (this.getDiseaseDate() == null ? other.getDiseaseDate() == null : this.getDiseaseDate().equals(other.getDiseaseDate()))
                && (this.getDiagnosisMark() == null ? other.getDiagnosisMark() == null : this.getDiagnosisMark().equals(other.getDiagnosisMark()))
                && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiseaseID() == null) ? 0 : getDiseaseID().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getSubjectMark() == null) ? 0 : getSubjectMark().hashCode());
        result = prime * result + ((getDoubtMark() == null) ? 0 : getDoubtMark().hashCode());
        result = prime * result + ((getDefiedMark() == null) ? 0 : getDefiedMark().hashCode());
        result = prime * result + ((getDiseaseDate() == null) ? 0 : getDiseaseDate().hashCode());
        result = prime * result + ((getDiagnosisMark() == null) ? 0 : getDiagnosisMark().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", diseaseID=").append(diseaseID);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", subjectMark=").append(subjectMark);
        sb.append(", doubtMark=").append(doubtMark);
        sb.append(", defiedMark=").append(defiedMark);
        sb.append(", diseaseDate=").append(diseaseDate);
        sb.append(", diagnosisMark=").append(diagnosisMark);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", status=").append(status);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}