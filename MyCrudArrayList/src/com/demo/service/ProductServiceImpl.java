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
		// TODO Auto-generated constructor stub
	}
	public void addProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		Product p=new Product(id,nm,qty);
		productDao.addProduct(p);
		}
	public List<Product> displayAll() {
		return productDao.getAllProducts();
		
	}
	public void deleteProduct(int ids) {
		productDao.removeProduct(ids);
	}
	@Override
	public Product searchProduct(int id) {
		return productDao.searchById(id);
	}
	public void modifyProduct(int idm) {
		Scanner scm=new Scanner(System.in);
		System.out.println("enter new qty");
		int qtym=scm.nextInt();
	 productDao.changeProduct(idm,qtym);
	}

}
