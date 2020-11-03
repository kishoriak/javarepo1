package com.demo.comparator;

import java.util.Comparator;

import com.demo.bean.Product;

public class MyQtyComparator implements Comparator<Product> {

	@Override     
	public int compare(Product p1, Product p2) {
		//System.out.println("comparator"+p1.getQty()+"---"+p2.getQty());
		if(p1.getQty()<p2.getQty()) {
			return -1;
		}
		else {
			if(p1.getQty()==p2.getQty()) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}

}
