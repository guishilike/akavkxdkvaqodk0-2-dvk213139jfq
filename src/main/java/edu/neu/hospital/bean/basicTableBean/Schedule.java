package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * schedule
 *
 * @author LiJie
 */
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 排班时间
     */
    private Date onDutyDate;
    /**
     * 科室ID
     */
    private Integer deptID;
    /**
     * 排班医生ID
     */
    private Integer onDutyDoctorID;
    /**
     * 号别ID：168普通、169专家、170急诊
     */
    private Integer levelNameID;
    /**
     * 午别ID
     */
    private Integer onDutyTimeID;
    /**
     * 排班限额
     */
    private Integer limitNumber;
    /**
     * 剩余号数
     */
    private Integer remainingAmount;
    /**
     * 排班规则ID
     */
    private Integer ruleID;
    /**
     * 有效状态：1有效、2无效
     */
    private String status;
    private Integer appearUserID;
    private Integer changeUserID;
    private Date appearDate;
    private Date changeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public Integer getOnDutyDoctorID() {
        return onDutyDoctorID;
    }

    public void setOnDutyDoctorID(Integer onDutyDoctorID) {
        this.onDutyDoctorID = onDutyDoctorID;
    }

    public Integer getLevelNameID() {
        return levelNameID;
    }

    public void setLevelNameID(Integer levelNameID) {
        this.levelNameID = levelNameID;
    }

    public Integer getOnDutyTimeID() {
        return onDutyTimeID;
    }

    public void setOnDutyTimeID(Integer onDutyTimeID) {
        this.onDutyTimeID = onDutyTimeID;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    public Integer getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Integer remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Integer getRuleID() {
        return ruleID;
    }

    public void setRuleID(Integer ruleID) {
        this.ruleID = ruleID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
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
        Schedule other = (Schedule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOnDutyDate() == null ? other.getOnDutyDate() == null : this.getOnDutyDate().equals(other.getOnDutyDate()))
                && (this.getDeptID() == null ? other.getDeptID() == null : this.getDeptID().equals(other.getDeptID()))
                && (this.getOnDutyDoctorID() == null ? other.getOnDutyDoctorID() == null : this.getOnDutyDoctorID().equals(other.getOnDutyDoctorID()))
                && (this.getLevelNameID() == null ? other.getLevelNameID() == null : this.getLevelNameID().equals(other.getLevelNameID()))
                && (this.getOnDutyTimeID() == null ? other.getOnDutyTimeID() == null : this.getOnDutyTimeID().equals(other.getOnDutyTimeID()))
                && (this.getLimitNumber() == null ? other.getLimitNumber() == null : this.getLimitNumber().equals(other.getLimitNumber()))
                && (this.getRemainingAmount() == null ? other.getRemainingAmount() == null : this.getRemainingAmount().equals(other.getRemainingAmount()))
                && (this.getRuleID() == null ? other.getRuleID() == null : this.getRuleID().equals(other.getRuleID()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOnDutyDate() == null) ? 0 : getOnDutyDate().hashCode());
        result = prime * result + ((getDeptID() == null) ? 0 : getDeptID().hashCode());
        result = prime * result + ((getOnDutyDoctorID() == null) ? 0 : getOnDutyDoctorID().hashCode());
        result = prime * result + ((getLevelNameID() == null) ? 0 : getLevelNameID().hashCode());
        result = prime * result + ((getOnDutyTimeID() == null) ? 0 : getOnDutyTimeID().hashCode());
        result = prime * result + ((getLimitNumber() == null) ? 0 : getLimitNumber().hashCode());
        result = prime * result + ((getRemainingAmount() == null) ? 0 : getRemainingAmount().hashCode());
        result = prime * result + ((getRuleID() == null) ? 0 : getRuleID().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", onDutyDate=").append(onDutyDate);
        sb.append(", deptID=").append(deptID);
        sb.append(", onDutyDoctorID=").append(onDutyDoctorID);
        sb.append(", levelNameID=").append(levelNameID);
        sb.append(", onDutyTimeID=").append(onDutyTimeID);
        sb.append(", limitNumber=").append(limitNumber);
        sb.append(", remainingAmount=").append(remainingAmount);
        sb.append(", ruleID=").append(ruleID);
        sb.append(", status=").append(status);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}