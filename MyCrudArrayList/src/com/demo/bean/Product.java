package com.demo.bean;

public class Product implements Cloneable{
	private int id;
	private String name;
	private int qty;
	private String desc;
	public Product() {
		super();
	}
	
	@Override
	public boolean equals(Object ob) { 
		if((this.id==((Product)ob).id)||(this.name.equals(((Product)ob).name))  ){
			return true;
		}
		
		return false;
	}
	
	public Product clone() {
		Product p1=new Product(); 
		p1.id=this.id;
		p1.name=this.name;
		p1.qty=this.qty;
		return p1;
	}
	
	public Product(int id, String name, int qty, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.desc = desc;
	}

	public Product(String nm) {
		super();
		id=0;
		name=nm;
		qty=0;
		
	}
	public Product(int id) {
		this.id=id;
		name="";
		qty=0;
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
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", desc=" + desc + "]";
	}

	

}
