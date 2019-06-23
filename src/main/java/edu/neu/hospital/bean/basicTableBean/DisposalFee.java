package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * disposalfee
 * @author 
 */
public class DisposalFee implements Serializable {
    /**
     * 病历id
     */
    private Integer medicalRecordID;

    /**
     * 医生id
     */
    private Integer doctorID;

    private Integer number;

    /**
     * 非药品项目ID
     */
    private Integer fMedItemID;

    /**
     * 处置ID
     */
    private Integer disposalID;

    private Integer disposalDetailsID;

    /**
     * 所属费用科目ID
     */
    private Integer expClassID;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 收费类别12
     */
    private Integer paymentCategoryID;

    private static final long serialVersionUID = 1L;

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getfMedItemID() {
        return fMedItemID;
    }

    public void setfMedItemID(Integer fMedItemID) {
        this.fMedItemID = fMedItemID;
    }

    public Integer getDisposalID() {
        return disposalID;
    }

    public void setDisposalID(Integer disposalID) {
        this.disposalID = disposalID;
    }

    public Integer getDisposalDetailsID() {
        return disposalDetailsID;
    }

    public void setDisposalDetailsID(Integer disposalDetailsID) {
        this.disposalDetailsID = disposalDetailsID;
    }

    public Integer getExpClassID() {
        return expClassID;
    }

    public void setExpClassID(Integer expClassID) {
        this.expClassID = expClassID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPaymentCategoryID() {
        return paymentCategoryID;
    }

    public void setPaymentCategoryID(Integer paymentCategoryID) {
        this.paymentCategoryID = paymentCategoryID;
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
        DisposalFee other = (DisposalFee) that;
        return (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getfMedItemID() == null ? other.getfMedItemID() == null : this.getfMedItemID().equals(other.getfMedItemID()))
            && (this.getDisposalID() == null ? other.getDisposalID() == null : this.getDisposalID().equals(other.getDisposalID()))
            && (this.getDisposalDetailsID() == null ? other.getDisposalDetailsID() == null : this.getDisposalDetailsID().equals(other.getDisposalDetailsID()))
            && (this.getExpClassID() == null ? other.getExpClassID() == null : this.getExpClassID().equals(other.getExpClassID()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPaymentCategoryID() == null ? other.getPaymentCategoryID() == null : this.getPaymentCategoryID().equals(other.getPaymentCategoryID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getfMedItemID() == null) ? 0 : getfMedItemID().hashCode());
        result = prime * result + ((getDisposalID() == null) ? 0 : getDisposalID().hashCode());
        result = prime * result + ((getDisposalDetailsID() == null) ? 0 : getDisposalDetailsID().hashCode());
        result = prime * result + ((getExpClassID() == null) ? 0 : getExpClassID().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPaymentCategoryID() == null) ? 0 : getPaymentCategoryID().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", number=").append(number);
        sb.append(", fMedItemID=").append(fMedItemID);
        sb.append(", disposalID=").append(disposalID);
        sb.append(", disposalDetailsID=").append(disposalDetailsID);
        sb.append(", expClassID=").append(expClassID);
        sb.append(", price=").append(price);
        sb.append(", paymentCategoryID=").append(paymentCategoryID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}