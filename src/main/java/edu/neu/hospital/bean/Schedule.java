package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * schedule
 * @author 
 */
public class Schedule implements Serializable {
    private Integer id;

    /**
     * 排班时间
     */
    private Date onDutyDate;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 排班医生
     */
    private Integer onDutyDoctorID;

    /**
     * 号别：168普通、169专家、170急诊
     */
    private Integer levelName;

    /**
     * 午别
     */
    private Integer onDutyTime;

    /**
     * 排班限额
     */
    private Integer limitNumber;

    /**
     * 剩余号数
     */
    private Integer remainingAmount;

    /**
     * 有效状态：1有效、2无效
     */
    private String status;

    private String reserve1;

    private String reserve2;

    private static final long serialVersionUID = 1L;

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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getOnDutyDoctorID() {
        return onDutyDoctorID;
    }

    public void setOnDutyDoctorID(Integer onDutyDoctorID) {
        this.onDutyDoctorID = onDutyDoctorID;
    }

    public Integer getLevelName() {
        return levelName;
    }

    public void setLevelName(Integer levelName) {
        this.levelName = levelName;
    }

    public Integer getOnDutyTime() {
        return onDutyTime;
    }

    public void setOnDutyTime(Integer onDutyTime) {
        this.onDutyTime = onDutyTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
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
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getOnDutyDoctorID() == null ? other.getOnDutyDoctorID() == null : this.getOnDutyDoctorID().equals(other.getOnDutyDoctorID()))
            && (this.getLevelName() == null ? other.getLevelName() == null : this.getLevelName().equals(other.getLevelName()))
            && (this.getOnDutyTime() == null ? other.getOnDutyTime() == null : this.getOnDutyTime().equals(other.getOnDutyTime()))
            && (this.getLimitNumber() == null ? other.getLimitNumber() == null : this.getLimitNumber().equals(other.getLimitNumber()))
            && (this.getRemainingAmount() == null ? other.getRemainingAmount() == null : this.getRemainingAmount().equals(other.getRemainingAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOnDutyDate() == null) ? 0 : getOnDutyDate().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getOnDutyDoctorID() == null) ? 0 : getOnDutyDoctorID().hashCode());
        result = prime * result + ((getLevelName() == null) ? 0 : getLevelName().hashCode());
        result = prime * result + ((getOnDutyTime() == null) ? 0 : getOnDutyTime().hashCode());
        result = prime * result + ((getLimitNumber() == null) ? 0 : getLimitNumber().hashCode());
        result = prime * result + ((getRemainingAmount() == null) ? 0 : getRemainingAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
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
        sb.append(", deptName=").append(deptName);
        sb.append(", onDutyDoctorID=").append(onDutyDoctorID);
        sb.append(", levelName=").append(levelName);
        sb.append(", onDutyTime=").append(onDutyTime);
        sb.append(", limitNumber=").append(limitNumber);
        sb.append(", remainingAmount=").append(remainingAmount);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}