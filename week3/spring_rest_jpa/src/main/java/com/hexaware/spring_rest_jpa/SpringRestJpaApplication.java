package com.hexaware.spring_rest_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpaApplication.class, args);
	}
	
	@Bean             //bcoz controller class does not have an annoation, so it cant be autowired thats why we created bean just like in spring core
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
