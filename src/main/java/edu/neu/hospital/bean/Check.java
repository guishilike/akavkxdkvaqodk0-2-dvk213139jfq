package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * check
 * @author 
 */
public class Check implements Serializable {
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
    private BigDecimal fee1;

    /**
     * 金额
     */
    private BigDecimal fee2;

    /**
     * 费用产生日期
     */
    private Date feeappeardate;

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

    public Date getFeeappeardate() {
        return feeappeardate;
    }

    public void setFeeappeardate(Date feeappeardate) {
        this.feeappeardate = feeappeardate;
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
        Check other = (Check) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getPatientname() == null ? other.getPatientname() == null : this.getPatientname().equals(other.getPatientname()))
            && (this.getFeecategory() == null ? other.getFeecategory() == null : this.getFeecategory().equals(other.getFeecategory()))
            && (this.getFee1() == null ? other.getFee1() == null : this.getFee1().equals(other.getFee1()))
            && (this.getFee2() == null ? other.getFee2() == null : this.getFee2().equals(other.getFee2()))
            && (this.getFeeappeardate() == null ? other.getFeeappeardate() == null : this.getFeeappeardate().equals(other.getFeeappeardate()));
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
        result = prime * result + ((getFee1() == null) ? 0 : getFee1().hashCode());
        result = prime * result + ((getFee2() == null) ? 0 : getFee2().hashCode());
        result = prime * result + ((getFeeappeardate() == null) ? 0 : getFeeappeardate().hashCode());
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
        sb.append(", fee1=").append(fee1);
        sb.append(", fee2=").append(fee2);
        sb.append(", feeappeardate=").append(feeappeardate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}