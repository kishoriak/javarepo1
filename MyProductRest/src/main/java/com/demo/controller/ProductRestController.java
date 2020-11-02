package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Product;
import com.demo.service.ProductService;

@RestController   //---- RestController + view=Controller
public class ProductRestController {
	@Autowired
	ProductService productService;
	
	//http://localhost:8080/products
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		return productService.findAllProduct();
		
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") int pid){
		return productService.getById(pid);
		
	}
		
	@PostMapping("/products")
	public Product insertData(@RequestBody Product p) {
		return productService.addProduct(p);
		
	}
	
	@PutMapping("/products")
	public Product updateData(@RequestBody Product p) {
		return productService.updateProduct(p);
		
	}
	
	@DeleteMapping("/products/{id}")
	public Product deleteData(@PathVariable int id) {
		return productService.deleteProduct(id);
		
	}
	

}
