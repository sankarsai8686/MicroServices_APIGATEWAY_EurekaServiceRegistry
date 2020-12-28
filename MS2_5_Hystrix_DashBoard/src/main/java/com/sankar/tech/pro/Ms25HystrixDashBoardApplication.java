package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class Ms25HystrixDashBoardApplication {

	public static void main(String[] args) {
		System.out.println("===Ms25HystrixDashBoardApplication===");
		SpringApplication.run(Ms25HystrixDashBoardApplication.class, args);
	}

}
