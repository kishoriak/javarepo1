package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct();

	List<Product> displayAll();

	boolean deleteProduct();

	Product searchById();

	


}
