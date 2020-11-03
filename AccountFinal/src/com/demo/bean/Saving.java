package com.demo.bean;

public class Saving extends Account{
	private String cb_no;
	private static double int_rate;
	private static double min_bal;
	static {
		int_rate=0.04;
		min_bal=25000;
	}
	
	public Saving() {
		super();
	}
	
	public Saving(int id, String name, double balance,String cb_no) {
		super(id, name, balance);
		this.cb_no = cb_no;
	}

	public String getCb_no() {
		return cb_no;
	}

	public void setCb_no(String cb_no) {
		this.cb_no = cb_no;
	}

	public static double getInt_rate() {
		return int_rate;
	}

	public static void setInt_rate(double int_rate) {
		Saving.int_rate = int_rate;
	}

	public static double getMin_bal() {
		return min_bal;
	}

	public static void setMin_bal(double min_bal) {
		Saving.min_bal = min_bal;
	}

	@Override
	public String toString() {
		return super.toString()+"Saving [cb_no=" + cb_no + "]";
	}

//	@Override
	public boolean withdraw(Account a,double amount) {
		double minbal=Saving.getMin_bal();
		if((a.getBalance()-amount)>minbal) {
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
