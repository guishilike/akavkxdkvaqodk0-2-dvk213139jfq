package edu.neu.hospital.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * drugs
 * @author 
 */
public class Drugs implements Serializable {
    /**
     * 药品编号   格式：86979474000208
     */
    private Integer id;

    /**
     * 药品编码  
     */
    private String drugscode;

    /**
     * 药品名称
     */
    private String drugsname;

    /**
     * 药品规格     格式：50mg×7片/盒、200mg×100ml/瓶等
     */
    private String drugsformat;

    /**
     * 包装单位  格式：1:支;2:瓶;3:盒;4:袋;5:克;
     */
    private String drugsunit;

    /**
     * 生产厂家  格式：江苏恒瑞医药股份有限公司
     */
    private String manufacturer;

    /**
     * 药品剂型 11
     */
    private Integer drugsdosageid;

    /**
     * 药品类型  10     格式：101:代表西药;102:代表中成药; 103:代表中草药; 
     */
    private Integer drugstypeid;

    /**
     * 药品单价
     */
    private BigDecimal drugsprice;

    /**
     * 拼音助记码     说明:药品名称首字母大写缩写
     */
    private String mnemoniccode;

    /**
     * 报销比例
     */
    private BigDecimal reimbursement;

    /**
     * 状态 1：有效，2无效
     */
    private String status;

    /**
     * 创建时间
     */
    private Date appeardate;

    /**
     * 创建人
     */
    private Integer appearuserid;

    /**
     * 修改日期
     */
    private Date changedate;

    /**
     * 修改人
     */
    private Integer changeuserid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugscode() {
        return drugscode;
    }

    public void setDrugscode(String drugscode) {
        this.drugscode = drugscode;
    }

    public String getDrugsname() {
        return drugsname;
    }

    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname;
    }

    public String getDrugsformat() {
        return drugsformat;
    }

    public void setDrugsformat(String drugsformat) {
        this.drugsformat = drugsformat;
    }

    public String getDrugsunit() {
        return drugsunit;
    }

    public void setDrugsunit(String drugsunit) {
        this.drugsunit = drugsunit;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getDrugsdosageid() {
        return drugsdosageid;
    }

    public void setDrugsdosageid(Integer drugsdosageid) {
        this.drugsdosageid = drugsdosageid;
    }

    public Integer getDrugstypeid() {
        return drugstypeid;
    }

    public void setDrugstypeid(Integer drugstypeid) {
        this.drugstypeid = drugstypeid;
    }

    public BigDecimal getDrugsprice() {
        return drugsprice;
    }

    public void setDrugsprice(BigDecimal drugsprice) {
        this.drugsprice = drugsprice;
    }

    public String getMnemoniccode() {
        return mnemoniccode;
    }

    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode;
    }

    public BigDecimal getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(BigDecimal reimbursement) {
        this.reimbursement = reimbursement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAppeardate() {
        return appeardate;
    }

    public void setAppeardate(Date appeardate) {
        this.appeardate = appeardate;
    }

    public Integer getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(Integer appearuserid) {
        this.appearuserid = appearuserid;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }

    public Integer getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(Integer changeuserid) {
        this.changeuserid = changeuserid;
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
        Drugs other = (Drugs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDrugscode() == null ? other.getDrugscode() == null : this.getDrugscode().equals(other.getDrugscode()))
            && (this.getDrugsname() == null ? other.getDrugsname() == null : this.getDrugsname().equals(other.getDrugsname()))
            && (this.getDrugsformat() == null ? other.getDrugsformat() == null : this.getDrugsformat().equals(other.getDrugsformat()))
            && (this.getDrugsunit() == null ? other.getDrugsunit() == null : this.getDrugsunit().equals(other.getDrugsunit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugsdosageid() == null ? other.getDrugsdosageid() == null : this.getDrugsdosageid().equals(other.getDrugsdosageid()))
            && (this.getDrugstypeid() == null ? other.getDrugstypeid() == null : this.getDrugstypeid().equals(other.getDrugstypeid()))
            && (this.getDrugsprice() == null ? other.getDrugsprice() == null : this.getDrugsprice().equals(other.getDrugsprice()))
            && (this.getMnemoniccode() == null ? other.getMnemoniccode() == null : this.getMnemoniccode().equals(other.getMnemoniccode()))
            && (this.getReimbursement() == null ? other.getReimbursement() == null : this.getReimbursement().equals(other.getReimbursement()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDrugscode() == null) ? 0 : getDrugscode().hashCode());
        result = prime * result + ((getDrugsname() == null) ? 0 : getDrugsname().hashCode());
        result = prime * result + ((getDrugsformat() == null) ? 0 : getDrugsformat().hashCode());
        result = prime * result + ((getDrugsunit() == null) ? 0 : getDrugsunit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugsdosageid() == null) ? 0 : getDrugsdosageid().hashCode());
        result = prime * result + ((getDrugstypeid() == null) ? 0 : getDrugstypeid().hashCode());
        result = prime * result + ((getDrugsprice() == null) ? 0 : getDrugsprice().hashCode());
        result = prime * result + ((getMnemoniccode() == null) ? 0 : getMnemoniccode().hashCode());
        result = prime * result + ((getReimbursement() == null) ? 0 : getReimbursement().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugscode=").append(drugscode);
        sb.append(", drugsname=").append(drugsname);
        sb.append(", drugsformat=").append(drugsformat);
        sb.append(", drugsunit=").append(drugsunit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsdosageid=").append(drugsdosageid);
        sb.append(", drugstypeid=").append(drugstypeid);
        sb.append(", drugsprice=").append(drugsprice);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", reimbursement=").append(reimbursement);
        sb.append(", status=").append(status);
        sb.append(", appeardate=").append(appeardate);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changedate=").append(changedate);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}