package com.nm.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nm.springbootstarter"})
@EnableJpaRepositories(basePackages = "com.nm.springboot")
@EntityScan(basePackages = "com.nm.springboot.entity")
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
