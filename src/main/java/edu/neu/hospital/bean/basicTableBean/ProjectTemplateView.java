package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * projecttemplateview
 * @author 
 */
public class ProjectTemplateView implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 医生ID
     */
    private Integer doctorId;

    /**
     * 组合名称
     */
    private String projectTemplateName;

    /**
     * 组合编码
     */
    private String templateCode;

    /**
     * 单据分类
     */
    private String category;

    /**
     * 适用范围
     */
    private Integer area;

    /**
     * 项目、药品、材料ID
     */
    private Integer relevantID;

    /**
     * 剂量
     */
    private Integer dosage;

    /**
     * 项目名称
     */
    private String fMedItemName;

    /**
     * 项目编码
     */
    private String code;

    /**
     * 单价
     */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getProjectTemplateName() {
        return projectTemplateName;
    }

    public void setProjectTemplateName(String projectTemplateName) {
        this.projectTemplateName = projectTemplateName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getRelevantID() {
        return relevantID;
    }

    public void setRelevantID(Integer relevantID) {
        this.relevantID = relevantID;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public String getfMedItemName() {
        return fMedItemName;
    }

    public void setfMedItemName(String fMedItemName) {
        this.fMedItemName = fMedItemName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
        ProjectTemplateView other = (ProjectTemplateView) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getProjectTemplateName() == null ? other.getProjectTemplateName() == null : this.getProjectTemplateName().equals(other.getProjectTemplateName()))
            && (this.getTemplateCode() == null ? other.getTemplateCode() == null : this.getTemplateCode().equals(other.getTemplateCode()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getRelevantID() == null ? other.getRelevantID() == null : this.getRelevantID().equals(other.getRelevantID()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getfMedItemName() == null ? other.getfMedItemName() == null : this.getfMedItemName().equals(other.getfMedItemName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getProjectTemplateName() == null) ? 0 : getProjectTemplateName().hashCode());
        result = prime * result + ((getTemplateCode() == null) ? 0 : getTemplateCode().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getRelevantID() == null) ? 0 : getRelevantID().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getfMedItemName() == null) ? 0 : getfMedItemName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", projectTemplateName=").append(projectTemplateName);
        sb.append(", templateCode=").append(templateCode);
        sb.append(", category=").append(category);
        sb.append(", area=").append(area);
        sb.append(", relevantID=").append(relevantID);
        sb.append(", dosage=").append(dosage);
        sb.append(", fMedItemName=").append(fMedItemName);
        sb.append(", code=").append(code);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}