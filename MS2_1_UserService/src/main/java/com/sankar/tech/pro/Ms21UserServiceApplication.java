package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Ms21UserServiceApplication {

	public static void main(String[] args) {
		System.out.println("===Ms21UserServiceApplication Started===");
		SpringApplication.run(Ms21UserServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate createInstance()
	{
		return new RestTemplate();
	}
	

}
