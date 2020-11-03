package com.demo.bean;

public class Account {
	private int id;
	private String name;
	private double balance;
	//default
	public Account() {
		super();
	}
	//parameterized
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public boolean withdraw(Account a,double amount) {
		a.balance=a.balance-amount;
		return true;
	}
	  
	public void deposit(double amount) {
		 this.balance =  this.balance + amount;
		}
	
	//setter and getters
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
