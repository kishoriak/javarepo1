package com.demo.test;
import java.util.Scanner;

import com.demo.service.AccountServiceImpl;
import com.demo.service.AccountService;
public class TestAccountService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		AccountService accService=new AccountServiceImpl();
		System.out.println("Add account details first.");
		do {
			System.out.println("1. Add Details \n2. Withdraw \n3. Deposit \n4. Display data\n5. Exit");
			System.out.println("choice: ");
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<2;i++) {
				System.out.println("1. Saving Account\n2. Currret Account\n 3. Exit");
				System.out.println("choice");
				int ch=sc.nextInt();
				accService.addData(ch,i);
			}
			break;
		case 2:
			System.out.println("1. Saving Account\n2. Currret Account\n3. Exit");
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			System.out.println("Enter Amount: ");
			double  wdAmount=sc.nextDouble();
			boolean status_w = accService.withdrawAmount(wdAmount,id);
			if(status_w) {
				System.out.println("Withdraw Successfull");
			}
			else {
				System.out.println("Invalid withdrawal");
			}
			break;
		case 3:
			System.out.println("1.Saving Account\n2.Currret Account\n 3.exit");
			System.out.println("Enter id: ");
			int id1=sc.nextInt();
			System.out.println("Enter Amount: ");
			double  dpAmount=sc.nextDouble();
			boolean status_d = accService.depositAmount(dpAmount,id1);
			if(status_d) {
				System.out.println("Deposited!!");
			}
			else {
				System.out.println("Invalid deposit operation");
			}
			break;
		case 4:
			accService.displayData();
			break;
		case 5:
			System.exit(0);
			break;
		}
			
		}while(choice!=4);
		

	}

}
