package com.xidian.smartfactoryeas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xidian.smartfactoryeas.dao")
public class SmartFactoryEasApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartFactoryEasApplication.class, args);
    }

}
