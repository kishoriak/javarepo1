package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct();
	List<Product> displayAll();
	Product searchProduct(int id);
	public boolean deleteProduct(int id);
	public boolean modifyQuantity(int id, String name);

}
