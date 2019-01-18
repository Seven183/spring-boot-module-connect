package com.sgq.testcontroller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sgq")
@MapperScan("com.sgq.testdao")
public class TestControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestControllerApplication.class, args);
    }

}

