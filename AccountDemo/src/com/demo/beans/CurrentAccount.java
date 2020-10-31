package com.demo.beans;

public class CurrentAccount extends Account{
	
	// declartion of static variables interest rates and minimum balance
	private static float interest_r;
	private static float min_balance;
	
	//initialization of static variables
	static {
		min_balance=0;
		
		//interest rate is 1%
		interest_r=0.01f;
	}
	

	//update balance if allowed and return true, else return false.
	@Override
	public boolean withdraw(float amount) {
		// TODO Auto-generated method stub
		float balance=super.getBal();
		if(balance-amount>=min_balance) {
			super.setBal(balance-amount);
			return true;
		}
		return false;
	}

	//default constructor
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Thank You for creating your account with HSBC #TogetherWeThrive");
	}

	//parameterized constructor
	public CurrentAccount(float bal, int id, String name) {
		
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
