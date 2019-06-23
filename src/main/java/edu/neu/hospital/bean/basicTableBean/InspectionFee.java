package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * inspectionfee
 * @author 
 */
public class InspectionFee implements Serializable {
    /**
     * 病历id
     */
    private Integer medicalRecordID;

    /**
     * 医生id
     */
    private Integer doctorID;

    private Integer inspectiondetailsID;

    /**
     * 检查检验id
     */
    private Integer inspectionID;

    /**
     * 非药品目录ID
     */
    private Integer fmedItemID;

    /**
     * 数目
     */
    private Integer number;

    /**
     * 是否开立
     */
    private Integer isDrawn;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 所属费用科目ID
     */
    private Integer expClassID;

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

    public Integer getInspectiondetailsID() {
        return inspectiondetailsID;
    }

    public void setInspectiondetailsID(Integer inspectiondetailsID) {
        this.inspectiondetailsID = inspectiondetailsID;
    }

    public Integer getInspectionID() {
        return inspectionID;
    }

    public void setInspectionID(Integer inspectionID) {
        this.inspectionID = inspectionID;
    }

    public Integer getFmedItemID() {
        return fmedItemID;
    }

    public void setFmedItemID(Integer fmedItemID) {
        this.fmedItemID = fmedItemID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIsDrawn() {
        return isDrawn;
    }

    public void setIsDrawn(Integer isDrawn) {
        this.isDrawn = isDrawn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getExpClassID() {
        return expClassID;
    }

    public void setExpClassID(Integer expClassID) {
        this.expClassID = expClassID;
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
        InspectionFee other = (InspectionFee) that;
        return (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getInspectiondetailsID() == null ? other.getInspectiondetailsID() == null : this.getInspectiondetailsID().equals(other.getInspectiondetailsID()))
            && (this.getInspectionID() == null ? other.getInspectionID() == null : this.getInspectionID().equals(other.getInspectionID()))
            && (this.getFmedItemID() == null ? other.getFmedItemID() == null : this.getFmedItemID().equals(other.getFmedItemID()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getExpClassID() == null ? other.getExpClassID() == null : this.getExpClassID().equals(other.getExpClassID()))
            && (this.getPaymentCategoryID() == null ? other.getPaymentCategoryID() == null : this.getPaymentCategoryID().equals(other.getPaymentCategoryID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getInspectiondetailsID() == null) ? 0 : getInspectiondetailsID().hashCode());
        result = prime * result + ((getInspectionID() == null) ? 0 : getInspectionID().hashCode());
        result = prime * result + ((getFmedItemID() == null) ? 0 : getFmedItemID().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getExpClassID() == null) ? 0 : getExpClassID().hashCode());
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
        sb.append(", inspectiondetailsID=").append(inspectiondetailsID);
        sb.append(", inspectionID=").append(inspectionID);
        sb.append(", fmedItemID=").append(fmedItemID);
        sb.append(", number=").append(number);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", price=").append(price);
        sb.append(", expClassID=").append(expClassID);
        sb.append(", paymentCategoryID=").append(paymentCategoryID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}