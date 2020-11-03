package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Account;
import com.demo.bean.Current;
import com.demo.bean.Saving;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	
	public AccountServiceImpl() {
		accountDao=new AccountDaoImpl();
	}
	
	
	@Override
	public void addSaving() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter checkbook no.");
		String cb=sc.nextLine();
		System.out.println("enter balance amout (minimum 25k): ");
		double bal=sc.nextDouble();
		sc.nextLine();
		Account as=new Saving(id,nm,bal,cb);
		accountDao.addSaving(as);
//		sc.close();
	}

	@Override
	public void addCurrent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter balance amout (no minimum balance): ");
		double bal=sc.nextDouble();
		sc.nextLine();
		Account ac=new Current(id,nm,bal);
		accountDao.addCurrent(ac);
//		sc.close();
	}


	@Override
	public Account searchAccount(int idw) {
//		Account ob=new Account(idw,"gjv",0.0);
		return accountDao.searchAccount(idw);
	}


//	@Override
//	public boolean withdraw(Account a, double amw) {
//		return accountDao.withdraw(a,amw);
//	}


	@Override
	public void deposit(Account a, double amd) {
		accountDao.deposit(a,amd);
		}


	@Override
	public List<Account> displayAll() {
		return accountDao.displayAll();
	}


	@Override
	public boolean withdrawS(Account aw, double amw) {
		return accountDao.withdrawS(aw,amw);
	}


	@Override
	public boolean withdrawC(Account aw, double amw) {
		return accountDao.withdrawC(aw,amw);
	}
	

}
