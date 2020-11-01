package com.demo.test;

import java.util.Scanner;

import com.demo.accountservice.AccountService;
import com.demo.accountservice.AccountServiceImpl;
import com.demo.exceptions.LessAmountException;

public class AccountTest {
	public static void main(String[] args) throws LessAmountException {
		Scanner sc = new Scanner(System.in);
		AccountService ac = new AccountServiceImpl();
		int choice = 0;
		do{
			System.out.println("1.Deposit amount\n2.Withdraw amount\n3.Balance Enquiry\n4.Minimum Balance\n5.Interest rate\n6.Exit\n");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					boolean flag = ac.depositAmt();
					if(flag) {
						System.out.println("Amount deposited\n");
					}
					else {
						System.out.println("Account not found\n");
					}
					break;
				case 2:
					flag = ac.withdrawAmt();
					if(flag) {
						System.out.println("Amount withdraw completed\n");
					}
					else {
						System.out.println("Account not found\n");
					}
					break;
				case 3:
					flag = ac.balanceEnquiry();
					if(!flag) {
						System.out.println("Account not found");
					}
					break;
				case 4:
					flag = ac.minBalance();
					if(!flag) {
						System.out.println("Account not found");
					}
					break;
				case 5:
					flag = ac.intRate();
					if(!flag) {
						System.out.println("Account not found");
					}
					break;
				case 6:
					sc.close();
					System.exit(0);
			}
		}while(choice!=6);
	}
}
