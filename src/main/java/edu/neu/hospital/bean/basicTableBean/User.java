package edu.neu.hospital.bean.basicTableBean;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 登录名
     */
    private String userName;

    /**
     * 真名
     */
    private String realName;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 科室ID
     */
    private Integer departmentID;

    /**
     * 用户类别
     */
    private Integer typeID;

    /**
     * 职称，查常数项表
     */
    private Integer rankID;

    /**
     * 是否排班
     */
    private String isSchedule;

    /**
     * 是否有效
     */
    private String status;

    private Integer appearUserID;

    private Integer changeUserID;

    private Date appearDate;

    private Date changeDate;

    private String photoLocation;

    private Long contact;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public Integer getRankID() {
        return rankID;
    }

    public void setRankID(Integer rankID) {
        this.rankID = rankID;
    }

    public String getIsSchedule() {
        return isSchedule;
    }

    public void setIsSchedule(String isSchedule) {
        this.isSchedule = isSchedule;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Date getAppearDate() {
        return appearDate;
    }

    public void setAppearDate(Date appearDate) {
        this.appearDate = appearDate;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getDepartmentID() == null ? other.getDepartmentID() == null : this.getDepartmentID().equals(other.getDepartmentID()))
            && (this.getTypeID() == null ? other.getTypeID() == null : this.getTypeID().equals(other.getTypeID()))
            && (this.getRankID() == null ? other.getRankID() == null : this.getRankID().equals(other.getRankID()))
            && (this.getIsSchedule() == null ? other.getIsSchedule() == null : this.getIsSchedule().equals(other.getIsSchedule()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAppearUserID() == null ? other.getAppearUserID() == null : this.getAppearUserID().equals(other.getAppearUserID()))
            && (this.getChangeUserID() == null ? other.getChangeUserID() == null : this.getChangeUserID().equals(other.getChangeUserID()))
            && (this.getAppearDate() == null ? other.getAppearDate() == null : this.getAppearDate().equals(other.getAppearDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()))
            && (this.getPhotoLocation() == null ? other.getPhotoLocation() == null : this.getPhotoLocation().equals(other.getPhotoLocation()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getDepartmentID() == null) ? 0 : getDepartmentID().hashCode());
        result = prime * result + ((getTypeID() == null) ? 0 : getTypeID().hashCode());
        result = prime * result + ((getRankID() == null) ? 0 : getRankID().hashCode());
        result = prime * result + ((getIsSchedule() == null) ? 0 : getIsSchedule().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAppearUserID() == null) ? 0 : getAppearUserID().hashCode());
        result = prime * result + ((getChangeUserID() == null) ? 0 : getChangeUserID().hashCode());
        result = prime * result + ((getAppearDate() == null) ? 0 : getAppearDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        result = prime * result + ((getPhotoLocation() == null) ? 0 : getPhotoLocation().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
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
        sb.append(", userName=").append(userName);
        sb.append(", realName=").append(realName);
        sb.append(", passwd=").append(passwd);
        sb.append(", departmentID=").append(departmentID);
        sb.append(", typeID=").append(typeID);
        sb.append(", rankID=").append(rankID);
        sb.append(", isSchedule=").append(isSchedule);
        sb.append(", status=").append(status);
        sb.append(", appearUserID=").append(appearUserID);
        sb.append(", changeUserID=").append(changeUserID);
        sb.append(", appearDate=").append(appearDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", photoLocation=").append(photoLocation);
        sb.append(", contact=").append(contact);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}