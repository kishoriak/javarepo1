package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMainApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringMainApp.class, args); 
		//ApplicationContext context= SpringApplication.run(ClassName.class, args);    

		//String[] beanlist=context.getBeanDefinitionNames();
		/*for(String name:beanlist) {
			System.out.println(name);
		}*/
		


	}

}
