package edu.neu.hospital.bean.baseBean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * scheduleview
 * @author 
 */
public class ScheduleView implements Serializable {
    private Integer id;

    /**
     * 排班时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date onDutyDate;

    /**
     * 科室ID
     */

    private Integer deptID;

    /**
     * 科室编码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 排班医生ID
     */
    private Integer onDutyDoctorID;

    /**
     * 登录名
     */
    private String userName;

    /**
     * 号别ID：168普通、169专家、170急诊
     */
    private Integer levelNameID;

    private String levelCode;

    private String levelName;

    /**
     * 午别ID
     */
    private Integer onDutyTimeID;

    private String onDutyTimeCode;

    private String onDutyTimeName;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appearDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    /**
     * 科室分类
     */
    private Integer deptCategoryID;

    /**
     * 科室类型
     */
    private Integer deptTypeID;

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

    public Integer getOnDutyDoctorID() {
        return onDutyDoctorID;
    }

    public void setOnDutyDoctorID(Integer onDutyDoctorID) {
        this.onDutyDoctorID = onDutyDoctorID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getLevelNameID() {
        return levelNameID;
    }

    public void setLevelNameID(Integer levelNameID) {
        this.levelNameID = levelNameID;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getOnDutyTimeID() {
        return onDutyTimeID;
    }

    public void setOnDutyTimeID(Integer onDutyTimeID) {
        this.onDutyTimeID = onDutyTimeID;
    }

    public String getOnDutyTimeCode() {
        return onDutyTimeCode;
    }

    public void setOnDutyTimeCode(String onDutyTimeCode) {
        this.onDutyTimeCode = onDutyTimeCode;
    }

    public String getOnDutyTimeName() {
        return onDutyTimeName;
    }

    public void setOnDutyTimeName(String onDutyTimeName) {
        this.onDutyTimeName = onDutyTimeName;
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
        ScheduleView other = (ScheduleView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOnDutyDate() == null ? other.getOnDutyDate() == null : this.getOnDutyDate().equals(other.getOnDutyDate()))
            && (this.getDeptID() == null ? other.getDeptID() == null : this.getDeptID().equals(other.getDeptID()))
            && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getOnDutyDoctorID() == null ? other.getOnDutyDoctorID() == null : this.getOnDutyDoctorID().equals(other.getOnDutyDoctorID()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getLevelNameID() == null ? other.getLevelNameID() == null : this.getLevelNameID().equals(other.getLevelNameID()))
            && (this.getLevelCode() == null ? other.getLevelCode() == null : this.getLevelCode().equals(other.getLevelCode()))
            && (this.getLevelName() == null ? other.getLevelName() == null : this.getLevelName().equals(other.getLevelName()))
            && (this.getOnDutyTimeID() == null ? other.getOnDutyTimeID() == null : this.getOnDutyTimeID().equals(other.getOnDutyTimeID()))
            && (this.getOnDutyTimeCode() == null ? other.getOnDutyTimeCode() == null : this.getOnDutyTimeCode().equals(other.getOnDutyTimeCode()))
            && (this.getOnDutyTimeName() == null ? other.getOnDutyTimeName() == null : this.getOnDutyTimeName().equals(other.getOnDutyTimeName()))
            && (this.getLimitNumber() == null ? other.getLimitNumber() == null : this.getLimitNumber().equals(other.getLimitNumber()))
            && (this.getRemainingAmount() == null ? other.getRemainingAmount() == null : this.getRemainingAmount().equals(other.getRemainingAmount()))
            && (this.getRuleID() == null ? other.getRuleID() == null : this.getRuleID().equals(other.getRuleID()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getDeptCategoryID() == null ? other.getDeptCategoryID() == null : this.getDeptCategoryID().equals(other.getDeptCategoryID()))
            && (this.getDeptTypeID() == null ? other.getDeptTypeID() == null : this.getDeptTypeID().equals(other.getDeptTypeID()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOnDutyDate() == null) ? 0 : getOnDutyDate().hashCode());
        result = prime * result + ((getDeptID() == null) ? 0 : getDeptID().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getOnDutyDoctorID() == null) ? 0 : getOnDutyDoctorID().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getLevelNameID() == null) ? 0 : getLevelNameID().hashCode());
        result = prime * result + ((getLevelCode() == null) ? 0 : getLevelCode().hashCode());
        result = prime * result + ((getLevelName() == null) ? 0 : getLevelName().hashCode());
        result = prime * result + ((getOnDutyTimeID() == null) ? 0 : getOnDutyTimeID().hashCode());
        result = prime * result + ((getOnDutyTimeCode() == null) ? 0 : getOnDutyTimeCode().hashCode());
        result = prime * result + ((getOnDutyTimeName() == null) ? 0 : getOnDutyTimeName().hashCode());
        result = prime * result + ((getLimitNumber() == null) ? 0 : getLimitNumber().hashCode());
        result = prime * result + ((getRemainingAmount() == null) ? 0 : getRemainingAmount().hashCode());
        result = prime * result + ((getRuleID() == null) ? 0 : getRuleID().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getDeptCategoryID() == null) ? 0 : getDeptCategoryID().hashCode());
        result = prime * result + ((getDeptTypeID() == null) ? 0 : getDeptTypeID().hashCode());
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
        sb.append(", onDutyDate=").append(onDutyDate);
        sb.append(", deptID=").append(deptID);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", deptName=").append(deptName);
        sb.append(", onDutyDoctorID=").append(onDutyDoctorID);
        sb.append(", userName=").append(userName);
        sb.append(", levelNameID=").append(levelNameID);
        sb.append(", levelCode=").append(levelCode);
        sb.append(", levelName=").append(levelName);
        sb.append(", onDutyTimeID=").append(onDutyTimeID);
        sb.append(", onDutyTimeCode=").append(onDutyTimeCode);
        sb.append(", onDutyTimeName=").append(onDutyTimeName);
        sb.append(", limitNumber=").append(limitNumber);
        sb.append(", remainingAmount=").append(remainingAmount);
        sb.append(", ruleID=").append(ruleID);
        sb.append(", status=").append(status);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", deptCategoryID=").append(deptCategoryID);
        sb.append(", deptTypeID=").append(deptTypeID);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}