package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * department
 * @author 
 */
public class Department implements Serializable {
    /**
     * 科室编号
     */
    private Integer id;

    /**
     * 科室编码
     */
    private String deptcode;

    /**
     * 科室名称
     */
    private String deptname;

    /**
     * 科室分类
     */
    private Integer deptcategoryid;

    /**
     * 科室类型
     */
    private Integer depttype;

    /**
     * 创建日期
     */
    private Date appeardate;

    /**
     * 创建人
     */
    private Integer appearuserid;

    /**
     * 修改日期
     */
    private Date changedate;

    /**
     * 修改人
     */
    private Integer changeuserid;

    /**
     * 状态
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getDeptcategoryid() {
        return deptcategoryid;
    }

    public void setDeptcategoryid(Integer deptcategoryid) {
        this.deptcategoryid = deptcategoryid;
    }

    public Integer getDepttype() {
        return depttype;
    }

    public void setDepttype(Integer depttype) {
        this.depttype = depttype;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public Integer getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(Integer appearuserid) {
        this.appearuserid = appearuserid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeptcode() == null ? other.getDeptcode() == null : this.getDeptcode().equals(other.getDeptcode()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getDeptcategoryid() == null ? other.getDeptcategoryid() == null : this.getDeptcategoryid().equals(other.getDeptcategoryid()))
            && (this.getDepttype() == null ? other.getDepttype() == null : this.getDepttype().equals(other.getDepttype()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptcode() == null) ? 0 : getDeptcode().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getDeptcategoryid() == null) ? 0 : getDeptcategoryid().hashCode());
        result = prime * result + ((getDepttype() == null) ? 0 : getDepttype().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deptcode=").append(deptcode);
        sb.append(", deptname=").append(deptname);
        sb.append(", deptcategoryid=").append(deptcategoryid);
        sb.append(", depttype=").append(depttype);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changedate=").append(changedate);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}