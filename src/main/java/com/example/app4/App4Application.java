package com.example.app4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class App4Application {
    @Bean
    public  RestTemplate  restTemplate() {
    return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(App4Application.class, args);
    }

}
