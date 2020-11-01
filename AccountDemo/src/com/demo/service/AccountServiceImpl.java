package com.demo.service;

import com.demo.bean.Account;
import com.demo.bean.Current;
import com.demo.bean.Savings;

public class AccountServiceImpl implements AccountService{
	static Account[] acc;
	static {
		acc=new Account[2];
	}
	
	public void addData() {
		acc[1] = new Current(3306, "Haroon", 123456, 0.0, 0, 12);
		acc[2] = new Savings(3306, "Haroon", 123456, 0.0, 0, "defsx");
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
	
	public boolean depositAmount(double amount, int id) {
		Account ac = searchAccount(id);
		if (ac!=null) {
		 ac.balance=ac.balance+amount;
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
