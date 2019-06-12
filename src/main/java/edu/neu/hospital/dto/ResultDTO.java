package edu.neu.hospital.dto;

public class ResultDTO<T> {
    private String status; // "OK";"NG"
    private String msg;
    private T data;

    public ResultDTO() {

    }

    public ResultDTO(String status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
