package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms22DepartmentServiceApplication {

	public static void main(String[] args) {
		System.out.println("======Ms22DepartmentServiceApplication======");
		SpringApplication.run(Ms22DepartmentServiceApplication.class, args);
	}

}
