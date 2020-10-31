package com.demo.beans;

abstract public class Account {
	
	//private members balance, id, name
	private float bal;
	private int id;
	private String name;
	
	// default constructor
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Account(float bal, int id, String name) {
		super();
		this.bal = bal;
		this.id = id;
		this.name = name;
	}
	
	// getters and setters

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
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

	@Override
	public String toString() {
		return "Account [bal=" + bal + ", id=" + id + ", name=" + name + "]";
	}
	
	public void deposit(float amount) {
		this.bal+=amount; 
	}
	
	abstract public boolean withdraw(float amount);
	
	
}
