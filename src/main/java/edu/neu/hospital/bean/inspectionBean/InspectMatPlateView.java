package edu.neu.hospital.bean.inspectionBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * inspectmatplateview
 * @author 
 */
public class InspectMatPlateView implements Serializable {
    /**
     * ID
     */
    private Integer plateID;

    /**
     * 医生ID
     */
    private Integer doctorId;

    /**
     * 组合编码
     */
    private String templateCode;

    /**
     * 组合名称
     */
    private String plateName;

    /**
     * 单据分类
     */
    private String category;

    /**
     * 适用范围
     */
    private Integer area;

    /**
     * 临床印象
     */
    private String impression;

    /**
     * 临床诊断（不是基础的那种诊断
     */
    private String diagnosis;

    /**
     * 目的要求
     */
    private String goal;

    /**
     * 药品或项目 129：药品 ，128：项目，130：材料
     */
    private Integer type;

    /**
     * 剂量
     */
    private Integer dosage;

    /**
     * 医嘱
     */
    private String advice;

    /**
     * 材料编码
     */
    private String code;

    /**
     * 材料名称
     */
    private String materialsName;

    /**
     * 规格
     */
    private String format;

    /**
     * id
     */
    private Integer plateDetailsID;

    /**
     * 材料编号
     */
    private Integer materialsID;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 真名
     */
    private String realName;

    private String constantName;

    private static final long serialVersionUID = 1L;

    public Integer getPlateID() {
        return plateID;
    }

    public void setPlateID(Integer plateID) {
        this.plateID = plateID;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
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

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(String materialsName) {
        this.materialsName = materialsName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getPlateDetailsID() {
        return plateDetailsID;
    }

    public void setPlateDetailsID(Integer plateDetailsID) {
        this.plateDetailsID = plateDetailsID;
    }

    public Integer getMaterialsID() {
        return materialsID;
    }

    public void setMaterialsID(Integer materialsID) {
        this.materialsID = materialsID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
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
        InspectMatPlateView other = (InspectMatPlateView) that;
        return (this.getPlateID() == null ? other.getPlateID() == null : this.getPlateID().equals(other.getPlateID()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getTemplateCode() == null ? other.getTemplateCode() == null : this.getTemplateCode().equals(other.getTemplateCode()))
            && (this.getPlateName() == null ? other.getPlateName() == null : this.getPlateName().equals(other.getPlateName()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()))
            && (this.getGoal() == null ? other.getGoal() == null : this.getGoal().equals(other.getGoal()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getAdvice() == null ? other.getAdvice() == null : this.getAdvice().equals(other.getAdvice()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getMaterialsName() == null ? other.getMaterialsName() == null : this.getMaterialsName().equals(other.getMaterialsName()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getPlateDetailsID() == null ? other.getPlateDetailsID() == null : this.getPlateDetailsID().equals(other.getPlateDetailsID()))
            && (this.getMaterialsID() == null ? other.getMaterialsID() == null : this.getMaterialsID().equals(other.getMaterialsID()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getConstantName() == null ? other.getConstantName() == null : this.getConstantName().equals(other.getConstantName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlateID() == null) ? 0 : getPlateID().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getTemplateCode() == null) ? 0 : getTemplateCode().hashCode());
        result = prime * result + ((getPlateName() == null) ? 0 : getPlateName().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        result = prime * result + ((getGoal() == null) ? 0 : getGoal().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getAdvice() == null) ? 0 : getAdvice().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getMaterialsName() == null) ? 0 : getMaterialsName().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getPlateDetailsID() == null) ? 0 : getPlateDetailsID().hashCode());
        result = prime * result + ((getMaterialsID() == null) ? 0 : getMaterialsID().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getConstantName() == null) ? 0 : getConstantName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plateID=").append(plateID);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", templateCode=").append(templateCode);
        sb.append(", plateName=").append(plateName);
        sb.append(", category=").append(category);
        sb.append(", area=").append(area);
        sb.append(", impression=").append(impression);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", goal=").append(goal);
        sb.append(", type=").append(type);
        sb.append(", dosage=").append(dosage);
        sb.append(", advice=").append(advice);
        sb.append(", code=").append(code);
        sb.append(", materialsName=").append(materialsName);
        sb.append(", format=").append(format);
        sb.append(", plateDetailsID=").append(plateDetailsID);
        sb.append(", materialsID=").append(materialsID);
        sb.append(", price=").append(price);
        sb.append(", realName=").append(realName);
        sb.append(", constantName=").append(constantName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}