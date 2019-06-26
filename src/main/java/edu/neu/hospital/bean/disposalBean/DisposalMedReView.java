package edu.neu.hospital.bean.disposalBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * disposalmedreview
 * @author 
 */
public class DisposalMedReView implements Serializable {
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

    /**
     * 药品编号   格式：86979474000208
     */
    private Integer drugsID;

    /**
     * 药品编码  
     */
    private String drugsCode;

    /**
     * 药品名称
     */
    private String drugsName;

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

    /**
     * 药品单价
     */
    private BigDecimal drugsPrice;

    private Integer constID;

    private String itemsTypeName;

    /**
     * 拼音助记码     说明:药品名称首字母大写缩写
     */
    private String mnemonicCode;

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
     * 报销比例
     */
    private BigDecimal reimbursement;

    /**
     * 真名
     */
    private String appearRName;

    /**
     * 真名
     */
    private String changeRName;

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

    private String drugsDosageName;

    private String drugsTypeName;

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

    public Integer getDrugsID() {
        return drugsID;
    }

    public void setDrugsID(Integer drugsID) {
        this.drugsID = drugsID;
    }

    public String getDrugsCode() {
        return drugsCode;
    }

    public void setDrugsCode(String drugsCode) {
        this.drugsCode = drugsCode;
    }

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
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

    public BigDecimal getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(BigDecimal drugsPrice) {
        this.drugsPrice = drugsPrice;
    }

    public Integer getConstID() {
        return constID;
    }

    public void setConstID(Integer constID) {
        this.constID = constID;
    }

    public String getItemsTypeName() {
        return itemsTypeName;
    }

    public void setItemsTypeName(String itemsTypeName) {
        this.itemsTypeName = itemsTypeName;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
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

    public BigDecimal getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(BigDecimal reimbursement) {
        this.reimbursement = reimbursement;
    }

    public String getAppearRName() {
        return appearRName;
    }

    public void setAppearRName(String appearRName) {
        this.appearRName = appearRName;
    }

    public String getChangeRName() {
        return changeRName;
    }

    public void setChangeRName(String changeRName) {
        this.changeRName = changeRName;
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

    public String getDrugsDosageName() {
        return drugsDosageName;
    }

    public void setDrugsDosageName(String drugsDosageName) {
        this.drugsDosageName = drugsDosageName;
    }

    public String getDrugsTypeName() {
        return drugsTypeName;
    }

    public void setDrugsTypeName(String drugsTypeName) {
        this.drugsTypeName = drugsTypeName;
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
        DisposalMedReView other = (DisposalMedReView) that;
        return (this.getMedMatListID() == null ? other.getMedMatListID() == null : this.getMedMatListID().equals(other.getMedMatListID()))
            && (this.getItemsType() == null ? other.getItemsType() == null : this.getItemsType().equals(other.getItemsType()))
            && (this.getItemsDetailID() == null ? other.getItemsDetailID() == null : this.getItemsDetailID().equals(other.getItemsDetailID()))
            && (this.getMedicinesMaterialsID() == null ? other.getMedicinesMaterialsID() == null : this.getMedicinesMaterialsID().equals(other.getMedicinesMaterialsID()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getMatOrMedType() == null ? other.getMatOrMedType() == null : this.getMatOrMedType().equals(other.getMatOrMedType()))
            && (this.getDrugsID() == null ? other.getDrugsID() == null : this.getDrugsID().equals(other.getDrugsID()))
            && (this.getDrugsCode() == null ? other.getDrugsCode() == null : this.getDrugsCode().equals(other.getDrugsCode()))
            && (this.getDrugsName() == null ? other.getDrugsName() == null : this.getDrugsName().equals(other.getDrugsName()))
            && (this.getDrugsFormat() == null ? other.getDrugsFormat() == null : this.getDrugsFormat().equals(other.getDrugsFormat()))
            && (this.getDrugsUnit() == null ? other.getDrugsUnit() == null : this.getDrugsUnit().equals(other.getDrugsUnit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugsDosageID() == null ? other.getDrugsDosageID() == null : this.getDrugsDosageID().equals(other.getDrugsDosageID()))
            && (this.getDrugsTypeID() == null ? other.getDrugsTypeID() == null : this.getDrugsTypeID().equals(other.getDrugsTypeID()))
            && (this.getDrugsPrice() == null ? other.getDrugsPrice() == null : this.getDrugsPrice().equals(other.getDrugsPrice()))
            && (this.getConstID() == null ? other.getConstID() == null : this.getConstID().equals(other.getConstID()))
            && (this.getItemsTypeName() == null ? other.getItemsTypeName() == null : this.getItemsTypeName().equals(other.getItemsTypeName()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getReimbursement() == null ? other.getReimbursement() == null : this.getReimbursement().equals(other.getReimbursement()))
            && (this.getAppearRName() == null ? other.getAppearRName() == null : this.getAppearRName().equals(other.getAppearRName()))
            && (this.getChangeRName() == null ? other.getChangeRName() == null : this.getChangeRName().equals(other.getChangeRName()))
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
            && (this.getExecutedName() == null ? other.getExecutedName() == null : this.getExecutedName().equals(other.getExecutedName()))
            && (this.getDrugsDosageName() == null ? other.getDrugsDosageName() == null : this.getDrugsDosageName().equals(other.getDrugsDosageName()))
            && (this.getDrugsTypeName() == null ? other.getDrugsTypeName() == null : this.getDrugsTypeName().equals(other.getDrugsTypeName()));
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
        result = prime * result + ((getDrugsID() == null) ? 0 : getDrugsID().hashCode());
        result = prime * result + ((getDrugsCode() == null) ? 0 : getDrugsCode().hashCode());
        result = prime * result + ((getDrugsName() == null) ? 0 : getDrugsName().hashCode());
        result = prime * result + ((getDrugsFormat() == null) ? 0 : getDrugsFormat().hashCode());
        result = prime * result + ((getDrugsUnit() == null) ? 0 : getDrugsUnit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugsDosageID() == null) ? 0 : getDrugsDosageID().hashCode());
        result = prime * result + ((getDrugsTypeID() == null) ? 0 : getDrugsTypeID().hashCode());
        result = prime * result + ((getDrugsPrice() == null) ? 0 : getDrugsPrice().hashCode());
        result = prime * result + ((getConstID() == null) ? 0 : getConstID().hashCode());
        result = prime * result + ((getItemsTypeName() == null) ? 0 : getItemsTypeName().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getReimbursement() == null) ? 0 : getReimbursement().hashCode());
        result = prime * result + ((getAppearRName() == null) ? 0 : getAppearRName().hashCode());
        result = prime * result + ((getChangeRName() == null) ? 0 : getChangeRName().hashCode());
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
        result = prime * result + ((getDrugsDosageName() == null) ? 0 : getDrugsDosageName().hashCode());
        result = prime * result + ((getDrugsTypeName() == null) ? 0 : getDrugsTypeName().hashCode());
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
        sb.append(", drugsID=").append(drugsID);
        sb.append(", drugsCode=").append(drugsCode);
        sb.append(", drugsName=").append(drugsName);
        sb.append(", drugsFormat=").append(drugsFormat);
        sb.append(", drugsUnit=").append(drugsUnit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsDosageID=").append(drugsDosageID);
        sb.append(", drugsTypeID=").append(drugsTypeID);
        sb.append(", drugsPrice=").append(drugsPrice);
        sb.append(", constID=").append(constID);
        sb.append(", itemsTypeName=").append(itemsTypeName);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", reimbursement=").append(reimbursement);
        sb.append(", appearRName=").append(appearRName);
        sb.append(", changeRName=").append(changeRName);
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
        sb.append(", drugsDosageName=").append(drugsDosageName);
        sb.append(", drugsTypeName=").append(drugsTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}