package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * inspectiondetailsview
 * @author 
 */
public class InspectionDetailsView implements Serializable {
    private Integer inspectionID;

    /**
     * 病历id
     */
    private Integer medicalRecordID;

    private Integer inspectionDetailsID;

    /**
     * 非药品目录ID
     */
    private Integer fmedItemID;

    /**
     * 数目
     */
    private Integer number;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 单价
     */
    private BigDecimal price;

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
     * 是否作废
     */
    private Integer isAbolished;

    /**
     * 是否执行
     */
    private Integer isExecuted;

    private Integer appearUserID;

    /**
     * 真名
     */
    private String appearUserName;

    /**
     * 真名
     */
    private String changeUserName;

    private Integer changeUserID;

    private Date changeDate;

    /**
     * 医生id
     */
    private Integer doctorID;

    private String isPaidName;

    private String isAbolishedName;

    private String isDrawnName;

    private String isExecutedName;

    private static final long serialVersionUID = 1L;

    public Integer getInspectionID() {
        return inspectionID;
    }

    public void setInspectionID(Integer inspectionID) {
        this.inspectionID = inspectionID;
    }

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public Integer getInspectionDetailsID() {
        return inspectionDetailsID;
    }

    public void setInspectionDetailsID(Integer inspectionDetailsID) {
        this.inspectionDetailsID = inspectionDetailsID;
    }

    public Integer getFmedItemID() {
        return fmedItemID;
    }

    public void setFmedItemID(Integer fmedItemID) {
        this.fmedItemID = fmedItemID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public String getAppearUserName() {
        return appearUserName;
    }

    public void setAppearUserName(String appearUserName) {
        this.appearUserName = appearUserName;
    }

    public String getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(String changeUserName) {
        this.changeUserName = changeUserName;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public String getIsPaidName() {
        return isPaidName;
    }

    public void setIsPaidName(String isPaidName) {
        this.isPaidName = isPaidName;
    }

    public String getIsAbolishedName() {
        return isAbolishedName;
    }

    public void setIsAbolishedName(String isAbolishedName) {
        this.isAbolishedName = isAbolishedName;
    }

    public String getIsDrawnName() {
        return isDrawnName;
    }

    public void setIsDrawnName(String isDrawnName) {
        this.isDrawnName = isDrawnName;
    }

    public String getIsExecutedName() {
        return isExecutedName;
    }

    public void setIsExecutedName(String isExecutedName) {
        this.isExecutedName = isExecutedName;
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
        InspectionDetailsView other = (InspectionDetailsView) that;
        return (this.getInspectionID() == null ? other.getInspectionID() == null : this.getInspectionID().equals(other.getInspectionID()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getInspectionDetailsID() == null ? other.getInspectionDetailsID() == null : this.getInspectionDetailsID().equals(other.getInspectionDetailsID()))
            && (this.getFmedItemID() == null ? other.getFmedItemID() == null : this.getFmedItemID().equals(other.getFmedItemID()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getIsExecuted() == null ? other.getIsExecuted() == null : this.getIsExecuted().equals(other.getIsExecuted()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getIsPaidName() == null ? other.getIsPaidName() == null : this.getIsPaidName().equals(other.getIsPaidName()))
            && (this.getIsAbolishedName() == null ? other.getIsAbolishedName() == null : this.getIsAbolishedName().equals(other.getIsAbolishedName()))
            && (this.getIsDrawnName() == null ? other.getIsDrawnName() == null : this.getIsDrawnName().equals(other.getIsDrawnName()))
            && (this.getIsExecutedName() == null ? other.getIsExecutedName() == null : this.getIsExecutedName().equals(other.getIsExecutedName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInspectionID() == null) ? 0 : getInspectionID().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getInspectionDetailsID() == null) ? 0 : getInspectionDetailsID().hashCode());
        result = prime * result + ((getFmedItemID() == null) ? 0 : getFmedItemID().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getIsExecuted() == null) ? 0 : getIsExecuted().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearUserName() == null) ? 0 : getAppearUserName().hashCode());
        result = prime * result + ((getChangeUserName() == null) ? 0 : getChangeUserName().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getIsPaidName() == null) ? 0 : getIsPaidName().hashCode());
        result = prime * result + ((getIsAbolishedName() == null) ? 0 : getIsAbolishedName().hashCode());
        result = prime * result + ((getIsDrawnName() == null) ? 0 : getIsDrawnName().hashCode());
        result = prime * result + ((getIsExecutedName() == null) ? 0 : getIsExecutedName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inspectionID=").append(inspectionID);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", inspectionDetailsID=").append(inspectionDetailsID);
        sb.append(", fmedItemID=").append(fmedItemID);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", isExecuted=").append(isExecuted);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", isPaidName=").append(isPaidName);
        sb.append(", isAbolishedName=").append(isAbolishedName);
        sb.append(", isDrawnName=").append(isDrawnName);
        sb.append(", isExecutedName=").append(isExecutedName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}