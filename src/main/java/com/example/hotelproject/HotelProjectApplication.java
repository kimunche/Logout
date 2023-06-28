package com.example.hotelproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.hotelproject.mapper")
@SpringBootApplication
public class HotelProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelProjectApplication.class, args);
    }

}
