package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

/**
 * registrationinfo
 *
 * @author LiJie
 */
public class Registrationinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *  挂号信息编号
     */
    private Integer id;
    /**
     * 病历号（2019052012345）
     */
    private Integer medicalRecordID;
    /**
     * 患者ID
     */
    private Integer patientID;
    /**
     * 挂号级别ID
     */
    private Integer registrationLevelID;
    /**
     * 挂号日期
     */
    private Date registrationDate;
    /**
     * 看诊日期
     */
    private Date seeDoctorDate;
    /**
     * 医院科室ID
     */
    private Integer departmentID;
    /**
     * 医生ID 
     */
    private Integer doctorID;
    /**
     * 挂号来源14
     */
    private Integer registrationSourceID;
    /**
     * 收费类别12
     */
    private Integer paymentCategoryID;
    /**
     * 是否已看诊
     */
    private String isSeenDoctor;
    /**
     * 挂号费用
     */
    private BigDecimal expense;
    /**
     * 挂号状态：01挂号02退号
     */
    private String registrationStatus;
    /**
     * 创建人员ID
     */
    private Integer appearUserID;
    private Date appearDate;
    private Integer changeUserID;
    private Date changeDate;
    /**
     * 是否有效
     */
    private String status;
    private String reserve1;
    private String reserve2;
    private String reserve3;

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

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public Integer getRegistrationLevelID() {
        return registrationLevelID;
    }

    public void setRegistrationLevelID(Integer registrationLevelID) {
        this.registrationLevelID = registrationLevelID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getSeeDoctorDate() {
        return seeDoctorDate;
    }

    public void setSeeDoctorDate(String seeDoctorDate) {
        this.seeDoctorDate = Date.from(Instant.parse(seeDoctorDate));
    }

    public void setSeeDoctorDate(Date seeDoctorDate) {
        this.seeDoctorDate = seeDoctorDate;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getRegistrationSourceID() {
        return registrationSourceID;
    }

    public void setRegistrationSourceID(Integer registrationSourceID) {
        this.registrationSourceID = registrationSourceID;
    }

    public Integer getPaymentCategoryID() {
        return paymentCategoryID;
    }

    public void setPaymentCategoryID(Integer paymentCategoryID) {
        this.paymentCategoryID = paymentCategoryID;
    }

    public String getIsSeenDocator() {
        return isSeenDoctor;
    }

    public void setIsSeenDocator(String isSeenDoctor) {
        this.isSeenDoctor = isSeenDoctor;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public void setExpense(BigDecimal expense) {
        this.expense = expense;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
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

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
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
        Registrationinfo other = (Registrationinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
                && (this.getPatientID() == null ? other.getPatientID() == null : this.getPatientID().equals(other.getPatientID()))
                && (this.getRegistrationLevelID() == null ? other.getRegistrationLevelID() == null : this.getRegistrationLevelID().equals(other.getRegistrationLevelID()))
                && (this.getRegistrationDate() == null ? other.getRegistrationDate() == null : this.getRegistrationDate().equals(other.getRegistrationDate()))
                && (this.getSeeDoctorDate() == null ? other.getSeeDoctorDate() == null : this.getSeeDoctorDate().equals(other.getSeeDoctorDate()))
                && (this.getDepartmentID() == null ? other.getDepartmentID() == null : this.getDepartmentID().equals(other.getDepartmentID()))
                && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
                && (this.getRegistrationSourceID() == null ? other.getRegistrationSourceID() == null : this.getRegistrationSourceID().equals(other.getRegistrationSourceID()))
                && (this.getPaymentCategoryID() == null ? other.getPaymentCategoryID() == null : this.getPaymentCategoryID().equals(other.getPaymentCategoryID()))
                && (this.getIsSeenDocator() == null ? other.getIsSeenDocator() == null : this.getIsSeenDocator().equals(other.getIsSeenDocator()))
                && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()))
                && (this.getRegistrationStatus() == null ? other.getRegistrationStatus() == null : this.getRegistrationStatus().equals(other.getRegistrationStatus()))
                && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
                && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
                && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getPatientID() == null) ? 0 : getPatientID().hashCode());
        result = prime * result + ((getRegistrationLevelID() == null) ? 0 : getRegistrationLevelID().hashCode());
        result = prime * result + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        result = prime * result + ((getSeeDoctorDate() == null) ? 0 : getSeeDoctorDate().hashCode());
        result = prime * result + ((getDepartmentID() == null) ? 0 : getDepartmentID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getRegistrationSourceID() == null) ? 0 : getRegistrationSourceID().hashCode());
        result = prime * result + ((getPaymentCategoryID() == null) ? 0 : getPaymentCategoryID().hashCode());
        result = prime * result + ((getIsSeenDocator() == null) ? 0 : getIsSeenDocator().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        result = prime * result + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
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
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", patientID=").append(patientID);
        sb.append(", registrationLevelID=").append(registrationLevelID);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", seeDoctorDate=").append(seeDoctorDate);
        sb.append(", departmentID=").append(departmentID);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", registrationSourceID=").append(registrationSourceID);
        sb.append(", paymentCategoryID=").append(paymentCategoryID);
        sb.append(", isSeenDocator=").append(isSeenDoctor);
        sb.append(", expense=").append(expense);
        sb.append(", registrationStatus=").append(registrationStatus);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}