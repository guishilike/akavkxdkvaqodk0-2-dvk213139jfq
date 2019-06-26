package edu.neu.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.neu.hospital.dao")
public class HisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisApplication.class, args);

    }

}
