package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * registrationinfo
 * @author 
 */
public class Registrationinfo implements Serializable {
    /**
     *  挂号信息编号
     */
    private Integer id;

    /**
     * 病历号（2019052012345）
     */
    private Integer medicalrecordid;

    /**
     * 患者ID
     */
    private Integer patientid;

    /**
     * 挂号级别ID
     */
    private Integer registrationlevelid;

    /**
     * 挂号日期
     */
    private Date registrationdate;

    /**
     * 看诊日期
     */
    private Date seedoctordate;

    /**
     * 医院科室ID
     */
    private Integer departmentid;

    /**
     * 医生ID 
     */
    private Integer doctorid;

    /**
     * 挂号来源14
     */
    private Integer registrationsourceid;

    /**
     * 收费类别12
     */
    private Integer paymentcategoryid;

    /**
     * 是否已看诊
     */
    private String isseendocator;

    /**
     * 挂号费用
     */
    private BigDecimal expense;

    /**
     * 挂号状态：01挂号02退号
     */
    private String registrationstatus;

    /**
     * 是否有效
     */
    private String status;

    /**
     * 创建人员ID
     */
    private Integer appearuserid;

    private Date appeardate;

    private Integer changeuserid;

    private Date changedate;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getRegistrationlevelid() {
        return registrationlevelid;
    }

    public void setRegistrationlevelid(Integer registrationlevelid) {
        this.registrationlevelid = registrationlevelid;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public Date getSeedoctordate() {
        return seedoctordate;
    }

    public void setSeedoctordate(Date seedoctordate) {
        this.seedoctordate = seedoctordate;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getRegistrationsourceid() {
        return registrationsourceid;
    }

    public void setRegistrationsourceid(Integer registrationsourceid) {
        this.registrationsourceid = registrationsourceid;
    }

    public Integer getPaymentcategoryid() {
        return paymentcategoryid;
    }

    public void setPaymentcategoryid(Integer paymentcategoryid) {
        this.paymentcategoryid = paymentcategoryid;
    }

    public String getIsseendocator() {
        return isseendocator;
    }

    public void setIsseendocator(String isseendocator) {
        this.isseendocator = isseendocator;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public void setExpense(BigDecimal expense) {
        this.expense = expense;
    }

    public String getRegistrationstatus() {
        return registrationstatus;
    }

    public void setRegistrationstatus(String registrationstatus) {
        this.registrationstatus = registrationstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(Integer appearuserid) {
        this.appearuserid = appearuserid;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public Integer getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(Integer changeuserid) {
        this.changeuserid = changeuserid;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
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
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getPatientid() == null ? other.getPatientid() == null : this.getPatientid().equals(other.getPatientid()))
            && (this.getRegistrationlevelid() == null ? other.getRegistrationlevelid() == null : this.getRegistrationlevelid().equals(other.getRegistrationlevelid()))
            && (this.getRegistrationdate() == null ? other.getRegistrationdate() == null : this.getRegistrationdate().equals(other.getRegistrationdate()))
            && (this.getSeedoctordate() == null ? other.getSeedoctordate() == null : this.getSeedoctordate().equals(other.getSeedoctordate()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getRegistrationsourceid() == null ? other.getRegistrationsourceid() == null : this.getRegistrationsourceid().equals(other.getRegistrationsourceid()))
            && (this.getPaymentcategoryid() == null ? other.getPaymentcategoryid() == null : this.getPaymentcategoryid().equals(other.getPaymentcategoryid()))
            && (this.getIsseendocator() == null ? other.getIsseendocator() == null : this.getIsseendocator().equals(other.getIsseendocator()))
            && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()))
            && (this.getRegistrationstatus() == null ? other.getRegistrationstatus() == null : this.getRegistrationstatus().equals(other.getRegistrationstatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getPatientid() == null) ? 0 : getPatientid().hashCode());
        result = prime * result + ((getRegistrationlevelid() == null) ? 0 : getRegistrationlevelid().hashCode());
        result = prime * result + ((getRegistrationdate() == null) ? 0 : getRegistrationdate().hashCode());
        result = prime * result + ((getSeedoctordate() == null) ? 0 : getSeedoctordate().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getRegistrationsourceid() == null) ? 0 : getRegistrationsourceid().hashCode());
        result = prime * result + ((getPaymentcategoryid() == null) ? 0 : getPaymentcategoryid().hashCode());
        result = prime * result + ((getIsseendocator() == null) ? 0 : getIsseendocator().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        result = prime * result + ((getRegistrationstatus() == null) ? 0 : getRegistrationstatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
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
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", patientid=").append(patientid);
        sb.append(", registrationlevelid=").append(registrationlevelid);
        sb.append(", registrationdate=").append(registrationdate);
        sb.append(", seedoctordate=").append(seedoctordate);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", registrationsourceid=").append(registrationsourceid);
        sb.append(", paymentcategoryid=").append(paymentcategoryid);
        sb.append(", isseendocator=").append(isseendocator);
        sb.append(", expense=").append(expense);
        sb.append(", registrationstatus=").append(registrationstatus);
        sb.append(", status=").append(status);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", changedate=").append(changedate);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}