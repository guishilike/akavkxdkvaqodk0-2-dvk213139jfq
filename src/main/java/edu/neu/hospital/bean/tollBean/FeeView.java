package edu.neu.hospital.bean.tollBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * feeview
 * @author 
 */
public class FeeView implements Serializable {
    /**
     * 患者费用编号
     */
    private Integer id;

    /**
     * 病历ID
     */
    private Integer medicalRecordID;

    /**
     * 收费类别12
     */
    private Integer feeCategoryID;

    /**
     * 收费项目ID
     */
    private Integer chargeItemID;

    /**
     * 费用科目类型
费用科目类型
     */
    private Integer expID;

    /**
     * 金额
     */
    private BigDecimal fee;

    /**
     * 收费员ID
     */
    private Integer tollManID;

    /**
     * 收费时间
     */
    private Date tollDate;

    /**
     * 缴费状态：1.已缴费2.未交费3.已退费
     */
    private Integer payStatus;

    /**
     * 日结状态：1.已日结2.未日结
     */
    private Integer dateStatus;

    /**
     * 创建人ID
     */
    private Integer appearUserID;

    /**
     * 费用产生日期
     */
    private Date feeAppearDate;

    /**
     * 修改人ID
     */
    private Integer changeUserID;

    /**
     * 费用变动日期
     */
    private Date feeChangeDate;

    /**
     * 费用科目名字
     */
    private String expName;

    /**
     * 真名
     */
    private String tollManName;

    /**
     * 真名
     */
    private String appearName;

    /**
     * 真名
     */
    private String changeName;

    private String feeCategoryName;

    private String payStatusName;

    private String dateStatusName;

    private static final long serialVersionUID = 1L;

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

    public Integer getFeeCategoryID() {
        return feeCategoryID;
    }

    public void setFeeCategoryID(Integer feeCategoryID) {
        this.feeCategoryID = feeCategoryID;
    }

    public Integer getChargeItemID() {
        return chargeItemID;
    }

    public void setChargeItemID(Integer chargeItemID) {
        this.chargeItemID = chargeItemID;
    }

    public Integer getExpID() {
        return expID;
    }

    public void setExpID(Integer expID) {
        this.expID = expID;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getTollManID() {
        return tollManID;
    }

    public void setTollManID(Integer tollManID) {
        this.tollManID = tollManID;
    }

    public Date getTollDate() {
        return tollDate;
    }

    public void setTollDate(Date tollDate) {
        this.tollDate = tollDate;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(Integer dateStatus) {
        this.dateStatus = dateStatus;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Date getFeeAppearDate() {
        return feeAppearDate;
    }

    public void setFeeAppearDate(Date feeAppearDate) {
        this.feeAppearDate = feeAppearDate;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public Date getFeeChangeDate() {
        return feeChangeDate;
    }

    public void setFeeChangeDate(Date feeChangeDate) {
        this.feeChangeDate = feeChangeDate;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getTollManName() {
        return tollManName;
    }

    public void setTollManName(String tollManName) {
        this.tollManName = tollManName;
    }

    public String getAppearName() {
        return appearName;
    }

    public void setAppearName(String appearName) {
        this.appearName = appearName;
    }

    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }

    public String getFeeCategoryName() {
        return feeCategoryName;
    }

    public void setFeeCategoryName(String feeCategoryName) {
        this.feeCategoryName = feeCategoryName;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public String getDateStatusName() {
        return dateStatusName;
    }

    public void setDateStatusName(String dateStatusName) {
        this.dateStatusName = dateStatusName;
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
        FeeView other = (FeeView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getFeeCategoryID() == null ? other.getFeeCategoryID() == null : this.getFeeCategoryID().equals(other.getFeeCategoryID()))
            && (this.getChargeItemID() == null ? other.getChargeItemID() == null : this.getChargeItemID().equals(other.getChargeItemID()))
            && (this.getExpID() == null ? other.getExpID() == null : this.getExpID().equals(other.getExpID()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getTollManID() == null ? other.getTollManID() == null : this.getTollManID().equals(other.getTollManID()))
            && (this.getTollDate() == null ? other.getTollDate() == null : this.getTollDate().equals(other.getTollDate()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getDateStatus() == null ? other.getDateStatus() == null : this.getDateStatus().equals(other.getDateStatus()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getFeeAppearDate() == null ? other.getFeeAppearDate() == null : this.getFeeAppearDate().equals(other.getFeeAppearDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getFeeChangeDate() == null ? other.getFeeChangeDate() == null : this.getFeeChangeDate().equals(other.getFeeChangeDate()))
            && (this.getExpName() == null ? other.getExpName() == null : this.getExpName().equals(other.getExpName()))
            && (this.getTollManName() == null ? other.getTollManName() == null : this.getTollManName().equals(other.getTollManName()))
            && (this.getAppearName() == null ? other.getAppearName() == null : this.getAppearName().equals(other.getAppearName()))
            && (this.getChangeName() == null ? other.getChangeName() == null : this.getChangeName().equals(other.getChangeName()))
            && (this.getFeeCategoryName() == null ? other.getFeeCategoryName() == null : this.getFeeCategoryName().equals(other.getFeeCategoryName()))
            && (this.getPayStatusName() == null ? other.getPayStatusName() == null : this.getPayStatusName().equals(other.getPayStatusName()))
            && (this.getDateStatusName() == null ? other.getDateStatusName() == null : this.getDateStatusName().equals(other.getDateStatusName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getFeeCategoryID() == null) ? 0 : getFeeCategoryID().hashCode());
        result = prime * result + ((getChargeItemID() == null) ? 0 : getChargeItemID().hashCode());
        result = prime * result + ((getExpID() == null) ? 0 : getExpID().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getTollManID() == null) ? 0 : getTollManID().hashCode());
        result = prime * result + ((getTollDate() == null) ? 0 : getTollDate().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getDateStatus() == null) ? 0 : getDateStatus().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getFeeAppearDate() == null) ? 0 : getFeeAppearDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getFeeChangeDate() == null) ? 0 : getFeeChangeDate().hashCode());
        result = prime * result + ((getExpName() == null) ? 0 : getExpName().hashCode());
        result = prime * result + ((getTollManName() == null) ? 0 : getTollManName().hashCode());
        result = prime * result + ((getAppearName() == null) ? 0 : getAppearName().hashCode());
        result = prime * result + ((getChangeName() == null) ? 0 : getChangeName().hashCode());
        result = prime * result + ((getFeeCategoryName() == null) ? 0 : getFeeCategoryName().hashCode());
        result = prime * result + ((getPayStatusName() == null) ? 0 : getPayStatusName().hashCode());
        result = prime * result + ((getDateStatusName() == null) ? 0 : getDateStatusName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", feeCategoryID=").append(feeCategoryID);
        sb.append(", chargeItemID=").append(chargeItemID);
        sb.append(", expID=").append(expID);
        sb.append(", fee=").append(fee);
        sb.append(", tollManID=").append(tollManID);
        sb.append(", tollDate=").append(tollDate);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", feeAppearDate=").append(feeAppearDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", feeChangeDate=").append(feeChangeDate);
        sb.append(", expName=").append(expName);
        sb.append(", tollManName=").append(tollManName);
        sb.append(", appearName=").append(appearName);
        sb.append(", changeName=").append(changeName);
        sb.append(", feeCategoryName=").append(feeCategoryName);
        sb.append(", payStatusName=").append(payStatusName);
        sb.append(", dateStatusName=").append(dateStatusName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}