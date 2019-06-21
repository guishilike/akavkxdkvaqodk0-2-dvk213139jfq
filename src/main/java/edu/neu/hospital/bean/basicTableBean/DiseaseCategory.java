package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * diseasecategory
 *
 * @author
 */
public class DiseaseCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Integer id;
    /**
     * 疾病分类的编码
     */
    private String code;
    /**
     * 疾病类别的名字
     */
    private String name;
    /**
     * 顺序号
     */
    private Integer squenceNo;
    /**
     * 疾病类型
     */
    private Integer dicaType;
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

    public Integer getSquenceNo() {
        return squenceNo;
    }

    public void setSquenceNo(Integer squenceNo) {
        this.squenceNo = squenceNo;
    }

    public Integer getDicaType() {
        return dicaType;
    }

    public void setDicaType(Integer dicaType) {
        this.dicaType = dicaType;
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
        DiseaseCategory other = (DiseaseCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getSquenceNo() == null ? other.getSquenceNo() == null : this.getSquenceNo().equals(other.getSquenceNo()))
                && (this.getDicaType() == null ? other.getDicaType() == null : this.getDicaType().equals(other.getDicaType()))
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
        result = prime * result + ((getSquenceNo() == null) ? 0 : getSquenceNo().hashCode());
        result = prime * result + ((getDicaType() == null) ? 0 : getDicaType().hashCode());
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
        sb.append(", squenceNo=").append(squenceNo);
        sb.append(", dicaType=").append(dicaType);
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