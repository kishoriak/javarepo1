package com.demo.service;
import  com.demo.bean.Account;
import  com.demo.bean.SavingAcc;
import  com.demo.bean.CurrentAcc;

public class AccountServiceImpl implements AccountService{
//public void deposit(double amount)
	static Account[] acc;
	static {
		acc= new Account[2]  ; 
	 // Array of account 
	}
	
///searching Account no.
	
	
	public void addData(int ch, int i) {
		if(ch==1) {
				acc[i] = new SavingAcc(12, "abc", 100000,0.04, 25000,"12354");
			}
		else {
				acc[i] = new CurrentAcc(11, "abcd", 12900, 0.0, 0, 12);
			}
		
	}
	
	
	//search account method
	public Account searchAccount(int id) {
		for(int i = 0; i<acc.length;i++) {
			if(acc[i].getId()==id) {
				return acc[i];
			}
			
		}
		return null;
	}
	
	//withdraw amount function
	public boolean withdrawAmount(double amount, int id) {
		Account ac = searchAccount(id);
		if (ac!=null) {
			return ac.withdraw(amount);
		}
		return false;
			
	}
	
	
	//deposit amount function
	public boolean depositAmount(double amount, int id) {
		Account ac = searchAccount(id);
		if (ac!=null) {
		 ac.deposit(amount);
		 return true;
		}
		return false;
	}
	
	public void displayData() {
		for(int i =0; i<acc.length; i++) {
			System.out.println(acc[i]);
		}
	}
	

}
