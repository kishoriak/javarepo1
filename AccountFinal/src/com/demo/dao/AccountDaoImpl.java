package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Account;
import com.demo.bean.Current;
import com.demo.bean.Saving;


public class AccountDaoImpl implements AccountDao{
	static List<Account> plist;
	static {
		plist= new ArrayList<Account>();
		plist.add(new Saving(12,"abhi",250000,"bh72jb"));
		plist.add(new Current(13,"anf",3000));
	}
	@Override
	public void addSaving(Account as) {
		plist.add(as);
		
	}

	@Override
	public void addCurrent(Account ac) {
		plist.add(ac);
		
	}

	@Override
	public List<Account> displayAll() {
		return plist;
	}

	@Override
	public void deposit(Account a, double amd) {
		a.deposit(amd);
	}

	@Override
	public boolean withdrawS(Account a, double amw) {
		if((a.getBalance()-amw)>Saving.getMin_bal()) {
			return a.withdraw(a,amw);		
		}
		else {
			return false;
		}
	}

	@Override
	public Account searchAccount(int id) {
		Account sa=null;
//		int pos=plist.indexOf(new Account(id,null,0.0));
//		System.out.println(plist);
//		System.out.println(pos);
		for(Account ac:plist) {
			if(ac.getId()==id) {
				sa=ac;
				System.out.println(sa);
				break;
			}
		}
		if(sa!=null) {
			return sa;
		}
		return null;
	}

	@Override
	public boolean withdrawC(Account aw, double amw) {
		if((aw.getBalance()-amw)>Current.getMin_bal()) {
			return aw.withdraw(aw,amw);		
		}
		else {
			return false;
		}
	}

}
