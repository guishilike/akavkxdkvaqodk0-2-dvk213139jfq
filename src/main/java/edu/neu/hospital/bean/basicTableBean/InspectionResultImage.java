package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * inspectionresultimage
 *
 * @author
 */
public class InspectionResultImage implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 图片名字
     */
    private String imageName;
    /**
     * 检查检验结果id
     */
    private Integer inspectionResultID;
    /**
     * 目录
     */
    private String catalog;
    private Integer appearUserID;
    private Integer changeUserID;
    private Date appearUserDate;
    private Date changeUserDate;
    private String status;
    private String reserve1;
    private String reserve2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getInspectionResultID() {
        return inspectionResultID;
    }

    public void setInspectionResultID(Integer inspectionResultID) {
        this.inspectionResultID = inspectionResultID;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Integer getAppearUserID() {
        return appearUserID;
    }

    public void setAppearUserID(Integer appearUserID) {
        this.appearUserID = appearUserID;
    }

    public Integer getChangeUserID() {
        return changeUserID;
    }

    public void setChangeUserID(Integer changeUserID) {
        this.changeUserID = changeUserID;
    }

    public Date getAppearUserDate() {
        return appearUserDate;
    }

    public void setAppearUserDate(Date appearUserDate) {
        this.appearUserDate = appearUserDate;
    }

    public Date getChangeUserDate() {
        return changeUserDate;
    }

    public void setChangeUserDate(Date changeUserDate) {
        this.changeUserDate = changeUserDate;
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
        InspectionResultImage other = (InspectionResultImage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getImageName() == null ? other.getImageName() == null : this.getImageName().equals(other.getImageName()))
                && (this.getInspectionResultID() == null ? other.getInspectionResultID() == null : this.getInspectionResultID().equals(other.getInspectionResultID()))
                && (this.getCatalog() == null ? other.getCatalog() == null : this.getCatalog().equals(other.getCatalog()))
                && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
                && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
                && (this.getAppearUserDate() == null ? other.getAppearUserDate() == null : this.getAppearUserDate().equals(other.getAppearUserDate()))
                && (this.getChangeUserDate() == null ? other.getChangeUserDate() == null : this.getChangeUserDate().equals(other.getChangeUserDate()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
                && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImageName() == null) ? 0 : getImageName().hashCode());
        result = prime * result + ((getInspectionResultID() == null) ? 0 : getInspectionResultID().hashCode());
        result = prime * result + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearUserDate() == null) ? 0 : getAppearUserDate().hashCode());
        result = prime * result + ((getChangeUserDate() == null) ? 0 : getChangeUserDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imageName=").append(imageName);
        sb.append(", inspectionResultID=").append(inspectionResultID);
        sb.append(", catalog=").append(catalog);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearUserDate=").append(appearUserDate);
        sb.append(", changeUserDate=").append(changeUserDate);
        sb.append(", status=").append(status);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}