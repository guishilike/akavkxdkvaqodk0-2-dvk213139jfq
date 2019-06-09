package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * department
 *
 * @author Lijie
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 科室编号
     */
    private Integer id;
    /**
     * 科室编码
     */
    private String deptCode;
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
     * 创建日期
     */
    private Date appearDate;
    /**
     * 创建人
     */
    private Integer appearUserID;
    /**
     * 修改日期
     */
    private Date changeDate;
    /**
     * 修改人
     */
    private Integer changeUserID;
    /**
     * 状态
     */
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
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
                && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
                && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
                && (this.getDeptCategoryID() == null ? other.getDeptCategoryID() == null : this.getDeptCategoryID().equals(other.getDeptCategoryID()))
                && (this.getDeptTypeID() == null ? other.getDeptTypeID() == null : this.getDeptTypeID().equals(other.getDeptTypeID()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDeptCategoryID() == null) ? 0 : getDeptCategoryID().hashCode());
        result = prime * result + ((getDeptTypeID() == null) ? 0 : getDeptTypeID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
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
        sb.append(", deptCode=").append(deptCode);
        sb.append(", deptName=").append(deptName);
        sb.append(", deptCategoryID=").append(deptCategoryID);
        sb.append(", deptTypeID=").append(deptTypeID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}