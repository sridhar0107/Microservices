package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddtestApplication.class, args);
	}

}
