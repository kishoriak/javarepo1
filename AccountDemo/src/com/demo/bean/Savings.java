package com.demo.bean;

import java.util.Date;

public class Savings extends Account{
	private static float interestrate;
	private static double minbalance;
	private String cqbnumber;
	
	static {
		interestrate=4;
		minbalance=25000;
	}

	public Savings() {
		super();
		cqbnumber=null;
	}


	public Savings(int id, String name, double balance, double interestrate, double minbalance, String cqbnumber ) {
		super(id, name, balance);
		this.cqbnumber = cqbnumber;
	}


	public boolean withdraw(double amount){
		if(balance-amount>minbalance) {
			balance=balance-amount;
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return super.toString() + "Interest Rate: "+ interestrate +"/nMinimum Balance: "+ minbalance  +"\nChequebook Number: " + cqbnumber;
	}
	
	
}
