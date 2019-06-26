package edu.neu.hospital.bean.tollBean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tollpresview
 * @author 
 */
public class TollPresView implements Serializable {
    /**
     * 患者费用编号
     */
    private Integer id;

    /**
     * 病历ID
     */
    private Integer medicalRecordID;

    /**
     * 收费类别12
     */
    private Integer feeCategoryID;

    /**
     * 收费项目ID
     */
    private Integer chargeItemID;

    /**
     * 费用科目类型
费用科目类型
     */
    private Integer expID;

    /**
     * 金额
     */
    private BigDecimal fee;

    /**
     * 收费员ID
     */
    private Integer tollManID;

    /**
     * 收费时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tollDate;

    /**
     * 创建人ID
     */
    private Integer appearUserID;

    /**
     * 费用产生日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date feeAppearDate;

    /**
     * 修改人ID
     */
    private Integer changeUserID;

    /**
     * 费用变动日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date feeChangeDate;
    /**
     * 缴费状态：1.已缴费2.未交费3.已退费
     */
    private Integer payStatus;

    /**
     * 日结状态：1.已日结2.未日结
     */
    private Integer dateStatus;

    /**
     * 病历号
     */
    private String medicalRecordNo;

    /**
     * 患者ID
     */
    private Integer patientID;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 身份证号
     */
    private String identityCardNo;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 家庭住址
     */
    private String familyAddress;

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

    /**
     * 拼音助记码     说明:药品名称首字母大写缩写
     */
    private String mnemonicCode;

    /**
     * 报销比例
     */
    private BigDecimal reimbursement;

    /**
     * 真名
     */
    private String tollName;

    /**
     * 真名
     */
    private String appearName;

    /**
     * 真名
     */
    private String changeName;

    private String feeCategoryName;

    private String payStatusName;

    private String dateStatusName;

    private String drugsDosageName;

    private String drugTypeName;

    /**
     * 费用科目名字
     */
    private String expName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public Integer getFeeCategoryID() {
        return feeCategoryID;
    }

    public void setFeeCategoryID(Integer feeCategoryID) {
        this.feeCategoryID = feeCategoryID;
    }

    public Integer getChargeItemID() {
        return chargeItemID;
    }

    public void setChargeItemID(Integer chargeItemID) {
        this.chargeItemID = chargeItemID;
    }

    public Integer getExpID() {
        return expID;
    }

    public void setExpID(Integer expID) {
        this.expID = expID;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getTollManID() {
        return tollManID;
    }

    public void setTollManID(Integer tollManID) {
        this.tollManID = tollManID;
    }

    public Date getTollDate() {
        return tollDate;
    }

    public void setTollDate(Date tollDate) {
        this.tollDate = tollDate;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Date getFeeAppearDate() {
        return feeAppearDate;
    }

    public void setFeeAppearDate(Date feeAppearDate) {
        this.feeAppearDate = feeAppearDate;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public Date getFeeChangeDate() {
        return feeChangeDate;
    }

    public void setFeeChangeDate(Date feeChangeDate) {
        this.feeChangeDate = feeChangeDate;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(Integer dateStatus) {
        this.dateStatus = dateStatus;
    }

    public String getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(String medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
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

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public BigDecimal getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(BigDecimal reimbursement) {
        this.reimbursement = reimbursement;
    }

    public String getTollName() {
        return tollName;
    }

    public void setTollName(String tollName) {
        this.tollName = tollName;
    }

    public String getAppearName() {
        return appearName;
    }

    public void setAppearName(String appearName) {
        this.appearName = appearName;
    }

    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }

    public String getFeeCategoryName() {
        return feeCategoryName;
    }

    public void setFeeCategoryName(String feeCategoryName) {
        this.feeCategoryName = feeCategoryName;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public String getDateStatusName() {
        return dateStatusName;
    }

    public void setDateStatusName(String dateStatusName) {
        this.dateStatusName = dateStatusName;
    }

    public String getDrugsDosageName() {
        return drugsDosageName;
    }

    public void setDrugsDosageName(String drugsDosageName) {
        this.drugsDosageName = drugsDosageName;
    }

    public String getDrugTypeName() {
        return drugTypeName;
    }

    public void setDrugTypeName(String drugTypeName) {
        this.drugTypeName = drugTypeName;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
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
        TollPresView other = (TollPresView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
            && (this.getFeeCategoryID() == null ? other.getFeeCategoryID() == null : this.getFeeCategoryID().equals(other.getFeeCategoryID()))
            && (this.getChargeItemID() == null ? other.getChargeItemID() == null : this.getChargeItemID().equals(other.getChargeItemID()))
            && (this.getExpID() == null ? other.getExpID() == null : this.getExpID().equals(other.getExpID()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getTollManID() == null ? other.getTollManID() == null : this.getTollManID().equals(other.getTollManID()))
            && (this.getTollDate() == null ? other.getTollDate() == null : this.getTollDate().equals(other.getTollDate()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getFeeAppearDate() == null ? other.getFeeAppearDate() == null : this.getFeeAppearDate().equals(other.getFeeAppearDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getFeeChangeDate() == null ? other.getFeeChangeDate() == null : this.getFeeChangeDate().equals(other.getFeeChangeDate()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getDateStatus() == null ? other.getDateStatus() == null : this.getDateStatus().equals(other.getDateStatus()))
            && (this.getMedicalRecordNo() == null ? other.getMedicalRecordNo() == null : this.getMedicalRecordNo().equals(other.getMedicalRecordNo()))
            && (this.getPatientID() == null ? other.getPatientID() == null : this.getPatientID().equals(other.getPatientID()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getIdentityCardNo() == null ? other.getIdentityCardNo() == null : this.getIdentityCardNo().equals(other.getIdentityCardNo()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getFamilyAddress() == null ? other.getFamilyAddress() == null : this.getFamilyAddress().equals(other.getFamilyAddress()))
            && (this.getPrescriptionID() == null ? other.getPrescriptionID() == null : this.getPrescriptionID().equals(other.getPrescriptionID()))
            && (this.getDrugID() == null ? other.getDrugID() == null : this.getDrugID().equals(other.getDrugID()))
            && (this.getUsage() == null ? other.getUsage() == null : this.getUsage().equals(other.getUsage()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getMedication() == null ? other.getMedication() == null : this.getMedication().equals(other.getMedication()))
            && (this.getDrugsCode() == null ? other.getDrugsCode() == null : this.getDrugsCode().equals(other.getDrugsCode()))
            && (this.getDrugsName() == null ? other.getDrugsName() == null : this.getDrugsName().equals(other.getDrugsName()))
            && (this.getDrugsFormat() == null ? other.getDrugsFormat() == null : this.getDrugsFormat().equals(other.getDrugsFormat()))
            && (this.getDrugsUnit() == null ? other.getDrugsUnit() == null : this.getDrugsUnit().equals(other.getDrugsUnit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugsDosageID() == null ? other.getDrugsDosageID() == null : this.getDrugsDosageID().equals(other.getDrugsDosageID()))
            && (this.getDrugsTypeID() == null ? other.getDrugsTypeID() == null : this.getDrugsTypeID().equals(other.getDrugsTypeID()))
            && (this.getDrugsPrice() == null ? other.getDrugsPrice() == null : this.getDrugsPrice().equals(other.getDrugsPrice()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getReimbursement() == null ? other.getReimbursement() == null : this.getReimbursement().equals(other.getReimbursement()))
            && (this.getTollName() == null ? other.getTollName() == null : this.getTollName().equals(other.getTollName()))
            && (this.getAppearName() == null ? other.getAppearName() == null : this.getAppearName().equals(other.getAppearName()))
            && (this.getChangeName() == null ? other.getChangeName() == null : this.getChangeName().equals(other.getChangeName()))
            && (this.getFeeCategoryName() == null ? other.getFeeCategoryName() == null : this.getFeeCategoryName().equals(other.getFeeCategoryName()))
            && (this.getPayStatusName() == null ? other.getPayStatusName() == null : this.getPayStatusName().equals(other.getPayStatusName()))
            && (this.getDateStatusName() == null ? other.getDateStatusName() == null : this.getDateStatusName().equals(other.getDateStatusName()))
            && (this.getDrugsDosageName() == null ? other.getDrugsDosageName() == null : this.getDrugsDosageName().equals(other.getDrugsDosageName()))
            && (this.getDrugTypeName() == null ? other.getDrugTypeName() == null : this.getDrugTypeName().equals(other.getDrugTypeName()))
            && (this.getExpName() == null ? other.getExpName() == null : this.getExpName().equals(other.getExpName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getFeeCategoryID() == null) ? 0 : getFeeCategoryID().hashCode());
        result = prime * result + ((getChargeItemID() == null) ? 0 : getChargeItemID().hashCode());
        result = prime * result + ((getExpID() == null) ? 0 : getExpID().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getTollManID() == null) ? 0 : getTollManID().hashCode());
        result = prime * result + ((getTollDate() == null) ? 0 : getTollDate().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getFeeAppearDate() == null) ? 0 : getFeeAppearDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getFeeChangeDate() == null) ? 0 : getFeeChangeDate().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getDateStatus() == null) ? 0 : getDateStatus().hashCode());
        result = prime * result + ((getMedicalRecordNo() == null) ? 0 : getMedicalRecordNo().hashCode());
        result = prime * result + ((getPatientID() == null) ? 0 : getPatientID().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getIdentityCardNo() == null) ? 0 : getIdentityCardNo().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getFamilyAddress() == null) ? 0 : getFamilyAddress().hashCode());
        result = prime * result + ((getPrescriptionID() == null) ? 0 : getPrescriptionID().hashCode());
        result = prime * result + ((getDrugID() == null) ? 0 : getDrugID().hashCode());
        result = prime * result + ((getUsage() == null) ? 0 : getUsage().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getMedication() == null) ? 0 : getMedication().hashCode());
        result = prime * result + ((getDrugsCode() == null) ? 0 : getDrugsCode().hashCode());
        result = prime * result + ((getDrugsName() == null) ? 0 : getDrugsName().hashCode());
        result = prime * result + ((getDrugsFormat() == null) ? 0 : getDrugsFormat().hashCode());
        result = prime * result + ((getDrugsUnit() == null) ? 0 : getDrugsUnit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugsDosageID() == null) ? 0 : getDrugsDosageID().hashCode());
        result = prime * result + ((getDrugsTypeID() == null) ? 0 : getDrugsTypeID().hashCode());
        result = prime * result + ((getDrugsPrice() == null) ? 0 : getDrugsPrice().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getReimbursement() == null) ? 0 : getReimbursement().hashCode());
        result = prime * result + ((getTollName() == null) ? 0 : getTollName().hashCode());
        result = prime * result + ((getAppearName() == null) ? 0 : getAppearName().hashCode());
        result = prime * result + ((getChangeName() == null) ? 0 : getChangeName().hashCode());
        result = prime * result + ((getFeeCategoryName() == null) ? 0 : getFeeCategoryName().hashCode());
        result = prime * result + ((getPayStatusName() == null) ? 0 : getPayStatusName().hashCode());
        result = prime * result + ((getDateStatusName() == null) ? 0 : getDateStatusName().hashCode());
        result = prime * result + ((getDrugsDosageName() == null) ? 0 : getDrugsDosageName().hashCode());
        result = prime * result + ((getDrugTypeName() == null) ? 0 : getDrugTypeName().hashCode());
        result = prime * result + ((getExpName() == null) ? 0 : getExpName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", feeCategoryID=").append(feeCategoryID);
        sb.append(", chargeItemID=").append(chargeItemID);
        sb.append(", expID=").append(expID);
        sb.append(", fee=").append(fee);
        sb.append(", tollManID=").append(tollManID);
        sb.append(", tollDate=").append(tollDate);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", feeAppearDate=").append(feeAppearDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", feeChangeDate=").append(feeChangeDate);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append(", medicalRecordNo=").append(medicalRecordNo);
        sb.append(", patientID=").append(patientID);
        sb.append(", patientName=").append(patientName);
        sb.append(", identityCardNo=").append(identityCardNo);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", familyAddress=").append(familyAddress);
        sb.append(", prescriptionID=").append(prescriptionID);
        sb.append(", drugID=").append(drugID);
        sb.append(", usage=").append(usage);
        sb.append(", dosage=").append(dosage);
        sb.append(", frequency=").append(frequency);
        sb.append(", quantity=").append(quantity);
        sb.append(", medication=").append(medication);
        sb.append(", drugsCode=").append(drugsCode);
        sb.append(", drugsName=").append(drugsName);
        sb.append(", drugsFormat=").append(drugsFormat);
        sb.append(", drugsUnit=").append(drugsUnit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsDosageID=").append(drugsDosageID);
        sb.append(", drugsTypeID=").append(drugsTypeID);
        sb.append(", drugsPrice=").append(drugsPrice);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", reimbursement=").append(reimbursement);
        sb.append(", tollName=").append(tollName);
        sb.append(", appearName=").append(appearName);
        sb.append(", changeName=").append(changeName);
        sb.append(", feeCategoryName=").append(feeCategoryName);
        sb.append(", payStatusName=").append(payStatusName);
        sb.append(", dateStatusName=").append(dateStatusName);
        sb.append(", drugsDosageName=").append(drugsDosageName);
        sb.append(", drugTypeName=").append(drugTypeName);
        sb.append(", expName=").append(expName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}