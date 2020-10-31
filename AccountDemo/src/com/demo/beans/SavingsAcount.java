package com.demo.beans;

public class SavingsAcount extends Account{
	
	//declartion of static variables interest rates and minimum balance
	private static float interest_r;
	private static float min_balance;
	
	//initialization of static variables
	static {
		min_balance=5000;
		
		//interest rate is 2.5%
		interest_r=0.025f;
	}
	
	//update balance if allowed and return true, else return false.
	@Override
	public boolean withdraw(float amount) {
		// TODO Auto-generated method stub
		float balance=super.getBal();
		if(balance-amount>=min_balance) {
			super.setBal(balance);
			return true;
		}
		return false;
	}
	
	
	
	public SavingsAcount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Thank You for creating your account with HSBC #TogetherWeThrive");
	}



	public SavingsAcount(float bal, int id, String name) {
		super(bal, id, name);
		// TODO Auto-generated constructor stub
		System.out.println("Thank You for creating your account with HSBC #TogetherWeThrive");
	}



	public float getInterestRate() {
		return interest_r;
	}
	
	public float getMinimumBalance() {
		return interest_r;
	}
	
}
