package com.demo.service;

public class ServiceGenerator {
	 public static ProductService createService() {
		 return  new ProductServiceImpl();
	 }
}
