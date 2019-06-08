package edu.neu.hospital.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * checktemplate
 * @author 
 */
public class Checktemplate implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 医生ID
     */
    private Integer doctorid;

    /**
     * 组合编码
     */
    private String templatecode;

    /**
     * 组合名称
     */
    private String name;

    private Date appeartime;

    private Date changetime;

    /**
     * 状态
     */
    private String status;

    /**
     * 保留1
     */
    private String reserve1;

    /**
     * 保留2
     */
    private String reserve2;

    /**
     * 保留3
     */
    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getTemplatecode() {
        return templatecode;
    }

    public void setTemplatecode(String templatecode) {
        this.templatecode = templatecode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAppeartime() {
        return appeartime;
    }

    public void setAppeartime(Date appeartime) {
        this.appeartime = appeartime;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
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

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
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
        Checktemplate other = (Checktemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getTemplatecode() == null ? other.getTemplatecode() == null : this.getTemplatecode().equals(other.getTemplatecode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAppeartime() == null ? other.getAppeartime() == null : this.getAppeartime().equals(other.getAppeartime()))
            && (this.getChangetime() == null ? other.getChangetime() == null : this.getChangetime().equals(other.getChangetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getTemplatecode() == null) ? 0 : getTemplatecode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAppeartime() == null) ? 0 : getAppeartime().hashCode());
        result = prime * result + ((getChangetime() == null) ? 0 : getChangetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", templatecode=").append(templatecode);
        sb.append(", name=").append(name);
        sb.append(", appeartime=").append(appeartime);
        sb.append(", changetime=").append(changetime);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}