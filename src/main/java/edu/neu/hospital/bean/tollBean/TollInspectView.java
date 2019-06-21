package edu.neu.hospital.bean.tollBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tollinspectview
 * @author 
 */
public class TollInspectView implements Serializable {
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
    private Date tollDate;

    /**
     * 创建人ID
     */
    private Integer appearUserID;

    /**
     * 费用产生日期
     */
    private Date feeAppearDate;

    /**
     * 修改人ID
     */
    private Integer changeUserID;

    /**
     * 费用变动日期
     */
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
     * 拼音助记码
     */
    private String mnemonicCode;

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

    private String expName;

    private String payStatusName;

    /**
     * 患者ID
     */
    private Integer patientID;

    /**
     * 非药品目录ID
     */
    private Integer fmedItemID;

    private String dateStatusName;

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

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
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

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public Integer getFmedItemID() {
        return fmedItemID;
    }

    public void setFmedItemID(Integer fmedItemID) {
        this.fmedItemID = fmedItemID;
    }

    public String getDateStatusName() {
        return dateStatusName;
    }

    public void setDateStatusName(String dateStatusName) {
        this.dateStatusName = dateStatusName;
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
        TollInspectView other = (TollInspectView) that;
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
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getIdentityCardNo() == null ? other.getIdentityCardNo() == null : this.getIdentityCardNo().equals(other.getIdentityCardNo()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getFamilyAddress() == null ? other.getFamilyAddress() == null : this.getFamilyAddress().equals(other.getFamilyAddress()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getTollName() == null ? other.getTollName() == null : this.getTollName().equals(other.getTollName()))
            && (this.getAppearName() == null ? other.getAppearName() == null : this.getAppearName().equals(other.getAppearName()))
            && (this.getChangeName() == null ? other.getChangeName() == null : this.getChangeName().equals(other.getChangeName()))
            && (this.getFeeCategoryName() == null ? other.getFeeCategoryName() == null : this.getFeeCategoryName().equals(other.getFeeCategoryName()))
            && (this.getExpName() == null ? other.getExpName() == null : this.getExpName().equals(other.getExpName()))
            && (this.getPayStatusName() == null ? other.getPayStatusName() == null : this.getPayStatusName().equals(other.getPayStatusName()))
            && (this.getPatientID() == null ? other.getPatientID() == null : this.getPatientID().equals(other.getPatientID()))
            && (this.getFmedItemID() == null ? other.getFmedItemID() == null : this.getFmedItemID().equals(other.getFmedItemID()))
            && (this.getDateStatusName() == null ? other.getDateStatusName() == null : this.getDateStatusName().equals(other.getDateStatusName()));
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
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getIdentityCardNo() == null) ? 0 : getIdentityCardNo().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getFamilyAddress() == null) ? 0 : getFamilyAddress().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getTollName() == null) ? 0 : getTollName().hashCode());
        result = prime * result + ((getAppearName() == null) ? 0 : getAppearName().hashCode());
        result = prime * result + ((getChangeName() == null) ? 0 : getChangeName().hashCode());
        result = prime * result + ((getFeeCategoryName() == null) ? 0 : getFeeCategoryName().hashCode());
        result = prime * result + ((getExpName() == null) ? 0 : getExpName().hashCode());
        result = prime * result + ((getPayStatusName() == null) ? 0 : getPayStatusName().hashCode());
        result = prime * result + ((getPatientID() == null) ? 0 : getPatientID().hashCode());
        result = prime * result + ((getFmedItemID() == null) ? 0 : getFmedItemID().hashCode());
        result = prime * result + ((getDateStatusName() == null) ? 0 : getDateStatusName().hashCode());
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
        sb.append(", patientName=").append(patientName);
        sb.append(", identityCardNo=").append(identityCardNo);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", familyAddress=").append(familyAddress);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", format=").append(format);
        sb.append(", price=").append(price);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", tollName=").append(tollName);
        sb.append(", appearName=").append(appearName);
        sb.append(", changeName=").append(changeName);
        sb.append(", feeCategoryName=").append(feeCategoryName);
        sb.append(", expName=").append(expName);
        sb.append(", payStatusName=").append(payStatusName);
        sb.append(", patientID=").append(patientID);
        sb.append(", fmedItemID=").append(fmedItemID);
        sb.append(", dateStatusName=").append(dateStatusName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}