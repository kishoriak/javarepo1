package com.demo.test;

import java.util.Scanner;

import com.demo.service.BankService;
import com.demo.service.BankServiceImpl;

public class TestCrudOperation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		BankService bankservice=new BankServiceImpl();
		do {
			System.out.println("1. Check Balance\n 2. Withdraw Money\n 3. Deposit Money\n");
			System.out.println("Choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Account Number: ");
				int a=sc.nextInt();
				System.out.println(BankService.checkbalance(a));
				break;
			case 2:
				break;
			case 3:
				System.out.println("Enter Account Number: ");
				int id=sc.nextInt();
				int deposit=sc.nextInt();
				BankService.deposit(id,deposit);
				break;
			case 4:
				sc.close();
				System.exit(0);
			}
		}
		while(choice!=4);
	}

}
