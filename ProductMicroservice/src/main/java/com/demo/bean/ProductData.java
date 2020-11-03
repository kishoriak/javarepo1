package com.demo.bean;

import java.util.List;

public class ProductData {
	List<Product> plist;

	public ProductData() {
		super();
	}

	public ProductData(List<Product> plist) {
		super();
		this.plist = plist;
	}

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	

}
