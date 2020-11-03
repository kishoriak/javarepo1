package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.bean.ProductData;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao = new ProductDaoImpl();

	//@Override
	public ProductData findAllProduct() {
		System.out.println("in service");
		return productDao.findAll();
	}


	//@Override
	public Product getById(int pid) {
		return productDao.getById(pid);
	}

}
