package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * diagnosisview
 * @author 
 */
public class DiagnosisView implements Serializable {
    /**
     * 疾病编码
     */
    private String code;

    /**
     * 疾病名字
     */
    private String name;

    private Integer id;

    /**
     * 病历id
     */
    private Integer medicalRecordID;

    /**
     * 疾病id
     */
    private Integer diseaseID;

    private Integer appearUserID;

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

    /**
     * 真名
     */
    private String realName;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Integer getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(Integer diseaseID) {
        this.diseaseID = diseaseID;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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
        DiagnosisView other = (DiagnosisView) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getDiseaseID() == null ? other.getDiseaseID() == null : this.getDiseaseID().equals(other.getDiseaseID()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getSubjectMark() == null ? other.getSubjectMark() == null : this.getSubjectMark().equals(other.getSubjectMark()))
            && (this.getDoubtMark() == null ? other.getDoubtMark() == null : this.getDoubtMark().equals(other.getDoubtMark()))
            && (this.getDefiedMark() == null ? other.getDefiedMark() == null : this.getDefiedMark().equals(other.getDefiedMark()))
            && (this.getDiseaseDate() == null ? other.getDiseaseDate() == null : this.getDiseaseDate().equals(other.getDiseaseDate()))
            && (this.getDiagnosisMark() == null ? other.getDiagnosisMark() == null : this.getDiagnosisMark().equals(other.getDiagnosisMark()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDiseaseID() == null) ? 0 : getDiseaseID().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getSubjectMark() == null) ? 0 : getSubjectMark().hashCode());
        result = prime * result + ((getDoubtMark() == null) ? 0 : getDoubtMark().hashCode());
        result = prime * result + ((getDefiedMark() == null) ? 0 : getDefiedMark().hashCode());
        result = prime * result + ((getDiseaseDate() == null) ? 0 : getDiseaseDate().hashCode());
        result = prime * result + ((getDiagnosisMark() == null) ? 0 : getDiagnosisMark().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", id=").append(id);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", diseaseID=").append(diseaseID);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", subjectMark=").append(subjectMark);
        sb.append(", doubtMark=").append(doubtMark);
        sb.append(", defiedMark=").append(defiedMark);
        sb.append(", diseaseDate=").append(diseaseDate);
        sb.append(", diagnosisMark=").append(diagnosisMark);
        sb.append(", realName=").append(realName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}