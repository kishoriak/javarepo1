package com.demo.service;

import java.util.List;

import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;

public interface ProductService {

	void addProduct();

	List<Product> displayAll();
    //search product by id
	Product searchProduct(int id);

	boolean modifyName(int id, String nm);

	boolean modifyNameandQty(int id, String nm, int qty);

	Product searchByName(String nm) throws ProductNotFoundException;

	List<Product> sortData();

	//void addProduct(int id, String nm, int qty, String desc);

}
