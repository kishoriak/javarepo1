package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
@SpringBootApplication
public class TestApp {

	public static void main(String[] args) {

		SpringApplication.run(TestApp.class,args);

		
	}
	@Bean
	public RestTemplate getRestTemplate(){
		System.out.println("Rest template created");
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
