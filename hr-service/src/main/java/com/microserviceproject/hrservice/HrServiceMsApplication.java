package com.microserviceproject.hrservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrServiceMsApplication.class, args);
	}

}
