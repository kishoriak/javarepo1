package com.account.bin;

public class Current extends Account {
	static {
		minb=0.0;
				roin=1;
	}
	static double minb;
	static int roin;
	private double withdrawamt;
	private double depositamt;
	private int numberoftransactions;
	public Current() {
		numberoftransactions=0;
	}
	public Current(int id,String nm,double bal,int not)
	{
		super(id,nm,bal);
		numberoftransactions=not;
	}
	public void withdraw(double w)
	{	
		if(super.balance>=withdrawamt)
			super.balance=super.balance-withdrawamt;
			else
				System.out.println("Insufficient balance");
	}
	public void deposit(double d)
	{
		super.balance=super.balance+depositamt;
	}
	
	public String toString() {
		return super.toString()+"number of transactions "+numberoftransactions;
		
	}
}
