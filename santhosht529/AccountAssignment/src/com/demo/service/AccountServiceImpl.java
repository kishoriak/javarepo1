package com.demo.service;
import  com.demo.bean.Account;
import  com.demo.bean.SavingsAcc;
import  com.demo.bean.CurrentAcc;

public class AccountServiceImpl implements AccountService{
//public void deposit(double amount)
	static Account[] acc;
	static {
		//creating
		acc= new Account[3]  ; 
	
	}
	
///searching Account no.
	
	
	public void addData(int ch, int i) {
		if(ch==1) {
				acc[i] = new SavingsAcc(12, "Goku", 45,0.04,25000 ,"HSBC004");
			}
		else {
				acc[i] = new CurrentAcc(13, "John", 15, 0.0, 0, 10);
			}
		
	}
	
	
	
	public Account searchAccount(int id) {
		for(int i = 0; i<acc.length;i++) {
			if(acc[i].getId()==id) {
				return acc[i];
			}
			
		}
		return null;
	}
	
	//withdrawing amount
	public boolean withdrawAmount(double amount, int id) {
		Account ac = searchAccount(id);
		if (ac!=null) {
			return ac.withdraw(amount);
		}
		return false;	
	}
	
	//this.balance = balance - amount;
	//return this.balance;
	
	//deposit amount 
	public boolean depositAmount(double amount, int id) {
		Account ac = searchAccount(id);
		if (ac!=null) {
		 ac.deposit(amount);
		 return true;
		}
		return false;
	}
	//to display data
	public void displayData() {
		for(int i =0; i<acc.length; i++) {
			System.out.println(acc[i]);
		}
	}
	
	
	
	
	
	

}