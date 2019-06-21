package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;

/**
 * inspectionview
 *
 * @author
 */
public class InspectionView implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer inspectionID;
    /**
     * 病历id
     */
    private Integer medicalRecordID;
    /**
     * 医生id
     */
    private Integer doctorID;
    private Integer inspectionDetailsID;
    /**
     * 非药品目录ID
     */
    private Integer fmedItemID;
    /**
     * 数目
     */
    private Integer number;

    public Integer getInspectionID() {
        return inspectionID;
    }

    public void setInspectionID(Integer inspectionID) {
        this.inspectionID = inspectionID;
    }

    public Integer getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(Integer medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getInspectionDetailsID() {
        return inspectionDetailsID;
    }

    public void setInspectionDetailsID(Integer inspectionDetailsID) {
        this.inspectionDetailsID = inspectionDetailsID;
    }

    public Integer getFmedItemID() {
        return fmedItemID;
    }

    public void setFmedItemID(Integer fmedItemID) {
        this.fmedItemID = fmedItemID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        InspectionView other = (InspectionView) that;
        return (this.getInspectionID() == null ? other.getInspectionID() == null : this.getInspectionID().equals(other.getInspectionID()))
                && (this.getMedicalRecordID() == null ? other.getMedicalRecordID() == null : this.getMedicalRecordID().equals(other.getMedicalRecordID()))
                && (this.getDoctorID() == null ? other.getDoctorID() == null : this.getDoctorID().equals(other.getDoctorID()))
                && (this.getInspectionDetailsID() == null ? other.getInspectionDetailsID() == null : this.getInspectionDetailsID().equals(other.getInspectionDetailsID()))
                && (this.getFmedItemID() == null ? other.getFmedItemID() == null : this.getFmedItemID().equals(other.getFmedItemID()))
                && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInspectionID() == null) ? 0 : getInspectionID().hashCode());
        result = prime * result + ((getMedicalRecordID() == null) ? 0 : getMedicalRecordID().hashCode());
        result = prime * result + ((getDoctorID() == null) ? 0 : getDoctorID().hashCode());
        result = prime * result + ((getInspectionDetailsID() == null) ? 0 : getInspectionDetailsID().hashCode());
        result = prime * result + ((getFmedItemID() == null) ? 0 : getFmedItemID().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inspectionID=").append(inspectionID);
        sb.append(", medicalRecordID=").append(medicalRecordID);
        sb.append(", doctorID=").append(doctorID);
        sb.append(", inspectionDetailsID=").append(inspectionDetailsID);
        sb.append(", fmedItemID=").append(fmedItemID);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}