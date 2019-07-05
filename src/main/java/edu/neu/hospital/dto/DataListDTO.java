package edu.neu.hospital.dto;

import java.io.Serializable;
import java.util.List;

public class DataListDTO<T> implements Serializable {
    private List<T> data ;
    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }





}
