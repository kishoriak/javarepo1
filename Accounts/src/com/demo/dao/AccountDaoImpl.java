package com.demo.dao;

import java.util.ArrayList;

import com.demo.accounts.Account;
import com.demo.accounts.Current;
import com.demo.accounts.Saving;
import com.demo.exceptions.LessAmountException;

public class AccountDaoImpl implements AccountDao{
	static ArrayList<Account> accounts;
	static {
		accounts = new ArrayList<>();
		accounts.add(new Current(20, "Giggs", 2500));
		accounts.add(new Current(22, "Scholes", 3000));
		accounts.add(new Saving(33, "Pirlo", 165416 ));
		accounts.add(new Saving(44, "Gattuso", 41650));
		accounts.add(new Current(55, "Zidane", 80000));
		accounts.add(new Saving(26, "Bergkamp", 65500));
	}
	
	@Override
	public boolean depositSaving(int id, double amt) {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Account acc = accounts.get(pos);
			acc.setBalance(acc.getBalance() + amt);
			return true;
		}
		return false;
		
	}
	
	@Override
	public boolean depositCurrent(int id, double amt) {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Account acc = accounts.get(pos);
			acc.setBalance(acc.getBalance() + amt);
			return true;
		}
		return false;
	}

	@Override
	public boolean withdarwSaving(int id, double amt) throws LessAmountException {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Saving acc = (Saving) accounts.get(pos);
			if(acc.getBalance() > amt && acc.getBalance() - amt >= Saving.getMinbal()) {
				acc.setBalance(acc.getBalance() - amt);
				return true;
			}
			else {
				throw new LessAmountException("Withdraw amount exceeds minimum balance");
			}
		}
		return false;
	}

	@Override
	public boolean withdarwCurrent(int id, double amt) throws LessAmountException {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Current acc = (Current) accounts.get(pos);
			if(acc.getBalance() > amt && acc.getBalance() - amt >= Current.getMinbal()) {
				acc.setBalance(acc.getBalance() - amt);
				return true;
			}
			else {
				throw new LessAmountException("Withdraw amount exceeds minimum balance");
			}
		}
		return false;
	}

	@Override
	public Double balanceEnqSaving(int id) {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Saving acc = (Saving) accounts.get(pos);
			return acc.getBalance();
		}
		return (double) -1;
	}

	@Override
	public Double balanceEnqCurrent(int id) {
		int pos = accounts.indexOf(new Current(id, null, 0));
		if(pos != -1) {
			Current acc = (Current) accounts.get(pos);
			return acc.getBalance();
		}
		return (double) -1;
	}

	@Override
	public Double minBalSaving(int id) {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Saving acc = (Saving) accounts.get(pos);
			return acc.getMinbal();
		}
		return (double) -1;
	}

	@Override
	public Double minBalCurrent(int id) {		
		int pos = accounts.indexOf(new Current(id, null, 0));
		if(pos != -1) {
			Current acc = (Current) accounts.get(pos);
			return acc.getMinbal();
		}
		return (double) -1;
	}

	@Override
	public Double intrateSaving(int id) {
		int pos = accounts.indexOf(new Saving(id, null, 0));
		if(pos != -1) {
			Saving acc = (Saving) accounts.get(pos);
			return acc.getIntrate();
		}
		return (double) -1;
	}

	@Override
	public Double intrateCurrent(int id) {
		int pos = accounts.indexOf(new Current(id, null, 0));
		if(pos != -1) {
			Current acc = (Current) accounts.get(pos);
			return acc.getIntrate();
		}
		return (double) -1;
	}
	
	
}
