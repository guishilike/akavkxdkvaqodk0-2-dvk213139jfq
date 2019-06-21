package edu.neu.hospital.bean.inspectionBean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * inspectmedplateview
 * @author 
 */
public class InspectMedPlateView implements Serializable {
    /**
     * ID
     */
    private Integer projecttemplateID;

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
    private String name;

    /**
     * 单据分类
     */
    private String category;

    /**
     * 临床印象
     */
    private String impression;

    /**
     * 适用范围
     */
    private Integer area;

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
     * id
     */
    private Integer plateDetailID;

    /**
     * 剂量
     */
    private Integer dosage;

    /**
     * 医嘱
     */
    private String advice;

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

    /**
     * 拼音助记码     说明:药品名称首字母大写缩写
     */
    private String mnemonicCode;

    /**
     * 报销比例
     */
    private BigDecimal reimbursement;

    private String constantName1;

    /**
     * 真名
     */
    private String realName;

    private String constantName2;

    private String constantName3;

    private static final long serialVersionUID = 1L;

    public Integer getProjecttemplateID() {
        return projecttemplateID;
    }

    public void setProjecttemplateID(Integer projecttemplateID) {
        this.projecttemplateID = projecttemplateID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
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

    public Integer getPlateDetailID() {
        return plateDetailID;
    }

    public void setPlateDetailID(Integer plateDetailID) {
        this.plateDetailID = plateDetailID;
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

    public String getConstantName1() {
        return constantName1;
    }

    public void setConstantName1(String constantName1) {
        this.constantName1 = constantName1;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getConstantName2() {
        return constantName2;
    }

    public void setConstantName2(String constantName2) {
        this.constantName2 = constantName2;
    }

    public String getConstantName3() {
        return constantName3;
    }

    public void setConstantName3(String constantName3) {
        this.constantName3 = constantName3;
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
        InspectMedPlateView other = (InspectMedPlateView) that;
        return (this.getProjecttemplateID() == null ? other.getProjecttemplateID() == null : this.getProjecttemplateID().equals(other.getProjecttemplateID()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getTemplateCode() == null ? other.getTemplateCode() == null : this.getTemplateCode().equals(other.getTemplateCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()))
            && (this.getGoal() == null ? other.getGoal() == null : this.getGoal().equals(other.getGoal()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPlateDetailID() == null ? other.getPlateDetailID() == null : this.getPlateDetailID().equals(other.getPlateDetailID()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getAdvice() == null ? other.getAdvice() == null : this.getAdvice().equals(other.getAdvice()))
            && (this.getDrugsID() == null ? other.getDrugsID() == null : this.getDrugsID().equals(other.getDrugsID()))
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
            && (this.getConstantName1() == null ? other.getConstantName1() == null : this.getConstantName1().equals(other.getConstantName1()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getConstantName2() == null ? other.getConstantName2() == null : this.getConstantName2().equals(other.getConstantName2()))
            && (this.getConstantName3() == null ? other.getConstantName3() == null : this.getConstantName3().equals(other.getConstantName3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProjecttemplateID() == null) ? 0 : getProjecttemplateID().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getTemplateCode() == null) ? 0 : getTemplateCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        result = prime * result + ((getGoal() == null) ? 0 : getGoal().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPlateDetailID() == null) ? 0 : getPlateDetailID().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getAdvice() == null) ? 0 : getAdvice().hashCode());
        result = prime * result + ((getDrugsID() == null) ? 0 : getDrugsID().hashCode());
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
        result = prime * result + ((getConstantName1() == null) ? 0 : getConstantName1().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getConstantName2() == null) ? 0 : getConstantName2().hashCode());
        result = prime * result + ((getConstantName3() == null) ? 0 : getConstantName3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projecttemplateID=").append(projecttemplateID);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", templateCode=").append(templateCode);
        sb.append(", name=").append(name);
        sb.append(", category=").append(category);
        sb.append(", impression=").append(impression);
        sb.append(", area=").append(area);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", goal=").append(goal);
        sb.append(", type=").append(type);
        sb.append(", plateDetailID=").append(plateDetailID);
        sb.append(", dosage=").append(dosage);
        sb.append(", advice=").append(advice);
        sb.append(", drugsID=").append(drugsID);
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
        sb.append(", constantName1=").append(constantName1);
        sb.append(", realName=").append(realName);
        sb.append(", constantName2=").append(constantName2);
        sb.append(", constantName3=").append(constantName3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}