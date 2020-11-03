package com.demo.service;

import java.util.List;

import com.demo.bean.Product;
import com.demo.bean.ProductData;

public interface ProductService {

	ProductData findAllProduct();

	Product getById(int pid);

}
