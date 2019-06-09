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
    private Integer userid;

    /**
     * 真名
     */
    private String realname;

    /**
     * 科室名称
     */
    private String deptname;

    /**
     * 病历ID
     */
    private Integer medicalrecordid;

    /**
     * 患者姓名
     */
    private String patientname;

    private String feecategory;

    /**
     * 金额
     */
    private BigDecimal fee;

    /**
     * 费用产生日期
     */
    private Date feeappeardate;

    /**
     * 患者费用编号
     */
    private Integer feeid;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getFeecategory() {
        return feecategory;
    }

    public void setFeecategory(String feecategory) {
        this.feecategory = feecategory;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getFeeappeardate() {
        return feeappeardate;
    }

    public void setFeeappeardate(Date feeappeardate) {
        this.feeappeardate = feeappeardate;
    }

    public Integer getFeeid() {
        return feeid;
    }

    public void setFeeid(Integer feeid) {
        this.feeid = feeid;
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
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getPatientname() == null ? other.getPatientname() == null : this.getPatientname().equals(other.getPatientname()))
            && (this.getFeecategory() == null ? other.getFeecategory() == null : this.getFeecategory().equals(other.getFeecategory()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getFeeappeardate() == null ? other.getFeeappeardate() == null : this.getFeeappeardate().equals(other.getFeeappeardate()))
            && (this.getFeeid() == null ? other.getFeeid() == null : this.getFeeid().equals(other.getFeeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getPatientname() == null) ? 0 : getPatientname().hashCode());
        result = prime * result + ((getFeecategory() == null) ? 0 : getFeecategory().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getFeeappeardate() == null) ? 0 : getFeeappeardate().hashCode());
        result = prime * result + ((getFeeid() == null) ? 0 : getFeeid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", realname=").append(realname);
        sb.append(", deptname=").append(deptname);
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", patientname=").append(patientname);
        sb.append(", feecategory=").append(feecategory);
        sb.append(", fee=").append(fee);
        sb.append(", feeappeardate=").append(feeappeardate);
        sb.append(", feeid=").append(feeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}