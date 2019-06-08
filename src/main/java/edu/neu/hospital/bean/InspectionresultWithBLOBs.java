package edu.neu.hospital.bean;

import java.io.Serializable;

/**
 * inspectionresult
 * @author 
 */
public class InspectionresultWithBLOBs extends Inspectionresult implements Serializable {
    /**
     * 所见
     */
    private String view;

    /**
     * 诊断
     */
    private String diagnosis;

    private static final long serialVersionUID = 1L;

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
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
        InspectionresultWithBLOBs other = (InspectionresultWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInspectionid() == null ? other.getInspectionid() == null : this.getInspectionid().equals(other.getInspectionid()))
            && (this.getFmeditemid() == null ? other.getFmeditemid() == null : this.getFmeditemid().equals(other.getFmeditemid()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getAppeardate() == null ? other.getAppeardate() == null : this.getAppeardate().equals(other.getAppeardate()))
            && (this.getChangedate() == null ? other.getChangedate() == null : this.getChangedate().equals(other.getChangedate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getView() == null ? other.getView() == null : this.getView().equals(other.getView()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInspectionid() == null) ? 0 : getInspectionid().hashCode());
        result = prime * result + ((getFmeditemid() == null) ? 0 : getFmeditemid().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
        result = prime * result + ((getAppeardate() == null) ? 0 : getAppeardate().hashCode());
        result = prime * result + ((getChangedate() == null) ? 0 : getChangedate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getView() == null) ? 0 : getView().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", view=").append(view);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}