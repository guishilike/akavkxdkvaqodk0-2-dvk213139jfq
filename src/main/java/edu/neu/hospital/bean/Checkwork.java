package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * checkwork
 * @author 
 */
public class Checkwork implements Serializable {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 真名
     */
    private String realName;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 病历ID
     */
    private Integer medicalRecordID;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 费用科目名字
     */
    private String feeCategoryName;

    /**
     * 金额
     */
    private BigDecimal fee1;

    /**
     * 金额
     */
    private BigDecimal fee2;

    /**
     * 费用产生日期
     */
    private Date feeAppearDate;

    /**
     * 患者费用编号
     */
    private Integer feeID;

    /**
     * 缴费状态：1.已缴费2.未交费3.已退费
     */
    private String payStatus;

    /**
     * 日结状态：1.已日结2.未日结
     */
    private String dateStatus;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getFeeCategoryName() {
        return feeCategoryName;
    }

    public void setFeeCategoryName(String feeCategoryName) {
        this.feeCategoryName = feeCategoryName;
    }

    public BigDecimal getFee1() {
        return fee1;
    }

    public void setFee1(BigDecimal fee1) {
        this.fee1 = fee1;
    }

    public BigDecimal getFee2() {
        return fee2;
    }

    public void setFee2(BigDecimal fee2) {
        this.fee2 = fee2;
    }

    public Date getFeeAppearDate() {
        return feeAppearDate;
    }

    public void setFeeAppearDate(Date feeAppearDate) {
        this.feeAppearDate = feeAppearDate;
    }

    public Integer getFeeID() {
        return feeID;
    }

    public void setFeeID(Integer feeID) {
        this.feeID = feeID;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(String dateStatus) {
        this.dateStatus = dateStatus;
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
        Checkwork other = (Checkwork) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getFeeCategoryName() == null ? other.getFeeCategoryName() == null : this.getFeeCategoryName().equals(other.getFeeCategoryName()))
            && (this.getFee1() == null ? other.getFee1() == null : this.getFee1().equals(other.getFee1()))
            && (this.getFee2() == null ? other.getFee2() == null : this.getFee2().equals(other.getFee2()))
            && (this.getFeeAppearDate() == null ? other.getFeeAppearDate() == null : this.getFeeAppearDate().equals(other.getFeeAppearDate()))
            && (this.getFeeID() == null ? other.getFeeID() == null : this.getFeeID().equals(other.getFeeID()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getDateStatus() == null ? other.getDateStatus() == null : this.getDateStatus().equals(other.getDateStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getFeeCategoryName() == null) ? 0 : getFeeCategoryName().hashCode());
        result = prime * result + ((getFee1() == null) ? 0 : getFee1().hashCode());
        result = prime * result + ((getFee2() == null) ? 0 : getFee2().hashCode());
        result = prime * result + ((getFeeAppearDate() == null) ? 0 : getFeeAppearDate().hashCode());
        result = prime * result + ((getFeeID() == null) ? 0 : getFeeID().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getDateStatus() == null) ? 0 : getDateStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", realName=").append(realName);
        sb.append(", deptName=").append(deptName);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", patientName=").append(patientName);
        sb.append(", feeCategoryName=").append(feeCategoryName);
        sb.append(", fee1=").append(fee1);
        sb.append(", fee2=").append(fee2);
        sb.append(", feeAppearDate=").append(feeAppearDate);
        sb.append(", feeID=").append(feeID);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}