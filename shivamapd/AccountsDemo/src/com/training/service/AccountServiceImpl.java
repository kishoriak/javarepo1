package com.training.service;

import java.util.Scanner;

import com.training.bean.Account;
import com.training.bean.CurrentAccount;
import com.training.bean.SavingAccount;

public class AccountServiceImpl implements AccountService{
	static Account[] acarr;
	static {
		acarr = new Account[5];
	}
	
	public void addData(int ch, int i) {
		
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter Id: "); 
		  int id = sc.nextInt();
		  System.out.println("Enter user name: "); 
		  String name = sc.next(); 
		  System.out.println("Enter user's Initial amount");
		  double bal = sc.nextDouble();
		 
		if(ch==1) {
			acarr[i] = new SavingAccount(id, name, bal,"987603");
		}else {
			acarr[i] = new CurrentAccount(id, name, bal, 0);
		}
		
	}
	
	public void displayAll() {
		for(int i=0;i<5;i++) {
			System.out.println(acarr[i]);
		}
	}
	
	public int searchId(int id) {
		for(int i=0;i<5;i++) {
			if(acarr[i].getId()==id) {
				return i;
			}
		}
		return -1;
	}
	
	public void withdrawAmt(int id, double amt) {
		if(id!=-1) {
			acarr[id].withdraw(amt);
		}else {
			System.out.println("User not found");
		}
	}
	
	public void depositAmt(int id, double amt) {
		if(id!=-1) {
			acarr[id].deposit(amt);
		}else {
			System.out.println("User not found");
		}
	}
	
	public void checkBalance(int id) {
		if(id!=-1) {
			System.out.println(acarr[id].getBalance());
		}else {
			System.out.println("User not found");
		}
	}
}
