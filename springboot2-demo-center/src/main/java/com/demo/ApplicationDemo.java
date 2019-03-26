package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
@EnableSwagger2Doc
@SpringBootApplication
public class ApplicationDemo extends SpringBootServletInitializer {
	private static final Logger LOGGER = LogManager.getLogger(ApplicationDemo.class);
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemo.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}
