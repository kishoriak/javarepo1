package com.demo.test;

import java.util.Scanner;

import com.demo.Exceptions.AgeException;
import com.demo.service.MyService;

public class TestExceptionAge {

	public static void main(String[] args) { //throws AgeException {
		try {
		    MyService ob=new MyService();
		    ob.acceptData();
		}catch(AgeException e){
			System.out.println("age not in range");
		}
	}

}
