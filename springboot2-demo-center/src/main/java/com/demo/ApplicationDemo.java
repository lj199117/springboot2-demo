package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
@EnableSwagger2Doc
@SpringBootApplication
public class ApplicationDemo {
	private static final Logger LOGGER = LogManager.getLogger(ApplicationDemo.class);
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemo.class, args);
    }
}
