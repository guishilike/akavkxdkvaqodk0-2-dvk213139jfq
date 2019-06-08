package edu.neu.hospital.bean;

import java.io.Serializable;

/**
 * diseasecategory
 * @author 
 */
public class Diseasecategory implements Serializable {
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
    private Integer squenceno;

    /**
     * 疾病类型
     */
    private Integer dicatype;

    private Integer appearuserid;

    private Integer changeuserid;

    private String status;

    private static final long serialVersionUID = 1L;

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

    public Integer getSquenceno() {
        return squenceno;
    }

    public void setSquenceno(Integer squenceno) {
        this.squenceno = squenceno;
    }

    public Integer getDicatype() {
        return dicatype;
    }

    public void setDicatype(Integer dicatype) {
        this.dicatype = dicatype;
    }

    public Integer getAppearuserid() {
        return appearuserid;
    }

    public void setAppearuserid(Integer appearuserid) {
        this.appearuserid = appearuserid;
    }

    public Integer getChangeuserid() {
        return changeuserid;
    }

    public void setChangeuserid(Integer changeuserid) {
        this.changeuserid = changeuserid;
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
        Diseasecategory other = (Diseasecategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSquenceno() == null ? other.getSquenceno() == null : this.getSquenceno().equals(other.getSquenceno()))
            && (this.getDicatype() == null ? other.getDicatype() == null : this.getDicatype().equals(other.getDicatype()))
            && (this.getAppearuserid() == null ? other.getAppearuserid() == null : this.getAppearuserid().equals(other.getAppearuserid()))
            && (this.getChangeuserid() == null ? other.getChangeuserid() == null : this.getChangeuserid().equals(other.getChangeuserid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSquenceno() == null) ? 0 : getSquenceno().hashCode());
        result = prime * result + ((getDicatype() == null) ? 0 : getDicatype().hashCode());
        result = prime * result + ((getAppearuserid() == null) ? 0 : getAppearuserid().hashCode());
        result = prime * result + ((getChangeuserid() == null) ? 0 : getChangeuserid().hashCode());
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
        sb.append(", squenceno=").append(squenceno);
        sb.append(", dicatype=").append(dicatype);
        sb.append(", appearuserid=").append(appearuserid);
        sb.append(", changeuserid=").append(changeuserid);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}