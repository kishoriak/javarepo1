package com.demo.bean;


public class SavingAcc extends Account {
	private String cqbookno;
	//to access in this class
	private static double int_rate;
	private static double min_balance;
	//Static Block 
		static {
			int_rate = 0.04;
			min_balance = 25000.0;
		}
	
		
	//Default Constructor
	public SavingAcc() {
		super();
		cqbookno = null;
	}
	
	
	//Parameterized Constructor
	public SavingAcc(int id ,String name, double balance, double int_rate,double min_balance, String cqbookno ) {
		super(id, name, balance);
		System.out.println("Saving Parameter");
		this.cqbookno= cqbookno; 
	}
	
	
	//Checking if the amount can be withdrawn and then withdrawing
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
		return super.toString() +  "Interest Rate = "+int_rate+ "\nMinimum Balance =" +min_balance+"\nChequebook No."+ cqbookno;
	}
}
