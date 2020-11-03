package com.demo.test;

import java.util.Scanner;

import com.demo.service.ShapeService;
import com.demo.service.ShapeServiceImpl;

public class TestPolyArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShapeService sservice=new ShapeServiceImpl();
		int choice=0;
		do {
		System.out.println("1.Add all shapes\n 2. Display all shapes\nExit");
		System.out.println("choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<5;i++) {
				System.out.println("1.triangle\n2.Circle\nexit");
				System.out.println("choice");
				int ch=sc.nextInt();
				sservice.addData(ch,i);
			}
			break;
		case 2:
			sservice.displayAll();
			break;
		case 3:
			System.exit(0);
			break;
		}
		}while(choice!=3);
		
	}

}
