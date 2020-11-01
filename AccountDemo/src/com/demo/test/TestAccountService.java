package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

public class TestAccountService {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		AccountService aservice=new AccountServiceImpl();
		
		do {
			System.out.println("1.Withdraw Ammout \n2.Deposit Amount \n3.Check Balance \n4Exit");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Choose account type\n");
				System.out.println("1.Savings \n2.Current");
				int ch=sc.nextInt();
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter amount :");
				double amount=sc.nextFloat();
				boolean status_w=aservice.withdrawAmount(amount,id);
				if(status_w) {
					System.out.println("Withdraw Successfull");
				}
				else {
					System.out.println("Insufficient Balance");
				}
				break;
			case 2:
				System.out.println("Choose account type\n");
				System.out.println("1.Savings \n2.Current");
				int ch1=sc.nextInt();
				System.out.println("Enter id");
				int id1=sc.nextInt();
				System.out.println("Enter amount :");
				double amount1=sc.nextFloat();
				boolean status_d=aservice.depositAmount(amount1,id1);
				if(status_d) {
					System.out.println("Deposit Successfull");
				}
				else {
					System.out.println("Deposit not successful");
				}
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}while(choice!=4);
	}

}
