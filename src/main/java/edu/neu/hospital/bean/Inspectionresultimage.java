package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * inspectionresultimage
 * @author 
 */
public class Inspectionresultimage implements Serializable {
    private Integer id;

    /**
     * 检查检验结果id
     */
    private Integer inspectionresultid;

    /**
     * 目录
     */
    private String catalog;

    private Integer appearuserid;

    private Integer changeuserid;

    private Date appearuserdate;

    private Date changeuserdate;

    private String status;

    private String reserve1;

    private String reserve2;

    /**
     * 图片名字
     */
    private byte[] imagename;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInspectionresultid() {
        return inspectionresultid;
    }

    public void setInspectionresultid(Integer inspectionresultid) {
        this.inspectionresultid = inspectionresultid;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
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

    public Date getAppearuserdate() {
        return appearuserdate;
    }

    public void setAppearuserdate(Date appearuserdate) {
        this.appearuserdate = appearuserdate;
    }

    public Date getChangeuserdate() {
        return changeuserdate;
    }

    public void setChangeuserdate(Date changeuserdate) {
        this.changeuserdate = changeuserdate;
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

    public byte[] getImagename() {
        return imagename;
    }

    public void setImagename(byte[] imagename) {
        this.imagename = imagename;
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
        Inspectionresultimage other = (Inspectionresultimage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInspectionresultid() == null ? other.getInspectionresultid() == null : this.getInspectionresultid().equals(other.getInspectionresultid()))
            && (this.getCatalog() == null ? other.getCatalog() == null : this.getCatalog().equals(other.getCatalog()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getAppearuserdate() == null ? other.getAppearuserdate() == null : this.getAppearuserdate().equals(other.getAppearuserdate()))
            && (this.getChangeuserdate() == null ? other.getChangeuserdate() == null : this.getChangeuserdate().equals(other.getChangeuserdate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (Arrays.equals(this.getImagename(), other.getImagename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInspectionresultid() == null) ? 0 : getInspectionresultid().hashCode());
        result = prime * result + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getAppearuserdate() == null) ? 0 : getAppearuserdate().hashCode());
        result = prime * result + ((getChangeuserdate() == null) ? 0 : getChangeuserdate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + (Arrays.hashCode(getImagename()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inspectionresultid=").append(inspectionresultid);
        sb.append(", catalog=").append(catalog);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", appearuserdate=").append(appearuserdate);
        sb.append(", changeuserdate=").append(changeuserdate);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", imagename=").append(imagename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}