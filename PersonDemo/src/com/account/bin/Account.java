package com.account.bin;

abstract public class Account {
	private int id;
	private String name;
	protected double balance;
	//private int roi;
	//private double minbal;
	public Account() {
		id=0;
		name=null;
		balance=0.0;
	}
	public Account(int id, String name, double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	/*public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}*/
	abstract public void withdraw(double w);
	abstract public void deposit(double d);
	/*public void withdraw(double w)
	{
		setBalance(getBalance()-w);
	}
	public void deposit(double d)
	{
		setBalance(getBalance()+d);
	}
	*/
	public String toString() {
		return "ID "+id+"\nName "+name+"\nBalance "+balance;
	}
	
}
