package com.demo.bean;

public class SavingAcc extends Account {
	private String chqbkno;
	
	private static double int_rate;
	private static double min_balance;
	
		static {
			int_rate = 0.04;
			min_balance = 25000.0;
		}
	
		
	//Default Costructor
	public SavingAcc() {
		super();
		chqbkno = null;
	}
	
	
	//Parameterized Constructor
	public SavingAcc(int id ,String name, double balance, double int_rate,double min_balance, String chqbkno ) {
		super(id, name, balance);
		System.out.println("Saving Account Added");
		this.chqbkno= chqbkno; 
	}
	
	
	//Checking if amount can be withdwran and then withdrwing
	public boolean withdraw(double amount) {
		if(this.balance>min_balance+amount) {
		balance = balance - amount;
		return true;
		}
		else {
			return false;
		}
	}
	

	public String toString() {
		return super.toString() +  "Interest Rate = "+int_rate+ "\nMinimum Balance =" +min_balance+"\nChequebook No."+ chqbkno;
	}
}
