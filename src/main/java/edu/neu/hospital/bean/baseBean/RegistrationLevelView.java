package edu.neu.hospital.bean.baseBean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * registrationlevelview
 * @author 
 */
public class RegistrationLevelView implements Serializable {
    private Integer id;

    private String registeredCode;

    private String registeredName;

    private Integer sequenceID;

    /**
     * 是否默认：0默认，1不是默认
     */
    private String isDefault;

    /**
     * 挂号费
     */
    private BigDecimal registrationFee;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appearDate;

    private Integer apearUserID;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

    private Integer changeUserID;

    /**
     * 登录名
     */
    private String appearUserName;

    /**
     * 登录名
     */
    private String changeUserName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegisteredCode() {
        return registeredCode;
    }

    public void setRegisteredCode(String registeredCode) {
        this.registeredCode = registeredCode;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public Integer getSequenceID() {
        return sequenceID;
    }

    public void setSequenceID(Integer sequenceID) {
        this.sequenceID = sequenceID;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public BigDecimal getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(BigDecimal registrationFee) {
        this.registrationFee = registrationFee;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getApearUserID() {
        return apearUserID;
    }

    public void setApearUserID(Integer apearUserID) {
        this.apearUserID = apearUserID;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public String getAppearUserName() {
        return appearUserName;
    }

    public void setAppearUserName(String appearUserName) {
        this.appearUserName = appearUserName;
    }

    public String getChangeUserName() {
        return changeUserName;
    }

    public void setChangeUserName(String changeUserName) {
        this.changeUserName = changeUserName;
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
        RegistrationLevelView other = (RegistrationLevelView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisteredCode() == null ? other.getRegisteredCode() == null : this.getRegisteredCode().equals(other.getRegisteredCode()))
            && (this.getRegisteredName() == null ? other.getRegisteredName() == null : this.getRegisteredName().equals(other.getRegisteredName()))
            && (this.getSequenceID() == null ? other.getSequenceID() == null : this.getSequenceID().equals(other.getSequenceID()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getRegistrationFee() == null ? other.getRegistrationFee() == null : this.getRegistrationFee().equals(other.getRegistrationFee()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getApearUserID() == null ? other.getApearUserID() == null : this.getApearUserID().equals(other.getApearUserID()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisteredCode() == null) ? 0 : getRegisteredCode().hashCode());
        result = prime * result + ((getRegisteredName() == null) ? 0 : getRegisteredName().hashCode());
        result = prime * result + ((getSequenceID() == null) ? 0 : getSequenceID().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getRegistrationFee() == null) ? 0 : getRegistrationFee().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getApearUserID() == null) ? 0 : getApearUserID().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearUserName() == null) ? 0 : getAppearUserName().hashCode());
        result = prime * result + ((getChangeUserName() == null) ? 0 : getChangeUserName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registeredCode=").append(registeredCode);
        sb.append(", registeredName=").append(registeredName);
        sb.append(", sequenceID=").append(sequenceID);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", registrationFee=").append(registrationFee);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", apearUserID=").append(apearUserID);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}