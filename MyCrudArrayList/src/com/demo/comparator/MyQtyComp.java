package com.demo.comparator;

import java.util.Comparator;

import com.demo.bean.Product;

public class MyQtyComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getQty()>p2.getQty())
			return 1;
		else if(p1.getQty() == p2.getQty())
			return 0;
		else
			return 0;
	}

}
