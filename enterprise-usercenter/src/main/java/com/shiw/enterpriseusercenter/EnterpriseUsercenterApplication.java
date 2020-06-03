package com.shiw.enterpriseusercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@ComponentScan(basePackages = {"com.shiw.enterpriseusercenter"})
public class EnterpriseUsercenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseUsercenterApplication.class, args);
	}

}
