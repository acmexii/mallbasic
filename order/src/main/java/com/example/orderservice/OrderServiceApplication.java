package com.example.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication    
public class OrderServiceApplication {
    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext =
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}