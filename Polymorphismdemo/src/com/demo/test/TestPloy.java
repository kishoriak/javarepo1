package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Circle;
import com.demo.bean.Shape;
import com.demo.bean.Triangle;

public class TestPloy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		Shape s=null;
		do {
		System.out.println("1.Triangle\n2.Circle\n3.Rectangle\n4.exit");
		System.out.println("Choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			
			s=new Triangle("red",3,3,4,5);
			break;
		case 2:
			s=new Circle("red",5);
			break;
		case 3: 
			break;
		case 4:
			System.exit(0);
			break;
		
		}
		System.out.println("Area : "+s.area());
		System.out.println("Perimeter : "+s.perimeter());
		}while(choice!=4);

	}

}
