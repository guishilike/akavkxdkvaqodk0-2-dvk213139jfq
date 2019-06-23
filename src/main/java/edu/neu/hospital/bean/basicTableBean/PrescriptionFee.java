package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * prescriptionfee
 * @author 
 */
public class PrescriptionFee implements Serializable {
    /**
     * 病历号
     */
    private Integer medicalRecordID;

    /**
     * 医生编号
     */
    private Integer doctorID;

    /**
     * 处方明细编号
     */
    private Integer prescriptionDetailID;

    /**
     * 处方编号
     */
    private Integer prescriptionID;

    /**
     * 药品编号
     */
    private Integer drugID;

    /**
     * 用量
     */
    private BigDecimal dosage;

    /**
     * 药品类型  10     格式：101:代表西药;102:代表中成药; 103:代表中草药; 
     */
    private Integer drugsTypeID;

    /**
     * 药品单价
     */
    private BigDecimal drugsPrice;

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

    public Integer getPrescriptionDetailID() {
        return prescriptionDetailID;
    }

    public void setPrescriptionDetailID(Integer prescriptionDetailID) {
        this.prescriptionDetailID = prescriptionDetailID;
    }

    public Integer getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(Integer prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public Integer getDrugsTypeID() {
        return drugsTypeID;
    }

    public void setDrugsTypeID(Integer drugsTypeID) {
        this.drugsTypeID = drugsTypeID;
    }

    public BigDecimal getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(BigDecimal drugsPrice) {
        this.drugsPrice = drugsPrice;
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
        PrescriptionFee other = (PrescriptionFee) that;
        return (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getPrescriptionDetailID() == null ? other.getPrescriptionDetailID() == null : this.getPrescriptionDetailID().equals(other.getPrescriptionDetailID()))
            && (this.getPrescriptionID() == null ? other.getPrescriptionID() == null : this.getPrescriptionID().equals(other.getPrescriptionID()))
            && (this.getDrugID() == null ? other.getDrugID() == null : this.getDrugID().equals(other.getDrugID()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getDrugsTypeID() == null ? other.getDrugsTypeID() == null : this.getDrugsTypeID().equals(other.getDrugsTypeID()))
            && (this.getDrugsPrice() == null ? other.getDrugsPrice() == null : this.getDrugsPrice().equals(other.getDrugsPrice()))
            && (this.getPaymentCategoryID() == null ? other.getPaymentCategoryID() == null : this.getPaymentCategoryID().equals(other.getPaymentCategoryID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getPrescriptionDetailID() == null) ? 0 : getPrescriptionDetailID().hashCode());
        result = prime * result + ((getPrescriptionID() == null) ? 0 : getPrescriptionID().hashCode());
        result = prime * result + ((getDrugID() == null) ? 0 : getDrugID().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getDrugsTypeID() == null) ? 0 : getDrugsTypeID().hashCode());
        result = prime * result + ((getDrugsPrice() == null) ? 0 : getDrugsPrice().hashCode());
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
        sb.append(", prescriptionDetailID=").append(prescriptionDetailID);
        sb.append(", prescriptionID=").append(prescriptionID);
        sb.append(", drugID=").append(drugID);
        sb.append(", dosage=").append(dosage);
        sb.append(", drugsTypeID=").append(drugsTypeID);
        sb.append(", drugsPrice=").append(drugsPrice);
        sb.append(", paymentCategoryID=").append(paymentCategoryID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}