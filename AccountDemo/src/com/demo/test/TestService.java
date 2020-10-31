package com.demo.test;

import java.util.Scanner;

import com.demo.service.Service;
import com.demo.service.ServiceImplementation;

public class TestService {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		Service service=new ServiceImplementation();
		System.out.println("Welcome to HSBC!\n Please select your option");
		
		
		do {
			System.out.println("How can we help you?\n1. Add Account\n2. Withdraw\n3. Deposit\n4. Display All Data\n5. Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				for(int i=0; i<2; i++) {
					System.out.println("Choose Account Type");
					System.out.println("1. Savings Account\n2. Current Account\n3. Exit");
					int choice2=sc.nextInt();
					if(choice2==3) break;
					service.addData(choice2, i);
				}
				break;
			case 2:{
				System.out.println("Enter your ID");
				int id=sc.nextInt();
				System.out.println("Select the Amount you want to Withdraw");
				float withdraw_amt=sc.nextFloat();
				boolean status=service.withdrawAmount(withdraw_amt, id);
				String msg=status?"Withdraw Successful. Thank you for banking with HSBC":"Withdraw unsuccessful. Please check the Details";
				System.out.println(msg);
				break;
			}
			case 3:{
				System.out.println("Enter your ID");
				int id=sc.nextInt();
				System.out.println("Select the Amount you want to Deposit");
				float withdraw_amt=sc.nextFloat();
				service.depositAmount(withdraw_amt, id);
				break;
			}
			
			case 4:
				service.displayData();
				
			}
		}while(choice!=5);
		System.exit(0);
	}
}
