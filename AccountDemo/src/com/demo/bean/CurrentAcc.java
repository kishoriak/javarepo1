package com.demo.bean;

public class CurrentAcc extends Account {
	private int tranx;
	
	private	static double int_rate;
	private	static double min_balance;
	
	static {
		int_rate = 0.01;
		min_balance = 0.0;
	}
	
	//Default Constructor
	public CurrentAcc() {
		super();
		tranx = 0;
	}
	
	//Parameterized constructor
	public CurrentAcc(int id ,String name, double balance, double int_rate,double min_balance, int tranx ) {
		super(id, name, balance);
		System.out.println("Current Account Added");
		this.tranx = tranx; 
		//this.intrate = intrate;
		//this.minbalance = minbalance;
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
		return super.toString() + "Interest Rate = "+int_rate+ "\nMinimum Balance =" +min_balance+ "No. of Transactions = "+ tranx;
	}
}
