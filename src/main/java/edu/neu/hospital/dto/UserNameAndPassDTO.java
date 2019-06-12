package edu.neu.hospital.dto;
//用于存储用户名和密码
public class UserNameAndPassDTO {
    private String userName;
    private  String password;

    public UserNameAndPassDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
