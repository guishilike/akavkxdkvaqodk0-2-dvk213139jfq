package edu.neu.hospital.bean.finaceBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * workloadstatistics
 * @author 
 */
public class WorkLoadStatistics implements Serializable {
    /**
     * 患者费用编号
     */
    private Integer feeID;

    /**
     * 用户ID
     */
    private Integer doctorID;

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
    private String feeTypeName;

    /**
     * 金额
     */
    private BigDecimal fee;

    /**
     * 费用产生日期
     */
    private Date feeAppearDate;

    /**
     * 缴费状态：1.已缴费2.未交费3.已退费
     */
    private Integer payStatus;

    private String paystatusCode;

    private String paystatusName;

    /**
     * 日结状态：1.已日结2.未日结
     */
    private Integer dateStatus;

    private String datestatusCode;

    private String datestatusName;

    private static final long serialVersionUID = 1L;

    public Integer getFeeID() {
        return feeID;
    }

    public void setFeeID(Integer feeID) {
        this.feeID = feeID;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
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

    public String getFeeTypeName() {
        return feeTypeName;
    }

    public void setFeeTypeName(String feeTypeName) {
        this.feeTypeName = feeTypeName;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getFeeAppearDate() {
        return feeAppearDate;
    }

    public void setFeeAppearDate(Date feeAppearDate) {
        this.feeAppearDate = feeAppearDate;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPaystatusCode() {
        return paystatusCode;
    }

    public void setPaystatusCode(String paystatusCode) {
        this.paystatusCode = paystatusCode;
    }

    public String getPaystatusName() {
        return paystatusName;
    }

    public void setPaystatusName(String paystatusName) {
        this.paystatusName = paystatusName;
    }

    public Integer getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(Integer dateStatus) {
        this.dateStatus = dateStatus;
    }

    public String getDatestatusCode() {
        return datestatusCode;
    }

    public void setDatestatusCode(String datestatusCode) {
        this.datestatusCode = datestatusCode;
    }

    public String getDatestatusName() {
        return datestatusName;
    }

    public void setDatestatusName(String datestatusName) {
        this.datestatusName = datestatusName;
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
        WorkLoadStatistics other = (WorkLoadStatistics) that;
        return (this.getFeeID() == null ? other.getFeeID() == null : this.getFeeID().equals(other.getFeeID()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getFeeTypeName() == null ? other.getFeeTypeName() == null : this.getFeeTypeName().equals(other.getFeeTypeName()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getFeeAppearDate() == null ? other.getFeeAppearDate() == null : this.getFeeAppearDate().equals(other.getFeeAppearDate()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getPaystatusCode() == null ? other.getPaystatusCode() == null : this.getPaystatusCode().equals(other.getPaystatusCode()))
            && (this.getPaystatusName() == null ? other.getPaystatusName() == null : this.getPaystatusName().equals(other.getPaystatusName()))
            && (this.getDateStatus() == null ? other.getDateStatus() == null : this.getDateStatus().equals(other.getDateStatus()))
            && (this.getDatestatusCode() == null ? other.getDatestatusCode() == null : this.getDatestatusCode().equals(other.getDatestatusCode()))
            && (this.getDatestatusName() == null ? other.getDatestatusName() == null : this.getDatestatusName().equals(other.getDatestatusName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeeID() == null) ? 0 : getFeeID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getFeeTypeName() == null) ? 0 : getFeeTypeName().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getFeeAppearDate() == null) ? 0 : getFeeAppearDate().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getPaystatusCode() == null) ? 0 : getPaystatusCode().hashCode());
        result = prime * result + ((getPaystatusName() == null) ? 0 : getPaystatusName().hashCode());
        result = prime * result + ((getDateStatus() == null) ? 0 : getDateStatus().hashCode());
        result = prime * result + ((getDatestatusCode() == null) ? 0 : getDatestatusCode().hashCode());
        result = prime * result + ((getDatestatusName() == null) ? 0 : getDatestatusName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feeID=").append(feeID);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", realName=").append(realName);
        sb.append(", deptName=").append(deptName);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", patientName=").append(patientName);
        sb.append(", feeTypeName=").append(feeTypeName);
        sb.append(", fee=").append(fee);
        sb.append(", feeAppearDate=").append(feeAppearDate);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", paystatusCode=").append(paystatusCode);
        sb.append(", paystatusName=").append(paystatusName);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append(", datestatusCode=").append(datestatusCode);
        sb.append(", datestatusName=").append(datestatusName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}