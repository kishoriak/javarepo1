package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	List<Product> displayAll();

	Product searchById(int ids);

	boolean deleteProduct(int idd);

	void addProduct(int ida);

	


}