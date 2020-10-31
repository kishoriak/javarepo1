package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
	static List<Product> plist;
	static {
		plist=new ArrayList<>();
	}

	@Override
	public void addProduct(Product p) {
		plist.add(p);
		
	}

	@Override
	public List<Product> getAllProducts() {
		return plist;
	}

	@Override
	public Product searchById(int id) {
		int pos=plist.indexOf(new Product(id,null,0));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
	}

	@Override
	public int deleteProduct(int id) {
		int pos = plist.indexOf(new Product(id,null,0));
		if(pos != -1) {
			plist.remove(pos);
			return 1;
		}
		return 0;
	}

	@Override
	public void displayById(int id) {
		int pos = plist.indexOf(new Product(id,null,0));
		if(pos != -1)
			System.out.println(plist.get(pos));
		else
			System.out.println("Product doesn't exist");
	}

	@Override
	public void modify(int id, int qty) {
		int pos = plist.indexOf(new Product(id,null, 0));
		if(pos != -1) {
			plist.get(pos).setQty(qty);
			System.out.println("Quantity modified");
		}
		else
			System.out.println("Product not found");
	}
	

}
