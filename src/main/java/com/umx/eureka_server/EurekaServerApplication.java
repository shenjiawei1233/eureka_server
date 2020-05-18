package com.umx.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    
    //初始化
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
