package com.demo.bean;

import java.util.Date;

abstract public class Account{
	
	private int id;
	private String name;
	public double balance;
	

	//Default Constructor  {Initialisation}
	public Account() {
		id=0;
		name=null;
		balance=0.0;
	}

	//Parameterized Constructor
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//Setter getter methods	
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

	abstract public boolean withdraw(double amount);
	
}
