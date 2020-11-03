package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice=0;
		AccountService accountService= new AccountServiceImpl();
		do {
			System.out.println("1. Add Account \n2. Withdraw \n3. Deposit \n4. Display All \n5Exit\n");
			System.out.println("choice: ");
			choice =sc.nextInt();
//			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("1. for Saving\n2. for Current");
				System.out.println("enter your choice: ");
				int ch=sc.nextInt();
				if(ch==1) {
					accountService.addSaving();
//					System.out.println("sdnladhbs1");
				}
				else {
					accountService.addCurrent();
				}
				break;
			case 2:
				System.out.println("Withdraw from \n1.Saving \n2. Current ");
				int cw=sc.nextInt();
				System.out.println("enter id");
				int idw=sc.nextInt();
				sc.nextLine();
				System.out.println("enter amount: ");
				double amw=sc.nextDouble();
//				sc.nextLine();
				Account aw= accountService.searchAccount(idw);
//				System.out.println(aw);
				if(cw==1) {
					boolean statw=accountService.withdrawS(aw,amw);
					if(statw) {
						System.out.println("withdraw successfull");
					}
					else {
						System.out.println("Withdraw UNSUCCESSFULL");
					}	
				}
				else {
					boolean statw=accountService.withdrawC(aw,amw);
					if(statw) {
						System.out.println("withdraw successfull");
					}
					else {
						System.out.println("Withdraw UNSUCCESSFULL");
					}	
				}
				break;
			case 3:
				System.out.println("1.Saving Account\n2.Currret Account\n 3.exit");
				int ch1=sc.nextInt();
				System.out.println("Enter id: ");
				int idd=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Amount: ");
				double  dpAmount=sc.nextDouble();
				Account ad= accountService.searchAccount(idd);
				System.out.println(ad);
				accountService.deposit(ad,dpAmount);
				System.out.println("Deposited");
				break;
			case 4:
				List<Account> alist=accountService.displayAll();
				for(Account p1:alist) {
					System.out.println(p1);
				}
				break;
			case 5:
				sc.close();
				System.exit(0);
				break;
			}
		}while(choice!=5);
		

	}

}
