package com.account.test;

import java.util.Scanner;

import com.account.service.AccountService;
import com.account.service.AccountServiceImpl;


public class TestAccSer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	AccountService asc=new AccountServiceImpl();
	int choice=0;
	do {
	System.out.println("1.Add account details\n 2. transaction\n 3.Exit");
		System.out.println("Enter choice");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		for(int i=0;i<5;i++) {
		System.out.println("1.Savings\n2.Current\n3.exit");
		System.out.println("enter choice");
		int ch=sc.nextInt();
		asc.addData(ch,i);
		}
	break;
	case 2:
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("1.Deposit\n2.Withdraw\n3.exit");
		int c=sc.nextInt();
		System.out.println("Enter amount");
		double amt=sc.nextDouble();
		if(asc.transaction(id, c, amt)==true)
		{
			System.out.println("Transaction done");
		}
		else
		{
			System.out.println("Invalid id");
		}
		break;
	case 3:
		System.exit(0);
		break;}
		}while(choice!=4);
	}
}

