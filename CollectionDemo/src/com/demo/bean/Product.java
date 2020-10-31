package com.demo.bean;

public class Product {
	private int pid;
	private String name,descr;
	private double price;
	private int qty;
	public Product() {
		super();
	}
	
	public Product(int pid, String name, String descr, double price, int qty) {
		super();
		this.pid = pid;
		this.name = name;
		this.descr = descr;
		this.price = price;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override          //this
	public boolean equals(Object obj) {
		System.out.println("In Equals"+this.pid+"------"+((Product)obj).pid);
		if(pid==((Product)obj).pid) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", descr=" + descr + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	

}
