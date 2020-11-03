package com.demo.service;

import java.util.Scanner;

import com.demo.Exceptions.AgeException;

public class MyService {
	public void acceptData() throws AgeException {
		Scanner sc=new Scanner(System.in);
		//try {
				System.out.println("enter age");
				int age=sc.nextInt();
				if((age<18) || (age>60)){
					throw new AgeException("age should be between 18 to 60");
				}
				else {
					System.out.println("right data");
				}
		/*}catch(AgeException e) {
			System.out.println(e.getMessage());
		}*/
	}

}
