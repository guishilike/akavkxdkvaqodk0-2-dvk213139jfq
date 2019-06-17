package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * workloadstatistics
 * @author 
 */
public class Workloadstatistics implements Serializable {
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

    /**
     * 日结状态：1.已日结2.未日结
     */
    private Integer dateStatus;

    private static final long serialVersionUID = 1L;

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

    public Integer getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(Integer dateStatus) {
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
        Workloadstatistics other = (Workloadstatistics) that;
        return (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getFeeTypeName() == null ? other.getFeeTypeName() == null : this.getFeeTypeName().equals(other.getFeeTypeName()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getFeeAppearDate() == null ? other.getFeeAppearDate() == null : this.getFeeAppearDate().equals(other.getFeeAppearDate()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getDateStatus() == null ? other.getDateStatus() == null : this.getDateStatus().equals(other.getDateStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getFeeTypeName() == null) ? 0 : getFeeTypeName().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getFeeAppearDate() == null) ? 0 : getFeeAppearDate().hashCode());
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
        sb.append(", doctorID=").append(doctorID);
        sb.append(", realName=").append(realName);
        sb.append(", deptName=").append(deptName);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", patientName=").append(patientName);
        sb.append(", feeTypeName=").append(feeTypeName);
        sb.append(", fee=").append(fee);
        sb.append(", feeAppearDate=").append(feeAppearDate);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}