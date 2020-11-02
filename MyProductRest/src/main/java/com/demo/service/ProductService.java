package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	List<Product> findAllProduct();

	

	Product addProduct(Product p);



	Product updateProduct(Product p);



	Product deleteProduct(int id);



	Product getById(int pid);

}
