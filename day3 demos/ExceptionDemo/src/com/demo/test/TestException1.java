package com.demo.test;

import java.util.Scanner;

public class TestException1 {
	public static void main(String[] args) {
		int num=51;
		Scanner sc=null;  //=new Scanner(System.in);
		//while(true) {
		for(int i=0;i<3;i++) {
		try {
			    sc=new Scanner(System.in);
				System.out.println("enter number");
				int guess=sc.nextInt();
				if(num==guess) {
					System.out.println("Yeppeee you guessed the number");
				}
				else {
					throw new ArithmeticException("Oops you missed the chance");
				}
				break;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			if (i==3) {
				System.out.println("no more chance left");
			}
		}finally {
			sc.close();
		}
		}
		
	}

}
