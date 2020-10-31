package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {
	void addProduct(Product p);

	List<Product> getAllProducts();

	Product searchById(int id);

	void removeProduct(int ids);

	void changeProduct(int idm,int qtym);


}
