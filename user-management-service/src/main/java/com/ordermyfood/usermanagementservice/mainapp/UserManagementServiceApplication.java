package com.ordermyfood.usermanagementservice.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.ordermyfood.*"})
@EnableJpaRepositories(basePackages = {"com.ordermyfood.*"})
@EntityScan("com.ordermyfood.*")
@EnableDiscoveryClient
@EnableSwagger2
@EnableCircuitBreaker
public class UserManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication.class, args);
	}
	
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
