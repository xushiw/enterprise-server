package com.shiw.structrue.enterprisestructrue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnterpriseStructrueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseStructrueApplication.class, args);
	}

}
