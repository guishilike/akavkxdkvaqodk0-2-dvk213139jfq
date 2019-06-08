package edu.neu.hospital.bean;

import java.io.Serializable;

/**
 * schedulerule
 * @author 
 */
public class Schedulerule implements Serializable {
    private Integer id;

    /**
     * 星期：1星期一、2星期二...7星期日
     */
    private Integer week;

    /**
     * 科室名称
     */
    private String deptname;

    /**
     * 排班医生
     */
    private Integer ondutydoctorid;

    /**
     * 号别：168普通、169专家、170急诊
     */
    private Integer levelname;

    /**
     * 状态：1有效，2无效
     */
    private String status;

    /**
     * 午别
     */
    private Integer ondutytime;

    /**
     * 排班限额
     */
    private Integer limitnumber;

    private String reserve1;

    private String reserve2;

    private static final long serialVersionUID = 1L;

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

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getOndutydoctorid() {
        return ondutydoctorid;
    }

    public void setOndutydoctorid(Integer ondutydoctorid) {
        this.ondutydoctorid = ondutydoctorid;
    }

    public Integer getLevelname() {
        return levelname;
    }

    public void setLevelname(Integer levelname) {
        this.levelname = levelname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOndutytime() {
        return ondutytime;
    }

    public void setOndutytime(Integer ondutytime) {
        this.ondutytime = ondutytime;
    }

    public Integer getLimitnumber() {
        return limitnumber;
    }

    public void setLimitnumber(Integer limitnumber) {
        this.limitnumber = limitnumber;
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
        Schedulerule other = (Schedulerule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getOndutydoctorid() == null ? other.getOndutydoctorid() == null : this.getOndutydoctorid().equals(other.getOndutydoctorid()))
            && (this.getLevelname() == null ? other.getLevelname() == null : this.getLevelname().equals(other.getLevelname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOndutytime() == null ? other.getOndutytime() == null : this.getOndutytime().equals(other.getOndutytime()))
            && (this.getLimitnumber() == null ? other.getLimitnumber() == null : this.getLimitnumber().equals(other.getLimitnumber()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getOndutydoctorid() == null) ? 0 : getOndutydoctorid().hashCode());
        result = prime * result + ((getLevelname() == null) ? 0 : getLevelname().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOndutytime() == null) ? 0 : getOndutytime().hashCode());
        result = prime * result + ((getLimitnumber() == null) ? 0 : getLimitnumber().hashCode());
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
        sb.append(", week=").append(week);
        sb.append(", deptname=").append(deptname);
        sb.append(", ondutydoctorid=").append(ondutydoctorid);
        sb.append(", levelname=").append(levelname);
        sb.append(", status=").append(status);
        sb.append(", ondutytime=").append(ondutytime);
        sb.append(", limitnumber=").append(limitnumber);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}