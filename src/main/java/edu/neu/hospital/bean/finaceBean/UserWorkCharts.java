package edu.neu.hospital.bean.finaceBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * userworkcharts
 * @author 
 */
public class UserWorkCharts implements Serializable {
    private BigDecimal sumfee;

    /**
     * 登录名
     */
    private String userName;

    /**
     * 科室名称
     */
    private String deptName;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSumfee() {
        return sumfee;
    }

    public void setSumfee(BigDecimal sumfee) {
        this.sumfee = sumfee;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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
        UserWorkCharts other = (UserWorkCharts) that;
        return (this.getSumfee() == null ? other.getSumfee() == null : this.getSumfee().equals(other.getSumfee()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSumfee() == null) ? 0 : getSumfee().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sumfee=").append(sumfee);
        sb.append(", userName=").append(userName);
        sb.append(", deptName=").append(deptName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}