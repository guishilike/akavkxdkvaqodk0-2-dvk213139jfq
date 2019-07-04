package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * commoninspectionview
 * @author 
 */
public class CommonInspectionView implements Serializable {
    private Integer id;

    private Integer doctorID;

    private Integer fMedItemID;

    private String status;

    /**
     * 项目编码
     */
    private String code;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 规格
     */
    private String format;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 所属费用科目ID
     */
    private Integer expClassID;

    /**
     * 执行科室ID
     */
    private Integer deptID;

    /**
     * 拼音助记码
     */
    private String mnemonicCode;

    /**
     * 项目类型
     */
    private Integer recordType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getfMedItemID() {
        return fMedItemID;
    }

    public void setfMedItemID(Integer fMedItemID) {
        this.fMedItemID = fMedItemID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
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
        CommonInspectionView other = (CommonInspectionView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
            && (this.getfMedItemID() == null ? other.getfMedItemID() == null : this.getfMedItemID().equals(other.getfMedItemID()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getExpClassID() == null ? other.getExpClassID() == null : this.getExpClassID().equals(other.getExpClassID()))
            && (this.getDeptID() == null ? other.getDeptID() == null : this.getDeptID().equals(other.getDeptID()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getRecordType() == null ? other.getRecordType() == null : this.getRecordType().equals(other.getRecordType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getfMedItemID() == null) ? 0 : getfMedItemID().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getExpClassID() == null) ? 0 : getExpClassID().hashCode());
        result = prime * result + ((getDeptID() == null) ? 0 : getDeptID().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", fMedItemID=").append(fMedItemID);
        sb.append(", status=").append(status);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", format=").append(format);
        sb.append(", price=").append(price);
        sb.append(", expClassID=").append(expClassID);
        sb.append(", deptID=").append(deptID);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", recordType=").append(recordType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}