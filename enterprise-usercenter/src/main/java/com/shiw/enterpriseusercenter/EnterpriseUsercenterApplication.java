package com.shiw.enterpriseusercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnterpriseUsercenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseUsercenterApplication.class, args);
	}

}
