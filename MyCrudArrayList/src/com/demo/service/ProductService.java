package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {
	void addProduct();
	void deleteProduct(int ids);

	List<Product> displayAll();

	Product searchProduct(int id);
	void modifyProduct(int idm);
}
