package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Ms24ApiGatewayApplication {

	public static void main(String[] args) {
		System.out.println("===Ms24ApiGatewayApplication===");
		SpringApplication.run(Ms24ApiGatewayApplication.class, args);
	}

}
