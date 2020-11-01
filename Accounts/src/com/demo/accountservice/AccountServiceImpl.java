package com.demo.accountservice;


import java.util.Scanner;

import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;
import com.demo.exceptions.LessAmountException;

public class AccountServiceImpl implements AccountService {
	
	Scanner sc = new Scanner(System.in);
	private AccountDao accountDao = new AccountDaoImpl();
	
	@Override
	public boolean depositAmt() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Deposit amount: \n");
		double amt = sc.nextDouble();
		System.out.println("1.Saving account\n2.Current Account\n");
		int choice = sc.nextInt();
		boolean flag;
		if(choice == 1) {			
			flag = accountDao.depositSaving(id, amt);			
		}
		else {
			flag = accountDao.depositCurrent(id, amt);
		}
		if(flag){
			return true;
		}
		return false;
	}

	@Override
	public boolean withdrawAmt() throws LessAmountException {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Withdraw amount: ");
		double amt = sc.nextDouble();
		System.out.println("1.Saving account\n2.Current Account\n");
		int choice = sc.nextInt();
		boolean flag;
		if(choice == 1) {			
			flag = accountDao.withdarwSaving(id, amt);			
		}
		else {
			flag = accountDao.withdarwCurrent(id, amt);
		}
		if(flag){
			return true;
		}
		return false;
	}

	@Override
	public boolean balanceEnquiry() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("1.Saving account\n2.Current Account\n");
		int choice = sc.nextInt();
		Double amount;
		if(choice == 1) {			
			 amount = accountDao.balanceEnqSaving(id);
		}
		else {
			amount = accountDao.balanceEnqCurrent(id);			
		}		
		if(amount != -1) {
			System.out.println("Available Balance: "+ amount);
			return true;
		 }
		 return false;		
	}

	@Override
	public boolean minBalance() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("1.Saving account\n2.Current Account\n");
		int choice = sc.nextInt();
		boolean flag;
		Double amount;
		if(choice == 1) {			
			 amount = accountDao.minBalSaving(id);
		}
		else {
			amount = accountDao.minBalCurrent(id);			
		}		
		if(amount != -1) {
			System.out.println("Minimum Balance: "+ amount);
			return true;
		 }
		 return false;
		
	}

	@Override
	public boolean intRate() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("1.Saving account\n2.Current Account\n");
		int choice = sc.nextInt();
		boolean flag;
		Double rate;
		if(choice == 1) {			
			 rate = accountDao.intrateSaving(id);
		}
		else {
			rate = accountDao.intrateCurrent(id);			
		}		
		if(rate != -1) {
			System.out.println("Interest rate: "+ rate*100 + "%");
			return true;
		 }
		return false;
	}
}
