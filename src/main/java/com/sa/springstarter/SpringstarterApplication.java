package com.sa.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringstarterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringstarterApplication.class, args);
	}

// For Spring MVC 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringstarterApplication.class);
	}
}
