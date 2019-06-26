package edu.neu.hospital.bean.baseBean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * departmentview
 * @author 
 */
public class DepartmentView implements Serializable {
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
     * 科室类型
     */
    private Integer deptTypeID;

    private String deptTypeCode;

    private String deptType;

    /**
     * 科室分类
     */
    private Integer deptCategoryID;

    private String deptCategoryCode;

    private String deptCategory;

    /**
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appearDate;

    /**
     * 创建人
     */
    private Integer appearUserID;

    /**
     * 修改日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    /**
     * 修改人
     */
    private Integer changeUserID;

    /**
     * 登录名
     */
    private String appearUserName;

    /**
     * 登录名
     */
    private String changeUserName;

    private static final long serialVersionUID = 1L;

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

    public Integer getDeptTypeID() {
        return deptTypeID;
    }

    public void setDeptTypeID(Integer deptTypeID) {
        this.deptTypeID = deptTypeID;
    }

    public String getDeptTypeCode() {
        return deptTypeCode;
    }

    public void setDeptTypeCode(String deptTypeCode) {
        this.deptTypeCode = deptTypeCode;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public Integer getDeptCategoryID() {
        return deptCategoryID;
    }

    public void setDeptCategoryID(Integer deptCategoryID) {
        this.deptCategoryID = deptCategoryID;
    }

    public String getDeptCategoryCode() {
        return deptCategoryCode;
    }

    public void setDeptCategoryCode(String deptCategoryCode) {
        this.deptCategoryCode = deptCategoryCode;
    }

    public String getDeptCategory() {
        return deptCategory;
    }

    public void setDeptCategory(String deptCategory) {
        this.deptCategory = deptCategory;
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

    public String getAppearUserName() {
        return appearUserName;
    }

    public void setAppearUserName(String appearUserName) {
        this.appearUserName = appearUserName;
    }

    public String getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(String changeUserName) {
        this.changeUserName = changeUserName;
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
        DepartmentView other = (DepartmentView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDeptTypeID() == null ? other.getDeptTypeID() == null : this.getDeptTypeID().equals(other.getDeptTypeID()))
            && (this.getDeptTypeCode() == null ? other.getDeptTypeCode() == null : this.getDeptTypeCode().equals(other.getDeptTypeCode()))
            && (this.getDeptType() == null ? other.getDeptType() == null : this.getDeptType().equals(other.getDeptType()))
            && (this.getDeptCategoryID() == null ? other.getDeptCategoryID() == null : this.getDeptCategoryID().equals(other.getDeptCategoryID()))
            && (this.getDeptCategoryCode() == null ? other.getDeptCategoryCode() == null : this.getDeptCategoryCode().equals(other.getDeptCategoryCode()))
            && (this.getDeptCategory() == null ? other.getDeptCategory() == null : this.getDeptCategory().equals(other.getDeptCategory()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDeptTypeID() == null) ? 0 : getDeptTypeID().hashCode());
        result = prime * result + ((getDeptTypeCode() == null) ? 0 : getDeptTypeCode().hashCode());
        result = prime * result + ((getDeptType() == null) ? 0 : getDeptType().hashCode());
        result = prime * result + ((getDeptCategoryID() == null) ? 0 : getDeptCategoryID().hashCode());
        result = prime * result + ((getDeptCategoryCode() == null) ? 0 : getDeptCategoryCode().hashCode());
        result = prime * result + ((getDeptCategory() == null) ? 0 : getDeptCategory().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearUserName() == null) ? 0 : getAppearUserName().hashCode());
        result = prime * result + ((getChangeUserName() == null) ? 0 : getChangeUserName().hashCode());
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
        sb.append(", deptTypeID=").append(deptTypeID);
        sb.append(", deptTypeCode=").append(deptTypeCode);
        sb.append(", deptType=").append(deptType);
        sb.append(", deptCategoryID=").append(deptCategoryID);
        sb.append(", deptCategoryCode=").append(deptCategoryCode);
        sb.append(", deptCategory=").append(deptCategory);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}