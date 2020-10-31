package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.demo.bean.Product;

public class TestHashMap {
public static void main(String[] args) {
	Map<Integer,Product> hm=new HashMap<>();
	
	hm.put(13,new Product(13,"table","asas",30000.00,34));
	hm.put(14,new Product(14,"laptop","asas",30456.00,34));
	hm.put(12,new Product(12,"chair","asas",3000.00,34));
	
	System.out.println(hm.get(12));
	hm.remove(13);
	Set<Integer> sk=hm.keySet();
	for(Integer k:sk) {
		System.out.println(k+"-----"+hm.get(k));
	}
	
	
}
}
