package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms23EurekaServiceRegistryApplication {

	public static void main(String[] args) {
		System.out.println("===Ms23EurekaServiceRegistryApplication===");
		SpringApplication.run(Ms23EurekaServiceRegistryApplication.class, args);
	}

}
