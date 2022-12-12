package com.example.wassimaloui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class WassimalouiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WassimalouiApplication.class, args);
    }

}
