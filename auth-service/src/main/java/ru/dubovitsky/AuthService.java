package ru.dubovitsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AuthService {

    public static void main(String[] args) {
        SpringApplication.run(AuthService.class, args);
    }

}
