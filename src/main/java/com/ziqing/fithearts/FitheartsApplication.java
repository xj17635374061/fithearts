package com.ziqing.fithearts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class FitheartsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FitheartsApplication.class, args);
    }
}
