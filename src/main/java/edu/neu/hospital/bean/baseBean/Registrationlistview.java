package edu.neu.hospital.bean.baseBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * registrationlistview
 * @author 
 */
public class Registrationlistview implements Serializable {
    /**
     *  挂号信息编号
     */
    private Integer id;

    /**
     * 病历号（2019052012345）
     */
    private Integer medRecID;

    /**
     * 患者姓名
     */
    private String patientName;

    private String regLevel;

    /**
     * 挂号日期
     */
    private Date registrationDate;

    /**
     * 看诊日期
     */
    private Date seeDoctorDate;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 真名
     */
    private String doctorName;

    private String regSource;

    private String payCategory;

    /**
     * 是否已看诊
     */
    private String isSeenDoctor;

    /**
     * 挂号费用
     */
    private BigDecimal expense;

    /**
     * 创建人员ID
     */
    private Integer appearUserID;

    private Date appearDate;

    /**
     * 真名
     */
    private String appearUser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedRecID() {
        return medRecID;
    }

    public void setMedRecID(Integer medRecID) {
        this.medRecID = medRecID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRegLevel() {
        return regLevel;
    }

    public void setRegLevel(String regLevel) {
        this.regLevel = regLevel;
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

    public void setSeeDoctorDate(Date seeDoctorDate) {
        this.seeDoctorDate = seeDoctorDate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRegSource() {
        return regSource;
    }

    public void setRegSource(String regSource) {
        this.regSource = regSource;
    }

    public String getPayCategory() {
        return payCategory;
    }

    public void setPayCategory(String payCategory) {
        this.payCategory = payCategory;
    }

    public String getIsSeenDoctor() {
        return isSeenDoctor;
    }

    public void setIsSeenDoctor(String isSeenDoctor) {
        this.isSeenDoctor = isSeenDoctor;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public void setExpense(BigDecimal expense) {
        this.expense = expense;
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

    public String getAppearUser() {
        return appearUser;
    }

    public void setAppearUser(String appearUser) {
        this.appearUser = appearUser;
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
        Registrationlistview other = (Registrationlistview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedRecID() == null ? other.getMedRecID() == null : this.getMedRecID().equals(other.getMedRecID()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getRegLevel() == null ? other.getRegLevel() == null : this.getRegLevel().equals(other.getRegLevel()))
            && (this.getRegistrationDate() == null ? other.getRegistrationDate() == null : this.getRegistrationDate().equals(other.getRegistrationDate()))
            && (this.getSeeDoctorDate() == null ? other.getSeeDoctorDate() == null : this.getSeeDoctorDate().equals(other.getSeeDoctorDate()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDoctorName() == null ? other.getDoctorName() == null : this.getDoctorName().equals(other.getDoctorName()))
            && (this.getRegSource() == null ? other.getRegSource() == null : this.getRegSource().equals(other.getRegSource()))
            && (this.getPayCategory() == null ? other.getPayCategory() == null : this.getPayCategory().equals(other.getPayCategory()))
            && (this.getIsSeenDoctor() == null ? other.getIsSeenDoctor() == null : this.getIsSeenDoctor().equals(other.getIsSeenDoctor()))
            && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getAppearUser() == null ? other.getAppearUser() == null : this.getAppearUser().equals(other.getAppearUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedRecID() == null) ? 0 : getMedRecID().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getRegLevel() == null) ? 0 : getRegLevel().hashCode());
        result = prime * result + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        result = prime * result + ((getSeeDoctorDate() == null) ? 0 : getSeeDoctorDate().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDoctorName() == null) ? 0 : getDoctorName().hashCode());
        result = prime * result + ((getRegSource() == null) ? 0 : getRegSource().hashCode());
        result = prime * result + ((getPayCategory() == null) ? 0 : getPayCategory().hashCode());
        result = prime * result + ((getIsSeenDoctor() == null) ? 0 : getIsSeenDoctor().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getAppearUser() == null) ? 0 : getAppearUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medRecID=").append(medRecID);
        sb.append(", patientName=").append(patientName);
        sb.append(", regLevel=").append(regLevel);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", seeDoctorDate=").append(seeDoctorDate);
        sb.append(", deptName=").append(deptName);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", regSource=").append(regSource);
        sb.append(", payCategory=").append(payCategory);
        sb.append(", isSeenDoctor=").append(isSeenDoctor);
        sb.append(", expense=").append(expense);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", appearUser=").append(appearUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}