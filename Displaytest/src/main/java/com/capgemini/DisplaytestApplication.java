package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DisplaytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplaytestApplication.class, args);
	}

}
