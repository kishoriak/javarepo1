package com.demo.service;

import java.util.List;

import com.demo.bean.Account;

public interface AccountService {

	public void addSaving();

	public void addCurrent();

	public Account searchAccount(int idw);
	
	public void deposit(Account a, double amd);
	
	public List<Account> displayAll();

	public boolean withdrawS(Account aw, double amw);

	public boolean withdrawC(Account aw, double amw);
}
