package com.demo.bean;

public class Current extends Account{
	private int num_trans=0;
	private static double int_rate;
	private static double min_bal;
	static {
		int_rate=0.06;
		min_bal=0.0;
	}
	
	public Current() {
		super();
	}
	
	public Current(int id, String name, double balance) {
		super(id, name, balance);
	}

	public int getNum_trans() {
		return num_trans;
	}

	public void setNum_trans(int num_trans) {
		this.num_trans = num_trans+1;
	}

	public static double getInt_rate() {
		return int_rate;
	}

	public static void setInt_rate(double int_rate) {
		Current.int_rate = int_rate;
	}

	public static double getMin_bal() {
		return min_bal;
	}

	public static void setMin_bal(double min_bal) {
		Current.min_bal = min_bal;
	}

	@Override
	public String toString() {
		return super.toString()+"Current [num_trans=" + num_trans + "]";
	}

//	@Override
	public boolean withdraw(Account a,double amount) {
		if(a.getBalance()>amount) {
			double intd=(a.getBalance())-amount;
			a.setBalance(intd);
			return true;
		}
		else {
//			System.out.println("Not sufficient Balance");
			return false;
		}
	}

	
	


}
