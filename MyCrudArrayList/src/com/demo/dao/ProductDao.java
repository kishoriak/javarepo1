package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	void addProduct(Product p);
	List<Product> getAllProducts();
	Product searchById(int id);
	public boolean deleteById(int id);
	public boolean modifyName(int id, String name);


}
