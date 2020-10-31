package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct();

	List<Product> displayAll();

	Product searchProduct(int id);
	
	int deleteProd(int id);
	void displayById(int id);
	void modify(int id, int qty);

}
