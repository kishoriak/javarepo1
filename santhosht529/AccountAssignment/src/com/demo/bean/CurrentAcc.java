package com.demo.bean;

public class CurrentAcc extends Account {
	private int transactions;
	//to access in this class
	private	static double int_rate;
	private	static double min_balance;
	//Static Block 
	static {
		int_rate = 0.01;
		min_balance = 0.0;
	}
	
	//Default constructor
	public CurrentAcc() {
		super();
		transactions = 0;
	}
	
	//Parameterized constructor
	public CurrentAcc(int id ,String name, double balance, double int_rate,double min_balance, int transactions ) {
		super(id, name, balance);
		System.out.println("Current Parameter");
		this.transactions = transactions; 
		//this.intrate = int_rate;
		//this.minbalance = min_balance;
	}
	//Withdraw function
	public boolean withdraw(double amount) {
		if(this.balance>amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + "Interest Rate = "+int_rate+ "\nMinimum Balance =" +min_balance+ "No. of transactionstions = "+ transactions;
	}
}
