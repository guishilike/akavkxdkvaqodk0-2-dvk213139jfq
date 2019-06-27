package edu.neu.hospital.bean.inspectionBean;

import java.io.Serializable;
import java.util.Date;

/**
 * inspectreview
 * @author 
 */
public class InspectReView implements Serializable {
    private Integer inspectionId;

    private Integer inspectionAppearUserID;

    /**
     * 病例ID
     */
    private Integer medicalrecordId;

    private Integer inspectiondetailsId;

    /**
     * 患者ID
     */
    private Integer patientId;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 身份证号
     */
    private String patientIdentityCardNo;

    /**
     * 年龄
     */
    private Integer patientAge;

    /**
     * 性别
     */
    private String patientGender;

    /**
     * 出生日期
     */
    private Date patientBirthday;

    /**
     * 家庭住址
     */
    private String patientFamilyAddress;

    /**
     * ID
     */
    private Integer fmeditemId;

    /**
     * 项目名称
     */
    private String fmeditemName;

    /**
     * 项目编码
     */
    private String fmeditemCode;

    /**
     * 规格
     */
    private String fmeditemFormat;

    private Integer medicalrechomeId;

    private String cheifComplaint;

    private String currentMedicalHistory;

    /**
     * 病史
     */
    private String pastMedicalHistory;

    private String allergies;

    private String drawnName;

    private String paidName;

    private String checkedName;

    private String registeredName;

    private String abolishedName;

    private String executedName;

    private Date appearDate;

    /**
     * 是否开立
     */
    private Integer isDrawn;

    /**
     * 是否缴费
     */
    private Integer isPaid;

    /**
     * 是否核对
     */
    private Integer isChecked;

    /**
     * 是否登记
     */
    private Integer isRegistered;

    /**
     * 是否作废
     */
    private Integer isAbolished;

    /**
     * 是否执行
     */
    private Integer isExecuted;

    /**
     * 真名
     */
    private String realName;

    /**
     * 数目
     */
    private Integer number;

    private String currentTreatmentSituation;

    private String physicalExamination;

    private String initialDiagnosis;

    /**
     * 检查建议
     */
    private String inspectRecommend;

    /**
     * 注意事项
     */
    private String attention;

    private static final long serialVersionUID = 1L;

    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Integer getInspectionAppearUserID() {
        return inspectionAppearUserID;
    }

    public void setInspectionAppearUserID(Integer inspectionAppearUserID) {
        this.inspectionAppearUserID = inspectionAppearUserID;
    }

    public Integer getMedicalrecordId() {
        return medicalrecordId;
    }

    public void setMedicalrecordId(Integer medicalrecordId) {
        this.medicalrecordId = medicalrecordId;
    }

    public Integer getInspectiondetailsId() {
        return inspectiondetailsId;
    }

    public void setInspectiondetailsId(Integer inspectiondetailsId) {
        this.inspectiondetailsId = inspectiondetailsId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientIdentityCardNo() {
        return patientIdentityCardNo;
    }

    public void setPatientIdentityCardNo(String patientIdentityCardNo) {
        this.patientIdentityCardNo = patientIdentityCardNo;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public Date getPatientBirthday() {
        return patientBirthday;
    }

    public void setPatientBirthday(Date patientBirthday) {
        this.patientBirthday = patientBirthday;
    }

    public String getPatientFamilyAddress() {
        return patientFamilyAddress;
    }

    public void setPatientFamilyAddress(String patientFamilyAddress) {
        this.patientFamilyAddress = patientFamilyAddress;
    }

    public Integer getFmeditemId() {
        return fmeditemId;
    }

    public void setFmeditemId(Integer fmeditemId) {
        this.fmeditemId = fmeditemId;
    }

    public String getFmeditemName() {
        return fmeditemName;
    }

    public void setFmeditemName(String fmeditemName) {
        this.fmeditemName = fmeditemName;
    }

    public String getFmeditemCode() {
        return fmeditemCode;
    }

    public void setFmeditemCode(String fmeditemCode) {
        this.fmeditemCode = fmeditemCode;
    }

    public String getFmeditemFormat() {
        return fmeditemFormat;
    }

    public void setFmeditemFormat(String fmeditemFormat) {
        this.fmeditemFormat = fmeditemFormat;
    }

    public Integer getMedicalrechomeId() {
        return medicalrechomeId;
    }

    public void setMedicalrechomeId(Integer medicalrechomeId) {
        this.medicalrechomeId = medicalrechomeId;
    }

    public String getCheifComplaint() {
        return cheifComplaint;
    }

    public void setCheifComplaint(String cheifComplaint) {
        this.cheifComplaint = cheifComplaint;
    }

    public String getCurrentMedicalHistory() {
        return currentMedicalHistory;
    }

    public void setCurrentMedicalHistory(String currentMedicalHistory) {
        this.currentMedicalHistory = currentMedicalHistory;
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

    public String getDrawnName() {
        return drawnName;
    }

    public void setDrawnName(String drawnName) {
        this.drawnName = drawnName;
    }

    public String getPaidName() {
        return paidName;
    }

    public void setPaidName(String paidName) {
        this.paidName = paidName;
    }

    public String getCheckedName() {
        return checkedName;
    }

    public void setCheckedName(String checkedName) {
        this.checkedName = checkedName;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getAbolishedName() {
        return abolishedName;
    }

    public void setAbolishedName(String abolishedName) {
        this.abolishedName = abolishedName;
    }

    public String getExecutedName() {
        return executedName;
    }

    public void setExecutedName(String executedName) {
        this.executedName = executedName;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getIsDrawn() {
        return isDrawn;
    }

    public void setIsDrawn(Integer isDrawn) {
        this.isDrawn = isDrawn;
    }

    public Integer getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Integer isPaid) {
        this.isPaid = isPaid;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    public Integer getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Integer isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Integer getIsAbolished() {
        return isAbolished;
    }

    public void setIsAbolished(Integer isAbolished) {
        this.isAbolished = isAbolished;
    }

    public Integer getIsExecuted() {
        return isExecuted;
    }

    public void setIsExecuted(Integer isExecuted) {
        this.isExecuted = isExecuted;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCurrentTreatmentSituation() {
        return currentTreatmentSituation;
    }

    public void setCurrentTreatmentSituation(String currentTreatmentSituation) {
        this.currentTreatmentSituation = currentTreatmentSituation;
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination;
    }

    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }

    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis;
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
        InspectReView other = (InspectReView) that;
        return (this.getInspectionId() == null ? other.getInspectionId() == null : this.getInspectionId().equals(other.getInspectionId()))
            && (this.getInspectionAppearUserID() == null ? other.getInspectionAppearUserID() == null : this.getInspectionAppearUserID().equals(other.getInspectionAppearUserID()))
            && (this.getMedicalrecordId() == null ? other.getMedicalrecordId() == null : this.getMedicalrecordId().equals(other.getMedicalrecordId()))
            && (this.getInspectiondetailsId() == null ? other.getInspectiondetailsId() == null : this.getInspectiondetailsId().equals(other.getInspectiondetailsId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientIdentityCardNo() == null ? other.getPatientIdentityCardNo() == null : this.getPatientIdentityCardNo().equals(other.getPatientIdentityCardNo()))
            && (this.getPatientAge() == null ? other.getPatientAge() == null : this.getPatientAge().equals(other.getPatientAge()))
            && (this.getPatientGender() == null ? other.getPatientGender() == null : this.getPatientGender().equals(other.getPatientGender()))
            && (this.getPatientBirthday() == null ? other.getPatientBirthday() == null : this.getPatientBirthday().equals(other.getPatientBirthday()))
            && (this.getPatientFamilyAddress() == null ? other.getPatientFamilyAddress() == null : this.getPatientFamilyAddress().equals(other.getPatientFamilyAddress()))
            && (this.getFmeditemId() == null ? other.getFmeditemId() == null : this.getFmeditemId().equals(other.getFmeditemId()))
            && (this.getFmeditemName() == null ? other.getFmeditemName() == null : this.getFmeditemName().equals(other.getFmeditemName()))
            && (this.getFmeditemCode() == null ? other.getFmeditemCode() == null : this.getFmeditemCode().equals(other.getFmeditemCode()))
            && (this.getFmeditemFormat() == null ? other.getFmeditemFormat() == null : this.getFmeditemFormat().equals(other.getFmeditemFormat()))
            && (this.getMedicalrechomeId() == null ? other.getMedicalrechomeId() == null : this.getMedicalrechomeId().equals(other.getMedicalrechomeId()))
            && (this.getCheifComplaint() == null ? other.getCheifComplaint() == null : this.getCheifComplaint().equals(other.getCheifComplaint()))
            && (this.getCurrentMedicalHistory() == null ? other.getCurrentMedicalHistory() == null : this.getCurrentMedicalHistory().equals(other.getCurrentMedicalHistory()))
            && (this.getPastMedicalHistory() == null ? other.getPastMedicalHistory() == null : this.getPastMedicalHistory().equals(other.getPastMedicalHistory()))
            && (this.getAllergies() == null ? other.getAllergies() == null : this.getAllergies().equals(other.getAllergies()))
            && (this.getDrawnName() == null ? other.getDrawnName() == null : this.getDrawnName().equals(other.getDrawnName()))
            && (this.getPaidName() == null ? other.getPaidName() == null : this.getPaidName().equals(other.getPaidName()))
            && (this.getCheckedName() == null ? other.getCheckedName() == null : this.getCheckedName().equals(other.getCheckedName()))
            && (this.getRegisteredName() == null ? other.getRegisteredName() == null : this.getRegisteredName().equals(other.getRegisteredName()))
            && (this.getAbolishedName() == null ? other.getAbolishedName() == null : this.getAbolishedName().equals(other.getAbolishedName()))
            && (this.getExecutedName() == null ? other.getExecutedName() == null : this.getExecutedName().equals(other.getExecutedName()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsChecked() == null ? other.getIsChecked() == null : this.getIsChecked().equals(other.getIsChecked()))
            && (this.getIsRegistered() == null ? other.getIsRegistered() == null : this.getIsRegistered().equals(other.getIsRegistered()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getIsExecuted() == null ? other.getIsExecuted() == null : this.getIsExecuted().equals(other.getIsExecuted()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCurrentTreatmentSituation() == null ? other.getCurrentTreatmentSituation() == null : this.getCurrentTreatmentSituation().equals(other.getCurrentTreatmentSituation()))
            && (this.getPhysicalExamination() == null ? other.getPhysicalExamination() == null : this.getPhysicalExamination().equals(other.getPhysicalExamination()))
            && (this.getInitialDiagnosis() == null ? other.getInitialDiagnosis() == null : this.getInitialDiagnosis().equals(other.getInitialDiagnosis()))
            && (this.getInspectRecommend() == null ? other.getInspectRecommend() == null : this.getInspectRecommend().equals(other.getInspectRecommend()))
            && (this.getAttention() == null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInspectionId() == null) ? 0 : getInspectionId().hashCode());
        result = prime * result + ((getInspectionAppearUserID() == null) ? 0 : getInspectionAppearUserID().hashCode());
        result = prime * result + ((getMedicalrecordId() == null) ? 0 : getMedicalrecordId().hashCode());
        result = prime * result + ((getInspectiondetailsId() == null) ? 0 : getInspectiondetailsId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientIdentityCardNo() == null) ? 0 : getPatientIdentityCardNo().hashCode());
        result = prime * result + ((getPatientAge() == null) ? 0 : getPatientAge().hashCode());
        result = prime * result + ((getPatientGender() == null) ? 0 : getPatientGender().hashCode());
        result = prime * result + ((getPatientBirthday() == null) ? 0 : getPatientBirthday().hashCode());
        result = prime * result + ((getPatientFamilyAddress() == null) ? 0 : getPatientFamilyAddress().hashCode());
        result = prime * result + ((getFmeditemId() == null) ? 0 : getFmeditemId().hashCode());
        result = prime * result + ((getFmeditemName() == null) ? 0 : getFmeditemName().hashCode());
        result = prime * result + ((getFmeditemCode() == null) ? 0 : getFmeditemCode().hashCode());
        result = prime * result + ((getFmeditemFormat() == null) ? 0 : getFmeditemFormat().hashCode());
        result = prime * result + ((getMedicalrechomeId() == null) ? 0 : getMedicalrechomeId().hashCode());
        result = prime * result + ((getCheifComplaint() == null) ? 0 : getCheifComplaint().hashCode());
        result = prime * result + ((getCurrentMedicalHistory() == null) ? 0 : getCurrentMedicalHistory().hashCode());
        result = prime * result + ((getPastMedicalHistory() == null) ? 0 : getPastMedicalHistory().hashCode());
        result = prime * result + ((getAllergies() == null) ? 0 : getAllergies().hashCode());
        result = prime * result + ((getDrawnName() == null) ? 0 : getDrawnName().hashCode());
        result = prime * result + ((getPaidName() == null) ? 0 : getPaidName().hashCode());
        result = prime * result + ((getCheckedName() == null) ? 0 : getCheckedName().hashCode());
        result = prime * result + ((getRegisteredName() == null) ? 0 : getRegisteredName().hashCode());
        result = prime * result + ((getAbolishedName() == null) ? 0 : getAbolishedName().hashCode());
        result = prime * result + ((getExecutedName() == null) ? 0 : getExecutedName().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsChecked() == null) ? 0 : getIsChecked().hashCode());
        result = prime * result + ((getIsRegistered() == null) ? 0 : getIsRegistered().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getIsExecuted() == null) ? 0 : getIsExecuted().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCurrentTreatmentSituation() == null) ? 0 : getCurrentTreatmentSituation().hashCode());
        result = prime * result + ((getPhysicalExamination() == null) ? 0 : getPhysicalExamination().hashCode());
        result = prime * result + ((getInitialDiagnosis() == null) ? 0 : getInitialDiagnosis().hashCode());
        result = prime * result + ((getInspectRecommend() == null) ? 0 : getInspectRecommend().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inspectionId=").append(inspectionId);
        sb.append(", inspectionAppearUserID=").append(inspectionAppearUserID);
        sb.append(", medicalrecordId=").append(medicalrecordId);
        sb.append(", inspectiondetailsId=").append(inspectiondetailsId);
        sb.append(", patientId=").append(patientId);
        sb.append(", patientName=").append(patientName);
        sb.append(", patientIdentityCardNo=").append(patientIdentityCardNo);
        sb.append(", patientAge=").append(patientAge);
        sb.append(", patientGender=").append(patientGender);
        sb.append(", patientBirthday=").append(patientBirthday);
        sb.append(", patientFamilyAddress=").append(patientFamilyAddress);
        sb.append(", fmeditemId=").append(fmeditemId);
        sb.append(", fmeditemName=").append(fmeditemName);
        sb.append(", fmeditemCode=").append(fmeditemCode);
        sb.append(", fmeditemFormat=").append(fmeditemFormat);
        sb.append(", medicalrechomeId=").append(medicalrechomeId);
        sb.append(", cheifComplaint=").append(cheifComplaint);
        sb.append(", currentMedicalHistory=").append(currentMedicalHistory);
        sb.append(", pastMedicalHistory=").append(pastMedicalHistory);
        sb.append(", allergies=").append(allergies);
        sb.append(", drawnName=").append(drawnName);
        sb.append(", paidName=").append(paidName);
        sb.append(", checkedName=").append(checkedName);
        sb.append(", registeredName=").append(registeredName);
        sb.append(", abolishedName=").append(abolishedName);
        sb.append(", executedName=").append(executedName);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", isRegistered=").append(isRegistered);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", isExecuted=").append(isExecuted);
        sb.append(", realName=").append(realName);
        sb.append(", number=").append(number);
        sb.append(", currentTreatmentSituation=").append(currentTreatmentSituation);
        sb.append(", physicalExamination=").append(physicalExamination);
        sb.append(", initialDiagnosis=").append(initialDiagnosis);
        sb.append(", inspectRecommend=").append(inspectRecommend);
        sb.append(", attention=").append(attention);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}