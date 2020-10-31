package com.account.service;

import com.account.bin.Account;
import com.account.bin.Current;
import com.account.bin.Savings;


public class AccountServiceImpl implements AccountService {
static Account[] arr;
static {
	arr=new Account[5];
}
public void addData(int ch,int i)
{
	if(ch==1)
	{
		arr[i]=new Savings(10+i,"ab",10000+20000*i,"1238465");
	}
	else
	{
		arr[i]=new Current(10+i,"ab",10000+20000*i,10);
	}
	
}
public Account searchAccount(int id) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i].getId()==id) {
			return arr[i];
		}
	}
	return null;
	}
/* static Account searchName(String nm) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i].getName().equals(nm)) {
			return arr[i];
		}
	}
	return null;
}*/

public boolean transaction(int id,int ch,double amt)
{
Account p=searchAccount(id);
	if(p!=null) {
	if(ch==1) {
			p.deposit(amt);
	}
	else
	{
		p.withdraw(amt);
	}  return true;
	}
	else {
	   return false;
	}
	
}

	}
