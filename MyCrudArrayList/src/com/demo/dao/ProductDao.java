package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;

public interface ProductDao {

	void addProduct(Product p);

	List<Product> getAllProducts();

	Product searchById(int id);

	boolean updateName(int id, String nm);

	boolean updateNameAndQty(int id, String nm, int qty);

	Product searchByName(String nm) throws ProductNotFoundException;

	List<Product> sortData();

	void deleteProduct(int id);

	Product displayById(int id);

}
