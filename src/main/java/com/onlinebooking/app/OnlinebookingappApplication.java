package com.onlinebooking.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.onlinebooking.app.controller" })
@EntityScan("com.onlinebooking.app.model")
@EnableJpaRepositories("com.onlinebooking.app.repository")
public class OnlinebookingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinebookingappApplication.class, args);
	}

}
