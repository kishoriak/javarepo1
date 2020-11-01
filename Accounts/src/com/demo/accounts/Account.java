package com.demo.accounts;

public class Account {
	protected int id;
	private String name;
	private double balance;	
	
	/* default constructor */
	public Account() {
		super();
	}
	
	public Account(int id, String name, double bal){
		this.id = id;
		this.name = name;
		this.balance = bal;
	}
	public boolean equals(Object obj) {
		if(id == ((Account)obj).id){
			return true;
		}
		return false;
	}	
	

	/* setter and getter methods */
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double bal) {
		this.balance = bal;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
		
}
