package com.begank.revival.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RevivalEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RevivalEurekaApplication.class, args);
    }

}
