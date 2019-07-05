package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * medicalrechometemplate
 * @author 
 */
public class MedicalRecHomeTemplate implements Serializable {
    /**
     * 病历首页模板ID
     */
    private Integer id;

    /**
     * 医生id
     */
    private Integer doctorId;

    /**
     * 名称
     */
    private String name;

    /**
     * 主诉
     */
    private String chiefCompliant;

    /**
     * 现病史
     */
    private String currentMedicalHistory;

    /**
     * 现状况
     */
    private String currentTreatmentSituation;

    private String pastMedicalHistory;

    private String allergies;

    private String physicalExamination;

    private String assistantExamination;

    private String attention;

    /**
     * 类别17
     */
    private Integer type;

    /**
     * 状态
     */
    private String status;

    private Date appearDate;

    private Date changeDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChiefCompliant() {
        return chiefCompliant;
    }

    public void setChiefCompliant(String chiefCompliant) {
        this.chiefCompliant = chiefCompliant;
    }

    public String getCurrentMedicalHistory() {
        return currentMedicalHistory;
    }

    public void setCurrentMedicalHistory(String currentMedicalHistory) {
        this.currentMedicalHistory = currentMedicalHistory;
    }

    public String getCurrentTreatmentSituation() {
        return currentTreatmentSituation;
    }

    public void setCurrentTreatmentSituation(String currentTreatmentSituation) {
        this.currentTreatmentSituation = currentTreatmentSituation;
    }

    public String getPastMedicalHistory() {
        return pastMedicalHistory;
    }

    public void setPastMedicalHistory(String pastMedicalHistory) {
        this.pastMedicalHistory = pastMedicalHistory;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination;
    }

    public String getAssistantExamination() {
        return assistantExamination;
    }

    public void setAssistantExamination(String assistantExamination) {
        this.assistantExamination = assistantExamination;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        MedicalRecHomeTemplate other = (MedicalRecHomeTemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getChiefCompliant() == null ? other.getChiefCompliant() == null : this.getChiefCompliant().equals(other.getChiefCompliant()))
            && (this.getCurrentMedicalHistory() == null ? other.getCurrentMedicalHistory() == null : this.getCurrentMedicalHistory().equals(other.getCurrentMedicalHistory()))
            && (this.getCurrentTreatmentSituation() == null ? other.getCurrentTreatmentSituation() == null : this.getCurrentTreatmentSituation().equals(other.getCurrentTreatmentSituation()))
            && (this.getPastMedicalHistory() == null ? other.getPastMedicalHistory() == null : this.getPastMedicalHistory().equals(other.getPastMedicalHistory()))
            && (this.getAllergies() == null ? other.getAllergies() == null : this.getAllergies().equals(other.getAllergies()))
            && (this.getPhysicalExamination() == null ? other.getPhysicalExamination() == null : this.getPhysicalExamination().equals(other.getPhysicalExamination()))
            && (this.getAssistantExamination() == null ? other.getAssistantExamination() == null : this.getAssistantExamination().equals(other.getAssistantExamination()))
            && (this.getAttention() == null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getChiefCompliant() == null) ? 0 : getChiefCompliant().hashCode());
        result = prime * result + ((getCurrentMedicalHistory() == null) ? 0 : getCurrentMedicalHistory().hashCode());
        result = prime * result + ((getCurrentTreatmentSituation() == null) ? 0 : getCurrentTreatmentSituation().hashCode());
        result = prime * result + ((getPastMedicalHistory() == null) ? 0 : getPastMedicalHistory().hashCode());
        result = prime * result + ((getAllergies() == null) ? 0 : getAllergies().hashCode());
        result = prime * result + ((getPhysicalExamination() == null) ? 0 : getPhysicalExamination().hashCode());
        result = prime * result + ((getAssistantExamination() == null) ? 0 : getAssistantExamination().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", name=").append(name);
        sb.append(", chiefCompliant=").append(chiefCompliant);
        sb.append(", currentMedicalHistory=").append(currentMedicalHistory);
        sb.append(", currentTreatmentSituation=").append(currentTreatmentSituation);
        sb.append(", pastMedicalHistory=").append(pastMedicalHistory);
        sb.append(", allergies=").append(allergies);
        sb.append(", physicalExamination=").append(physicalExamination);
        sb.append(", assistantExamination=").append(assistantExamination);
        sb.append(", attention=").append(attention);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}