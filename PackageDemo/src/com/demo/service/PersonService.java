package com.demo.service;
import java.text.ParseException;
import java.text.*;
import java.util.Date;
import java.util.Scanner;

import com.demo.bean.Person;

public class PersonService {
	static {
		parr=new Person[5];
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	static Person[] parr;
	static SimpleDateFormat sdf;
	/*
	 * public PersonService() { parr=new Person[20]; }
	 */
	public static void acceptData() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<parr.length;i++) {
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			System.out.println("enter Mobile");
			String mob=sc.next();
			System.out.println("enter email");
			String em=sc.next();
			System.out.println("enetr Date(dd/mm/yyyy)");
			String dt=sc.next();
			try {
				Date jdt=sdf.parse(dt);
				parr[i]=new Person(id,nm,mob,em,jdt);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void dispalyData() {
		for(int i=0;i<parr.length;i++) {
			System.out.println(parr[i]);
		}
	}

}
