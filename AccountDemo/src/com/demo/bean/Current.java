package com.demo.bean;

public class Current extends Account{
	private static float interestrate;
	private static double minbalance;
	private int totaltransaction;
	
	static {
		interestrate=1;
		minbalance=0;
	}
	
	
	public Current() {
		super();
		totaltransaction=0;
	}
	
	public Current(int id ,String name, double balance, double interestrate,double minbalance, int totaltransaction) {
		super(id,name,balance);
		this.totaltransaction = totaltransaction;
	}


	public boolean withdraw(double amount){
		if(amount<balance) {
			balance=balance-amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + "Interest Rate: "+ interestrate +"/nMinimum Balance: "+ minbalance  +"\nNo of transaction=" + totaltransaction;
	}
	
	

}
