package com.example.springmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringmasterclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmasterclassApplication.class,
            args);
    }

}
