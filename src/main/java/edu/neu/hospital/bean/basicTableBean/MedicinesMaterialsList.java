package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * medicinesmaterialslist
 * @author 
 */
public class MedicinesMaterialsList implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 检查检验或处置
     */
    private Integer itemsType;

    /**
     * 明细ID
     */
    private Integer itemsDetailID;

    /**
     * 药品材料编号
     */
    private Integer medicinesMaterialsID;

    /**
     * 用量
     */
    private BigDecimal dosage;

    /**
     * 药品或材料，0：药品 1：材料
     */
    private String matOrMedType;

    /**
     * 创建人
     */
    private Integer appearUserID;

    /**
     * 创建日期
     */
    private Date appearDate;

    /**
     * 修改人
     */
    private Integer changeUserID;

    /**
     * 修改日期
     */
    private Date changeDate;

    /**
     * 状态
     */
    private String status;

    private Integer isDrawn;

    private Integer isPaid;

    private Integer isChecked;

    private Integer isAbolished;

    private Integer isRegistered;

    private Integer isExecuted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemsType() {
        return itemsType;
    }

    public void setItemsType(Integer itemsType) {
        this.itemsType = itemsType;
    }

    public Integer getItemsDetailID() {
        return itemsDetailID;
    }

    public void setItemsDetailID(Integer itemsDetailID) {
        this.itemsDetailID = itemsDetailID;
    }

    public Integer getMedicinesMaterialsID() {
        return medicinesMaterialsID;
    }

    public void setMedicinesMaterialsID(Integer medicinesMaterialsID) {
        this.medicinesMaterialsID = medicinesMaterialsID;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getMatOrMedType() {
        return matOrMedType;
    }

    public void setMatOrMedType(String matOrMedType) {
        this.matOrMedType = matOrMedType;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    public Integer getIsAbolished() {
        return isAbolished;
    }

    public void setIsAbolished(Integer isAbolished) {
        this.isAbolished = isAbolished;
    }

    public Integer getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Integer isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Integer getIsExecuted() {
        return isExecuted;
    }

    public void setIsExecuted(Integer isExecuted) {
        this.isExecuted = isExecuted;
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
        MedicinesMaterialsList other = (MedicinesMaterialsList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemsType() == null ? other.getItemsType() == null : this.getItemsType().equals(other.getItemsType()))
            && (this.getItemsDetailID() == null ? other.getItemsDetailID() == null : this.getItemsDetailID().equals(other.getItemsDetailID()))
            && (this.getMedicinesMaterialsID() == null ? other.getMedicinesMaterialsID() == null : this.getMedicinesMaterialsID().equals(other.getMedicinesMaterialsID()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getMatOrMedType() == null ? other.getMatOrMedType() == null : this.getMatOrMedType().equals(other.getMatOrMedType()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsChecked() == null ? other.getIsChecked() == null : this.getIsChecked().equals(other.getIsChecked()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getIsRegistered() == null ? other.getIsRegistered() == null : this.getIsRegistered().equals(other.getIsRegistered()))
            && (this.getIsExecuted() == null ? other.getIsExecuted() == null : this.getIsExecuted().equals(other.getIsExecuted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemsType() == null) ? 0 : getItemsType().hashCode());
        result = prime * result + ((getItemsDetailID() == null) ? 0 : getItemsDetailID().hashCode());
        result = prime * result + ((getMedicinesMaterialsID() == null) ? 0 : getMedicinesMaterialsID().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getMatOrMedType() == null) ? 0 : getMatOrMedType().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsChecked() == null) ? 0 : getIsChecked().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getIsRegistered() == null) ? 0 : getIsRegistered().hashCode());
        result = prime * result + ((getIsExecuted() == null) ? 0 : getIsExecuted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemsType=").append(itemsType);
        sb.append(", itemsDetailID=").append(itemsDetailID);
        sb.append(", medicinesMaterialsID=").append(medicinesMaterialsID);
        sb.append(", dosage=").append(dosage);
        sb.append(", matOrMedType=").append(matOrMedType);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", status=").append(status);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", isRegistered=").append(isRegistered);
        sb.append(", isExecuted=").append(isExecuted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}