package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * schedulerule
 *
 * @author LiJie
 */
public class ScheduleRule implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 星期：1星期一、2星期二...7星期日
     */
    private Integer week;
    /**
     * 科室ID
     */
    private Integer deptID;
    /**
     * 排班医生ID
     */
    private Integer onDutyDoctorID;
    /**
     * 号别：168普通、169专家、170急诊
     */
    private Integer levelNameID;
    /**
     * 午别
     */
    private Integer onDutyTimeID;
    /**
     * 排班限额
     */
    private Integer limitNumber;
    private Integer appearUserID;
    private Integer changeUserID;
    private Date appearDate;
    private Date changeDate;
    /**
     * 状态：1有效，2无效
     */
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
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
        ScheduleRule other = (ScheduleRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
                && (this.getDeptID() == null ? other.getDeptID() == null : this.getDeptID().equals(other.getDeptID()))
                && (this.getOnDutyDoctorID() == null ? other.getOnDutyDoctorID() == null : this.getOnDutyDoctorID().equals(other.getOnDutyDoctorID()))
                && (this.getLevelNameID() == null ? other.getLevelNameID() == null : this.getLevelNameID().equals(other.getLevelNameID()))
                && (this.getOnDutyTimeID() == null ? other.getOnDutyTimeID() == null : this.getOnDutyTimeID().equals(other.getOnDutyTimeID()))
                && (this.getLimitNumber() == null ? other.getLimitNumber() == null : this.getLimitNumber().equals(other.getLimitNumber()))
                && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getDeptID() == null) ? 0 : getDeptID().hashCode());
        result = prime * result + ((getOnDutyDoctorID() == null) ? 0 : getOnDutyDoctorID().hashCode());
        result = prime * result + ((getLevelNameID() == null) ? 0 : getLevelNameID().hashCode());
        result = prime * result + ((getOnDutyTimeID() == null) ? 0 : getOnDutyTimeID().hashCode());
        result = prime * result + ((getLimitNumber() == null) ? 0 : getLimitNumber().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
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
        sb.append(", week=").append(week);
        sb.append(", deptID=").append(deptID);
        sb.append(", onDutyDoctorID=").append(onDutyDoctorID);
        sb.append(", levelNameID=").append(levelNameID);
        sb.append(", onDutyTimeID=").append(onDutyTimeID);
        sb.append(", limitNumber=").append(limitNumber);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}