package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public ProductServiceImpl() {
		productDao=new ProductDaoImpl();
		
	}
    
	//add product in arraylist
	@Override
	public void addProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter desc");
		String desc=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		Product p=new Product(id,nm,qty,desc);
		/*
		 * Product p1=new Product(); p1.setId(p.getId()); p1.setName(p.getName());
		 * p1.setQty(p.getQty());
		 */
		//Object.clone();
		Product p1=p.clone();
		productDao.addProduct(p);
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
	public boolean modifyName(int id, String nm) {
		return productDao.updateName(id,nm);
	}

	@Override
	public boolean modifyNameandQty(int id, String nm, int qty) {
		return productDao.updateNameAndQty(id,nm,qty);
	}

	@Override
	public Product searchByName(String nm) throws ProductNotFoundException {
		return productDao.searchByName(nm);
	}

	@Override
	public List<Product> sortData() {
		return productDao.sortData();
		
	}
	

}
