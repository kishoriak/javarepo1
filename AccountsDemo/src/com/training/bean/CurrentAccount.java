package com.training.bean;

public class CurrentAccount extends Account {
	static {
		intrestRate = .01f;
		minBalance = 0;
	}
	
	private int numberTransaction;
	private static float intrestRate;
	private static int minBalance;
	
	public CurrentAccount() {
		this.numberTransaction = 0;
	}
	
	public CurrentAccount(int id, String name, double balance, int numberTransaction) {
		super(id, name, balance);
		this.numberTransaction=numberTransaction;
	}
	
	public void deposit(double amt) {
		this.numberTransaction++;
		super.deposit(amt);
	}
	
	public void withdraw(double amt) {
		if(super.getBalance()>=amt) {
			super.setBalance(super.getBalance()-amt);
			this.numberTransaction++;
			System.out.println(amt+"is successfully withdrawn");
		}else {
			System.out.println("Desired amt is more than available balance");
		}
	}
	
	public String toString() {
		return super.toString()+"\nNumber of Transaction: "+numberTransaction+"\nIntrest Rate: "+intrestRate+"\nMinimum Balance: "+minBalance;
	}
	
}
