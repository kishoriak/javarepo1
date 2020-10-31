package com.demo.service;

import com.demo.beans.*;

public class ServiceImplementation implements Service{
	
	static Account ac_array[];
	
	//initialize static variables
	static{
		ac_array=new Account[2];
	}

	@Override
	public boolean withdrawAmount(float amount, int id) {
		// TODO Auto-generated method stub
		Account account=null;
		for(int i=0; i<ac_array.length; i++) {
			if(ac_array[i].getId()==id) {
				account=ac_array[i];
			}
		}
		boolean tranx_flag=false;
		if(account!=null) {
			return account.withdraw(amount);
		}
		return false;
	}

	@Override
	public void depositAmount(float amount, int id) {
		// TODO Auto-generated method stub
		Account account=null;
		for(int i=0; i<ac_array.length; i++) {
			if(ac_array[i].getId()==id) {
				account=ac_array[i];
			}
		}
		
		if(account!=null) {
			account.deposit(amount);
		}
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		for(int i=0; i<ac_array.length; i++) {
			System.out.println(ac_array[i]);
		}
	}

	@Override
	public void addData(int choice, int ind) {
		// TODO Auto-generated method stub
		if(choice==1) {
			ac_array[ind]=new SavingsAcount(10000000, 1, "Rich Saurabh :)");
		}
		else {
			ac_array[ind]=new CurrentAccount(10, 2, "Poor Saurabh :(");
		}
	}
	
}
