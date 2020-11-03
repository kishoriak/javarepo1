package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	List<Product> findAll();

	Product insertProduct(Product p);

	Product updateProduct(Product p);

	Product deletProduct(int id);

	Product getById(int pid);

}
