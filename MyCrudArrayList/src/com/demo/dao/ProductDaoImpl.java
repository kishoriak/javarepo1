package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.bean.Product;
import com.demo.comparator.MyQtyComparator;
import com.demo.exception.ProductNotFoundException;

public class ProductDaoImpl implements ProductDao{
	private static List<Product> plist;
	static {
		plist=new ArrayList<>();
		plist.add(new Product(12,"chair",30,"hsjkhsd"));
		plist.add(new Product(13,"table",50,"jzjh"));
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
		int pos=plist.indexOf(new Product(id));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
	}
	
	

	//@Override
	public boolean updateName(int id, String nm) {
		Product p=searchById(id);
		if(p!=null) {
			p.setName(nm);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateNameAndQty(int id, String nm, int qty) {
		Product p=searchById(id);
		if(p!=null) {
			p.setName(nm);
			p.setQty(qty);
			return true;
		}
		return false;
	}

	@Override
	public Product searchByName(String nm) throws ProductNotFoundException{
		/*for(Product p:plist) {
			if(p.getName().equals(nm)) {
				return p;
			}
			
		}*/
		int pos=plist.indexOf(new Product(nm));
		if(pos!=-1) {
			return plist.get(pos);
		}
		throw new ProductNotFoundException("product not found");
		
	}

	@Override
	public List<Product> sortData() {
		Collections.sort(plist,new MyQtyComparator());
		return plist.subList(0,3);
		
		//display first 3 products with highest qty
	}

	@Override
	public int deleteProduct(Product p1) {
		int size=plist.size();
		plist.remove(p1);
		if(plist.size()<size) {
			return 1;
		}
		else 
			return 0;
	}


}
