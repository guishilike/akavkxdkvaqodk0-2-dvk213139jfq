package edu.neu.hospital.bean.baseBean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * fmeditemview
 * @author 
 */
public class FmeditemView implements Serializable {
    /**
     * ID
     */
    private Integer id;

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
     * 费用科目名字
     */
    private String expClassName;

    /**
     * 执行科室ID
     */
    private Integer deptID;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 拼音助记码
     */
    private String mnemonicCode;

    /**
     * 项目类型
     */
    private Integer recordType;

    private String typeName;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appearDate;

    /**
     * 创建人
     */
    private Integer appearUserID;

    /**
     * 真名
     */
    private String appearUserName;

    /**
     * 修改人ID
     */
    private Integer changeUserID;

    /**
     * 真名
     */
    private String changeUserName;

    /**
     * 状态
     */
    private String status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getExpClassName() {
        return expClassName;
    }

    public void setExpClassName(String expClassName) {
        this.expClassName = expClassName;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public String getAppearUserName() {
        return appearUserName;
    }

    public void setAppearUserName(String appearUserName) {
        this.appearUserName = appearUserName;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public String getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(String changeUserName) {
        this.changeUserName = changeUserName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
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
        FmeditemView other = (FmeditemView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getExpClassID() == null ? other.getExpClassID() == null : this.getExpClassID().equals(other.getExpClassID()))
            && (this.getExpClassName() == null ? other.getExpClassName() == null : this.getExpClassName().equals(other.getExpClassName()))
            && (this.getDeptID() == null ? other.getDeptID() == null : this.getDeptID().equals(other.getDeptID()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getRecordType() == null ? other.getRecordType() == null : this.getRecordType().equals(other.getRecordType()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getExpClassID() == null) ? 0 : getExpClassID().hashCode());
        result = prime * result + ((getExpClassName() == null) ? 0 : getExpClassName().hashCode());
        result = prime * result + ((getDeptID() == null) ? 0 : getDeptID().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearUserName() == null) ? 0 : getAppearUserName().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getChangeUserName() == null) ? 0 : getChangeUserName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", format=").append(format);
        sb.append(", price=").append(price);
        sb.append(", expClassID=").append(expClassID);
        sb.append(", expClassName=").append(expClassName);
        sb.append(", deptID=").append(deptID);
        sb.append(", deptName=").append(deptName);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", recordType=").append(recordType);
        sb.append(", typeName=").append(typeName);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", status=").append(status);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}