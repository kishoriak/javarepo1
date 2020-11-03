package com.demo.bean;

public class Product {
	private int id;
	private String name;
	private int qty;
	
	//Default Constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized constructor
	public Product(int id, String name, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
	}
	//getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + qty;
//		return result;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (id == ((Product)obj).id) {
			return true;
		}return false;
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + "]";
	}
	
	//equals method
	
	
	
}
