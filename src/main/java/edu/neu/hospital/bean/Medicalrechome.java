package edu.neu.hospital.bean;

import java.io.Serializable;

/**
 * medicalrechome
 * @author 
 */
public class Medicalrechome implements Serializable {
    private Integer id;

    private Integer medicalrecid;

    private Integer doctorid;

    private String chiefcomplaint;

    private String currentmedicalhistory;

    private String currenttreatmentsituation;

    /**
     * 病史
     */
    private String pastmedicalhistory;

    private String allergies;

    private String physicalexamination;

    private String initialdiagnosis;

    private String initialdiagnosistype;

    /**
     * 检查建议
     */
    private String inspectrecommend;

    /**
     * 注意事项
     */
    private String attention;

    /**
     * 状态
     */
    private String status;

    /**
     * 保留1
     */
    private String reserve1;

    /**
     * 保留2
     */
    private String reserve2;

    /**
     * 保留3
     */
    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalrecid() {
        return medicalrecid;
    }

    public void setMedicalrecid(Integer medicalrecid) {
        this.medicalrecid = medicalrecid;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getChiefcomplaint() {
        return chiefcomplaint;
    }

    public void setChiefcomplaint(String chiefcomplaint) {
        this.chiefcomplaint = chiefcomplaint;
    }

    public String getCurrentmedicalhistory() {
        return currentmedicalhistory;
    }

    public void setCurrentmedicalhistory(String currentmedicalhistory) {
        this.currentmedicalhistory = currentmedicalhistory;
    }

    public String getCurrenttreatmentsituation() {
        return currenttreatmentsituation;
    }

    public void setCurrenttreatmentsituation(String currenttreatmentsituation) {
        this.currenttreatmentsituation = currenttreatmentsituation;
    }

    public String getPastmedicalhistory() {
        return pastmedicalhistory;
    }

    public void setPastmedicalhistory(String pastmedicalhistory) {
        this.pastmedicalhistory = pastmedicalhistory;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPhysicalexamination() {
        return physicalexamination;
    }

    public void setPhysicalexamination(String physicalexamination) {
        this.physicalexamination = physicalexamination;
    }

    public String getInitialdiagnosis() {
        return initialdiagnosis;
    }

    public void setInitialdiagnosis(String initialdiagnosis) {
        this.initialdiagnosis = initialdiagnosis;
    }

    public String getInitialdiagnosistype() {
        return initialdiagnosistype;
    }

    public void setInitialdiagnosistype(String initialdiagnosistype) {
        this.initialdiagnosistype = initialdiagnosistype;
    }

    public String getInspectrecommend() {
        return inspectrecommend;
    }

    public void setInspectrecommend(String inspectrecommend) {
        this.inspectrecommend = inspectrecommend;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
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
        Medicalrechome other = (Medicalrechome) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalrecid() == null ? other.getMedicalrecid() == null : this.getMedicalrecid().equals(other.getMedicalrecid()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getChiefcomplaint() == null ? other.getChiefcomplaint() == null : this.getChiefcomplaint().equals(other.getChiefcomplaint()))
            && (this.getCurrentmedicalhistory() == null ? other.getCurrentmedicalhistory() == null : this.getCurrentmedicalhistory().equals(other.getCurrentmedicalhistory()))
            && (this.getCurrenttreatmentsituation() == null ? other.getCurrenttreatmentsituation() == null : this.getCurrenttreatmentsituation().equals(other.getCurrenttreatmentsituation()))
            && (this.getPastmedicalhistory() == null ? other.getPastmedicalhistory() == null : this.getPastmedicalhistory().equals(other.getPastmedicalhistory()))
            && (this.getAllergies() == null ? other.getAllergies() == null : this.getAllergies().equals(other.getAllergies()))
            && (this.getPhysicalexamination() == null ? other.getPhysicalexamination() == null : this.getPhysicalexamination().equals(other.getPhysicalexamination()))
            && (this.getInitialdiagnosis() == null ? other.getInitialdiagnosis() == null : this.getInitialdiagnosis().equals(other.getInitialdiagnosis()))
            && (this.getInitialdiagnosistype() == null ? other.getInitialdiagnosistype() == null : this.getInitialdiagnosistype().equals(other.getInitialdiagnosistype()))
            && (this.getInspectrecommend() == null ? other.getInspectrecommend() == null : this.getInspectrecommend().equals(other.getInspectrecommend()))
            && (this.getAttention() == null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalrecid() == null) ? 0 : getMedicalrecid().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getChiefcomplaint() == null) ? 0 : getChiefcomplaint().hashCode());
        result = prime * result + ((getCurrentmedicalhistory() == null) ? 0 : getCurrentmedicalhistory().hashCode());
        result = prime * result + ((getCurrenttreatmentsituation() == null) ? 0 : getCurrenttreatmentsituation().hashCode());
        result = prime * result + ((getPastmedicalhistory() == null) ? 0 : getPastmedicalhistory().hashCode());
        result = prime * result + ((getAllergies() == null) ? 0 : getAllergies().hashCode());
        result = prime * result + ((getPhysicalexamination() == null) ? 0 : getPhysicalexamination().hashCode());
        result = prime * result + ((getInitialdiagnosis() == null) ? 0 : getInitialdiagnosis().hashCode());
        result = prime * result + ((getInitialdiagnosistype() == null) ? 0 : getInitialdiagnosistype().hashCode());
        result = prime * result + ((getInspectrecommend() == null) ? 0 : getInspectrecommend().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medicalrecid=").append(medicalrecid);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", chiefcomplaint=").append(chiefcomplaint);
        sb.append(", currentmedicalhistory=").append(currentmedicalhistory);
        sb.append(", currenttreatmentsituation=").append(currenttreatmentsituation);
        sb.append(", pastmedicalhistory=").append(pastmedicalhistory);
        sb.append(", allergies=").append(allergies);
        sb.append(", physicalexamination=").append(physicalexamination);
        sb.append(", initialdiagnosis=").append(initialdiagnosis);
        sb.append(", initialdiagnosistype=").append(initialdiagnosistype);
        sb.append(", inspectrecommend=").append(inspectrecommend);
        sb.append(", attention=").append(attention);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}