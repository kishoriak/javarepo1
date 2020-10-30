package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao = new ProductDaoImpl();
	Scanner sc = new Scanner(System.in);
	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter quantity");
		int qty = sc.nextInt();
		Product p = new Product(id,name,qty);
		productDao.addProduct(p);
	}

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public boolean deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("enter id of the product to be deleted:");
		int id = sc.nextInt();
		return productDao.deleteProduct(id);
	}

	@Override
	public Product searchById() {
		// TODO Auto-generated method stub
		System.out.println("enter id");
		int id = sc.nextInt();
		return productDao.searchProductById(id);
		
	}
	
	
}
