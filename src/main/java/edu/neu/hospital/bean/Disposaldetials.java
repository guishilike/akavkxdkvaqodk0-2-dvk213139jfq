package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * disposaldetials
 * @author 
 */
public class Disposaldetials implements Serializable {
    private Integer id;

    /**
     * 处置ID
     */
    private Integer disposalid;

    /**
     * 非药品项目ID
     */
    private Integer fmeditemid;

    private Integer appearuserid;

    private Integer changeuserid;

    private Date appeardate;

    private Date changedate;

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

    public Integer getDisposalid() {
        return disposalid;
    }

    public void setDisposalid(Integer disposalid) {
        this.disposalid = disposalid;
    }

    public Integer getFmeditemid() {
        return fmeditemid;
    }

    public void setFmeditemid(Integer fmeditemid) {
        this.fmeditemid = fmeditemid;
    }

    public Integer getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(Integer appearuserid) {
        this.appearuserid = appearuserid;
    }

    public Integer getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(Integer changeuserid) {
        this.changeuserid = changeuserid;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
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
        Disposaldetials other = (Disposaldetials) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDisposalid() == null ? other.getDisposalid() == null : this.getDisposalid().equals(other.getDisposalid()))
            && (this.getFmeditemid() == null ? other.getFmeditemid() == null : this.getFmeditemid().equals(other.getFmeditemid()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDisposalid() == null) ? 0 : getDisposalid().hashCode());
        result = prime * result + ((getFmeditemid() == null) ? 0 : getFmeditemid().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
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
        sb.append(", disposalid=").append(disposalid);
        sb.append(", fmeditemid=").append(fmeditemid);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", changedate=").append(changedate);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}