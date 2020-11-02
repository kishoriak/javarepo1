package com.training.bean;

public class SavingAccount extends Account{
	static {
		intrestRate = 0.04f;
		minBalance = 25000;
	}
	private String cheqNumber;
	private static float intrestRate;
	private static int minBalance;
	public SavingAccount() {
		this.cheqNumber = null;
	}
	
	public SavingAccount(int id, String name, double balance, String cheq) {
		super(id, name, balance);
		this.cheqNumber = cheq;
	}
	
	public void withdraw(double amt) {
		if(super.getBalance()>=amt+minBalance) {
			super.setBalance(super.getBalance()-amt);
			System.out.println(amt+"is successfully withdrawn");
		}else {
			System.out.println("Desired amt is more than available balance");
		}
	}
	
	public String toString() {
		return super.toString()+"\nCheque Book Number: "+cheqNumber+"\nIntrestRate: "+intrestRate+"\nMinimum balance: "+minBalance;
	}
}
