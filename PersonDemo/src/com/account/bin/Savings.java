package com.account.bin;

public class Savings extends Account {
	static {
		minb=25000.0;
				roin=4;
	}
	private String chequebknum;
	static double minb;
	static int roin;
	private double withdrawamt;
	private double depositamt;

	public Savings() {
		chequebknum=null;	
		
	}
	public Savings(int id,String nm,double bal,String cqbkn)
	{
		super(id,nm,bal);
		chequebknum=cqbkn;
	}
	public void withdraw(double w)
	{	
		if((super.balance-minb)>=withdrawamt)
			super.balance=super.balance-withdrawamt;
			else
				System.out.println("Insufficient balance");
	}
	public void deposit(double d)
	{
		super.balance=super.balance+depositamt;
	}/*
	public void withdraw(double w)
	{
		super.withdraw(w);
	}
	public void deposit(double d)
	{
		super.deposit(d);
	}*/
public String toString() {
	return super.toString()+"Chequebook num "+chequebknum;	
	}
	
}
