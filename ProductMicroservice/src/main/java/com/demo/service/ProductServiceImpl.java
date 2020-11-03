package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.bean.ProductData;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;

	@Override
	public ProductData findAllProduct() {
		return productDao.findAll();
	}

	@Override
	public Product addProduct(Product p) {
		return productDao.insertProduct(p);
		
	}

	@Override
	public Product updateProduct(Product p) {
		return productDao.updateProduct(p);
	}

	@Override
	public Product deleteProduct(int id) {
		return productDao.deletProduct(id);
	}

	@Override
	public Product getById(int pid) {
		return productDao.getById(pid);
	}

}
