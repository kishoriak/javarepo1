package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.bean.ProductData;
import com.demo.service.ProductService;

//@Controller
@RestController
public class ProductFrontController {
	@Autowired
	ProductService productService;
	
	
	//localhost:8282/products/product
	@GetMapping("/products/product")
	public ProductData  getAllProducts() {
		return productService.findAllProduct();
		
	}
	
	
	/*public Product getById() {
		
	}*/
	
	
}
