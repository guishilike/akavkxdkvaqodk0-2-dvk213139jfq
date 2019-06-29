package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * medicalrechome
 * @author 
 */
public class MedicalRecHome implements Serializable {
    private Integer id;

    private Integer medicalRecId;

    private Integer doctorId;

    private String chiefComplaint;

    private String currentMedicalHistory;

    private String currentTreatmentSituation;

    /**
     * 病史
     */
    private String pastMedicalHistory;

    private String allergies;

    private String physicalExamination;

    private String assistantExamination;

    private String initialDiagnosis;

    private String initialDiagnosisType;

    /**
     * 检查建议
     */
    private String inspectRecommend;

    /**
     * 注意事项
     */
    private String attention;

    /**
     * 状态
     */
    private String status;

    /**
     * 生成时间
     */
    private Date appearDate;

    /**
     * 修改时间
     */
    private Date changeDate;

    /**
     * 保留3
     */
    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalRecId() {
        return medicalRecId;
    }

    public void setMedicalRecId(Integer medicalRecId) {
        this.medicalRecId = medicalRecId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
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

    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }

    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis;
    }

    public String getInitialDiagnosisType() {
        return initialDiagnosisType;
    }

    public void setInitialDiagnosisType(String initialDiagnosisType) {
        this.initialDiagnosisType = initialDiagnosisType;
    }

    public String getInspectRecommend() {
        return inspectRecommend;
    }

    public void setInspectRecommend(String inspectRecommend) {
        this.inspectRecommend = inspectRecommend;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
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
        MedicalRecHome other = (MedicalRecHome) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecId() == null ? other.getMedicalRecId() == null : this.getMedicalRecId().equals(other.getMedicalRecId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getChiefComplaint() == null ? other.getChiefComplaint() == null : this.getChiefComplaint().equals(other.getChiefComplaint()))
            && (this.getCurrentMedicalHistory() == null ? other.getCurrentMedicalHistory() == null : this.getCurrentMedicalHistory().equals(other.getCurrentMedicalHistory()))
            && (this.getCurrentTreatmentSituation() == null ? other.getCurrentTreatmentSituation() == null : this.getCurrentTreatmentSituation().equals(other.getCurrentTreatmentSituation()))
            && (this.getPastMedicalHistory() == null ? other.getPastMedicalHistory() == null : this.getPastMedicalHistory().equals(other.getPastMedicalHistory()))
            && (this.getAllergies() == null ? other.getAllergies() == null : this.getAllergies().equals(other.getAllergies()))
            && (this.getPhysicalExamination() == null ? other.getPhysicalExamination() == null : this.getPhysicalExamination().equals(other.getPhysicalExamination()))
            && (this.getAssistantExamination() == null ? other.getAssistantExamination() == null : this.getAssistantExamination().equals(other.getAssistantExamination()))
            && (this.getInitialDiagnosis() == null ? other.getInitialDiagnosis() == null : this.getInitialDiagnosis().equals(other.getInitialDiagnosis()))
            && (this.getInitialDiagnosisType() == null ? other.getInitialDiagnosisType() == null : this.getInitialDiagnosisType().equals(other.getInitialDiagnosisType()))
            && (this.getInspectRecommend() == null ? other.getInspectRecommend() == null : this.getInspectRecommend().equals(other.getInspectRecommend()))
            && (this.getAttention() == null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecId() == null) ? 0 : getMedicalRecId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getChiefComplaint() == null) ? 0 : getChiefComplaint().hashCode());
        result = prime * result + ((getCurrentMedicalHistory() == null) ? 0 : getCurrentMedicalHistory().hashCode());
        result = prime * result + ((getCurrentTreatmentSituation() == null) ? 0 : getCurrentTreatmentSituation().hashCode());
        result = prime * result + ((getPastMedicalHistory() == null) ? 0 : getPastMedicalHistory().hashCode());
        result = prime * result + ((getAllergies() == null) ? 0 : getAllergies().hashCode());
        result = prime * result + ((getPhysicalExamination() == null) ? 0 : getPhysicalExamination().hashCode());
        result = prime * result + ((getAssistantExamination() == null) ? 0 : getAssistantExamination().hashCode());
        result = prime * result + ((getInitialDiagnosis() == null) ? 0 : getInitialDiagnosis().hashCode());
        result = prime * result + ((getInitialDiagnosisType() == null) ? 0 : getInitialDiagnosisType().hashCode());
        result = prime * result + ((getInspectRecommend() == null) ? 0 : getInspectRecommend().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
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
        sb.append(", medicalRecId=").append(medicalRecId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", chiefComplaint=").append(chiefComplaint);
        sb.append(", currentMedicalHistory=").append(currentMedicalHistory);
        sb.append(", currentTreatmentSituation=").append(currentTreatmentSituation);
        sb.append(", pastMedicalHistory=").append(pastMedicalHistory);
        sb.append(", allergies=").append(allergies);
        sb.append(", physicalExamination=").append(physicalExamination);
        sb.append(", assistantExamination=").append(assistantExamination);
        sb.append(", initialDiagnosis=").append(initialDiagnosis);
        sb.append(", initialDiagnosisType=").append(initialDiagnosisType);
        sb.append(", inspectRecommend=").append(inspectRecommend);
        sb.append(", attention=").append(attention);
        sb.append(", status=").append(status);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}