package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * constantitem
 *
 * @author
 */
public class ConstantItem implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer constantTypeID;
    private String constantCode;
    private String constantName;
    private Date appearDate;
    private Integer apearUserID;
    private Date changeDate;
    private Integer changeUserID;
    /**
     * 状态 1：有效，2无效
     */
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConstantTypeID() {
        return constantTypeID;
    }

    public void setConstantTypeID(Integer constantTypeID) {
        this.constantTypeID = constantTypeID;
    }

    public String getConstantCode() {
        return constantCode;
    }

    public void setConstantCode(String constantCode) {
        this.constantCode = constantCode;
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getApearUserID() {
        return apearUserID;
    }

    public void setApearUserID(Integer apearUserID) {
        this.apearUserID = apearUserID;
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
        ConstantItem other = (ConstantItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getConstantTypeID() == null ? other.getConstantTypeID() == null : this.getConstantTypeID().equals(other.getConstantTypeID()))
                && (this.getConstantCode() == null ? other.getConstantCode() == null : this.getConstantCode().equals(other.getConstantCode()))
                && (this.getConstantName() == null ? other.getConstantName() == null : this.getConstantName().equals(other.getConstantName()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getApearUserID() == null ? other.getApearUserID() == null : this.getApearUserID().equals(other.getApearUserID()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConstantTypeID() == null) ? 0 : getConstantTypeID().hashCode());
        result = prime * result + ((getConstantCode() == null) ? 0 : getConstantCode().hashCode());
        result = prime * result + ((getConstantName() == null) ? 0 : getConstantName().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getApearUserID() == null) ? 0 : getApearUserID().hashCode());
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
        sb.append(", constantTypeID=").append(constantTypeID);
        sb.append(", constantCode=").append(constantCode);
        sb.append(", constantName=").append(constantName);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", apearUserID=").append(apearUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}