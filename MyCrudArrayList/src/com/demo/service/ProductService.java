package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct();

	List<Product> displayAll();

	Product searchProduct(int id);

	void deleteProduct(Product p);

	void modifyProductQty(Product q, int qt);

}
