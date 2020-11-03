package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	void addProduct(Product p);

	List<Product> getAllProducts();

	boolean deleteProduct(int id);

	Product searchProductById(int id);

}
