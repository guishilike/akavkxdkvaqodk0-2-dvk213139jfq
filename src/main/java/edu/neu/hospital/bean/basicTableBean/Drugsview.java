package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;

/**
 * drugsview
 * @author 
 */
public class Drugsview implements Serializable {
    /**
     * 药品编号   格式：86979474000208
     */
    private Integer id;

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
     * 包装单位  格式：1:支;2:瓶;3:盒;4:袋;5:克;
     */
    private String drugsUnit;

    /**
     * 生产厂家  格式：江苏恒瑞医药股份有限公司
     */
    private String manufacturer;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDrugsUnit() {
        return drugsUnit;
    }

    public void setDrugsUnit(String drugsUnit) {
        this.drugsUnit = drugsUnit;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
        Drugsview other = (Drugsview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDrugsName() == null ? other.getDrugsName() == null : this.getDrugsName().equals(other.getDrugsName()))
            && (this.getDrugsCode() == null ? other.getDrugsCode() == null : this.getDrugsCode().equals(other.getDrugsCode()))
            && (this.getDrugsFormat() == null ? other.getDrugsFormat() == null : this.getDrugsFormat().equals(other.getDrugsFormat()))
            && (this.getDrugsUnit() == null ? other.getDrugsUnit() == null : this.getDrugsUnit().equals(other.getDrugsUnit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugsDosageID() == null ? other.getDrugsDosageID() == null : this.getDrugsDosageID().equals(other.getDrugsDosageID()))
            && (this.getDrugsTypeID() == null ? other.getDrugsTypeID() == null : this.getDrugsTypeID().equals(other.getDrugsTypeID()))
            && (this.getDrugsDosage() == null ? other.getDrugsDosage() == null : this.getDrugsDosage().equals(other.getDrugsDosage()))
            && (this.getDrugsType() == null ? other.getDrugsType() == null : this.getDrugsType().equals(other.getDrugsType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDrugsName() == null) ? 0 : getDrugsName().hashCode());
        result = prime * result + ((getDrugsCode() == null) ? 0 : getDrugsCode().hashCode());
        result = prime * result + ((getDrugsFormat() == null) ? 0 : getDrugsFormat().hashCode());
        result = prime * result + ((getDrugsUnit() == null) ? 0 : getDrugsUnit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugsDosageID() == null) ? 0 : getDrugsDosageID().hashCode());
        result = prime * result + ((getDrugsTypeID() == null) ? 0 : getDrugsTypeID().hashCode());
        result = prime * result + ((getDrugsDosage() == null) ? 0 : getDrugsDosage().hashCode());
        result = prime * result + ((getDrugsType() == null) ? 0 : getDrugsType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugsName=").append(drugsName);
        sb.append(", drugsCode=").append(drugsCode);
        sb.append(", drugsFormat=").append(drugsFormat);
        sb.append(", drugsUnit=").append(drugsUnit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsDosageID=").append(drugsDosageID);
        sb.append(", drugsTypeID=").append(drugsTypeID);
        sb.append(", drugsDosage=").append(drugsDosage);
        sb.append(", drugsType=").append(drugsType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}