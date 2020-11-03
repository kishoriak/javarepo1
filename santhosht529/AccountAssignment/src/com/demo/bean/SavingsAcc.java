package com.demo.bean;


public class SavingsAcc extends Account {
	private String chequeBookNumber;
	//to access in this class
	private static double int_rate;
	private static double min_balance;
	//Static Block 
		static {
			int_rate = 0.04;
			min_balance = 25000.0;
		}
	
		
	//Default Constructor
	public SavingsAcc() {
		super();
		chequeBookNumber = null;
	}
	
	
	//Parameterized Constructor
	public SavingsAcc(int id ,String name, double balance, 
			double int_rate,double min_balance, 
			String chequeBookNumber ) {
		super(id, name, balance);
		System.out.println("Saving Parameter");
		this.chequeBookNumber= chequeBookNumber; 
	}
	
	
	//Can withdraw?
	public boolean withdraw(double amount) {
		if(this.balance>min_balance+amount) {
		balance = balance - amount;
		return true;
		}
		else {
			return false;
		}
	}
	
	//to-string method
	public String toString() {
		return super.toString() +  "Interest Rate = "+int_rate+ "\nMinimum Balance =" +min_balance+"\nChequebook No."+ chequeBookNumber;
	}
}
