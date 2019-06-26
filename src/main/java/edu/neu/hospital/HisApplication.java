package edu.neu.hospital;

import org.json.JSONArray;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan("edu.neu.hospital.dao")
public class HisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisApplication.class, args);

    }

}
