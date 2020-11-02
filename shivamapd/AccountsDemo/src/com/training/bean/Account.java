package com.training.bean;

abstract public class Account {
	private int id;
	private String name;
	private double balance;
	
	public Account() {
		id=0;
		name=null;
		balance = 0.00f;
	}
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	
	public void deposit(double amount) {
		setBalance(this.balance+amount);
		System.out.println(amount+"successfully deposited");
	}
	
	abstract public void withdraw(double amt);
	
	public String toString() {
		return "\nID: "+id+"\nName: "+name+"\nBalance: "+balance;
	}
}
