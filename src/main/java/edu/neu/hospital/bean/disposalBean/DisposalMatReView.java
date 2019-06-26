package edu.neu.hospital.bean.disposalBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * disposalmatreview
 * @author 
 */
public class DisposalMatReView implements Serializable {
    /**
     * 编号
     */
    private Integer medMatListID;

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

    private String constantName;

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
     * 真名
     */
    private String creatRName;

    /**
     * 真名
     */
    private String changeRName;

    /**
     * 材料编号
     */
    private Integer matID;

    /**
     * 材料编码
     */
    private String code;

    /**
     * 材料名称
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
     * 非药品项目ID
     */
    private Integer fmedItemID;

    private Integer isDrawn;

    private Integer isPaid;

    private Integer isChecked;

    private Integer isAbolished;

    private Integer isRegistered;

    private Integer isExecuted;

    private String drawnName;

    private String paidName;

    private String checkedName;

    private String abolishedName;

    private String registeredName;

    private String executedName;

    private static final long serialVersionUID = 1L;

    public Integer getMedMatListID() {
        return medMatListID;
    }

    public void setMedMatListID(Integer medMatListID) {
        this.medMatListID = medMatListID;
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

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
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

    public String getCreatRName() {
        return creatRName;
    }

    public void setCreatRName(String creatRName) {
        this.creatRName = creatRName;
    }

    public String getChangeRName() {
        return changeRName;
    }

    public void setChangeRName(String changeRName) {
        this.changeRName = changeRName;
    }

    public Integer getMatID() {
        return matID;
    }

    public void setMatID(Integer matID) {
        this.matID = matID;
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

    public Integer getFmedItemID() {
        return fmedItemID;
    }

    public void setFmedItemID(Integer fmedItemID) {
        this.fmedItemID = fmedItemID;
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

    public String getDrawnName() {
        return drawnName;
    }

    public void setDrawnName(String drawnName) {
        this.drawnName = drawnName;
    }

    public String getPaidName() {
        return paidName;
    }

    public void setPaidName(String paidName) {
        this.paidName = paidName;
    }

    public String getCheckedName() {
        return checkedName;
    }

    public void setCheckedName(String checkedName) {
        this.checkedName = checkedName;
    }

    public String getAbolishedName() {
        return abolishedName;
    }

    public void setAbolishedName(String abolishedName) {
        this.abolishedName = abolishedName;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getExecutedName() {
        return executedName;
    }

    public void setExecutedName(String executedName) {
        this.executedName = executedName;
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
        DisposalMatReView other = (DisposalMatReView) that;
        return (this.getMedMatListID() == null ? other.getMedMatListID() == null : this.getMedMatListID().equals(other.getMedMatListID()))
            && (this.getItemsType() == null ? other.getItemsType() == null : this.getItemsType().equals(other.getItemsType()))
            && (this.getItemsDetailID() == null ? other.getItemsDetailID() == null : this.getItemsDetailID().equals(other.getItemsDetailID()))
            && (this.getMedicinesMaterialsID() == null ? other.getMedicinesMaterialsID() == null : this.getMedicinesMaterialsID().equals(other.getMedicinesMaterialsID()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getMatOrMedType() == null ? other.getMatOrMedType() == null : this.getMatOrMedType().equals(other.getMatOrMedType()))
            && (this.getConstantName() == null ? other.getConstantName() == null : this.getConstantName().equals(other.getConstantName()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getCreatRName() == null ? other.getCreatRName() == null : this.getCreatRName().equals(other.getCreatRName()))
            && (this.getChangeRName() == null ? other.getChangeRName() == null : this.getChangeRName().equals(other.getChangeRName()))
            && (this.getMatID() == null ? other.getMatID() == null : this.getMatID().equals(other.getMatID()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getFmedItemID() == null ? other.getFmedItemID() == null : this.getFmedItemID().equals(other.getFmedItemID()))
            && (this.getIsDrawn() == null ? other.getIsDrawn() == null : this.getIsDrawn().equals(other.getIsDrawn()))
            && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()))
            && (this.getIsChecked() == null ? other.getIsChecked() == null : this.getIsChecked().equals(other.getIsChecked()))
            && (this.getIsAbolished() == null ? other.getIsAbolished() == null : this.getIsAbolished().equals(other.getIsAbolished()))
            && (this.getIsRegistered() == null ? other.getIsRegistered() == null : this.getIsRegistered().equals(other.getIsRegistered()))
            && (this.getIsExecuted() == null ? other.getIsExecuted() == null : this.getIsExecuted().equals(other.getIsExecuted()))
            && (this.getDrawnName() == null ? other.getDrawnName() == null : this.getDrawnName().equals(other.getDrawnName()))
            && (this.getPaidName() == null ? other.getPaidName() == null : this.getPaidName().equals(other.getPaidName()))
            && (this.getCheckedName() == null ? other.getCheckedName() == null : this.getCheckedName().equals(other.getCheckedName()))
            && (this.getAbolishedName() == null ? other.getAbolishedName() == null : this.getAbolishedName().equals(other.getAbolishedName()))
            && (this.getRegisteredName() == null ? other.getRegisteredName() == null : this.getRegisteredName().equals(other.getRegisteredName()))
            && (this.getExecutedName() == null ? other.getExecutedName() == null : this.getExecutedName().equals(other.getExecutedName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedMatListID() == null) ? 0 : getMedMatListID().hashCode());
        result = prime * result + ((getItemsType() == null) ? 0 : getItemsType().hashCode());
        result = prime * result + ((getItemsDetailID() == null) ? 0 : getItemsDetailID().hashCode());
        result = prime * result + ((getMedicinesMaterialsID() == null) ? 0 : getMedicinesMaterialsID().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getMatOrMedType() == null) ? 0 : getMatOrMedType().hashCode());
        result = prime * result + ((getConstantName() == null) ? 0 : getConstantName().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getCreatRName() == null) ? 0 : getCreatRName().hashCode());
        result = prime * result + ((getChangeRName() == null) ? 0 : getChangeRName().hashCode());
        result = prime * result + ((getMatID() == null) ? 0 : getMatID().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getFmedItemID() == null) ? 0 : getFmedItemID().hashCode());
        result = prime * result + ((getIsDrawn() == null) ? 0 : getIsDrawn().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        result = prime * result + ((getIsChecked() == null) ? 0 : getIsChecked().hashCode());
        result = prime * result + ((getIsAbolished() == null) ? 0 : getIsAbolished().hashCode());
        result = prime * result + ((getIsRegistered() == null) ? 0 : getIsRegistered().hashCode());
        result = prime * result + ((getIsExecuted() == null) ? 0 : getIsExecuted().hashCode());
        result = prime * result + ((getDrawnName() == null) ? 0 : getDrawnName().hashCode());
        result = prime * result + ((getPaidName() == null) ? 0 : getPaidName().hashCode());
        result = prime * result + ((getCheckedName() == null) ? 0 : getCheckedName().hashCode());
        result = prime * result + ((getAbolishedName() == null) ? 0 : getAbolishedName().hashCode());
        result = prime * result + ((getRegisteredName() == null) ? 0 : getRegisteredName().hashCode());
        result = prime * result + ((getExecutedName() == null) ? 0 : getExecutedName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medMatListID=").append(medMatListID);
        sb.append(", itemsType=").append(itemsType);
        sb.append(", itemsDetailID=").append(itemsDetailID);
        sb.append(", medicinesMaterialsID=").append(medicinesMaterialsID);
        sb.append(", dosage=").append(dosage);
        sb.append(", matOrMedType=").append(matOrMedType);
        sb.append(", constantName=").append(constantName);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", creatRName=").append(creatRName);
        sb.append(", changeRName=").append(changeRName);
        sb.append(", matID=").append(matID);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", format=").append(format);
        sb.append(", price=").append(price);
        sb.append(", fmedItemID=").append(fmedItemID);
        sb.append(", isDrawn=").append(isDrawn);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", isAbolished=").append(isAbolished);
        sb.append(", isRegistered=").append(isRegistered);
        sb.append(", isExecuted=").append(isExecuted);
        sb.append(", drawnName=").append(drawnName);
        sb.append(", paidName=").append(paidName);
        sb.append(", checkedName=").append(checkedName);
        sb.append(", abolishedName=").append(abolishedName);
        sb.append(", registeredName=").append(registeredName);
        sb.append(", executedName=").append(executedName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}