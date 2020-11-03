package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Product;
import com.demo.bean.ProductData;
import com.demo.service.ProductService;

@RestController
public class ProductRestMicroController {
	@Autowired
	ProductService productService;
	
	//http://localhost:8080/products
	
	@GetMapping("/products")
	public ProductData getAllProduct(){
		ProductData p = productService.findAllProduct();
		System.out.println(p);
		return p;
		
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") int pid){
		return productService.getById(pid);
		
	}
}
