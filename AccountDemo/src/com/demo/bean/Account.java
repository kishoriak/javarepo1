package com.demo.bean;

abstract public class Account {
	private int id ;
	private String name;
	protected double balance;
	
	 ///Default Constructor
	public Account() {                
		id = 0;
		name = null;
		balance = 0.0;
		
	}
	//Parameterized
	public Account(int id, String name, double balance) { 
		this.id = id;
		this.name = null;
		this.balance = balance;
		
	}
	//setter method
	public void SetId(int id){
		this.id = id;
	}
	
	public void SetName(String name){
		this.name = name;
	}
	
	public void SetBalance(double balance){
		this.balance = balance;
	}
	
	
	//getter method
	public int getId(){
		return id;
	}
	
	public  String getName(){
		return name;
	}
	
	public double getBalance(){
		return  balance;
	}
	
	abstract public boolean withdraw(double amount);
	
	 public void deposit(double amount) {
		 this.balance =  this.balance + amount;
		}
	//to-string method
	public String toString() {
		return "Id = "+id+ "Name = "+name+"\n Balance = "+balance;
	}
	
}
