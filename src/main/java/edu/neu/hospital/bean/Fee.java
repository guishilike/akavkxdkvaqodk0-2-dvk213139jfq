package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * fee
 * @author 
 */
public class Fee implements Serializable {
    /**
     * 患者费用编号
     */
    private Integer id;

    /**
     * 病历ID
     */
    private Integer medicalrecordid;

    /**
     * 收费类别12
     */
    private Integer feecategoryid;

    /**
     * 收费项目ID
     */
    private Integer chargeitemid;

    /**
     * 金额
     */
    private BigDecimal fee;

    /**
     * 收费方式5
     */
    private Integer paymentmethodid;

    /**
     * 收费人员ID
     */
    private Integer appearuserid;

    private Integer changeuserid;

    /**
     * 费用产生日期
     */
    private Date feeappeardate;

    /**
     * 费用变动日期
     */
    private Date feechangedate;

    /**
     * 缴费状态：1.已缴费2.未交费3.已退费
     */
    private String paystatus;

    /**
     * 日结状态：1.已日结2.未日结
     */
    private String datestatus;

    /**
     * 是否有效
     */
    private String status;

    private String reserve1;

    private String reserve2;

    private String reserver3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    public Integer getFeecategoryid() {
        return feecategoryid;
    }

    public void setFeecategoryid(Integer feecategoryid) {
        this.feecategoryid = feecategoryid;
    }

    public Integer getChargeitemid() {
        return chargeitemid;
    }

    public void setChargeitemid(Integer chargeitemid) {
        this.chargeitemid = chargeitemid;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getPaymentmethodid() {
        return paymentmethodid;
    }

    public void setPaymentmethodid(Integer paymentmethodid) {
        this.paymentmethodid = paymentmethodid;
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

    public Date getFeeappeardate() {
        return feeappeardate;
    }

    public void setFeeappeardate(Date feeappeardate) {
        this.feeappeardate = feeappeardate;
    }

    public Date getFeechangedate() {
        return feechangedate;
    }

    public void setFeechangedate(Date feechangedate) {
        this.feechangedate = feechangedate;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public String getDatestatus() {
        return datestatus;
    }

    public void setDatestatus(String datestatus) {
        this.datestatus = datestatus;
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

    public String getReserver3() {
        return reserver3;
    }

    public void setReserver3(String reserver3) {
        this.reserver3 = reserver3;
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
        Fee other = (Fee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()))
            && (this.getFeecategoryid() == null ? other.getFeecategoryid() == null : this.getFeecategoryid().equals(other.getFeecategoryid()))
            && (this.getChargeitemid() == null ? other.getChargeitemid() == null : this.getChargeitemid().equals(other.getChargeitemid()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getPaymentmethodid() == null ? other.getPaymentmethodid() == null : this.getPaymentmethodid().equals(other.getPaymentmethodid()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getFeeappeardate() == null ? other.getFeeappeardate() == null : this.getFeeappeardate().equals(other.getFeeappeardate()))
            && (this.getFeechangedate() == null ? other.getFeechangedate() == null : this.getFeechangedate().equals(other.getFeechangedate()))
            && (this.getPaystatus() == null ? other.getPaystatus() == null : this.getPaystatus().equals(other.getPaystatus()))
            && (this.getDatestatus() == null ? other.getDatestatus() == null : this.getDatestatus().equals(other.getDatestatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserver3() == null ? other.getReserver3() == null : this.getReserver3().equals(other.getReserver3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        result = prime * result + ((getFeecategoryid() == null) ? 0 : getFeecategoryid().hashCode());
        result = prime * result + ((getChargeitemid() == null) ? 0 : getChargeitemid().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getPaymentmethodid() == null) ? 0 : getPaymentmethodid().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getFeeappeardate() == null) ? 0 : getFeeappeardate().hashCode());
        result = prime * result + ((getFeechangedate() == null) ? 0 : getFeechangedate().hashCode());
        result = prime * result + ((getPaystatus() == null) ? 0 : getPaystatus().hashCode());
        result = prime * result + ((getDatestatus() == null) ? 0 : getDatestatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserver3() == null) ? 0 : getReserver3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", feecategoryid=").append(feecategoryid);
        sb.append(", chargeitemid=").append(chargeitemid);
        sb.append(", fee=").append(fee);
        sb.append(", paymentmethodid=").append(paymentmethodid);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", feeappeardate=").append(feeappeardate);
        sb.append(", feechangedate=").append(feechangedate);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", datestatus=").append(datestatus);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserver3=").append(reserver3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}