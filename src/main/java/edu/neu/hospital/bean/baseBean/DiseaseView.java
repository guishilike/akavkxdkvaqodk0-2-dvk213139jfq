package edu.neu.hospital.bean.baseBean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * diseaseview
 * @author 
 */
public class DiseaseView implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 疾病编码
     */
    private String code;

    /**
     * 疾病名字
     */
    private String name;

    private String diseaseIcd;

    /**
     * ICD编码
     */
    private Integer diseaseCatagoryId;

    /**
     * 疾病分类的编码
     */
    private String diseaseCategoryCode;

    /**
     * 疾病类别的名字
     */
    private String diseaseCategoryName;

    /**
     * 疾病类型
     */
    private Integer dicaTypeID;

    private String dicaTypeCode;

    private String dicaTypeName;

    private Integer appearUserId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appearDate;

    private Integer changeUserId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date changeDate;

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

    public String getDiseaseIcd() {
        return diseaseIcd;
    }

    public void setDiseaseIcd(String diseaseIcd) {
        this.diseaseIcd = diseaseIcd;
    }

    public Integer getDiseaseCatagoryId() {
        return diseaseCatagoryId;
    }

    public void setDiseaseCatagoryId(Integer diseaseCatagoryId) {
        this.diseaseCatagoryId = diseaseCatagoryId;
    }

    public String getDiseaseCategoryCode() {
        return diseaseCategoryCode;
    }

    public void setDiseaseCategoryCode(String diseaseCategoryCode) {
        this.diseaseCategoryCode = diseaseCategoryCode;
    }

    public String getDiseaseCategoryName() {
        return diseaseCategoryName;
    }

    public void setDiseaseCategoryName(String diseaseCategoryName) {
        this.diseaseCategoryName = diseaseCategoryName;
    }

    public Integer getDicaTypeID() {
        return dicaTypeID;
    }

    public void setDicaTypeID(Integer dicaTypeID) {
        this.dicaTypeID = dicaTypeID;
    }

    public String getDicaTypeCode() {
        return dicaTypeCode;
    }

    public void setDicaTypeCode(String dicaTypeCode) {
        this.dicaTypeCode = dicaTypeCode;
    }

    public String getDicaTypeName() {
        return dicaTypeName;
    }

    public void setDicaTypeName(String dicaTypeName) {
        this.dicaTypeName = dicaTypeName;
    }

    public Integer getAppearUserId() {
        return appearUserId;
    }

    public void setAppearUserId(Integer appearUserId) {
        this.appearUserId = appearUserId;
    }

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Integer getChangeUserId() {
        return changeUserId;
    }

    public void setChangeUserId(Integer changeUserId) {
        this.changeUserId = changeUserId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
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
        DiseaseView other = (DiseaseView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDiseaseIcd() == null ? other.getDiseaseIcd() == null : this.getDiseaseIcd().equals(other.getDiseaseIcd()))
            && (this.getDiseaseCatagoryId() == null ? other.getDiseaseCatagoryId() == null : this.getDiseaseCatagoryId().equals(other.getDiseaseCatagoryId()))
            && (this.getDiseaseCategoryCode() == null ? other.getDiseaseCategoryCode() == null : this.getDiseaseCategoryCode().equals(other.getDiseaseCategoryCode()))
            && (this.getDiseaseCategoryName() == null ? other.getDiseaseCategoryName() == null : this.getDiseaseCategoryName().equals(other.getDiseaseCategoryName()))
            && (this.getDicaTypeID() == null ? other.getDicaTypeID() == null : this.getDicaTypeID().equals(other.getDicaTypeID()))
            && (this.getDicaTypeCode() == null ? other.getDicaTypeCode() == null : this.getDicaTypeCode().equals(other.getDicaTypeCode()))
            && (this.getDicaTypeName() == null ? other.getDicaTypeName() == null : this.getDicaTypeName().equals(other.getDicaTypeName()))
            && (this.getAppearUserId() == null ? other.getAppearUserId() == null : this.getAppearUserId().equals(other.getAppearUserId()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeUserId() == null ? other.getChangeUserId() == null : this.getChangeUserId().equals(other.getChangeUserId()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getAppearUserName() == null ? other.getAppearUserName() == null : this.getAppearUserName().equals(other.getAppearUserName()))
            && (this.getChangeUserName() == null ? other.getChangeUserName() == null : this.getChangeUserName().equals(other.getChangeUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDiseaseIcd() == null) ? 0 : getDiseaseIcd().hashCode());
        result = prime * result + ((getDiseaseCatagoryId() == null) ? 0 : getDiseaseCatagoryId().hashCode());
        result = prime * result + ((getDiseaseCategoryCode() == null) ? 0 : getDiseaseCategoryCode().hashCode());
        result = prime * result + ((getDiseaseCategoryName() == null) ? 0 : getDiseaseCategoryName().hashCode());
        result = prime * result + ((getDicaTypeID() == null) ? 0 : getDicaTypeID().hashCode());
        result = prime * result + ((getDicaTypeCode() == null) ? 0 : getDicaTypeCode().hashCode());
        result = prime * result + ((getDicaTypeName() == null) ? 0 : getDicaTypeName().hashCode());
        result = prime * result + ((getAppearUserId() == null) ? 0 : getAppearUserId().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeUserId() == null) ? 0 : getChangeUserId().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", diseaseIcd=").append(diseaseIcd);
        sb.append(", diseaseCatagoryId=").append(diseaseCatagoryId);
        sb.append(", diseaseCategoryCode=").append(diseaseCategoryCode);
        sb.append(", diseaseCategoryName=").append(diseaseCategoryName);
        sb.append(", dicaTypeID=").append(dicaTypeID);
        sb.append(", dicaTypeCode=").append(dicaTypeCode);
        sb.append(", dicaTypeName=").append(dicaTypeName);
        sb.append(", appearUserId=").append(appearUserId);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeUserId=").append(changeUserId);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", appearUserName=").append(appearUserName);
        sb.append(", changeUserName=").append(changeUserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}