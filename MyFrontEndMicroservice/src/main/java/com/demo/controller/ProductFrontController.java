package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.ProductData;
import com.demo.service.ProductService;

@RestController
public class ProductFrontController {
	@Autowired
	ProductService productService;
	//@Override
	@GetMapping("/products/products")
	public ProductData getAllProducts(){
		ProductData p =  productService.findAllProduct();
		System.out.println("in controller");
		System.out.println(p);
		return p;
	}
	
	
//	public Person getAllPerson() {
//		
//	}
}
