package edu.neu.hospital.bean;

import java.io.Serializable;

/**
 * checktemplatedetail
 * @author 
 */
public class Checktemplatedetail implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 组套id
     */
    private Integer checktemplateid;

    /**
     * 非药品目录id
     */
    private Integer fmeditemid;

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

    public Integer getChecktemplateid() {
        return checktemplateid;
    }

    public void setChecktemplateid(Integer checktemplateid) {
        this.checktemplateid = checktemplateid;
    }

    public Integer getFmeditemid() {
        return fmeditemid;
    }

    public void setFmeditemid(Integer fmeditemid) {
        this.fmeditemid = fmeditemid;
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
        Checktemplatedetail other = (Checktemplatedetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChecktemplateid() == null ? other.getChecktemplateid() == null : this.getChecktemplateid().equals(other.getChecktemplateid()))
            && (this.getFmeditemid() == null ? other.getFmeditemid() == null : this.getFmeditemid().equals(other.getFmeditemid()))
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
        result = prime * result + ((getChecktemplateid() == null) ? 0 : getChecktemplateid().hashCode());
        result = prime * result + ((getFmeditemid() == null) ? 0 : getFmeditemid().hashCode());
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
        sb.append(", checktemplateid=").append(checktemplateid);
        sb.append(", fmeditemid=").append(fmeditemid);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}