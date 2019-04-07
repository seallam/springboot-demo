package com.seal.springboot.microservice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: seal
 * @company: shai-tech
 * @create: 2019-04-07 23:45
 */
@EnableFeignClients(basePackages = {})
@EnableEurekaClient
@ComponentScan({
        "com.seal.springboot",
})
@SpringBootApplication
public class MicroServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceServerApplication.class, args);
    }
}
