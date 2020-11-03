package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;

public interface ProductDao {

	void addProduct(Product p);

	List<Product> getAllProducts();

	Product searchById(int id);

	int deleteProduct(Product p1);

	Product searchByName(String nm) throws ProductNotFoundException;

	List<Product> sortData();

	boolean updateNameAndQty(int id, String nm, int qty);
	

}
