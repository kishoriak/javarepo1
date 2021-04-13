package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public ProductServiceImpl() {
		productDao=new ProductDaoImpl();
		
	}

	@Override
	public void addProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter quantity");
		int qty=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter description");
		String desc=sc.nextLine();
		Product p=new Product(id,nm,qty,desc);
		productDao.addProduct(p);
		sc.close();
	}

	@Override
	public List<Product> displayAll() {
		return productDao.getAllProducts();
		
	}

	@Override
	public Product searchProduct(int id) {
		return productDao.searchById(id);
	}

	@Override
	public int deleteProduct(Product p1) {
		int flag=productDao.deleteProduct(p1);
		return flag;
	}


}
