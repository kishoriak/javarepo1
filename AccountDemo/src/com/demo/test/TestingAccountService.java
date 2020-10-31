package com.demo.test;
import java.util.Scanner;

import com.demo.service.AccountServiceImpl;
import com.demo.service.AccountService;
public class TestingAccountService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		AccountService aservice=new AccountServiceImpl();
		do {
			System.out.println("1. Add Details \n2. Withdraw \n3. Deposit \n4. Display Data  \n5. Exit");
			System.out.println("choice");
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<3;i++) {
				System.out.println("1.Saving Account\n2.Currret Account\n 3.exit");
				System.out.println("choice");
				int ch=sc.nextInt();
				aservice.addData(ch,i);
			}
			break;
		case 2:
			System.out.println("Withdraw from which account \n 1.Saving Account\n2.Currret Account\n 3.exit");
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			System.out.println("Enter Amount to withdraw ");
			double  wamount=sc.nextDouble();
			boolean status_w = aservice.withdrawAmount(wamount,id);
			if(status_w) {
				System.out.println("Withdraw Successfull");
			}
			else {
				System.out.println("Withdraw Invalid");
			}
			break;
		case 3:
			System.out.println("Withdraw from which account \n 1.Saving Account\n2.Currret Account\n 3.exit");
			System.out.println("Enter id: ");
			int id1=sc.nextInt();
			System.out.println("Enter Amount to withdraw ");
			double  damount=sc.nextDouble();
			boolean status_d = aservice.depositAmount(damount,id1);
			if(status_d) {
				System.out.println("Deposit Successfull");
			}
			else {
				System.out.println("Deposit Invalid");
			}
			break;
		case 4:
			break;
		case 5:
			System.exit(0);
			break;
			
		
		}
		System.out.println("Remaining Amount ");
			
		}while(choice!=5);
		

	}

}
