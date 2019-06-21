package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * fee
 * @author 
 */
public class Fee implements Serializable {
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
     * 创建人ID
     */
    private Integer appearUserID;

    /**
     * 修改人ID
     */
    private Integer changeUserID;

    /**
     * 费用产生日期
     */
    private Date feeAppearDate;

    /**
     * 费用变动日期
     */
    private Date feeChangeDate;

    /**
     * 缴费状态：1.已缴费2.未交费3.已退费
     */
    private Integer payStatus;

    /**
     * 日结状态：1.已日结2.未日结
     */
    private Integer dateStatus;

    /**
     * 是否有效
     */
    private String status;

    private String reserve1;

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

    public Date getFeeAppearDate() {
        return feeAppearDate;
    }

    public void setFeeAppearDate(Date feeAppearDate) {
        this.feeAppearDate = feeAppearDate;
    }

    public Date getFeeChangeDate() {
        return feeChangeDate;
    }

    public void setFeeChangeDate(Date feeChangeDate) {
        this.feeChangeDate = feeChangeDate;
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
        Fee other = (Fee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getFeeCategoryID() == null ? other.getFeeCategoryID() == null : this.getFeeCategoryID().equals(other.getFeeCategoryID()))
            && (this.getChargeItemID() == null ? other.getChargeItemID() == null : this.getChargeItemID().equals(other.getChargeItemID()))
            && (this.getExpID() == null ? other.getExpID() == null : this.getExpID().equals(other.getExpID()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getTollManID() == null ? other.getTollManID() == null : this.getTollManID().equals(other.getTollManID()))
            && (this.getTollDate() == null ? other.getTollDate() == null : this.getTollDate().equals(other.getTollDate()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getFeeAppearDate() == null ? other.getFeeAppearDate() == null : this.getFeeAppearDate().equals(other.getFeeAppearDate()))
            && (this.getFeeChangeDate() == null ? other.getFeeChangeDate() == null : this.getFeeChangeDate().equals(other.getFeeChangeDate()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getDateStatus() == null ? other.getDateStatus() == null : this.getDateStatus().equals(other.getDateStatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()));
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
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getFeeAppearDate() == null) ? 0 : getFeeAppearDate().hashCode());
        result = prime * result + ((getFeeChangeDate() == null) ? 0 : getFeeChangeDate().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getDateStatus() == null) ? 0 : getDateStatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
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
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", feeAppearDate=").append(feeAppearDate);
        sb.append(", feeChangeDate=").append(feeChangeDate);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}