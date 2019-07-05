package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * prescriptiondetailview
 * @author 
 */
public class Prescriptiondetailview implements Serializable {
    /**
     * 处方明细编号
     */
    private Integer id;

    /**
     * 处方编号
     */
    private Integer prescriptionID;

    /**
     * 药品编号
     */
    private Integer drugID;

    /**
     * 用法
     */
    private String usage;

    /**
     * 用量
     */
    private BigDecimal dosage;

    /**
     * 频次
     */
    private Integer frequency;

    private Integer quantity;

    /**
     * 用药嘱托
     */
    private String medication;

    /**
     * 保留字段2
     */
    private Integer isDrawn;

    /**
     * 保留字段3
     */
    private Integer isPaid;

    private Integer isAbolished;

    /**
     * 药品名称
     */
    private String drugsName;

    /**
     * 药品编码  
     */
    private String drugsCode;

    /**
     * 药品规格     格式：50mg×7片/盒、200mg×100ml/瓶等
     */
    private String drugsFormat;

    /**
     * 生产厂家  格式：江苏恒瑞医药股份有限公司
     */
    private String manufacturer;

    /**
     * 包装单位  格式：1:支;2:瓶;3:盒;4:袋;5:克;
     */
    private String drugsUnit;

    /**
     * 药品剂型 11
     */
    private Integer drugsDosageID;

    /**
     * 药品类型  10     格式：101:代表西药;102:代表中成药; 103:代表中草药; 
     */
    private Integer drugsTypeID;

    private String drugsDosage;

    private String drugsType;

    private Integer isGotDrugs;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public Integer getIsDrawn() {
        return isDrawn;
    }

    public void setIsDrawn(Integer isDrawn) {
        this.isDrawn = isDrawn;
    }

    public Integer getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Integer isPaid) {
        this.isPaid = isPaid;
    }

    public Integer getIsAbolished() {
        return isAbolished;
    }

    public void setIsAbolished(Integer isAbolished) {
        this.isAbolished = isAbolished;
    }

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    public String getDrugsCode() {
        return drugsCode;
    }

    public void setDrugsCode(String drugsCode) {
        this.drugsCode = drugsCode;
    }

    public String getDrugsFormat() {
        return drugsFormat;
    }

    public void setDrugsFormat(String drugsFormat) {
        this.drugsFormat = drugsFormat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDrugsUnit() {
        return drugsUnit;
    }

    public void setDrugsUnit(String drugsUnit) {
        this.drugsUnit = drugsUnit;
    }

    public Integer getDrugsDosageID() {
        return drugsDosageID;
    }

    public void setDrugsDosageID(Integer drugsDosageID) {
        this.drugsDosageID = drugsDosageID;
    }

    public Integer getDrugsTypeID() {
        return drugsTypeID;
    }

    public void setDrugsTypeID(Integer drugsTypeID) {
        this.drugsTypeID = drugsTypeID;
    }

    public String getDrugsDosage() {
        return drugsDosage;
    }

    public void setDrugsDosage(String drugsDosage) {
        this.drugsDosage = drugsDosage;
    }

    public String getDrugsType() {
        return drugsType;
    }

    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }

    public Integer getIsGotDrugs() {
        return isGotDrugs;
    }

    public void setIsGotDrugs(Integer isGotDrugs) {
        this.isGotDrugs = isGotDrugs;
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
        Prescriptiondetailview other = (Prescriptiondetailview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrescriptionID() == null ? other.getPrescriptionID() == null : this.getPrescriptionID().equals(other.getPrescriptionID()))
            && (this.getDrugID() == null ? other.getDrugID() == null : this.getDrugID().equals(other.getDrugID()))
            && (this.getUsage() == null ? other.getUsage() == null : this.getUsage().equals(other.getUsage()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getMedication() == null ? other.getMedication() == null : this.getMedication().equals(other.getMedication()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getDrugsName() == null ? other.getDrugsName() == null : this.getDrugsName().equals(other.getDrugsName()))
            && (this.getDrugsCode() == null ? other.getDrugsCode() == null : this.getDrugsCode().equals(other.getDrugsCode()))
            && (this.getDrugsFormat() == null ? other.getDrugsFormat() == null : this.getDrugsFormat().equals(other.getDrugsFormat()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugsUnit() == null ? other.getDrugsUnit() == null : this.getDrugsUnit().equals(other.getDrugsUnit()))
            && (this.getDrugsDosageID() == null ? other.getDrugsDosageID() == null : this.getDrugsDosageID().equals(other.getDrugsDosageID()))
            && (this.getDrugsTypeID() == null ? other.getDrugsTypeID() == null : this.getDrugsTypeID().equals(other.getDrugsTypeID()))
            && (this.getDrugsDosage() == null ? other.getDrugsDosage() == null : this.getDrugsDosage().equals(other.getDrugsDosage()))
            && (this.getDrugsType() == null ? other.getDrugsType() == null : this.getDrugsType().equals(other.getDrugsType()))
            && (this.getIsGotDrugs() == null ? other.getIsGotDrugs() == null : this.getIsGotDrugs().equals(other.getIsGotDrugs()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrescriptionID() == null) ? 0 : getPrescriptionID().hashCode());
        result = prime * result + ((getDrugID() == null) ? 0 : getDrugID().hashCode());
        result = prime * result + ((getUsage() == null) ? 0 : getUsage().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getMedication() == null) ? 0 : getMedication().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getDrugsName() == null) ? 0 : getDrugsName().hashCode());
        result = prime * result + ((getDrugsCode() == null) ? 0 : getDrugsCode().hashCode());
        result = prime * result + ((getDrugsFormat() == null) ? 0 : getDrugsFormat().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugsUnit() == null) ? 0 : getDrugsUnit().hashCode());
        result = prime * result + ((getDrugsDosageID() == null) ? 0 : getDrugsDosageID().hashCode());
        result = prime * result + ((getDrugsTypeID() == null) ? 0 : getDrugsTypeID().hashCode());
        result = prime * result + ((getDrugsDosage() == null) ? 0 : getDrugsDosage().hashCode());
        result = prime * result + ((getDrugsType() == null) ? 0 : getDrugsType().hashCode());
        result = prime * result + ((getIsGotDrugs() == null) ? 0 : getIsGotDrugs().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prescriptionID=").append(prescriptionID);
        sb.append(", drugID=").append(drugID);
        sb.append(", usage=").append(usage);
        sb.append(", dosage=").append(dosage);
        sb.append(", frequency=").append(frequency);
        sb.append(", quantity=").append(quantity);
        sb.append(", medication=").append(medication);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", drugsName=").append(drugsName);
        sb.append(", drugsCode=").append(drugsCode);
        sb.append(", drugsFormat=").append(drugsFormat);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsUnit=").append(drugsUnit);
        sb.append(", drugsDosageID=").append(drugsDosageID);
        sb.append(", drugsTypeID=").append(drugsTypeID);
        sb.append(", drugsDosage=").append(drugsDosage);
        sb.append(", drugsType=").append(drugsType);
        sb.append(", isGotDrugs=").append(isGotDrugs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}