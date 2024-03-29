package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;

/**
 * authority
 *
 * @author
 */
public class Authority implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 上级权限ID
     */
    private Integer superID;
    /**
     * 权限名
     */
    private String authorityName;
    /**
     * 功能连接
     */
    private String authorityConn;
    private String status;
    private String reserve1;
    private String reserve2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSuperID() {
        return superID;
    }

    public void setSuperID(Integer superID) {
        this.superID = superID;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getAuthorityConn() {
        return authorityConn;
    }

    public void setAuthorityConn(String authorityConn) {
        this.authorityConn = authorityConn;
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
        Authority other = (Authority) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getSuperID() == null ? other.getSuperID() == null : this.getSuperID().equals(other.getSuperID()))
                && (this.getAuthorityName() == null ? other.getAuthorityName() == null : this.getAuthorityName().equals(other.getAuthorityName()))
                && (this.getAuthorityConn() == null ? other.getAuthorityConn() == null : this.getAuthorityConn().equals(other.getAuthorityConn()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
                && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSuperID() == null) ? 0 : getSuperID().hashCode());
        result = prime * result + ((getAuthorityName() == null) ? 0 : getAuthorityName().hashCode());
        result = prime * result + ((getAuthorityConn() == null) ? 0 : getAuthorityConn().hashCode());
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
        sb.append(", superID=").append(superID);
        sb.append(", authorityName=").append(authorityName);
        sb.append(", authorityConn=").append(authorityConn);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}