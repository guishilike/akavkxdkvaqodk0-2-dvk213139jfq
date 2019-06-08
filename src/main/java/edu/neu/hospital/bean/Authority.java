package edu.neu.hospital.bean;

import java.io.Serializable;

/**
 * authority
 * @author 
 */
public class Authority implements Serializable {
    private Integer id;

    /**
     * 上级权限ID
     */
    private Integer superid;

    /**
     * 权限名
     */
    private String authorityname;

    /**
     * 功能连接
     */
    private String authorityconn;

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

    public Integer getSuperid() {
        return superid;
    }

    public void setSuperid(Integer superid) {
        this.superid = superid;
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname;
    }

    public String getAuthorityconn() {
        return authorityconn;
    }

    public void setAuthorityconn(String authorityconn) {
        this.authorityconn = authorityconn;
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
            && (this.getSuperid() == null ? other.getSuperid() == null : this.getSuperid().equals(other.getSuperid()))
            && (this.getAuthorityname() == null ? other.getAuthorityname() == null : this.getAuthorityname().equals(other.getAuthorityname()))
            && (this.getAuthorityconn() == null ? other.getAuthorityconn() == null : this.getAuthorityconn().equals(other.getAuthorityconn()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSuperid() == null) ? 0 : getSuperid().hashCode());
        result = prime * result + ((getAuthorityname() == null) ? 0 : getAuthorityname().hashCode());
        result = prime * result + ((getAuthorityconn() == null) ? 0 : getAuthorityconn().hashCode());
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
        sb.append(", superid=").append(superid);
        sb.append(", authorityname=").append(authorityname);
        sb.append(", authorityconn=").append(authorityconn);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}