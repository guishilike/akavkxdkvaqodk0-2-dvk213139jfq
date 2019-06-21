package edu.neu.hospital.bean.inspectionBean;

import java.io.Serializable;
import java.util.Date;

/**
 * inspectformview
 * @author 
 */
public class InspectFormView implements Serializable {
    private Integer inspectionId;

    private Date inspectionAppearDate;

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

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 拼音助记码
     */
    private String fmeditemMnemonicCode;

    private String drawmName;

    /**
     * 病例ID
     */
    private Integer medicalrecordId;

    /**
     * ID
     */
    private Integer fmeditemId;

    /**
     * 患者ID
     */
    private Integer patientId;

    private Integer inspectionDetailsID;

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

    private String paidName;

    private String checkedName;

    private String registeredName;

    private String abolishedName;

    private String executedName;

    private Integer appearUserID;

    /**
     * 真名
     */
    private String realName;

    private static final long serialVersionUID = 1L;

    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Date getInspectionAppearDate() {
        return inspectionAppearDate;
    }

    public void setInspectionAppearDate(Date inspectionAppearDate) {
        this.inspectionAppearDate = inspectionAppearDate;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getFmeditemMnemonicCode() {
        return fmeditemMnemonicCode;
    }

    public void setFmeditemMnemonicCode(String fmeditemMnemonicCode) {
        this.fmeditemMnemonicCode = fmeditemMnemonicCode;
    }

    public String getDrawmName() {
        return drawmName;
    }

    public void setDrawmName(String drawmName) {
        this.drawmName = drawmName;
    }

    public Integer getMedicalrecordId() {
        return medicalrecordId;
    }

    public void setMedicalrecordId(Integer medicalrecordId) {
        this.medicalrecordId = medicalrecordId;
    }

    public Integer getFmeditemId() {
        return fmeditemId;
    }

    public void setFmeditemId(Integer fmeditemId) {
        this.fmeditemId = fmeditemId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getInspectionDetailsID() {
        return inspectionDetailsID;
    }

    public void setInspectionDetailsID(Integer inspectionDetailsID) {
        this.inspectionDetailsID = inspectionDetailsID;
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

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
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
        InspectFormView other = (InspectFormView) that;
        return (this.getInspectionId() == null ? other.getInspectionId() == null : this.getInspectionId().equals(other.getInspectionId()))
            && (this.getInspectionAppearDate() == null ? other.getInspectionAppearDate() == null : this.getInspectionAppearDate().equals(other.getInspectionAppearDate()))
            && (this.getFmeditemName() == null ? other.getFmeditemName() == null : this.getFmeditemName().equals(other.getFmeditemName()))
            && (this.getFmeditemCode() == null ? other.getFmeditemCode() == null : this.getFmeditemCode().equals(other.getFmeditemCode()))
            && (this.getFmeditemFormat() == null ? other.getFmeditemFormat() == null : this.getFmeditemFormat().equals(other.getFmeditemFormat()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getFmeditemMnemonicCode() == null ? other.getFmeditemMnemonicCode() == null : this.getFmeditemMnemonicCode().equals(other.getFmeditemMnemonicCode()))
            && (this.getDrawmName() == null ? other.getDrawmName() == null : this.getDrawmName().equals(other.getDrawmName()))
            && (this.getMedicalrecordId() == null ? other.getMedicalrecordId() == null : this.getMedicalrecordId().equals(other.getMedicalrecordId()))
            && (this.getFmeditemId() == null ? other.getFmeditemId() == null : this.getFmeditemId().equals(other.getFmeditemId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getInspectionDetailsID() == null ? other.getInspectionDetailsID() == null : this.getInspectionDetailsID().equals(other.getInspectionDetailsID()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsChecked() == null ? other.getIsChecked() == null : this.getIsChecked().equals(other.getIsChecked()))
            && (this.getIsRegistered() == null ? other.getIsRegistered() == null : this.getIsRegistered().equals(other.getIsRegistered()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getIsExecuted() == null ? other.getIsExecuted() == null : this.getIsExecuted().equals(other.getIsExecuted()))
            && (this.getPaidName() == null ? other.getPaidName() == null : this.getPaidName().equals(other.getPaidName()))
            && (this.getCheckedName() == null ? other.getCheckedName() == null : this.getCheckedName().equals(other.getCheckedName()))
            && (this.getRegisteredName() == null ? other.getRegisteredName() == null : this.getRegisteredName().equals(other.getRegisteredName()))
            && (this.getAbolishedName() == null ? other.getAbolishedName() == null : this.getAbolishedName().equals(other.getAbolishedName()))
            && (this.getExecutedName() == null ? other.getExecutedName() == null : this.getExecutedName().equals(other.getExecutedName()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInspectionId() == null) ? 0 : getInspectionId().hashCode());
        result = prime * result + ((getInspectionAppearDate() == null) ? 0 : getInspectionAppearDate().hashCode());
        result = prime * result + ((getFmeditemName() == null) ? 0 : getFmeditemName().hashCode());
        result = prime * result + ((getFmeditemCode() == null) ? 0 : getFmeditemCode().hashCode());
        result = prime * result + ((getFmeditemFormat() == null) ? 0 : getFmeditemFormat().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getFmeditemMnemonicCode() == null) ? 0 : getFmeditemMnemonicCode().hashCode());
        result = prime * result + ((getDrawmName() == null) ? 0 : getDrawmName().hashCode());
        result = prime * result + ((getMedicalrecordId() == null) ? 0 : getMedicalrecordId().hashCode());
        result = prime * result + ((getFmeditemId() == null) ? 0 : getFmeditemId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getInspectionDetailsID() == null) ? 0 : getInspectionDetailsID().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsChecked() == null) ? 0 : getIsChecked().hashCode());
        result = prime * result + ((getIsRegistered() == null) ? 0 : getIsRegistered().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getIsExecuted() == null) ? 0 : getIsExecuted().hashCode());
        result = prime * result + ((getPaidName() == null) ? 0 : getPaidName().hashCode());
        result = prime * result + ((getCheckedName() == null) ? 0 : getCheckedName().hashCode());
        result = prime * result + ((getRegisteredName() == null) ? 0 : getRegisteredName().hashCode());
        result = prime * result + ((getAbolishedName() == null) ? 0 : getAbolishedName().hashCode());
        result = prime * result + ((getExecutedName() == null) ? 0 : getExecutedName().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inspectionId=").append(inspectionId);
        sb.append(", inspectionAppearDate=").append(inspectionAppearDate);
        sb.append(", fmeditemName=").append(fmeditemName);
        sb.append(", fmeditemCode=").append(fmeditemCode);
        sb.append(", fmeditemFormat=").append(fmeditemFormat);
        sb.append(", patientName=").append(patientName);
        sb.append(", fmeditemMnemonicCode=").append(fmeditemMnemonicCode);
        sb.append(", drawmName=").append(drawmName);
        sb.append(", medicalrecordId=").append(medicalrecordId);
        sb.append(", fmeditemId=").append(fmeditemId);
        sb.append(", patientId=").append(patientId);
        sb.append(", inspectionDetailsID=").append(inspectionDetailsID);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", isRegistered=").append(isRegistered);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", isExecuted=").append(isExecuted);
        sb.append(", paidName=").append(paidName);
        sb.append(", checkedName=").append(checkedName);
        sb.append(", registeredName=").append(registeredName);
        sb.append(", abolishedName=").append(abolishedName);
        sb.append(", executedName=").append(executedName);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", realName=").append(realName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}