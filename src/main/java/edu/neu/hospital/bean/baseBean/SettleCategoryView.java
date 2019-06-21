package edu.neu.hospital.bean.baseBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * settlecategoryview
 * @author 
 */
public class SettleCategoryView implements Serializable {
    private Integer id;

    private String settleCategoryCode;

    private String settleCategoryName;

    private Integer sequenceID;

    private BigDecimal thresnold1;

    private BigDecimal thresnold2;

    private BigDecimal thresnold3;

    private BigDecimal proportion1;

    private BigDecimal proportion2;

    private BigDecimal proportion3;

    private BigDecimal proportion4;

    private Date appearDate;

    private Integer apearUserID;

    private Date changeDate;

    private Integer changeUserID;

    /**
     * 登录名
     */
    private String appearUserName;

    /**
     * 登录名
     */
    private String changeUserName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSettleCategoryCode() {
        return settleCategoryCode;
    }

    public void setSettleCategoryCode(String settleCategoryCode) {
        this.settleCategoryCode = settleCategoryCode;
    }

    public String getSettleCategoryName() {
        return settleCategoryName;
    }

    public void setSettleCategoryName(String settleCategoryName) {
        this.settleCategoryName = settleCategoryName;
    }

    public Integer getSequenceID() {
        return sequenceID;
    }

    public void setSequenceID(Integer sequenceID) {
        this.sequenceID = sequenceID;
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

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getApearUserID() {
        return apearUserID;
    }

    public void setApearUserID(Integer apearUserID) {
        this.apearUserID = apearUserID;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public String getAppearUserName() {
        return appearUserName;
    }

    public void setAppearUserName(String appearUserName) {
        this.appearUserName = appearUserName;
    }

    public String getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(String changeUserName) {
        this.changeUserName = changeUserName;
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
        SettleCategoryView other = (SettleCategoryView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSettleCategoryCode() == null ? other.getSettleCategoryCode() == null : this.getSettleCategoryCode().equals(other.getSettleCategoryCode()))
            && (this.getSettleCategoryName() == null ? other.getSettleCategoryName() == null : this.getSettleCategoryName().equals(other.getSettleCategoryName()))
            && (this.getSequenceID() == null ? other.getSequenceID() == null : this.getSequenceID().equals(other.getSequenceID()))
            && (this.getThresnold1() == null ? other.getThresnold1() == null : this.getThresnold1().equals(other.getThresnold1()))
            && (this.getThresnold2() == null ? other.getThresnold2() == null : this.getThresnold2().equals(other.getThresnold2()))
            && (this.getThresnold3() == null ? other.getThresnold3() == null : this.getThresnold3().equals(other.getThresnold3()))
            && (this.getProportion1() == null ? other.getProportion1() == null : this.getProportion1().equals(other.getProportion1()))
            && (this.getProportion2() == null ? other.getProportion2() == null : this.getProportion2().equals(other.getProportion2()))
            && (this.getProportion3() == null ? other.getProportion3() == null : this.getProportion3().equals(other.getProportion3()))
            && (this.getProportion4() == null ? other.getProportion4() == null : this.getProportion4().equals(other.getProportion4()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getApearUserID() == null ? other.getApearUserID() == null : this.getApearUserID().equals(other.getApearUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSettleCategoryCode() == null) ? 0 : getSettleCategoryCode().hashCode());
        result = prime * result + ((getSettleCategoryName() == null) ? 0 : getSettleCategoryName().hashCode());
        result = prime * result + ((getSequenceID() == null) ? 0 : getSequenceID().hashCode());
        result = prime * result + ((getThresnold1() == null) ? 0 : getThresnold1().hashCode());
        result = prime * result + ((getThresnold2() == null) ? 0 : getThresnold2().hashCode());
        result = prime * result + ((getThresnold3() == null) ? 0 : getThresnold3().hashCode());
        result = prime * result + ((getProportion1() == null) ? 0 : getProportion1().hashCode());
        result = prime * result + ((getProportion2() == null) ? 0 : getProportion2().hashCode());
        result = prime * result + ((getProportion3() == null) ? 0 : getProportion3().hashCode());
        result = prime * result + ((getProportion4() == null) ? 0 : getProportion4().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getApearUserID() == null) ? 0 : getApearUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearUserName() == null) ? 0 : getAppearUserName().hashCode());
        result = prime * result + ((getChangeUserName() == null) ? 0 : getChangeUserName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", settleCategoryCode=").append(settleCategoryCode);
        sb.append(", settleCategoryName=").append(settleCategoryName);
        sb.append(", sequenceID=").append(sequenceID);
        sb.append(", thresnold1=").append(thresnold1);
        sb.append(", thresnold2=").append(thresnold2);
        sb.append(", thresnold3=").append(thresnold3);
        sb.append(", proportion1=").append(proportion1);
        sb.append(", proportion2=").append(proportion2);
        sb.append(", proportion3=").append(proportion3);
        sb.append(", proportion4=").append(proportion4);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", apearUserID=").append(apearUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}