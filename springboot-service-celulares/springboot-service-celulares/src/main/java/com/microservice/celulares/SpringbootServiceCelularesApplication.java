package com.microservice.celulares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.microservice.celulares.entity")
public class SpringbootServiceCelularesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceCelularesApplication.class, args);
    }
}