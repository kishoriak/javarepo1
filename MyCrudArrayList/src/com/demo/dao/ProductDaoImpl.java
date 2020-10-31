package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao{
static List<Product> plist;
static {
	plist=new ArrayList<>();
	plist.add(new Product(12,"chair",2000));
}
@Override
public void addProduct(Product p)
{
	plist.add(p);
}
public List<Product> getAllProducts(){
	return plist;
}
@Override
public Product searchById(int id) {
	int pos=plist.indexOf(new Product(id,null,0));
	if(pos!=-1)
	{
		return plist.get(pos);
	}
	return null;
}
public void removeProduct(int ids)
{
 plist.remove(searchById(ids));
}
public void changeProduct(int idm,int qtym)
{
	searchById(idm).setQty(qtym);
}
}
