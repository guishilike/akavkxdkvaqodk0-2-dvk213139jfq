package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * medicinesmaterialslist
 * @author 
 */
public class Medicinesmaterialslist implements Serializable {
    /**
     * 药品材料编号
     */
    private Integer id;

    /**
     * 项目编号 检查或者处置
     */
    private Integer itemsid;

    /**
     * 非药品项目编号
     */
    private Integer fmeditemid;

    /**
     * 药品材料编号
     */
    private Integer medicinesmaterialsid;

    /**
     * 用量
     */
    private BigDecimal dosage;

    /**
     * 创建人
     */
    private String appearuserid;

    /**
     * 创建日期
     */
    private Date appeardate;

    /**
     * 修改人
     */
    private String changeuserid;

    /**
     * 修改日期
     */
    private Date changedate;

    /**
     * 状态
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

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getFmeditemid() {
        return fmeditemid;
    }

    public void setFmeditemid(Integer fmeditemid) {
        this.fmeditemid = fmeditemid;
    }

    public Integer getMedicinesmaterialsid() {
        return medicinesmaterialsid;
    }

    public void setMedicinesmaterialsid(Integer medicinesmaterialsid) {
        this.medicinesmaterialsid = medicinesmaterialsid;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(String appearuserid) {
        this.appearuserid = appearuserid;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public String getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(String changeuserid) {
        this.changeuserid = changeuserid;
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
        Medicinesmaterialslist other = (Medicinesmaterialslist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemsid() == null ? other.getItemsid() == null : this.getItemsid().equals(other.getItemsid()))
            && (this.getFmeditemid() == null ? other.getFmeditemid() == null : this.getFmeditemid().equals(other.getFmeditemid()))
            && (this.getMedicinesmaterialsid() == null ? other.getMedicinesmaterialsid() == null : this.getMedicinesmaterialsid().equals(other.getMedicinesmaterialsid()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
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
        result = prime * result + ((getItemsid() == null) ? 0 : getItemsid().hashCode());
        result = prime * result + ((getFmeditemid() == null) ? 0 : getFmeditemid().hashCode());
        result = prime * result + ((getMedicinesmaterialsid() == null) ? 0 : getMedicinesmaterialsid().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
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
        sb.append(", itemsid=").append(itemsid);
        sb.append(", fmeditemid=").append(fmeditemid);
        sb.append(", medicinesmaterialsid=").append(medicinesmaterialsid);
        sb.append(", dosage=").append(dosage);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", changedate=").append(changedate);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}