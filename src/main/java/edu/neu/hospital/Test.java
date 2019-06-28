package edu.neu.hospital;

import java.time.Instant;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Date date = Date.from(Instant.parse("2019-06-11T16:00:00.000Z"));
        System.out.println(date);
    }
}
