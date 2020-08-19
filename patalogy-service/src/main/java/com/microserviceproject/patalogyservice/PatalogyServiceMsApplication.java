package com.microserviceproject.patalogyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PatalogyServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatalogyServiceMsApplication.class, args);
	}

}
