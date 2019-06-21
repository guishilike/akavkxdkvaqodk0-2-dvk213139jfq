package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * disease
 *
 * @author
 */
public class Disease implements Serializable {
    private static final long serialVersionUID = 1L;
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
    private Integer appearUserId;
    private Date appearDate;
    private Integer changeUserId;
    private Date changeDate;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        Disease other = (Disease) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getDiseaseIcd() == null ? other.getDiseaseIcd() == null : this.getDiseaseIcd().equals(other.getDiseaseIcd()))
                && (this.getDiseaseCatagoryId() == null ? other.getDiseaseCatagoryId() == null : this.getDiseaseCatagoryId().equals(other.getDiseaseCatagoryId()))
                && (this.getAppearUserId() == null ? other.getAppearUserId() == null : this.getAppearUserId().equals(other.getAppearUserId()))
                && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
                && (this.getChangeUserId() == null ? other.getChangeUserId() == null : this.getChangeUserId().equals(other.getChangeUserId()))
                && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
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
        result = prime * result + ((getAppearUserId() == null) ? 0 : getAppearUserId().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeUserId() == null) ? 0 : getChangeUserId().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", appearUserId=").append(appearUserId);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeUserId=").append(changeUserId);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}