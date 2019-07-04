package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * disposaldetailsview
 * @author 
 */
public class DisposalDetailsView implements Serializable {
    private Integer disposalID;

    /**
     * 病历id
     */
    private Integer medicalRecordID;

    /**
     * 医生id
     */
    private Integer doctorID;

    private Integer disposalDetailsID;

    /**
     * 非药品项目ID
     */
    private Integer fMedItemID;

    private Integer number;

    private Integer appearUserID;

    private Integer changeUserID;

    private Date appearDate;

    private Date changeDate;

    /**
     * 是否开立
     */
    private Integer isDrawn;

    private Integer isPaid;

    private Integer isAbolished;

    private Integer isExecuted;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 真名
     */
    private String appearUserName;

    /**
     * 真名
     */
    private String changeUserName;

    private String isDrawnName;

    private String isAbolishedName;

    private String isPaidName;

    private String isExecutedName;

    private static final long serialVersionUID = 1L;

    public Integer getDisposalID() {
        return disposalID;
    }

    public void setDisposalID(Integer disposalID) {
        this.disposalID = disposalID;
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

    public Integer getDisposalDetailsID() {
        return disposalDetailsID;
    }

    public void setDisposalDetailsID(Integer disposalDetailsID) {
        this.disposalDetailsID = disposalDetailsID;
    }

    public Integer getfMedItemID() {
        return fMedItemID;
    }

    public void setfMedItemID(Integer fMedItemID) {
        this.fMedItemID = fMedItemID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public String getIsDrawnName() {
        return isDrawnName;
    }

    public void setIsDrawnName(String isDrawnName) {
        this.isDrawnName = isDrawnName;
    }

    public String getIsAbolishedName() {
        return isAbolishedName;
    }

    public void setIsAbolishedName(String isAbolishedName) {
        this.isAbolishedName = isAbolishedName;
    }

    public String getIsPaidName() {
        return isPaidName;
    }

    public void setIsPaidName(String isPaidName) {
        this.isPaidName = isPaidName;
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
        DisposalDetailsView other = (DisposalDetailsView) that;
        return (this.getDisposalID() == null ? other.getDisposalID() == null : this.getDisposalID().equals(other.getDisposalID()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getDisposalDetailsID() == null ? other.getDisposalDetailsID() == null : this.getDisposalDetailsID().equals(other.getDisposalDetailsID()))
            && (this.getfMedItemID() == null ? other.getfMedItemID() == null : this.getfMedItemID().equals(other.getfMedItemID()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getIsExecuted() == null ? other.getIsExecuted() == null : this.getIsExecuted().equals(other.getIsExecuted()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()))
            && (this.getIsDrawnName() == null ? other.getIsDrawnName() == null : this.getIsDrawnName().equals(other.getIsDrawnName()))
            && (this.getIsAbolishedName() == null ? other.getIsAbolishedName() == null : this.getIsAbolishedName().equals(other.getIsAbolishedName()))
            && (this.getIsPaidName() == null ? other.getIsPaidName() == null : this.getIsPaidName().equals(other.getIsPaidName()))
            && (this.getIsExecutedName() == null ? other.getIsExecutedName() == null : this.getIsExecutedName().equals(other.getIsExecutedName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDisposalID() == null) ? 0 : getDisposalID().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getDisposalDetailsID() == null) ? 0 : getDisposalDetailsID().hashCode());
        result = prime * result + ((getfMedItemID() == null) ? 0 : getfMedItemID().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getIsExecuted() == null) ? 0 : getIsExecuted().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAppearUserName() == null) ? 0 : getAppearUserName().hashCode());
        result = prime * result + ((getChangeUserName() == null) ? 0 : getChangeUserName().hashCode());
        result = prime * result + ((getIsDrawnName() == null) ? 0 : getIsDrawnName().hashCode());
        result = prime * result + ((getIsAbolishedName() == null) ? 0 : getIsAbolishedName().hashCode());
        result = prime * result + ((getIsPaidName() == null) ? 0 : getIsPaidName().hashCode());
        result = prime * result + ((getIsExecutedName() == null) ? 0 : getIsExecutedName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", disposalID=").append(disposalID);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", disposalDetailsID=").append(disposalDetailsID);
        sb.append(", fMedItemID=").append(fMedItemID);
        sb.append(", number=").append(number);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", isExecuted=").append(isExecuted);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", isDrawnName=").append(isDrawnName);
        sb.append(", isAbolishedName=").append(isAbolishedName);
        sb.append(", isPaidName=").append(isPaidName);
        sb.append(", isExecutedName=").append(isExecutedName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}