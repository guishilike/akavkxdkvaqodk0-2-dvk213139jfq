package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * constantitem
 * @author 
 */
public class Constantitem implements Serializable {
    private Integer id;

    private Integer constanttypeid;

    private String constantcode;

    private String constant;

    /**
     * 状态 1：有效，2无效
     */
    private String status;

    private Date appeardate;

    private Integer apearuserid;

    private Date changedate;

    private Integer changeuserid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConstanttypeid() {
        return constanttypeid;
    }

    public void setConstanttypeid(Integer constanttypeid) {
        this.constanttypeid = constanttypeid;
    }

    public String getConstantcode() {
        return constantcode;
    }

    public void setConstantcode(String constantcode) {
        this.constantcode = constantcode;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public Integer getApearuserid() {
        return apearuserid;
    }

    public void setApearuserid(Integer apearuserid) {
        this.apearuserid = apearuserid;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }

    public Integer getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(Integer changeuserid) {
        this.changeuserid = changeuserid;
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
        Constantitem other = (Constantitem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConstanttypeid() == null ? other.getConstanttypeid() == null : this.getConstanttypeid().equals(other.getConstanttypeid()))
            && (this.getConstantcode() == null ? other.getConstantcode() == null : this.getConstantcode().equals(other.getConstantcode()))
            && (this.getConstant() == null ? other.getConstant() == null : this.getConstant().equals(other.getConstant()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getApearuserid() == null ? other.getApearuserid() == null : this.getApearuserid().equals(other.getApearuserid()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConstanttypeid() == null) ? 0 : getConstanttypeid().hashCode());
        result = prime * result + ((getConstantcode() == null) ? 0 : getConstantcode().hashCode());
        result = prime * result + ((getConstant() == null) ? 0 : getConstant().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getApearuserid() == null) ? 0 : getApearuserid().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", constanttypeid=").append(constanttypeid);
        sb.append(", constantcode=").append(constantcode);
        sb.append(", constant=").append(constant);
        sb.append(", status=").append(status);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", apearuserid=").append(apearuserid);
        sb.append(", changedate=").append(changedate);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}