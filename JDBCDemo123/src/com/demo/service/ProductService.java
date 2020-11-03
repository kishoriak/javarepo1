package com.demo.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;

public class ProductService {
	private ProductDao pDao;
     
	public ProductService() {
		super();
		this.pDao = new ProductDao();
	}

	public int addProduct() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product id");
		int id=sc.nextInt();
		System.out.println("enter product name");
		String nm=sc.next();
		System.out.println("enter product price");
		double pr=sc.nextDouble();
		Product p=new Product(id,nm,pr);
		return pDao.insertProduct(p);
		
		
	}

	public List<Product> displayAll() throws SQLException {
		return pDao.displayAllProduct();
		
	}

	public Product displayById(int id) throws SQLException {
		return pDao.getById(id);
		
	}

	public int updateProduct(int id, String nm, double pr) throws SQLException {
		return pDao.updateProduct(id,nm,pr);
		
	}

	public int deleteProduct(int id) throws SQLException {
		return pDao.deleteProductById(id);
	}

	public void closeConnection() {
		pDao.closeConnection();
		
	}

}
