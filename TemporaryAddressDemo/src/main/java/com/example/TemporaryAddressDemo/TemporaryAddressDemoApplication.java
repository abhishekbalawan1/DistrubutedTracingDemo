package com.example.TemporaryAddressDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TemporaryAddressDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemporaryAddressDemoApplication.class, args);
	}

}
