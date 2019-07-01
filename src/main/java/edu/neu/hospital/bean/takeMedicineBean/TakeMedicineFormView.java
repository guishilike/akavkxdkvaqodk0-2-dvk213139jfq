package edu.neu.hospital.bean.takeMedicineBean;

import java.io.Serializable;
import java.util.Date;

/**
 * takemedicineformview
 * @author 
 */
public class TakeMedicineFormView implements Serializable {
    /**
     * 处方编号
     */
    private Integer id;

    /**
     * 病历号
     */
    private Integer medicalRecordID;

    /**
     * 病历号
     */
    private String medicalRecordNo;

    /**
     * 医生编号
     */
    private Integer doctorID;

    /**
     * 真名
     */
    private String realName;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 患者ID
     */
    private Integer patientID;

    /**
     * 身份证号
     */
    private String identityCardNo;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 家庭住址
     */
    private String familyAddress;

    /**
     * 诊断状态
     */
    private String diagnosisStatus;

    private Date appearDate;

    private Date changeDate;

    /**
     * 科室ID
     */
    private Integer departmentID;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 科室分类
     */
    private Integer deptCategoryID;

    /**
     * 科室类型
     */
    private Integer deptTypeID;

    /**
     * 科室编码
     */
    private String deptCode;

    private String deptTypeName;

    private String deptCategoryName;

    private Integer mark;

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

    public String getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(String medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getDiagnosisStatus() {
        return diagnosisStatus;
    }

    public void setDiagnosisStatus(String diagnosisStatus) {
        this.diagnosisStatus = diagnosisStatus;
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

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptCategoryID() {
        return deptCategoryID;
    }

    public void setDeptCategoryID(Integer deptCategoryID) {
        this.deptCategoryID = deptCategoryID;
    }

    public Integer getDeptTypeID() {
        return deptTypeID;
    }

    public void setDeptTypeID(Integer deptTypeID) {
        this.deptTypeID = deptTypeID;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptTypeName() {
        return deptTypeName;
    }

    public void setDeptTypeName(String deptTypeName) {
        this.deptTypeName = deptTypeName;
    }

    public String getDeptCategoryName() {
        return deptCategoryName;
    }

    public void setDeptCategoryName(String deptCategoryName) {
        this.deptCategoryName = deptCategoryName;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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
        TakeMedicineFormView other = (TakeMedicineFormView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getMedicalRecordNo() == null ? other.getMedicalRecordNo() == null : this.getMedicalRecordNo().equals(other.getMedicalRecordNo()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientID() == null ? other.getPatientID() == null : this.getPatientID().equals(other.getPatientID()))
            && (this.getIdentityCardNo() == null ? other.getIdentityCardNo() == null : this.getIdentityCardNo().equals(other.getIdentityCardNo()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getFamilyAddress() == null ? other.getFamilyAddress() == null : this.getFamilyAddress().equals(other.getFamilyAddress()))
            && (this.getDiagnosisStatus() == null ? other.getDiagnosisStatus() == null : this.getDiagnosisStatus().equals(other.getDiagnosisStatus()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getDepartmentID() == null ? other.getDepartmentID() == null : this.getDepartmentID().equals(other.getDepartmentID()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDeptCategoryID() == null ? other.getDeptCategoryID() == null : this.getDeptCategoryID().equals(other.getDeptCategoryID()))
            && (this.getDeptTypeID() == null ? other.getDeptTypeID() == null : this.getDeptTypeID().equals(other.getDeptTypeID()))
            && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
            && (this.getDeptTypeName() == null ? other.getDeptTypeName() == null : this.getDeptTypeName().equals(other.getDeptTypeName()))
            && (this.getDeptCategoryName() == null ? other.getDeptCategoryName() == null : this.getDeptCategoryName().equals(other.getDeptCategoryName()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getMedicalRecordNo() == null) ? 0 : getMedicalRecordNo().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientID() == null) ? 0 : getPatientID().hashCode());
        result = prime * result + ((getIdentityCardNo() == null) ? 0 : getIdentityCardNo().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getFamilyAddress() == null) ? 0 : getFamilyAddress().hashCode());
        result = prime * result + ((getDiagnosisStatus() == null) ? 0 : getDiagnosisStatus().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getDepartmentID() == null) ? 0 : getDepartmentID().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDeptCategoryID() == null) ? 0 : getDeptCategoryID().hashCode());
        result = prime * result + ((getDeptTypeID() == null) ? 0 : getDeptTypeID().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getDeptTypeName() == null) ? 0 : getDeptTypeName().hashCode());
        result = prime * result + ((getDeptCategoryName() == null) ? 0 : getDeptCategoryName().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
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
        sb.append(", medicalRecordNo=").append(medicalRecordNo);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", realName=").append(realName);
        sb.append(", patientName=").append(patientName);
        sb.append(", patientID=").append(patientID);
        sb.append(", identityCardNo=").append(identityCardNo);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", familyAddress=").append(familyAddress);
        sb.append(", diagnosisStatus=").append(diagnosisStatus);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", departmentID=").append(departmentID);
        sb.append(", deptName=").append(deptName);
        sb.append(", deptCategoryID=").append(deptCategoryID);
        sb.append(", deptTypeID=").append(deptTypeID);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", deptTypeName=").append(deptTypeName);
        sb.append(", deptCategoryName=").append(deptCategoryName);
        sb.append(", mark=").append(mark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}