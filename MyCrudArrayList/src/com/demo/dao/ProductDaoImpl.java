package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
	static List<Product> plist;
	static {
		plist=new ArrayList<>();
		plist.add(new Product(12,"chair",2000));
		plist.add(new Product(13,"table",3000));
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

}
