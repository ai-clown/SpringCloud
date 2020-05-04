package com.hd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AiClownEurekaRunApp {
    public static void main(String[] args) {
        SpringApplication.run(AiClownEurekaRunApp.class,args);
    }
}
