package com.training.test;

import java.util.Scanner;

import com.training.service.AccountService;
import com.training.service.AccountServiceImpl;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
		AccountService as = new AccountServiceImpl();
		System.out.println("1.Search Id\n2.withdraw Amt\n3.deposit Amt\n4.Check Balance\n5.addAccount\n6.displayAll\n7.Exit");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter id");
			int id = sc.nextInt();
			int i = as.searchId(id);
			System.out.println("Id: "+i);
			break;
		case 2:
			System.out.println("Enter amt to withdraw");
			double amt = sc.nextDouble();
			int id1 = sc.nextInt();
			int id2 = as.searchId(id1);
			as.withdrawAmt(id2, amt);
			break;
		case 3:
			System.out.println("Enter amt to deposit");
			double damt = sc.nextDouble();
			int id3 = sc.nextInt();
			int id4 = as.searchId(id3);
			as.depositAmt(id4, damt);
			break;
		case 4:
			System.out.println("Enter Id: ");
			int id5 = sc.nextInt();
			int id6 = as.searchId(id5);
			as.checkBalance(id6);
			break;
		case 5:
			for(int g=0;g<5;g++) {
				System.out.println("1.Saving Account\n2.Current Account");
				int ch = sc.nextInt();
				as.addData(ch,g);
			}
			break;
		case 6:
			as.displayAll();
			break;
		case 7:
			System.exit(0);
			break;
		}
		}while(choice!=7);
	}

}
