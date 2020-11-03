package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	
	public ProductServiceImpl() {
		productDao= new ProductDaoImpl();
	}
	Scanner sc = new Scanner(System.in);
	@Override
	
	public void addProduct(int ida) {
		// TODO Auto-generated method stub
		
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter quantity");
		int qty = sc.nextInt();
		Product p = new Product(ida,name,qty);
		productDao.addProduct(p);
	}

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override

	public boolean deleteProduct(int idd) {
		// TODO Auto-generated method stub
		
		return productDao.deleteProduct(idd);
	}

	@Override
	public Product searchById(int ids) {
		
		
		return productDao.searchProductById(ids);
		
	}
	
	
}
