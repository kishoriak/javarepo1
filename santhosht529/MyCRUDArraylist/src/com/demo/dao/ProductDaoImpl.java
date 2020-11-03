package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
static List<Product> plist;
static {
	plist = new ArrayList<Product>();
	plist.add(new Product(12,"chair",850));
	plist.add(new Product(13,"table",2000));
}
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		plist.add(p);
		
	}
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return plist;
	}
	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		Product pdel = new Product(id,null,0);
		for(Product p: plist) {
			if(p.getId()==pdel.getId()) {
				plist.remove(p);
				return true;
			}
		}
		System.out.println("product not found");
		return false;
	}
	@Override
	public Product searchProductById(int id) {
		int pos = plist.indexOf(new Product(id,null,0));
		if(pos!=-1) {
			return plist.get(pos);
			}
		else {
			return null;
			
		}
		
	}

}