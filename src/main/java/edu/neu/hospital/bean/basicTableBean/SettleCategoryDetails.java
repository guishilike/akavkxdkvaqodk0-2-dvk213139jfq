package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * settlecategorydetails
 * @author 
 */
public class SettleCategoryDetails implements Serializable {
    private Integer id;

    private Integer settleCategoryID;

    private BigDecimal thresnold1;

    private BigDecimal thresnold2;

    private BigDecimal thresnold3;

    private BigDecimal proportion1;

    private BigDecimal proportion2;

    private BigDecimal proportion3;

    private BigDecimal proportion4;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSettleCategoryID() {
        return settleCategoryID;
    }

    public void setSettleCategoryID(Integer settleCategoryID) {
        this.settleCategoryID = settleCategoryID;
    }

    public BigDecimal getThresnold1() {
        return thresnold1;
    }

    public void setThresnold1(BigDecimal thresnold1) {
        this.thresnold1 = thresnold1;
    }

    public BigDecimal getThresnold2() {
        return thresnold2;
    }

    public void setThresnold2(BigDecimal thresnold2) {
        this.thresnold2 = thresnold2;
    }

    public BigDecimal getThresnold3() {
        return thresnold3;
    }

    public void setThresnold3(BigDecimal thresnold3) {
        this.thresnold3 = thresnold3;
    }

    public BigDecimal getProportion1() {
        return proportion1;
    }

    public void setProportion1(BigDecimal proportion1) {
        this.proportion1 = proportion1;
    }

    public BigDecimal getProportion2() {
        return proportion2;
    }

    public void setProportion2(BigDecimal proportion2) {
        this.proportion2 = proportion2;
    }

    public BigDecimal getProportion3() {
        return proportion3;
    }

    public void setProportion3(BigDecimal proportion3) {
        this.proportion3 = proportion3;
    }

    public BigDecimal getProportion4() {
        return proportion4;
    }

    public void setProportion4(BigDecimal proportion4) {
        this.proportion4 = proportion4;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        SettleCategoryDetails other = (SettleCategoryDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSettleCategoryID() == null ? other.getSettleCategoryID() == null : this.getSettleCategoryID().equals(other.getSettleCategoryID()))
            && (this.getThresnold1() == null ? other.getThresnold1() == null : this.getThresnold1().equals(other.getThresnold1()))
            && (this.getThresnold2() == null ? other.getThresnold2() == null : this.getThresnold2().equals(other.getThresnold2()))
            && (this.getThresnold3() == null ? other.getThresnold3() == null : this.getThresnold3().equals(other.getThresnold3()))
            && (this.getProportion1() == null ? other.getProportion1() == null : this.getProportion1().equals(other.getProportion1()))
            && (this.getProportion2() == null ? other.getProportion2() == null : this.getProportion2().equals(other.getProportion2()))
            && (this.getProportion3() == null ? other.getProportion3() == null : this.getProportion3().equals(other.getProportion3()))
            && (this.getProportion4() == null ? other.getProportion4() == null : this.getProportion4().equals(other.getProportion4()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSettleCategoryID() == null) ? 0 : getSettleCategoryID().hashCode());
        result = prime * result + ((getThresnold1() == null) ? 0 : getThresnold1().hashCode());
        result = prime * result + ((getThresnold2() == null) ? 0 : getThresnold2().hashCode());
        result = prime * result + ((getThresnold3() == null) ? 0 : getThresnold3().hashCode());
        result = prime * result + ((getProportion1() == null) ? 0 : getProportion1().hashCode());
        result = prime * result + ((getProportion2() == null) ? 0 : getProportion2().hashCode());
        result = prime * result + ((getProportion3() == null) ? 0 : getProportion3().hashCode());
        result = prime * result + ((getProportion4() == null) ? 0 : getProportion4().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", settleCategoryID=").append(settleCategoryID);
        sb.append(", thresnold1=").append(thresnold1);
        sb.append(", thresnold2=").append(thresnold2);
        sb.append(", thresnold3=").append(thresnold3);
        sb.append(", proportion1=").append(proportion1);
        sb.append(", proportion2=").append(proportion2);
        sb.append(", proportion3=").append(proportion3);
        sb.append(", proportion4=").append(proportion4);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}