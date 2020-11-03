package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;
import com.demo.bean.ProductData;

public interface ProductDao {

	ProductData findAll();

	

	Product getById(int pid);

}
