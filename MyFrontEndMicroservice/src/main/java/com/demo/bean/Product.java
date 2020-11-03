package com.demo.bean;

public class Product {
	private int pid;
	private String pname;
	private String pdesc;
	private double price;
	private int qty;
	
	public Product() {
		super();
	}

	public Product(int pid, String pname, String pdesc, double price, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.price = price;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
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

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	

}
