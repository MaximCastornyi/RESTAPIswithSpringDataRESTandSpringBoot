package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
public class SpringDatarestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatarestDemoApplication.class, args);
	}

}
