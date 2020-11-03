package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.bean.Product;

public class TestProductCollection {
	public static void main(String[] args) {
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(12,"chair","asas",3000.00,34));
		plist.add(new Product(13,"table","asas",30000.00,34));
		plist.add(new Product(14,"laptop","asas",30456.00,34));
		///searching
		
		for(int i=0;i<plist.size();i++)
		{
			if(plist.get(i).getName().equals("table"))
				plist.remove(i);
		}
		
		Iterator<Product> it1=plist.iterator();
		while(it1.hasNext()) {
			Product p=it1.next();
			if(p.getName().equals("table")){
				it1.remove();
			}
		}
		
		
		
		int pos =plist.indexOf(new Product(15,null,null,0.0,0));
		if(pos==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println(plist.get(pos));
		}
      // Product p=new Product();
		//display all
		for(int i=0;i<plist.size();i++) {
			System.out.println(plist.get(i));
		}
		//java 5
		Iterator<Product> it=plist.iterator();
		while(it.hasNext()) {
			Product p=it.next();
			System.out.println(p);
		}
		//java 7
		for(Product p:plist) {
			System.out.println(p);
		}
		
		///java 8
		plist.forEach(System.out::println);
		plist.forEach((p)->{System.out.println(p);});
		
		///delete
		plist.remove(new Product(13,null,null,0.0,0));
		
		plist.forEach((p)->{System.out.println(p);});
       
	}
}
