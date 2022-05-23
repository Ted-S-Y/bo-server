package com.bo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoServerApplication.class, args);
	}

}
