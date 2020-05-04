package com.hd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AiClownEureka2RunApp {
    public static void main(String[] args) {
        SpringApplication.run(AiClownEureka2RunApp.class,args);
    }
}
