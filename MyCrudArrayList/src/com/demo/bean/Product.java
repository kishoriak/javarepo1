package com.demo.bean;

public class Product {
	private int id;
	private String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object ob) {
		if(id==((Product)ob).id)
			return true;
		else
			return false;
	}
	private int qty;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + "]";
	}
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
	public Product(int id, String name, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
	}
	

}
