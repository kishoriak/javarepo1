package com.demo.dao;

import java.util.List;

import com.demo.bean.Account;

public interface AccountDao {

	void addSaving(Account as);

	void addCurrent(Account ac);

	List<Account> displayAll();

	void deposit(Account a, double amd);

//	boolean withdraw(Account a, double amw);

	Account searchAccount(int idw);

	boolean withdrawS(Account aw, double amw);

	boolean withdrawC(Account aw, double amw);


}
