package edu.neu.hospital.dto;
//用于存储id列表的DTO
import java.io.Serializable;
import java.util.List;

public class IdDTO implements Serializable {
    private List<Integer> id ;
    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }



}
